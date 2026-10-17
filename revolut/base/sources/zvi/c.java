package zvi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f325687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f325688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f325689c;

    public c(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f325687a = controllerContainerConstraintLayout;
        this.f325688b = largeActionButton;
        this.f325689c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f325687a;
    }
}
