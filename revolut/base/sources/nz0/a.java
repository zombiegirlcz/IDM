package nz0;

import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.LocalResourceVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import jv0.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements mz0.b {
    @Override // mz0.b
    public final boolean a(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        return video instanceof LocalResourceVideo;
    }

    @Override // mz0.b
    public final void b(Video video, mz0.c videoPlayer, jz0.c cVar) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        if ((video instanceof LocalResourceVideo ? (LocalResourceVideo) video : null) == null) {
            throw mz0.b.c("LocalResourceVideo");
        }
        LocalResourceVideo localResourceVideo = (LocalResourceVideo) video;
        videoPlayer.setRepeat(localResourceVideo.getF60083b());
        VideoShutter f60084c = localResourceVideo.getF60084c();
        if (f60084c != null) {
            videoPlayer.setShutter(f60084c);
        }
        oz0.b d = localResourceVideo.getD();
        if (d != null) {
            videoPlayer.setScaleType(d);
        }
        int f60082a = localResourceVideo.getF60082a();
        oz0.c transparencyMode = localResourceVideo.getF();
        UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) videoPlayer;
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        uiKitPlayerView.j(new u(f60082a, transparencyMode), cVar);
        if (localResourceVideo.getE()) {
            uiKitPlayerView.i();
        }
    }
}
