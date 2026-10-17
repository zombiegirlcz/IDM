package myh;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f210509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f210510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f210511c;
    public final xi0.b d;
    public final xi0.b e;
    public final wd6.h f;

    public d(wd6.e exchangeMode, c topMoney, c bottomMoney, xi0.b topCurrency, xi0.b bottomCurrency) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(topMoney, "topMoney");
        Intrinsics.checkNotNullParameter(bottomMoney, "bottomMoney");
        Intrinsics.checkNotNullParameter(topCurrency, "topCurrency");
        Intrinsics.checkNotNullParameter(bottomCurrency, "bottomCurrency");
        this.f210509a = exchangeMode;
        this.f210510b = topMoney;
        this.f210511c = bottomMoney;
        this.d = topCurrency;
        this.e = bottomCurrency;
        this.f = wd6.h.MARKET;
    }

    @Override // myh.h
    public final wd6.e a() {
        return this.f210509a;
    }

    @Override // myh.h
    public final c b() {
        return this.f210510b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f210509a == dVar.f210509a && Intrinsics.f(this.f210510b, dVar.f210510b) && Intrinsics.f(this.f210511c, dVar.f210511c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    @Override // myh.h
    public final xi0.b getCurrency() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + l.j(this.d, (this.f210511c.hashCode() + ((this.f210510b.hashCode() + (this.f210509a.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // myh.h
    public final wd6.h t() {
        return this.f;
    }
}
