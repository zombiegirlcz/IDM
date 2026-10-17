package jxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cxe.d f179168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179169c;

    public e(cxe.d totalAmount, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f179167a = totalAmount;
        this.f179168b = dVar;
        dj0.d.Companion.getClass();
        this.f179169c = dj0.d.e;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.f179169c;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179167a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.f179168b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f179167a, eVar.f179167a) && Intrinsics.f(this.f179168b, eVar.f179168b);
    }

    public final int hashCode() {
        int iHashCode = this.f179167a.hashCode() * 31;
        cxe.d dVar = this.f179168b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
