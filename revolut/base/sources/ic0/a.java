package ic0;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import io.fotoapparat.view.CameraView;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f160197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraView f160198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f160199c;
    public final NavBarWithToolbar d;
    public final ImageView e;
    public final Button f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TwinVerticalButton f160200g;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, CameraView cameraView, FrameLayout frameLayout, NavBarWithToolbar navBarWithToolbar, ImageView imageView, Button button, TwinVerticalButton twinVerticalButton) {
        this.f160197a = controllerContainerFrameLayout;
        this.f160198b = cameraView;
        this.f160199c = frameLayout;
        this.d = navBarWithToolbar;
        this.e = imageView;
        this.f = button;
        this.f160200g = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f160197a;
    }
}
