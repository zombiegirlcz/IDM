package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f205440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f205441c;
    public final j d;
    public final j e;

    public c(String pricingPlanId, xi0.b currency, dj0.d dVar, j fee2, j jVar) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f205439a = pricingPlanId;
        this.f205440b = currency;
        this.f205441c = dVar;
        this.d = fee2;
        this.e = jVar;
    }

    @Override // mha.h
    public final String a() {
        return this.f205439a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f205439a, cVar.f205439a) && Intrinsics.f(this.f205440b, cVar.f205440b) && Intrinsics.f(this.f205441c, cVar.f205441c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f205440b, this.f205439a.hashCode() * 31, 31);
        dj0.d dVar = this.f205441c;
        int iHashCode = (this.d.hashCode() + ((iJ + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        j jVar = this.e;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }
}
