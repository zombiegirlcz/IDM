package nr;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.camerakit.ui.views.view.CameraKitHintView;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f218498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitHintView f218499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinHorizontalButton f218500c;

    public f(ControllerContainerFrameLayout controllerContainerFrameLayout, CameraKitHintView cameraKitHintView, TwinHorizontalButton twinHorizontalButton) {
        this.f218498a = controllerContainerFrameLayout;
        this.f218499b = cameraKitHintView;
        this.f218500c = twinHorizontalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f218498a;
    }
}
