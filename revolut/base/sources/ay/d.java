package ay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitView f10997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f10998c;
    public final CameraKitDebugOverlayView d;
    public final FooterTextView e;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CameraKitView cameraKitView, LargeActionButton largeActionButton, CameraKitDebugOverlayView cameraKitDebugOverlayView, FooterTextView footerTextView) {
        this.f10996a = controllerContainerCoordinatorLayout;
        this.f10997b = cameraKitView;
        this.f10998c = largeActionButton;
        this.d = cameraKitDebugOverlayView;
        this.e = footerTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10996a;
    }
}
