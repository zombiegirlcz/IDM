package az;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.camerakit.revolut.ui.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, ay.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/camerakit/revolut/ui/databinding/ScreenCameraKitFlowTerminalCameraBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cameraKitTerminalCameraScreen_cameraKitView;
        CameraKitView cameraKitView = (CameraKitView) ViewBindings.findChildViewById(p0, i);
        if (cameraKitView != null) {
            i = R$id.cameraKitTerminalCameraScreen_close;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.cameraKitTerminalCameraScreen_debugOverlay;
                CameraKitDebugOverlayView cameraKitDebugOverlayView = (CameraKitDebugOverlayView) ViewBindings.findChildViewById(p0, i);
                if (cameraKitDebugOverlayView != null) {
                    i = R$id.cameraKitTerminalCameraScreen_footerText;
                    FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
                    if (footerTextView != null) {
                        return new ay.d((ControllerContainerCoordinatorLayout) p0, cameraKitView, largeActionButton, cameraKitDebugOverlayView, footerTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
