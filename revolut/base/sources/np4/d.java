package np4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218131b;

    public d() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f218130a, dVar.f218130a) && Intrinsics.f(this.f218131b, dVar.f218131b);
    }

    public final int hashCode() {
        String str = this.f218130a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dj0.d dVar = this.f218131b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public d(dj0.d dVar, String str) {
        this.f218130a = str;
        this.f218131b = dVar;
    }
}
