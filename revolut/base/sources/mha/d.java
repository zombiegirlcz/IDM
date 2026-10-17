package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f205443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f205444c;

    public d(String pricingPlanId, xi0.b currency, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f205442a = pricingPlanId;
        this.f205443b = currency;
        this.f205444c = dVar;
    }

    @Override // mha.h
    public final String a() {
        return this.f205442a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f205442a, dVar.f205442a) && Intrinsics.f(this.f205443b, dVar.f205443b) && Intrinsics.f(this.f205444c, dVar.f205444c);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f205443b, this.f205442a.hashCode() * 31, 31);
        dj0.d dVar = this.f205444c;
        return iJ + (dVar == null ? 0 : dVar.hashCode());
    }
}
