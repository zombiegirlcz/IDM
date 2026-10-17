package v30;

import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f285809a;

    public o(UrlVideo video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f285809a = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f285809a.equals(((o) obj2).f285809a);
    }

    public final int hashCode() {
        return this.f285809a.hashCode();
    }
}
