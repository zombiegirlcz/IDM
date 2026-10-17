package jxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cxe.d f179186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179187c;

    public k(cxe.d totalAmount, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f179185a = totalAmount;
        this.f179186b = dVar;
        dj0.d.Companion.getClass();
        this.f179187c = dj0.d.e;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.f179187c;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179185a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.f179186b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f179185a, kVar.f179185a) && Intrinsics.f(this.f179186b, kVar.f179186b);
    }

    public final int hashCode() {
        int iHashCode = this.f179185a.hashCode() * 31;
        cxe.d dVar = this.f179186b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
