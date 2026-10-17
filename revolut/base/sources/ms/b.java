package ms;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.biometric_verification.impl.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitHintView;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, nr.f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/biometric_verification/impl/databinding/ScreenSubmitConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.submitConfirmationHintView;
        CameraKitHintView cameraKitHintView = (CameraKitHintView) ViewBindings.findChildViewById(p0, i);
        if (cameraKitHintView != null) {
            i = R$id.submitConfirmationTwinButton;
            TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) ViewBindings.findChildViewById(p0, i);
            if (twinHorizontalButton != null) {
                return new nr.f((ControllerContainerFrameLayout) p0, cameraKitHintView, twinHorizontalButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
