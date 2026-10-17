package hmd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f153684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScrollingPagerIndicatorView f153685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2 f153686c;

    public e(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ScrollingPagerIndicatorView scrollingPagerIndicatorView, ViewPager2 viewPager2) {
        this.f153684a = controllerContainerConstraintLayout;
        this.f153685b = scrollingPagerIndicatorView;
        this.f153686c = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f153684a;
    }
}
