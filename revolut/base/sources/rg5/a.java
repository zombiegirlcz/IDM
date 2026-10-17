package rg5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f254039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f254040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f254041c;
    public final SpinnerPickerView d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, SpinnerPickerView spinnerPickerView) {
        this.f254039a = controllerContainerConstraintLayout;
        this.f254040b = actionFooterView;
        this.f254041c = navBarWithToolbar;
        this.d = spinnerPickerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f254039a;
    }
}
