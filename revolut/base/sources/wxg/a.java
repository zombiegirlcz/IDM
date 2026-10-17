package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300951c;
    public final dj0.d d;
    public final float e;
    public final BigDecimal f;

    public a(mwg.c bond, String name, String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(bond, "bond");
        Intrinsics.checkNotNullParameter(name, "assetName");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        dj0.d value = bond.f209444c;
        float f = bond.d;
        BigDecimal quantity = bond.f209443b;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f300949a = symbol;
        this.f300950b = ref2;
        this.f300951c = name;
        this.d = value;
        this.e = f;
        this.f = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f300949a, aVar.f300949a) && Intrinsics.f(this.f300950b, aVar.f300950b) && Intrinsics.f(this.f300951c, aVar.f300951c) && Intrinsics.f(this.d, aVar.d) && Float.compare(this.e, aVar.e) == 0 && Intrinsics.f(this.f, aVar.f);
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
        return this.f.hashCode() + m72.b.b(this.e, v7.c(p.a.c(p.a.c(this.f300949a.hashCode() * 31, 31, this.f300950b), 31, this.f300951c), 31, this.d), 31);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f;
    }
}
