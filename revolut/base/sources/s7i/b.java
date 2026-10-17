package s7i;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f260843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f260844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f260845c;
    public final FixedTabs d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, BasicNavBar basicNavBar, FixedTabs fixedTabs) {
        this.f260843a = controllerContainerCoordinatorLayout;
        this.f260844b = actionFooterView;
        this.f260845c = basicNavBar;
        this.d = fixedTabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f260843a;
    }
}
