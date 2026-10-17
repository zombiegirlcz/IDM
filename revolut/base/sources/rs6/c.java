package rs6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f257023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f257024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f257025c;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar) {
        this.f257023a = controllerContainerFrameLayout;
        this.f257024b = largeActionButton;
        this.f257025c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f257023a;
    }
}
