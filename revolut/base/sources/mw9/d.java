package mw9;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ScanView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import io.fotoapparat.view.CameraView;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f209417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraView f209418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f209419c;
    public final FrameLayout d;
    public final ScanView e;
    public final ProgressBar f;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CameraView cameraView, TextView textView, FrameLayout frameLayout, ScanView scanView, ProgressBar progressBar) {
        this.f209417a = controllerContainerConstraintLayout;
        this.f209418b = cameraView;
        this.f209419c = textView;
        this.d = frameLayout;
        this.e = scanView;
        this.f = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f209417a;
    }
}
