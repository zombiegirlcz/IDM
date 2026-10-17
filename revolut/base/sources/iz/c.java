package iz;

import gv.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f169803a;

    public c(m media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f169803a = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f169803a, ((c) obj2).f169803a);
    }

    public final int hashCode() {
        return this.f169803a.hashCode();
    }
}
