package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f205446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f205447c;
    public final j d;

    public e(String pricingPlanId, xi0.b currency, Long l2, j fee2) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f205445a = pricingPlanId;
        this.f205446b = currency;
        this.f205447c = l2;
        this.d = fee2;
    }

    @Override // mha.h
    public final String a() {
        return this.f205445a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f205445a, eVar.f205445a) && Intrinsics.f(this.f205446b, eVar.f205446b) && Intrinsics.f(this.f205447c, eVar.f205447c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f205446b, this.f205445a.hashCode() * 31, 31);
        Long l2 = this.f205447c;
        return this.d.hashCode() + ((iJ + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
