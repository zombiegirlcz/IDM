package dr2;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.barcode.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import io.fotoapparat.view.CameraView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, yq2.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/barcode/databinding/ScreenBarcodeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.barcodeScreen_actionButton;
        SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
        if (smallActionButton != null) {
            i = R$id.barcodeScreen_actionContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
            if (frameLayout != null) {
                i = R$id.barcodeScreen_cameraView;
                CameraView cameraView = (CameraView) ViewBindings.findChildViewById(p0, i);
                if (cameraView != null) {
                    i = R$id.barcodeScreen_navBarWithToolbar;
                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithToolbar != null) {
                        i = R$id.barcodeScreen_scanner;
                        ScanView scanView = (ScanView) ViewBindings.findChildViewById(p0, i);
                        if (scanView != null) {
                            return new yq2.a((ControllerContainerConstraintLayout) p0, smallActionButton, frameLayout, cameraView, navBarWithToolbar, scanView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
