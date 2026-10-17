package mce;

import al4.q;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import efm.r;
import h9e.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import nce.a;
import qua.z;
import wsg.n;
import ypg.p;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9e.a f204342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f204343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f204344c;
    public final j9l.a d;
    public final c9e.c e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f204345g;

    public d(g9e.a subscriptionListModel, n walletInteractor, f upcomingPaymentsItemMapper, j9l.a moneyCalculator, c9e.c subscriptionNavigationProvider, a recurringPaymentFilterProvider, q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionListModel, "subscriptionListModel");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(upcomingPaymentsItemMapper, "upcomingPaymentsItemMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentFilterProvider, "recurringPaymentFilterProvider");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f204342a = subscriptionListModel;
        this.f204343b = walletInteractor;
        this.f204344c = upcomingPaymentsItemMapper;
        this.d = moneyCalculator;
        this.e = subscriptionNavigationProvider;
        this.f = recurringPaymentFilterProvider;
        this.f204345g = creditCardProductInteractor;
    }

    public final r a(r rVar, nie.c cVar, RecurringPaymentAccount recurringPaymentAccount, RecurringPaymentFilter.And and) {
        return ue0.e.E(m70.a.g(pd.b.r(nim.a.w(rVar, new m9l.d(25)), new ja3.d(this, cVar, recurringPaymentAccount, and, 23)), new j1(14), null, 2), f0.f322471a);
    }

    public final r b(nce.a aVar, nie.c accountDescriptor, RecurringPaymentAccount recurringPaymentAccount) {
        Intrinsics.checkNotNullParameter(accountDescriptor, "accountDescriptor");
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        boolean z = aVar instanceof a.C1197a;
        int i = 3;
        g9e.a aVar2 = this.f204342a;
        if (z) {
            return a(g9e.a.a(aVar2, new RecurringPaymentFilter.And(RecurringPaymentFilter.ByActiveFromNow.f89324a, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.ByNextDateFromNow(3), RecurringPaymentFilter.ByPendingRefund.f89330a)), recurringPaymentAccount, 19), accountDescriptor, recurringPaymentAccount, null);
        }
        if (!(aVar instanceof nce.b)) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            r rVarJust = r.just(f0.f322471a);
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        nce.b bVar = (nce.b) aVar;
        RecurringPaymentFilter.And and = bVar.f214180a;
        String str = bVar.f214181b;
        xi0.b.Companion.getClass();
        xi0.b baseCurrency = xi0.a.a(str);
        z recurringPaymentWalletFilter = pce.a.a(recurringPaymentAccount);
        kce.q qVar = (kce.q) aVar2;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(recurringPaymentWalletFilter, "recurringPaymentWalletFilter");
        r rVarC = g9e.a.c(qVar, null, and, recurringPaymentWalletFilter, 48);
        pcd.h filter = new pcd.h(0);
        Intrinsics.checkNotNullParameter(filter, "filter");
        r rVarF = ((p) qVar.f).f(w4l.h.f294642c, filter);
        r map = cl3.a.a(qVar.f182717l).map(new kce.c(new kcd.a(4), i));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return a(pd.b.r(kli.a.i(rVarC, rVarF, map), new k79.b(qVar, baseCurrency, 10)), accountDescriptor, recurringPaymentAccount, and);
    }
}
