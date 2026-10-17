package g50;

import cli.j;
import cli.o;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements j, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Video f140598a;

    public d(UrlVideo urlVideo) {
        this.f140598a = urlVideo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f140598a, ((d) obj2).f140598a);
    }

    public final int hashCode() {
        Video video = this.f140598a;
        if (video == null) {
            return 0;
        }
        return video.hashCode();
    }
}
