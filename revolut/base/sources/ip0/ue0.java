package ip0;

import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ue0 extends ve0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Video f166648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0 f166649b;

    public ue0(Video video, te0 size) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f166648a = video;
        this.f166649b = size;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ue0)) {
            return false;
        }
        ue0 ue0Var = (ue0) obj2;
        return Intrinsics.f(this.f166648a, ue0Var.f166648a) && Intrinsics.f(this.f166649b, ue0Var.f166649b);
    }

    public final int hashCode() {
        return this.f166649b.hashCode() + (this.f166648a.hashCode() * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ue0(Video video, int i) {
        this(video, new se0(i));
        Intrinsics.checkNotNullParameter(video, "video");
    }
}
