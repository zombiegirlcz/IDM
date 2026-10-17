package sy;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.camerakit.revolut.ui.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayView;
import com.revolut.camerakit.ui.views.view.player.CameraKitPlayer;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ay.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/camerakit/revolut/ui/databinding/ScreenCameraKitFlowCameraBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cameraKitCameraScreen_cameraKitView;
        CameraKitView cameraKitView = (CameraKitView) ViewBindings.findChildViewById(p0, i);
        if (cameraKitView != null) {
            i = R$id.cameraKitCameraScreen_debugOverlay;
            CameraKitDebugOverlayView cameraKitDebugOverlayView = (CameraKitDebugOverlayView) ViewBindings.findChildViewById(p0, i);
            if (cameraKitDebugOverlayView != null) {
                i = R$id.cameraKitCameraScreen_footerText;
                FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
                if (footerTextView != null) {
                    i = R$id.cameraKitCameraScreen_navBar;
                    BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                    if (basicNavBar != null) {
                        i = R$id.cameraKitCameraScreen_player;
                        CameraKitPlayer cameraKitPlayer = (CameraKitPlayer) ViewBindings.findChildViewById(p0, i);
                        if (cameraKitPlayer != null) {
                            return new ay.c((ControllerContainerCoordinatorLayout) p0, cameraKitView, cameraKitDebugOverlayView, footerTextView, basicNavBar, cameraKitPlayer);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
