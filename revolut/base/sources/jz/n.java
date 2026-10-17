package jz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv.m f179558b;

    public n(gv.m media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f179558b = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f179558b, ((n) obj2).f179558b);
    }

    public final int hashCode() {
        return this.f179558b.hashCode();
    }
}
