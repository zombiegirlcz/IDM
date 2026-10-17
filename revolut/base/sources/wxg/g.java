package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f300970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f300971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f300972c;
    public final float d;

    public g(mwg.c crypto) {
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        xi0.a aVar = xi0.b.Companion;
        String str = crypto.f209442a;
        aVar.getClass();
        xi0.b currency = xi0.a.a(str);
        dj0.d value = crypto.f209444c;
        BigDecimal amount = crypto.f209443b;
        float f = crypto.d;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300970a = currency;
        this.f300971b = amount;
        this.f300972c = value;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f300970a, gVar.f300970a) && Intrinsics.f(this.f300971b, gVar.f300971b) && Intrinsics.f(this.f300972c, gVar.f300972c) && Float.compare(this.d, gVar.d) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.d;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f300972c;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + v7.c(t61.a.d(this.f300971b, this.f300970a.hashCode() * 31, 31), 31, this.f300972c);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f300971b;
    }
}
