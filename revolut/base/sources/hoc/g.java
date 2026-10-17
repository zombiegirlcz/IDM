package hoc;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalValueChartPoint f154275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f154276b;

    public g(TotalValueChartPoint totalValuePoint) {
        Intrinsics.checkNotNullParameter(totalValuePoint, "totalValuePoint");
        this.f154275a = totalValuePoint;
        this.f154276b = j.b(new h1g.a(this, 28));
    }

    @Override // hoc.h
    public final BigDecimal a() {
        return (BigDecimal) this.f154276b.getValue();
    }

    @Override // hoc.h
    public final long b() {
        return this.f154275a.f95005a.getMillis();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f154275a, ((g) obj2).f154275a);
    }

    @Override // hoc.h
    public final BigDecimal getValue() {
        return pyd.c.x(this.f154275a.f95006b);
    }

    public final int hashCode() {
        return this.f154275a.hashCode();
    }
}
