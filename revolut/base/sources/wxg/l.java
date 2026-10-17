package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f300987c;
    public final String d;
    public final dj0.d e;
    public final float f;

    public l(mwg.c stock, String name, String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(stock, "stock");
        Intrinsics.checkNotNullParameter(name, "assetName");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        BigDecimal shares = stock.f209443b;
        dj0.d value = stock.f209444c;
        float f = stock.d;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(shares, "shares");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300985a = symbol;
        this.f300986b = ref2;
        this.f300987c = shares;
        this.d = name;
        this.e = value;
        this.f = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f300985a, lVar.f300985a) && Intrinsics.f(this.f300986b, lVar.f300986b) && Intrinsics.f(this.f300987c, lVar.f300987c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Float.compare(this.f, lVar.f) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.f;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + v7.c(p.a.c(t61.a.d(this.f300987c, p.a.c(this.f300985a.hashCode() * 31, 31, this.f300986b), 31), 31, this.d), 31, this.e);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f300987c;
    }
}
