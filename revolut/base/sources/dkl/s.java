package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f115681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f115682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f115683c;

    public s(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ActionFooterView actionFooterView, BasicNavBar basicNavBar) {
        this.f115681a = controllerContainerConstraintLayout;
        this.f115682b = actionFooterView;
        this.f115683c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115681a;
    }
}
