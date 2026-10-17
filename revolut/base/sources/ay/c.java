package ay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayView;
import com.revolut.camerakit.ui.views.view.player.CameraKitPlayer;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitView f10994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraKitDebugOverlayView f10995c;
    public final FooterTextView d;
    public final BasicNavBar e;
    public final CameraKitPlayer f;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CameraKitView cameraKitView, CameraKitDebugOverlayView cameraKitDebugOverlayView, FooterTextView footerTextView, BasicNavBar basicNavBar, CameraKitPlayer cameraKitPlayer) {
        this.f10993a = controllerContainerCoordinatorLayout;
        this.f10994b = cameraKitView;
        this.f10995c = cameraKitDebugOverlayView;
        this.d = footerTextView;
        this.e = basicNavBar;
        this.f = cameraKitPlayer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10993a;
    }
}
