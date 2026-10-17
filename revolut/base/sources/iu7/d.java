package iu7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f168533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f168534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f168535c;
    public final Tabs d;
    public final ViewPager2 e;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs, ViewPager2 viewPager2) {
        this.f168533a = controllerContainerConstraintLayout;
        this.f168534b = largeActionButton;
        this.f168535c = navBarWithToolbar;
        this.d = tabs;
        this.e = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f168533a;
    }
}
