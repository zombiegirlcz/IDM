package rrj;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import efm.d0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mlk.b0;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import tof.d8;
import tof.i3;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f256863b;

    public /* synthetic */ k(o oVar, int i) {
        this.f256862a = i;
        this.f256863b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String id10;
        switch (this.f256862a) {
            case 0:
                CategorisationFilter categorisationFilter = (CategorisationFilter) obj2;
                Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
                return new pfm.n(new pu9.a(this.f256863b, categorisationFilter, 16), 1);
            case 1:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                qzi.a aVar = (qzi.a) hVar.f288433a;
                Data data = (Data) hVar.f288434b;
                do3.n nVar = (do3.n) hVar.f288435c;
                Set set = (Set) hVar.d;
                he3.d dVar = he3.d.SPENDINGS;
                o oVar = this.f256863b;
                DateTime dateTimeG = ((l80.f) oVar.f256874w).g();
                DateTime dateTimeAtStartOfDay = aVar.e.toDateTimeAtStartOfDay();
                Intrinsics.h(dateTimeAtStartOfDay);
                Interval interval = new Interval(dateTimeAtStartOfDay, (DateTime) cim.c.k(dateTimeAtStartOfDay, dateTimeG));
                CategorisationFilter.Scope.PocketsIdSet pocketsIdSet = new CategorisationFilter.Scope.PocketsIdSet(set);
                i3 i3Var = (i3) data.getContent();
                d8 d8Var = (i3Var == null || (id10 = i3Var.getId()) == null) ? null : new d8(id10);
                AccountId accountId = oVar.f256869p.f101520b;
                if (accountId instanceof AccountId.Joint) {
                    str = ((AccountId.Joint) accountId).f51412a;
                } else {
                    if (!Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = nVar.f116408a;
                }
                return new CategorisationFilter(dVar, pocketsIdSet, interval, null, d8Var, null, null, null, y0.b(str), null, 744);
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                qzi.a aVar2 = (qzi.a) rVar.f314201a;
                qzi.h hVar2 = (qzi.h) rVar.f314202b;
                i3 transactionCategory = (i3) rVar.f314203c;
                o oVar2 = this.f256863b;
                DateTime dateTimeG2 = ((l80.f) oVar2.f256874w).g();
                DateTime dateTimeAtStartOfDay2 = aVar2.e.toDateTimeAtStartOfDay();
                Intrinsics.h(dateTimeAtStartOfDay2);
                Interval interval2 = new Interval(dateTimeAtStartOfDay2, (DateTime) cim.c.k(dateTimeAtStartOfDay2, dateTimeG2));
                mrj.a aVar3 = oVar2.v;
                DateTime periodStart = interval2.getStart();
                Intrinsics.checkNotNullExpressionValue(periodStart, "getStart(...)");
                DateTime periodEnd = interval2.getEnd();
                Intrinsics.checkNotNullExpressionValue(periodEnd, "getEnd(...)");
                AccountId accountId2 = oVar2.f256869p.f101520b;
                mrj.c cVar = (mrj.c) aVar3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(periodStart, "periodStart");
                Intrinsics.checkNotNullParameter(periodEnd, "periodEnd");
                Intrinsics.checkNotNullParameter(accountId2, "accountId");
                Intrinsics.checkNotNullParameter(transactionCategory, "transactionCategory");
                d0 d0VarB = cVar.b(periodStart, periodEnd, accountId2, transactionCategory);
                b0 b0Var = new b0(new gpd.j(transactionCategory, 1), 21);
                d0VarB.getClass();
                ufm.i iVar = new ufm.i(d0VarB, b0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return new ufm.i(iVar, new rpi.d(new qz9.o(aVar2, 25, hVar2, transactionCategory), 16), 1);
            default:
                CategorisationFilter it8 = (CategorisationFilter) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                o oVar3 = this.f256863b;
                l5i.q qVar = oVar3.f256873t;
                AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
                SpendingAnalyticsAccount spendingAnalyticsAccountB = com.revolut.retail.feature.api.a.b(oVar3.f256869p.f101520b);
                companion.getClass();
                return rd0.e.c(qVar.c(new ge3.b(it8, AnalyticsAccountsSelection.Companion.a(spendingAnalyticsAccountB))), kotlin.coroutines.g.f186406a);
        }
    }
}
