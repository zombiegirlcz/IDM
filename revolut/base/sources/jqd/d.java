package jqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f177702b;

    public d(String fundingPocketId, xi0.b defaultCurrency) {
        Intrinsics.checkNotNullParameter(fundingPocketId, "fundingPocketId");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        this.f177701a = fundingPocketId;
        this.f177702b = defaultCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f177701a, dVar.f177701a) && Intrinsics.f(this.f177702b, dVar.f177702b);
    }

    public final int hashCode() {
        return this.f177702b.hashCode() + (this.f177701a.hashCode() * 31);
    }
}
