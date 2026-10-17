package o05;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f221154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f221155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarLargeCentred f221156c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarLargeCentred navBarLargeCentred) {
        this.f221154a = controllerContainerCoordinatorLayout;
        this.f221155b = actionFooterView;
        this.f221156c = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f221154a;
    }
}
