package kv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.m f189888a;

    public d(gv.m media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f189888a = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f189888a, ((d) obj2).f189888a);
    }

    public final int hashCode() {
        return this.f189888a.hashCode();
    }
}
