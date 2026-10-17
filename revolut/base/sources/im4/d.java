package im4;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f162305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f162306b;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView) {
        this.f162305a = controllerContainerCoordinatorLayout;
        this.f162306b = actionFooterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f162305a;
    }
}
