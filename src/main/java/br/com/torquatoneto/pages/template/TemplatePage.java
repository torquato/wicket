package br.com.torquatoneto.pages.template;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;
/**
 * http://examples7x.wicket.apache.org/template/wicket/bookmarkable/org.apache.wicket.examples.template.pageinheritance.Page2?2
 * 
 * @author torquato.neto
 *
 */
public abstract class TemplatePage extends WebPage {
    /** title of the current page. */
    private String pageTitle = "(no title)";

    /** the current banner. */
//    private Banner currentBanner;

    /**
     * Constructor
     */
    public TemplatePage() {
        add(new Label("title", new PropertyModel<>(this, "pageTitle")));
//        add(currentBanner = new Banner1("ad"));
        add(new Link("changeAdLink") {
            /**
             * @see org.apache.wicket.markup.html.link.Link#onClick()
             */
            @Override
            public void onClick() {
//                if (currentBanner.getClass() == Banner1.class) {
//                    TemplatePage.this.replace(currentBanner = new Banner2("ad"));
//                } else {
//                    TemplatePage.this.replace(currentBanner = new Banner1("ad"));
//                }
            }
        });
//        add(new BookmarkablePageLink<>("page1Link", Page1.class));
//        add(new BookmarkablePageLink<>("page2Link", Page2.class));
    }

    /**
     * Gets the title.
     * 
     * @return title
     */
    public final String getPageTitle() {
        return pageTitle;
    }

    /**
     * Sets the title.
     * 
     * @param title
     *            title
     */
    public final void setPageTitle(String title) {
        pageTitle = title;
    }
}
