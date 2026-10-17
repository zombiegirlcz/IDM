package g73;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.BlurredImageBackgroundView;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import com.revolut.ui_kit.carousel_with_sheet.layout.ControllerContainerCardsCarouselLayout;
import com.revolut.ui_kit.carousel_with_sheet.view.HorizontalScrollExpandableLayoutView;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCardsCarouselLayout f141089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f141090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlurredImageBackgroundView f141091c;
    public final LegacyContentContainerFrameLayout d;
    public final VideoBackgroundView e;
    public final HorizontalScrollExpandableLayoutView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoordinatorLayout f141092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BasicNavBar f141093h;
    public final AsyncDiffRecyclerView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ControllerContainerCardsCarouselLayout f141094j;

    public c(ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout, LargeActionButton largeActionButton, BlurredImageBackgroundView blurredImageBackgroundView, LegacyContentContainerFrameLayout legacyContentContainerFrameLayout, VideoBackgroundView videoBackgroundView, HorizontalScrollExpandableLayoutView horizontalScrollExpandableLayoutView, CoordinatorLayout coordinatorLayout, BasicNavBar basicNavBar, AsyncDiffRecyclerView asyncDiffRecyclerView, ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout2) {
        this.f141089a = controllerContainerCardsCarouselLayout;
        this.f141090b = largeActionButton;
        this.f141091c = blurredImageBackgroundView;
        this.d = legacyContentContainerFrameLayout;
        this.e = videoBackgroundView;
        this.f = horizontalScrollExpandableLayoutView;
        this.f141092g = coordinatorLayout;
        this.f141093h = basicNavBar;
        this.i = asyncDiffRecyclerView;
        this.f141094j = controllerContainerCardsCarouselLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f141089a;
    }
}
