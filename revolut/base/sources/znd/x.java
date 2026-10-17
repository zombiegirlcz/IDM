package znd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Interval;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(AnalyticsDetailsController analyticsDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.v, continuation, 0);
            case 1:
                return new x(this.v, continuation, 1);
            default:
                return new x(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Iterable<he3.j> iterableE0;
        int size;
        SpendingAnalyticsAccount spendingAnalyticsAccount;
        int i = this.u;
        AnalyticsDetailsController analyticsDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2();
                cli.y yVar = bVar.N;
                a aVar2 = (a) ((j2) yVar.f22677a).getValue();
                if (aVar2.f323709c == amd.i.TRANSACTIONS) {
                    ind.g gVar = (ind.g) aVar2.f323707a.getContent();
                    int i2 = 0;
                    if (gVar != null) {
                        Iterator it8 = gVar.f162804a.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((ind.e) next).a(), gVar.f162805b.f200981b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        ind.c cVar = next instanceof ind.c ? (ind.c) next : null;
                        if (cVar != null) {
                            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = cVar.f162795g;
                            Interval intervalD = analyticsSpendingPeriod$Interval != null ? hx7.a.D(analyticsSpendingPeriod$Interval) : null;
                            ind.b0 b0Var = cVar.e;
                            if (b0Var instanceof ind.a0) {
                                iterableE0 = ((ind.a0) b0Var).f162787a;
                            } else {
                                if (!(b0Var instanceof ind.z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ind.z zVar = (ind.z) b0Var;
                                iterableE0 = zhm.d0.E0(zVar.f162836b, zVar.f162835a);
                            }
                            int i3 = 0;
                            for (he3.j jVar : iterableE0) {
                                if (intervalD == null) {
                                    size = jVar.e.size();
                                } else {
                                    List list = jVar.e;
                                    if ((list instanceof Collection) && list.isEmpty()) {
                                        size = 0;
                                    } else {
                                        Iterator it9 = list.iterator();
                                        int i5 = 0;
                                        while (it9.hasNext()) {
                                            if (intervalD.contains(((he3.h) it9.next()).f151559a.f272593h) && (i5 = i5 + 1) < 0) {
                                                zhm.v.r();
                                                throw null;
                                            }
                                        }
                                        size = i5;
                                    }
                                }
                                i3 += size;
                            }
                            i2 = i3;
                        }
                    }
                    int i6 = aVar2.f323713l;
                    if (i6 < i2) {
                        int i21 = i6 + 30;
                        if (i21 <= i2) {
                            i2 = i21;
                        }
                        if (((j2) yVar.f22677a).getValue() == aVar2) {
                            bVar.H2(yVar, new wk4.k(i2, 12));
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2();
                AnalyticsAccountsSelection analyticsAccountsSelection = bVar2.S;
                AnalyticsAccountsSelection.Spending spending = analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Spending ? (AnalyticsAccountsSelection.Spending) analyticsAccountsSelection : null;
                if (spending != null && (spendingAnalyticsAccount = (SpendingAnalyticsAccount) zhm.d0.L0(spending.f99207a)) != null && ((spendingAnalyticsAccount instanceof AnalyticsAccount.Personal.All) || (spendingAnalyticsAccount instanceof AnalyticsAccount.Joint.All))) {
                    bVar2.l1().M0(new dod.d(com.revolut.retail.feature.api.a.a(spendingAnalyticsAccount)));
                }
                return Unit.f186387a;
        }
    }
}
