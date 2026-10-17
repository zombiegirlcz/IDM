package nz0;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import jv0.v;
import kotlin.jvm.internal.Intrinsics;
import oz0.d;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements mz0.b {
    @Override // mz0.b
    public final boolean a(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        return video instanceof UriVideo;
    }

    @Override // mz0.b
    public final void b(Video video, mz0.c videoPlayer, jz0.c cVar) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        UriVideo uriVideo = video instanceof UriVideo ? (UriVideo) video : null;
        if (uriVideo == null) {
            throw mz0.b.c("UriVideo");
        }
        videoPlayer.setRepeat(uriVideo.f60087c);
        Boolean bool = uriVideo.e;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            videoPlayer.setVideoVolumeMode(d.ALWAYS);
            videoPlayer.setVolumeLevel(zBooleanValue ? BitmapDescriptorFactory.HUE_RED : 1.0f);
        }
        oz0.b bVar = uriVideo.d;
        if (bVar != null) {
            videoPlayer.setScaleType(bVar);
        }
        UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) videoPlayer;
        Context context = uiKitPlayerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uri2 = kli.a.q(context) ? uriVideo.f60086b : uriVideo.f60085a;
        oz0.c transparencyMode = uriVideo.f60088g;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        uiKitPlayerView.j(new v(uri2, transparencyMode), cVar);
        if (uriVideo.f) {
            uiKitPlayerView.i();
        }
    }
}
