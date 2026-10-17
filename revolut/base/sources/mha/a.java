package mha;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f205434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f205435c;
    public final j d;

    public a(String pricingPlanId, xi0.b currency, dj0.d limit, j fee2) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f205433a = pricingPlanId;
        this.f205434b = currency;
        this.f205435c = limit;
        this.d = fee2;
    }

    @Override // mha.h
    public final String a() {
        return this.f205433a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f205433a, aVar.f205433a) && Intrinsics.f(this.f205434b, aVar.f205434b) && Intrinsics.f(this.f205435c, aVar.f205435c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(h30.l.j(this.f205434b, this.f205433a.hashCode() * 31, 31), 31, this.f205435c);
    }
}
