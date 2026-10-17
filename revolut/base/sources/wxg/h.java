package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300975c;
    public final dj0.d d;
    public final float e;
    public final BigDecimal f;

    public h(mwg.c fund, String name, String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(fund, "fund");
        Intrinsics.checkNotNullParameter(name, "assetName");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        dj0.d value = fund.f209444c;
        float f = fund.d;
        BigDecimal quantity = fund.f209443b;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f300973a = symbol;
        this.f300974b = ref2;
        this.f300975c = name;
        this.d = value;
        this.e = f;
        this.f = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f300973a, hVar.f300973a) && Intrinsics.f(this.f300974b, hVar.f300974b) && Intrinsics.f(this.f300975c, hVar.f300975c) && Intrinsics.f(this.d, hVar.d) && Float.compare(this.e, hVar.e) == 0 && Intrinsics.f(this.f, hVar.f);
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.e;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + m72.b.b(this.e, v7.c(p.a.c(p.a.c(this.f300973a.hashCode() * 31, 31, this.f300974b), 31, this.f300975c), 31, this.d), 31);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f;
    }
}
