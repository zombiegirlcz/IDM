package jd1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f172926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f172927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f172928c;

    public h(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f172926a = controllerContainerConstraintLayout;
        this.f172927b = largeActionButton;
        this.f172928c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f172926a;
    }
}
