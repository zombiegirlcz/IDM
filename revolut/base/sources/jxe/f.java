package jxe;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cxe.d f179170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f179171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cxe.d f179172c;
    public final dj0.d d;

    public f(cxe.d totalAmount, dj0.d selectedExtraTopUpAmount, cxe.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(selectedExtraTopUpAmount, "selectedExtraTopUpAmount");
        this.f179170a = totalAmount;
        this.f179171b = selectedExtraTopUpAmount;
        this.f179172c = dVar;
        dj0.d.Companion.getClass();
        this.d = dj0.d.e;
    }

    @Override // jxe.l
    public final dj0.d a() {
        return this.d;
    }

    @Override // jxe.l
    public final cxe.d b() {
        return this.f179170a;
    }

    @Override // jxe.l
    public final cxe.d c() {
        return this.f179172c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f179170a, fVar.f179170a) && Intrinsics.f(this.f179171b, fVar.f179171b) && Intrinsics.f(this.f179172c, fVar.f179172c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f179170a.hashCode() * 31, 31, this.f179171b);
        cxe.d dVar = this.f179172c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
