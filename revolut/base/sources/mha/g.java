package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f205451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f205452c;

    public g(String pricingPlanId, xi0.b currency, j jVar) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f205450a = pricingPlanId;
        this.f205451b = currency;
        this.f205452c = jVar;
    }

    @Override // mha.h
    public final String a() {
        return this.f205450a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205450a, gVar.f205450a) && Intrinsics.f(this.f205451b, gVar.f205451b) && Intrinsics.f(this.f205452c, gVar.f205452c);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f205451b, this.f205450a.hashCode() * 31, 31);
        j jVar = this.f205452c;
        return iJ + (jVar == null ? 0 : jVar.hashCode());
    }
}
