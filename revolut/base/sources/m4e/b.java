package m4e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f202725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabs f202726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f202727c;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FixedTabs fixedTabs, NavBarWithToolbar navBarWithToolbar) {
        this.f202725a = controllerContainerConstraintLayout;
        this.f202726b = fixedTabs;
        this.f202727c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f202725a;
    }
}
