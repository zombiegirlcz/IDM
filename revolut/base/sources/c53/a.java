package c53;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f21401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f21402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f21403c;
    public final ChatInputView d;
    public final NavBarBottomSheet e;
    public final ViewPager2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScrollingPagerIndicatorView f21404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LargeActionButton f21405h;
    public final LargeActionButton i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AsyncDiffRecyclerView f21406j;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AnimatedBackgroundView animatedBackgroundView, LargeActionButton largeActionButton, ChatInputView chatInputView, NavBarBottomSheet navBarBottomSheet, ViewPager2 viewPager2, ScrollingPagerIndicatorView scrollingPagerIndicatorView, LargeActionButton largeActionButton2, LargeActionButton largeActionButton3, AsyncDiffRecyclerView asyncDiffRecyclerView) {
        this.f21401a = controllerContainerConstraintLayout;
        this.f21402b = animatedBackgroundView;
        this.f21403c = largeActionButton;
        this.d = chatInputView;
        this.e = navBarBottomSheet;
        this.f = viewPager2;
        this.f21404g = scrollingPagerIndicatorView;
        this.f21405h = largeActionButton2;
        this.i = largeActionButton3;
        this.f21406j = asyncDiffRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21401a;
    }
}
