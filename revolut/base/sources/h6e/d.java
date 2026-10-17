package h6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f149629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f149630b;

    public d() {
        this((c) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f149629a, dVar.f149629a) && Intrinsics.f(this.f149630b, dVar.f149630b);
    }

    public final int hashCode() {
        c cVar = this.f149629a;
        int iHashCode = (cVar == null ? 0 : cVar.f149628a.hashCode()) * 31;
        b bVar = this.f149630b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public /* synthetic */ d(c cVar, int i) {
        this((i & 1) != 0 ? null : cVar, (b) null);
    }

    public d(c cVar, b bVar) {
        this.f149629a = cVar;
        this.f149630b = bVar;
    }
}
