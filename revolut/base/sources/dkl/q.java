package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f115676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f115677b;

    public q(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView) {
        this.f115676a = controllerContainerCoordinatorLayout;
        this.f115677b = actionFooterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115676a;
    }
}
