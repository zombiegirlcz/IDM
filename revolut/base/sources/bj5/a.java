package bj5;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import io.fotoapparat.view.CameraView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraView f15562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f15563c;
    public final FrameLayout d;
    public final NavBarWithToolbar e;
    public final ScanView f;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CameraView cameraView, TextView textView, FrameLayout frameLayout, NavBarWithToolbar navBarWithToolbar, ScanView scanView) {
        this.f15561a = controllerContainerConstraintLayout;
        this.f15562b = cameraView;
        this.f15563c = textView;
        this.d = frameLayout;
        this.e = navBarWithToolbar;
        this.f = scanView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f15561a;
    }
}
