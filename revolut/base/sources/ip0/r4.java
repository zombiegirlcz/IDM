package ip0;

import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Video f166103a;

    public r4(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f166103a = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r4) && Intrinsics.f(this.f166103a, ((r4) obj2).f166103a);
    }

    public final int hashCode() {
        return this.f166103a.hashCode();
    }
}
