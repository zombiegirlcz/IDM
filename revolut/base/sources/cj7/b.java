package cj7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f24625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f24626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FixedTabs f24627c;
    public final ViewPager2 d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, FixedTabs fixedTabs, ViewPager2 viewPager2) {
        this.f24625a = controllerContainerConstraintLayout;
        this.f24626b = navBarWithToolbar;
        this.f24627c = fixedTabs;
        this.d = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f24625a;
    }
}
