package ind;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f162792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.i f162793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f162794c;
    public final xi0.b d;
    public final b0 e;
    public final CategorisationFilter f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f162795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f162796h;
    public final dj0.d i;

    public c(AnalyticsSpendingPeriod$Interval interval, lzi.i type, long j2, xi0.b currency, b0 section, CategorisationFilter categorisationFilter, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, List rates) {
        Iterable iterableE0;
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f162792a = interval;
        this.f162793b = type;
        this.f162794c = j2;
        this.d = currency;
        this.e = section;
        this.f = categorisationFilter;
        this.f162795g = analyticsSpendingPeriod$Interval;
        this.f162796h = rates;
        if (section instanceof a0) {
            iterableE0 = ((a0) section).f162787a;
        } else {
            if (!(section instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVar = (z) section;
            iterableE0 = d0.E0(zVar.f162836b, zVar.f162835a);
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : iterableE0) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? ((he3.j) obj2).f151564b : pyd.c.O(dVarO, ((he3.j) obj2).f151564b);
            i = i2;
        }
        this.i = otd.f.e(dVarO, this.d);
    }

    @Override // ind.e
    public final b0 D() {
        return this.e;
    }

    @Override // ind.e
    public final AnalyticsSpendingPeriod$Interval a() {
        return this.f162792a;
    }

    public final ArrayList b(boolean z) {
        b0 b0Var = this.e;
        if (!(b0Var instanceof a0)) {
            if (!(b0Var instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVar = (z) b0Var;
            return d0.E0(zVar.f162836b, zVar.f162835a);
        }
        a0 a0Var = (a0) b0Var;
        List list = a0Var.f162787a;
        he3.j jVar = a0Var.f162788b;
        if (!z) {
            jVar = null;
        }
        return d0.E0(zhm.v.l(jVar), list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f162792a, cVar.f162792a) && this.f162793b == cVar.f162793b && this.f162794c == cVar.f162794c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f162795g, cVar.f162795g) && Intrinsics.f(this.f162796h, cVar.f162796h);
    }

    @Override // ind.e
    public final lzi.i getType() {
        return this.f162793b;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + h30.l.j(this.d, a0.d.c((this.f162793b.hashCode() + (this.f162792a.hashCode() * 31)) * 31, 31, this.f162794c), 31)) * 31;
        CategorisationFilter categorisationFilter = this.f;
        int iHashCode2 = (iHashCode + (categorisationFilter == null ? 0 : categorisationFilter.hashCode())) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f162795g;
        return this.f162796h.hashCode() + ((iHashCode2 + (analyticsSpendingPeriod$Interval != null ? analyticsSpendingPeriod$Interval.hashCode() : 0)) * 31);
    }
}
