package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f205437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f205438c;
    public final j d;

    public b(String pricingPlanId, xi0.b currency, j fee2, j jVar) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f205436a = pricingPlanId;
        this.f205437b = currency;
        this.f205438c = fee2;
        this.d = jVar;
    }

    @Override // mha.h
    public final String a() {
        return this.f205436a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f205436a, bVar.f205436a) && Intrinsics.f(this.f205437b, bVar.f205437b) && Intrinsics.f(this.f205438c, bVar.f205438c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f205438c.hashCode() + h30.l.j(this.f205437b, this.f205436a.hashCode() * 31, 31)) * 31;
        j jVar = this.d;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
