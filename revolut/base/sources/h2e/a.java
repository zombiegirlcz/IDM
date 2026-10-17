package h2e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f148794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f148795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f148796c;
    public final ViewPager2 d;
    public final Tabs e;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithBigTile navBarWithBigTile, ViewPager2 viewPager2, Tabs tabs) {
        this.f148794a = controllerContainerCoordinatorLayout;
        this.f148795b = actionFooterView;
        this.f148796c = navBarWithBigTile;
        this.d = viewPager2;
        this.e = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f148794a;
    }
}
