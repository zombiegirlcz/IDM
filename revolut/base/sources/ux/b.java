package ux;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.camerakit.revolut.ui.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ay.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/camerakit/revolut/ui/databinding/ScreenBarcodeReaderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.barcodeReaderScreen_actionButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.barcodeReaderScreen_cameraView;
            CameraKitView cameraKitView = (CameraKitView) ViewBindings.findChildViewById(p0, i);
            if (cameraKitView != null) {
                i = R$id.barcodeReaderScreen_navBar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                if (basicNavBar != null) {
                    return new ay.b((ControllerContainerConstraintLayout) p0, largeActionButton, cameraKitView, basicNavBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
