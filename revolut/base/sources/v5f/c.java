package v5f;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f286212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f286213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarLargeCentred f286214c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarLargeCentred navBarLargeCentred) {
        this.f286212a = controllerContainerCoordinatorLayout;
        this.f286213b = actionFooterView;
        this.f286214c = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f286212a;
    }
}
