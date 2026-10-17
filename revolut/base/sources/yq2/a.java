package yq2;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import io.fotoapparat.view.CameraView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f315976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmallActionButton f315977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f315978c;
    public final CameraView d;
    public final NavBarWithToolbar e;
    public final ScanView f;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, SmallActionButton smallActionButton, FrameLayout frameLayout, CameraView cameraView, NavBarWithToolbar navBarWithToolbar, ScanView scanView) {
        this.f315976a = controllerContainerConstraintLayout;
        this.f315977b = smallActionButton;
        this.f315978c = frameLayout;
        this.d = cameraView;
        this.e = navBarWithToolbar;
        this.f = scanView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f315976a;
    }
}
