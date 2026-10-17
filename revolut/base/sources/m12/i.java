package m12;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import io.fotoapparat.view.CameraView;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f201212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraView f201213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f201214c;
    public final FrameLayout d;
    public final ScanView e;
    public final ProgressBar f;

    public i(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CameraView cameraView, TextView textView, FrameLayout frameLayout, ScanView scanView, ProgressBar progressBar) {
        this.f201212a = controllerContainerConstraintLayout;
        this.f201213b = cameraView;
        this.f201214c = textView;
        this.d = frameLayout;
        this.e = scanView;
        this.f = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f201212a;
    }
}
