package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f215214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoomableFullScreenVideoView f215215b;

    public l(ControllerContainerFrameLayout controllerContainerFrameLayout, ZoomableFullScreenVideoView zoomableFullScreenVideoView) {
        this.f215214a = controllerContainerFrameLayout;
        this.f215215b = zoomableFullScreenVideoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215214a;
    }
}
