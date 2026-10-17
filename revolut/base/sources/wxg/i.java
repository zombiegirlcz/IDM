package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f300976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f300977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f300978c;
    public final float d;

    public i(iwg.a analyticsProductType, int i, dj0.d value, float f) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300976a = analyticsProductType;
        this.f300977b = i;
        this.f300978c = value;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f300976a == iVar.f300976a && this.f300977b == iVar.f300977b && Intrinsics.f(this.f300978c, iVar.f300978c) && Float.compare(this.d, iVar.d) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.d;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f300978c;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + v7.c(j6.a.b(this.f300977b, this.f300976a.hashCode() * 31, 31), 31, this.f300978c);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }
}
