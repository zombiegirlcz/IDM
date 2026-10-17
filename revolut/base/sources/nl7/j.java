package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f217071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f217072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f217073c;

    public j(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f217071a = controllerContainerConstraintLayout;
        this.f217072b = navBarWithToolbar;
        this.f217073c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217071a;
    }
}
