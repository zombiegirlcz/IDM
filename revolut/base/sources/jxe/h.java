package jxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cxe.d f179177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179178c;

    public h(cxe.d totalAmount, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f179176a = totalAmount;
        this.f179177b = dVar;
        dj0.d.Companion.getClass();
        this.f179178c = dj0.d.e;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.f179178c;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179176a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.f179177b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f179176a, hVar.f179176a) && Intrinsics.f(this.f179177b, hVar.f179177b);
    }

    public final int hashCode() {
        int iHashCode = this.f179176a.hashCode() * 31;
        cxe.d dVar = this.f179177b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
