package zvi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f325690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f325691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f325692c;
    public final ScrollingPagerIndicatorView d;
    public final BasicNavBar e;
    public final ViewPager2 f;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, FooterTextView footerTextView, ScrollingPagerIndicatorView scrollingPagerIndicatorView, BasicNavBar basicNavBar, ViewPager2 viewPager2) {
        this.f325690a = controllerContainerConstraintLayout;
        this.f325691b = largeActionButton;
        this.f325692c = footerTextView;
        this.d = scrollingPagerIndicatorView;
        this.e = basicNavBar;
        this.f = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f325690a;
    }
}
