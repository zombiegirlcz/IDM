package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl4.c f290279b;

    public p(String label, tl4.c cVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f290278a = label;
        this.f290279b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f290278a, pVar.f290278a) && this.f290279b == pVar.f290279b;
    }

    public final int hashCode() {
        int iHashCode = this.f290278a.hashCode() * 31;
        tl4.c cVar = this.f290279b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
