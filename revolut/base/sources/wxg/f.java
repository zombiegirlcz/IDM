package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f300967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f300968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f300969c;
    public final float d;

    public f(mwg.c commodity) {
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        xi0.a aVar = xi0.b.Companion;
        String str = commodity.f209442a;
        aVar.getClass();
        xi0.b currency = xi0.a.a(str);
        dj0.d value = commodity.f209444c;
        float f = commodity.d;
        BigDecimal amount = commodity.f209443b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300967a = currency;
        this.f300968b = amount;
        this.f300969c = value;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f300967a, fVar.f300967a) && Intrinsics.f(this.f300968b, fVar.f300968b) && Intrinsics.f(this.f300969c, fVar.f300969c) && Float.compare(this.d, fVar.d) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.d;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f300969c;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + v7.c(t61.a.d(this.f300968b, this.f300967a.hashCode() * 31, 31), 31, this.f300969c);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f300968b;
    }
}
