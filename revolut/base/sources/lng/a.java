package lng;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f197249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f197250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateInputView f197251c;
    public final InputText d;
    public final NavBarWithToolbar e;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, DateInputView dateInputView, InputText inputText, NavBarWithToolbar navBarWithToolbar) {
        this.f197249a = controllerContainerCoordinatorLayout;
        this.f197250b = actionFooterView;
        this.f197251c = dateInputView;
        this.d = inputText;
        this.e = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f197249a;
    }
}
