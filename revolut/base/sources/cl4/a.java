package cl4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f24928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f24929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f24930c;
    public final boolean d;
    public final dj0.d e;
    public final boolean f;

    public a(d cashback, xi0.b currency, wi0.b countryCode, boolean z, dj0.d creditLimit, boolean z3) {
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        this.f24928a = cashback;
        this.f24929b = currency;
        this.f24930c = countryCode;
        this.d = z;
        this.e = creditLimit;
        this.f = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24928a, aVar.f24928a) && Intrinsics.f(this.f24929b, aVar.f24929b) && Intrinsics.f(this.f24930c, aVar.f24930c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + v7.c(j6.a.c(p.a.c(h30.l.j(this.f24929b, this.f24928a.hashCode() * 31, 31), 31, this.f24930c.f297794a), 31, this.d), 31, this.e);
    }
}
