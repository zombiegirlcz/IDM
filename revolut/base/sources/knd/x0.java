package knd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.g9;
import tof.i7;
import tof.ib;
import tof.m9;
import tof.na;
import tof.q7;
import tof.y6;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f186153a;

    public x0(p0 categorizationFilterBuilder, x analyticsExtraTransactionFilterProvider) {
        Intrinsics.checkNotNullParameter(categorizationFilterBuilder, "categorizationFilterBuilder");
        Intrinsics.checkNotNullParameter(analyticsExtraTransactionFilterProvider, "analyticsExtraTransactionFilterProvider");
        this.f186153a = analyticsExtraTransactionFilterProvider;
    }

    public static i7 a(ind.h hVar) {
        if (!hVar.f162809c) {
            return new ib(hVar.f162808b);
        }
        i7.c cVar = i7.Companion;
        m9 m9Var = new m9(true);
        y6[] y6VarArr = {y6.CARD_PAYMENT, y6.CARD_REFUND, y6.ATM};
        cVar.getClass();
        return i7.c.b(m9Var, new na(i7.c.d(y6VarArr)));
    }

    public static CategorisationFilter b(x0 x0Var, ind.g gVar, yld.d screenType, AnalyticsAccountsSelection accountsSelection, Set excludeRecipientIds, he3.c cVar, i7 i7Var, fnd.a aVar, int i) {
        g9 g9VarA;
        he3.d dVar;
        he3.c exclusionRule = (i & 16) != 0 ? he3.c.EXCLUDE_ONLY_FULLY_EXCLUDED : cVar;
        q7 q7VarA = null;
        i7 i7Var2 = (i & 32) != 0 ? null : i7Var;
        fnd.a aVar2 = (i & 64) != 0 ? null : aVar;
        x xVar = x0Var.f186153a;
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        if (accountsSelection instanceof AnalyticsAccountsSelection.Savings) {
            g9VarA = x.a(screenType);
        } else {
            if (!(accountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) && !(accountsSelection instanceof AnalyticsAccountsSelection.Pro) && !(accountsSelection instanceof AnalyticsAccountsSelection.Spending)) {
                throw new NoWhenBranchMatchedException();
            }
            g9VarA = null;
        }
        switch (w0.f186151b[screenType.ordinal()]) {
            case 1:
                dVar = he3.d.SPENDINGS;
                break;
            case 2:
                dVar = he3.d.INCOME;
                break;
            case 3:
                dVar = he3.d.BOTH;
                break;
            case 4:
                dVar = he3.d.INCOME;
                break;
            case 5:
                int i2 = aVar2 == null ? -1 : w0.f186150a[aVar2.ordinal()];
                if (i2 == -1) {
                    throw new UnsupportedOperationException("cashflow is not supported without type");
                }
                if (i2 == 1) {
                    dVar = he3.d.INCOME;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = he3.d.SPENDINGS;
                }
                break;
                break;
            case 6:
                throw new UnsupportedOperationException("Sales is not supported in this function");
            default:
                throw new NoWhenBranchMatchedException();
        }
        he3.d transactionsDirection = dVar;
        Set pocketIds = gVar.d.f65754a;
        lzi.j jVar = gVar.f162805b;
        AnalyticsSpendingPeriod$Interval interval = jVar.f200982c;
        if (interval == null) {
            interval = jVar.f200981b;
        }
        if (g9VarA != null || i7Var2 != null) {
            i7.Companion.getClass();
            q7VarA = i7.c.a(g9VarA, i7Var2);
        }
        q7 q7Var = q7VarA;
        he3.b dateFilter = he3.b.START_DATE;
        Intrinsics.checkNotNullParameter(transactionsDirection, "transactionsDirection");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(excludeRecipientIds, "excludeRecipientIds");
        Intrinsics.checkNotNullParameter(exclusionRule, "exclusionRule");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        return new CategorisationFilter(transactionsDirection, new CategorisationFilter.Scope.PocketsIdSet(pocketIds), hx7.a.D(interval), null, q7Var, null, dateFilter, exclusionRule, excludeRecipientIds, null, 520);
    }

    public static CategorisationFilter c(ind.g gVar) {
        Object next;
        Iterator it8 = gVar.f162804a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            ind.e eVar = (ind.e) next;
            if ((eVar instanceof ind.c) && Intrinsics.f(((ind.c) eVar).f162792a, gVar.f162805b.f200981b)) {
                break;
            }
        }
        ind.e eVar2 = (ind.e) next;
        if (eVar2 != null) {
            return ((ind.c) eVar2).f;
        }
        return null;
    }
}
