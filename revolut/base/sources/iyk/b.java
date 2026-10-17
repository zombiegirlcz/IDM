package iyk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f169778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f169779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f169780c;
    public final SpinnerPickerView d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, SpinnerPickerView spinnerPickerView) {
        this.f169778a = controllerContainerConstraintLayout;
        this.f169779b = actionFooterView;
        this.f169780c = navBarWithToolbar;
        this.d = spinnerPickerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f169778a;
    }
}
