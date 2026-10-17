package x32;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import io.fotoapparat.view.CameraView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, m12.i.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrScannerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.qrScanner_cameraView;
        CameraView cameraView = (CameraView) ViewBindings.findChildViewById(p0, i);
        if (cameraView != null) {
            i = R$id.qrScanner_messageLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(p0, i);
            if (textView != null) {
                i = R$id.qrScanner_messageLabelContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                if (frameLayout != null) {
                    i = R$id.qrScanner_scanView;
                    ScanView scanView = (ScanView) ViewBindings.findChildViewById(p0, i);
                    if (scanView != null) {
                        i = R$id.qrScanner_scannerProgress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(p0, i);
                        if (progressBar != null) {
                            return new m12.i((ControllerContainerConstraintLayout) p0, cameraView, textView, frameLayout, scanView, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
