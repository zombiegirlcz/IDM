package hv;

import gv.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f155778a;

    public b(m media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f155778a = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f155778a, ((b) obj2).f155778a);
    }

    public final int hashCode() {
        return this.f155778a.hashCode();
    }
}
