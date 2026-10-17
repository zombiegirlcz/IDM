package sx2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.card_design.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.ui_kit.card_scene.CardDesignProxyCarouselView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, dy2.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_design/impl/databinding/ScreenCardDesignCarouselBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cardDesignCarouselScreen_cardView;
        CardDesignProxyCarouselView cardDesignProxyCarouselView = (CardDesignProxyCarouselView) ViewBindings.findChildViewById(p0, i);
        if (cardDesignProxyCarouselView != null) {
            i = R$id.cardDesignCarouselScreen_descriptionsRecycler;
            if (((RecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.cardDesignCarouselScreen_footerText;
                FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
                if (footerTextView != null) {
                    i = R$id.cardDesignCarouselScreen_largeButton;
                    LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                    if (largeActionButton != null) {
                        i = R$id.cardDesignCarouselScreen_navBar;
                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                        if (basicNavBar != null) {
                            i = R$id.cardDesignCarouselScreen_tagView;
                            TagView tagView = (TagView) ViewBindings.findChildViewById(p0, i);
                            if (tagView != null) {
                                i = R$id.cardDesignCarouselScreen_videoPreviewTagView;
                                SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                if (smallActionButton != null) {
                                    return new dy2.a((ControllerContainerConstraintLayout) p0, cardDesignProxyCarouselView, footerTextView, largeActionButton, basicNavBar, tagView, smallActionButton);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
