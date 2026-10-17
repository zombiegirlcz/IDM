package ug7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f279983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f279984b;

    public e() {
        this((d) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f279983a, eVar.f279983a) && Intrinsics.f(this.f279984b, eVar.f279984b);
    }

    public final int hashCode() {
        d dVar = this.f279983a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f279984b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public /* synthetic */ e(d dVar, int i) {
        this((i & 1) != 0 ? null : dVar, (d) null);
    }

    public e(d dVar, d dVar2) {
        this.f279983a = dVar;
        this.f279984b = dVar2;
    }
}
