package if9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f160975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f160976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f160977c;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, BasicNavBar basicNavBar) {
        this.f160975a = controllerContainerCoordinatorLayout;
        this.f160976b = actionFooterView;
        this.f160977c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f160975a;
    }
}
