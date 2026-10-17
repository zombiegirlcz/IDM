package yjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f314461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f314462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f314463c;

    public d(dj0.d dVar, dj0.d dVar2, dj0.d dVar3) {
        this.f314461a = dVar;
        this.f314462b = dVar2;
        this.f314463c = dVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f314461a, dVar.f314461a) && Intrinsics.f(this.f314462b, dVar.f314462b) && Intrinsics.f(this.f314463c, dVar.f314463c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f314461a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f314462b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f314463c;
        return iHashCode2 + (dVar3 != null ? dVar3.hashCode() : 0);
    }
}
