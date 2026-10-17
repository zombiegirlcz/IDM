package myh;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f210518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f210519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f210520c;
    public final wd6.h d;

    public g(wd6.e exchangeMode, b amount, xi0.b currency) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f210518a = exchangeMode;
        this.f210519b = amount;
        this.f210520c = currency;
        this.d = wd6.h.TAKE_PROFIT_STOP_LOSS;
    }

    @Override // myh.h
    public final wd6.e a() {
        return this.f210518a;
    }

    @Override // myh.h
    public final c b() {
        return this.f210519b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f210518a == gVar.f210518a && Intrinsics.f(this.f210519b, gVar.f210519b) && Intrinsics.f(this.f210520c, gVar.f210520c);
    }

    @Override // myh.h
    public final xi0.b getCurrency() {
        return this.f210520c;
    }

    public final int hashCode() {
        return this.f210520c.hashCode() + v7.c(this.f210518a.hashCode() * 31, 31, this.f210519b.f210508a);
    }

    @Override // myh.h
    public final wd6.h t() {
        return this.d;
    }
}
