package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300957c;
    public final dj0.d d;
    public final dj0.d e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f300958g;

    public c(mwg.c cfdAsset, String name, String ref2, String symbol, dj0.d currentPrice) {
        Intrinsics.checkNotNullParameter(cfdAsset, "cfdAsset");
        Intrinsics.checkNotNullParameter(name, "assetName");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        dj0.d value = cfdAsset.f209444c;
        float f = cfdAsset.d;
        BigDecimal quantity = cfdAsset.f209443b;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f300955a = symbol;
        this.f300956b = ref2;
        this.f300957c = name;
        this.d = currentPrice;
        this.e = value;
        this.f = f;
        this.f300958g = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f300955a, cVar.f300955a) && Intrinsics.f(this.f300956b, cVar.f300956b) && Intrinsics.f(this.f300957c, cVar.f300957c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Float.compare(this.f, cVar.f) == 0 && Intrinsics.f(this.f300958g, cVar.f300958g);
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
        return this.f300958g.hashCode() + m72.b.b(this.f, v7.c(v7.c(p.a.c(p.a.c(this.f300955a.hashCode() * 31, 31, this.f300956b), 31, this.f300957c), 31, this.d), 31, this.e), 31);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f300958g;
    }
}
