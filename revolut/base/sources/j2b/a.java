package j2b;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f170794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f170795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f170796c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar) {
        this.f170794a = controllerContainerConstraintLayout;
        this.f170795b = actionFooterView;
        this.f170796c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f170794a;
    }
}
