package iy0;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZoomableFullScreenVideoView f169577b;

    public /* synthetic */ a(ZoomableFullScreenVideoView zoomableFullScreenVideoView, int i) {
        this.f169576a = i;
        this.f169577b = zoomableFullScreenVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f169576a;
        ZoomableFullScreenVideoView zoomableFullScreenVideoView = this.f169577b;
        switch (i) {
            case 0:
                ZoomableFullScreenVideoView.b(zoomableFullScreenVideoView);
                break;
            case 1:
                int i2 = ZoomableFullScreenVideoView.C;
                zoomableFullScreenVideoView.A = null;
                SmallActionButton smallActionButton = zoomableFullScreenVideoView.f59764x;
                smallActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                smallActionButton.setVisibility(0);
                smallActionButton.animate().alpha(1.0f).start();
                break;
            default:
                int i3 = ZoomableFullScreenVideoView.C;
                ViewParent parent = zoomableFullScreenVideoView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(zoomableFullScreenVideoView);
                }
                break;
        }
    }
}
