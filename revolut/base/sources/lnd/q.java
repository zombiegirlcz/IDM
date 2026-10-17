package lnd;

import aw0.e1;
import aw0.h1;
import aw0.j1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzi.b f197196a;

    public q(mzi.b intervalMapper) {
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        this.f197196a = intervalMapper;
    }

    public final j1 a(Clause title, MoneyClause displayValue, AnalyticsSpendingPeriod$Interval interval, yld.c analyticsChartStyle, lzi.i periodType) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(analyticsChartStyle, "analyticsChartStyle");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        int i = p.f197195b[analyticsChartStyle.ordinal()];
        mzi.b bVar = this.f197196a;
        if (i == 1) {
            h1 h1Var = new h1(title);
            Interval intervalD = hx7.a.D(interval);
            int i2 = p.f197194a[periodType.ordinal()];
            if (i2 == 1 || i2 == 2) {
                z = true;
            } else {
                if (i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            return new j1(h1Var, displayValue, new e1(mzi.b.a(bVar, intervalD, null, z, null, 58)));
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new UnsupportedOperationException("Chart header mapper not supporting Line Chart");
        }
        Interval intervalD2 = hx7.a.D(interval);
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254);
        int i3 = p.f197194a[periodType.ordinal()];
        if (i3 == 1 || i3 == 2) {
            z3 = true;
        } else {
            if (i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        return new j1(new h1(new CompositeClause(zhm.v.k(title, mzi.b.a(bVar, intervalD2, custom, z3, null, 56)), new DotDividerClause((Integer) null), null, null, 12)), displayValue, null);
    }
}
