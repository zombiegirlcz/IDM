package jd1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f172929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f172930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f172931c;
    public final LargeActionButton d;
    public final FixedTabs e;

    public i(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2, FixedTabs fixedTabs) {
        this.f172929a = controllerContainerConstraintLayout;
        this.f172930b = navBarWithToolbar;
        this.f172931c = largeActionButton;
        this.d = largeActionButton2;
        this.e = fixedTabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f172929a;
    }
}
