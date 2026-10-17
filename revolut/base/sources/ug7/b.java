package ug7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f279979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f279980b;

    public b() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f279979a, bVar.f279979a) && Intrinsics.f(this.f279980b, bVar.f279980b);
    }

    public final int hashCode() {
        a aVar = this.f279979a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f279980b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public b(a aVar, a aVar2) {
        this.f279979a = aVar;
        this.f279980b = aVar2;
    }
}
