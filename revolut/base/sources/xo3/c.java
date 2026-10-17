package xo3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f307594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f307595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f307596c;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar) {
        this.f307594a = controllerContainerFrameLayout;
        this.f307595b = largeActionButton;
        this.f307596c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307594a;
    }
}
