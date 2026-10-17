package afa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f3977b;

    public a0(String currency, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f3976a = currency;
        this.f3977b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f3976a, a0Var.f3976a) && Intrinsics.f(this.f3977b, a0Var.f3977b);
    }

    public final int hashCode() {
        return this.f3977b.f297794a.hashCode() + (this.f3976a.hashCode() * 31);
    }
}
