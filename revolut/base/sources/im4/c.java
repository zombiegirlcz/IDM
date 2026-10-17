package im4;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f162302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tabs f162303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f162304c;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, Tabs tabs, NavBarWithToolbar navBarWithToolbar) {
        this.f162302a = controllerContainerConstraintLayout;
        this.f162303b = tabs;
        this.f162304c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f162302a;
    }
}
