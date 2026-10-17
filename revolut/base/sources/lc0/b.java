package lc0;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.backend_flow.photo.R$id;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import io.fotoapparat.view.CameraView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ic0.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/core/backend_flow/photo/databinding/ScreenCardPhotoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cardPhoto_cameraView;
        CameraView cameraView = (CameraView) ViewBindings.findChildViewById(p0, i);
        if (cameraView != null) {
            i = R$id.cardPhoto_finderGroup;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
            if (frameLayout != null) {
                i = R$id.cardPhoto_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.cardPhoto_previewView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(p0, i);
                    if (imageView != null) {
                        i = R$id.cardPhoto_takePhotoButton;
                        Button button = (Button) ViewBindings.findChildViewById(p0, i);
                        if (button != null) {
                            i = R$id.cardPhoto_twinVerticalButton;
                            TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                            if (twinVerticalButton != null) {
                                return new ic0.a((ControllerContainerFrameLayout) p0, cameraView, frameLayout, navBarWithToolbar, imageView, button, twinVerticalButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
