package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f115671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogoWithTaglineView f115672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f115673c;

    public o(ControllerContainerLinearLayout controllerContainerLinearLayout, LogoWithTaglineView logoWithTaglineView, NavBarWithToolbar navBarWithToolbar) {
        this.f115671a = controllerContainerLinearLayout;
        this.f115672b = logoWithTaglineView;
        this.f115673c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115671a;
    }
}
