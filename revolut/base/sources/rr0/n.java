package rr0;

import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.LocalResourceVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import mx0.d2;

/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private n() {
    }

    public static boolean a(Video video, d2 d2Var) throws Throwable {
        if (video instanceof LocalResourceVideo) {
            if (d2Var != d2.FULLSCREEN_VIDEO_DARK && ((LocalResourceVideo) video).f != oz0.c.ENABLED) {
                return false;
            }
            LocalResourceVideo localResourceVideo = (LocalResourceVideo) video;
            if (localResourceVideo.f60083b || !localResourceVideo.e) {
                return false;
            }
        } else {
            if (!(video instanceof UrlVideo)) {
                hx7.e.n(new IllegalArgumentException("Unexpected video type received = " + video));
                return true;
            }
            if (d2Var != d2.FULLSCREEN_VIDEO_DARK && ((UrlVideo) video).f60092g != oz0.c.ENABLED) {
                return false;
            }
            UrlVideo urlVideo = (UrlVideo) video;
            if (urlVideo.f60091c || !urlVideo.f) {
                return false;
            }
        }
        return true;
    }
}
