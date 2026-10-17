package jxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cxe.d f179180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179181c;

    public i(cxe.d totalAmount, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f179179a = totalAmount;
        this.f179180b = dVar;
        dj0.d.Companion.getClass();
        this.f179181c = dj0.d.e;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.f179181c;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179179a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.f179180b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f179179a, iVar.f179179a) && Intrinsics.f(this.f179180b, iVar.f179180b);
    }

    public final int hashCode() {
        int iHashCode = this.f179179a.hashCode() * 31;
        cxe.d dVar = this.f179180b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
