package t73;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.BlurredImageBackgroundView;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import com.revolut.ui_kit.carousel_with_sheet.R$id;
import com.revolut.ui_kit.carousel_with_sheet.layout.ControllerContainerCardsCarouselLayout;
import com.revolut.ui_kit.carousel_with_sheet.view.HorizontalScrollExpandableLayoutView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, g73.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_screen/impl/databinding/ScreenCardsCarouselNewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cardsCarousel_addToGpayButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.cardsCarousel_bgBlurredImageBackgroundView;
            BlurredImageBackgroundView blurredImageBackgroundView = (BlurredImageBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (blurredImageBackgroundView != null) {
                i = R$id.cardsCarousel_bgContainer;
                LegacyContentContainerFrameLayout legacyContentContainerFrameLayout = (LegacyContentContainerFrameLayout) ViewBindings.findChildViewById(p0, i);
                if (legacyContentContainerFrameLayout != null) {
                    i = R$id.cardsCarousel_bgVideoView;
                    VideoBackgroundView videoBackgroundView = (VideoBackgroundView) ViewBindings.findChildViewById(p0, i);
                    if (videoBackgroundView != null) {
                        i = R$id.cardsCarousel_expandableLayoutView;
                        HorizontalScrollExpandableLayoutView horizontalScrollExpandableLayoutView = (HorizontalScrollExpandableLayoutView) ViewBindings.findChildViewById(p0, i);
                        if (horizontalScrollExpandableLayoutView != null) {
                            i = com.revolut.feature.card_screen.impl.R$id.cardsCarousel_expandableLayoutViewContainer;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(p0, i);
                            if (coordinatorLayout != null) {
                                i = R$id.cardsCarousel_navBar;
                                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                                if (basicNavBar != null) {
                                    i = R$id.cardsCarousel_recyclerView;
                                    AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
                                    if (asyncDiffRecyclerView != null) {
                                        ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = (ControllerContainerCardsCarouselLayout) p0;
                                        return new g73.c(controllerContainerCardsCarouselLayout, largeActionButton, blurredImageBackgroundView, legacyContentContainerFrameLayout, videoBackgroundView, horizontalScrollExpandableLayoutView, coordinatorLayout, basicNavBar, asyncDiffRecyclerView, controllerContainerCardsCarouselLayout);
                                    }
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
