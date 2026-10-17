package txc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f275383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f275384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f275385c;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, NavBarWithToolbar navBarWithToolbar, TwinVerticalButton twinVerticalButton) {
        this.f275383a = controllerContainerFrameLayout;
        this.f275384b = navBarWithToolbar;
        this.f275385c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f275383a;
    }
}
