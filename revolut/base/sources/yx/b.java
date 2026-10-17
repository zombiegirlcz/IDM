package yx;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.camerakit.revolut.ui.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ay.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/camerakit/revolut/ui/databinding/ScreenBarcodeQrReaderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.barcodeQrReaderScreen_cameraView;
        CameraKitView cameraKitView = (CameraKitView) ViewBindings.findChildViewById(p0, i);
        if (cameraKitView != null) {
            i = R$id.barcodeQrReaderScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                int i2 = R$id.screenRecyclerNavbarTwinVerticalButton_twinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i2);
                if (twinVerticalButton != null) {
                    return new ay.a(controllerContainerConstraintLayout, cameraKitView, navBarWithToolbar, twinVerticalButton);
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
