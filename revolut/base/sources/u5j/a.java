package u5j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f277455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ButtonsActionsView f277456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f277457c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ButtonsActionsView buttonsActionsView, NavBarWithToolbar navBarWithToolbar) {
        this.f277455a = controllerContainerCoordinatorLayout;
        this.f277456b = buttonsActionsView;
        this.f277457c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f277455a;
    }
}
