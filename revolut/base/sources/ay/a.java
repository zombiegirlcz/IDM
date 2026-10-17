package ay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f10987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitView f10988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f10989c;
    public final TwinVerticalButton d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CameraKitView cameraKitView, NavBarWithToolbar navBarWithToolbar, TwinVerticalButton twinVerticalButton) {
        this.f10987a = controllerContainerConstraintLayout;
        this.f10988b = cameraKitView;
        this.f10989c = navBarWithToolbar;
        this.d = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10987a;
    }
}
