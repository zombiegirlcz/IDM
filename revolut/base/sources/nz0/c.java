package nz0;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import jv0.w;
import kotlin.jvm.internal.Intrinsics;
import oz0.d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements mz0.b {
    @Override // mz0.b
    public final boolean a(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        return video instanceof UrlVideo;
    }

    @Override // mz0.b
    public final void b(Video video, mz0.c videoPlayer, jz0.c cVar) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        UrlVideo urlVideo = video instanceof UrlVideo ? (UrlVideo) video : null;
        if (urlVideo == null) {
            throw mz0.b.c("UrlVideo");
        }
        videoPlayer.setRepeat(urlVideo.f60091c);
        Boolean bool = urlVideo.e;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            videoPlayer.setVideoVolumeMode(d.ALWAYS);
            if (zBooleanValue) {
                videoPlayer.setVolumeLevel(BitmapDescriptorFactory.HUE_RED);
            } else {
                videoPlayer.setVolumeLevel(1.0f);
            }
        }
        oz0.b bVar = urlVideo.d;
        if (bVar != null) {
            videoPlayer.setScaleType(bVar);
        }
        UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) videoPlayer;
        Context context = uiKitPlayerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        String url2 = kli.a.q(context) ? urlVideo.f60090b : urlVideo.f60089a;
        UrlVideo urlVideo2 = (UrlVideo) video;
        oz0.c transparencyMode = urlVideo2.f60092g;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        uiKitPlayerView.j(new w(url2, transparencyMode), cVar);
        if (urlVideo2.f) {
            uiKitPlayerView.i();
        }
    }
}
