package vb1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f287353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f287354b;

    public b(ControllerContainerLinearLayout controllerContainerLinearLayout, NavBarWithToolbar navBarWithToolbar) {
        this.f287353a = controllerContainerLinearLayout;
        this.f287354b = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f287353a;
    }
}
