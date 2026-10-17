package a60;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f1508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoomableFullScreenVideoView f1509b;

    public b(ControllerContainerFrameLayout controllerContainerFrameLayout, ZoomableFullScreenVideoView zoomableFullScreenVideoView) {
        this.f1508a = controllerContainerFrameLayout;
        this.f1509b = zoomableFullScreenVideoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1508a;
    }
}
