package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f300959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f300960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f300961c;

    public d(mwg.d cash) {
        Intrinsics.checkNotNullParameter(cash, "cash");
        xi0.a aVar = xi0.b.Companion;
        String str = cash.f209447a;
        aVar.getClass();
        xi0.b currency = xi0.a.a(str);
        dj0.d value = cash.f209448b;
        float f = cash.f209449c;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300959a = currency;
        this.f300960b = value;
        this.f300961c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f300959a, dVar.f300959a) && Intrinsics.f(this.f300960b, dVar.f300960b) && Float.compare(this.f300961c, dVar.f300961c) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.f300961c;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f300960b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f300961c) + v7.c(this.f300959a.hashCode() * 31, 31, this.f300960b);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }
}
