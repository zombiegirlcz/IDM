package jv0;

import android.graphics.SurfaceTexture;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UiKitPlayerView f178743b;

    public /* synthetic */ h(UiKitPlayerView uiKitPlayerView, int i) {
        this.f178742a = i;
        this.f178743b = uiKitPlayerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f178742a) {
            case 0:
                this.f178743b.f57717t.onRenderedFirstFrame();
                break;
            case 1:
                UiKitPlayerView uiKitPlayerView = this.f178743b;
                uiKitPlayerView.getShutterImageView().setAlpha(1.0f);
                uiKitPlayerView.getShutterImageView().setVisibility(8);
                break;
            case 2:
                this.f178743b.v.setAlpha(1.0f);
                break;
            default:
                UiKitPlayerView uiKitPlayerView2 = this.f178743b;
                kv0.c cVar = uiKitPlayerView2.f57719x;
                SurfaceTexture surfaceTexture = uiKitPlayerView2.d;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                uiKitPlayerView2.d = null;
                cVar.f189910b = null;
                cVar.b();
                break;
        }
    }
}
