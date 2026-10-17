package dkl;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CardsCarouselView;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout;
import com.revolut.ui_kit.carousel_with_sheet.view.HorizontalScrollExpandableLayoutView;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarouselWithBottomSheetContainerLayout f115662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyContentContainerFrameLayout f115663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardsCarouselView f115664c;
    public final HorizontalScrollExpandableLayoutView d;
    public final BasicNavBar e;
    public final CarouselWithBottomSheetContainerLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoordinatorLayout f115665g;

    public l(CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout, LegacyContentContainerFrameLayout legacyContentContainerFrameLayout, CardsCarouselView cardsCarouselView, HorizontalScrollExpandableLayoutView horizontalScrollExpandableLayoutView, BasicNavBar basicNavBar, CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout2, CoordinatorLayout coordinatorLayout) {
        this.f115662a = carouselWithBottomSheetContainerLayout;
        this.f115663b = legacyContentContainerFrameLayout;
        this.f115664c = cardsCarouselView;
        this.d = horizontalScrollExpandableLayoutView;
        this.e = basicNavBar;
        this.f = carouselWithBottomSheetContainerLayout2;
        this.f115665g = coordinatorLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115662a;
    }
}
