package rp0;

import com.revolut.core.ui_kit_core.displayers.media.Media;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Media f256157a;

    public r0(Media media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f256157a = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f256157a, ((r0) obj2).f256157a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f256157a.hashCode() * 31);
    }
}
