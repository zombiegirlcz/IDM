package c9h;

import ael.q0;
import ael.y;
import akg.n;
import c1g.o;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.r;
import vkm.q;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements wzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f22469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f22470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8h.k f22471c;
    public final ppk.f d;
    public final p2b.j e;
    public final r f;

    public k(ybl.k tradingAccountsInteractor, ybl.d portfolioInteractor, x8h.k displayCurrencyInteractor, ppk.f ratesInteractor, p2b.j cfdShareablePerformanceInteractor, r wealthMarginInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cfdShareablePerformanceInteractor, "cfdShareablePerformanceInteractor");
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        this.f22469a = tradingAccountsInteractor;
        this.f22470b = portfolioInteractor;
        this.f22471c = displayCurrencyInteractor;
        this.d = ratesInteractor;
        this.e = cfdShareablePerformanceInteractor;
        this.f = wealthMarginInteractor;
    }

    public static List g(TradingAccount tradingAccount) {
        boolean z;
        int i = i.f22466a[tradingAccount.getF105254j().ordinal()];
        boolean z3 = false;
        if (i == 1 || i == 2 || i == 3) {
            z = true;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        if (tradingAccount.getD() == cfl.b.ACTIVE || ((tradingAccount instanceof TradingAccount.Margin) && com.revolut.shared.feature.wealth.models.trading_accounts.d.k(tradingAccount))) {
            z3 = true;
        }
        if (!z || !z3) {
            return f0.f322471a;
        }
        List listJ = tradingAccount.J();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listJ) {
            TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) obj2;
            if (portfolio.f105211b == com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE || ((tradingAccount instanceof TradingAccount.Margin) && com.revolut.shared.feature.wealth.models.trading_accounts.d.k(tradingAccount) && portfolio.f105211b == com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static dj0.d o(dj0.d dVar, n9l.a aVar, boolean z) {
        if (z) {
            return dVar;
        }
        if (aVar != null) {
            return pyd.c.K(dVar, aVar.f213663c, aVar.f213662b);
        }
        return null;
    }

    public final n f(List list, xi0.b bVar, n9l.b bVar2) {
        Flow flowI;
        List<kel.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (kel.b bVar3 : list2) {
            xi0.a aVar = xi0.b.Companion;
            String str = bVar3.f183148a.e;
            aVar.getClass();
            arrayList.add(new Pair(xi0.a.a(str), bVar));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Pair pair = (Pair) obj2;
            if (!Intrinsics.f(pair.f186385a, pair.f186386b)) {
                arrayList2.add(obj2);
            }
        }
        List listU = d0.U(arrayList2);
        List list3 = listU;
        if (list3.isEmpty()) {
            flowI = zi0.c.i(f0.f322471a);
        } else {
            ppk.f fVar = this.d;
            flowI = bVar2 != null ? rd0.e.b(fVar.d(listU, bVar2)) : rd0.e.b(fVar.b(list3, false));
        }
        return nim.a.v(flowI, new a(this, list, bVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia r6, java.lang.String r7, w4l.j r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof c9h.j
            if (r0 == 0) goto L13
            r0 = r9
            c9h.j r0 = (c9h.j) r0
            int r1 = r0.f22468x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22468x = r1
            goto L18
        L13:
            c9h.j r0 = new c9h.j
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22468x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r9)
            java.lang.String r9 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)
            java.lang.String r9 = "portfolioLoadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            c9h.f r9 = new c9h.f
            r9.<init>(r6)
            szg.a r6 = szg.a.f266811a
            kotlinx.coroutines.flow.Flow r6 = r5.n(r9, r6, r8)
            zfd.e r6 = zi0.c.w(r6)
            c2f.m r8 = new c2f.m
            r9 = 21
            r8.<init>(r9)
            jhi.b r6 = mo3.a.g(r6, r4, r8, r3)
            r0.u = r7
            r0.f22468x = r3
            java.lang.Object r9 = vkm.q.x(r6, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r6 = r9.iterator()
        L6a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r6.next()
            r9 = r8
            kel.b r9 = (kel.b) r9
            java.lang.String r9 = r9.f183150c
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r7)
            if (r9 == 0) goto L6a
            return r8
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c9h.k.h(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia, java.lang.String, w4l.j, gim.c):java.lang.Object");
    }

    public final Flow i(String pocketId, cfl.i tradingAccountHolderIdFilter, w4l.k portfolioLoadingStrategy) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(tradingAccountHolderIdFilter, "tradingAccountHolderIdFilter");
        Intrinsics.checkNotNullParameter(portfolioLoadingStrategy, "portfolioLoadingStrategy");
        return boh.f.e(nim.a.v(l(tradingAccountHolderIdFilter, w4l.h.f294642c), new c8i.c(this, 11)), new o(this, portfolioLoadingStrategy, pocketId, 9));
    }

    public final Flow j(List list, w4l.k kVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            String string = ((TradingAccount.Portfolio) it8.next()).f105210a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(((y) this.f22470b).e(string, kVar));
        }
        return !arrayList.isEmpty() ? nim.a.v(u0.k(arrayList), new c8i.c(8)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
    }

    public final n k(String portfolioId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.i(((y) this.f22470b).e(portfolioId, loadingStrategy), nim.a.v(((q0) this.f22469a).o(portfolioId, loadingStrategy), new c86.c(portfolioId, 2)), nim.a.y(this.f.u(portfolioId, null, loadingStrategy), new c8i.c(5))), new c8i.c(this, 6));
    }

    public final n l(cfl.i tradingAccountHolderIdFilter, w4l.k loadingStrategy) {
        q0 q0Var = (q0) this.f22469a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(tradingAccountHolderIdFilter, "tradingAccountHolderIdFilter");
        cfl.k accountHolderTypeFilter = cfl.k.f23744a;
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(q0Var.p(loadingStrategy, tradingAccountHolderIdFilter, accountHolderTypeFilter), new c8i.c(10));
    }

    public final t38.e m(h hVar, szg.c cVar, w4l.k kVar) {
        return u0.m(q.q(this.f22471c.b()), n(hVar, cVar, kVar));
    }

    public final Flow n(h hVar, szg.c cVar, w4l.k kVar) {
        boolean z = cVar instanceof szg.b;
        ybl.d dVar = this.f22470b;
        if (z) {
            return nim.a.v(((y) dVar).e(((szg.b) cVar).f266812a, kVar), new c8i.c(9));
        }
        if (hVar instanceof g) {
            return nim.a.v(((y) dVar).e(((g) hVar).f22465a, kVar), new c8i.c(9));
        }
        if (!(hVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        return boh.f.e(nim.a.v(ybl.k.h(this.f22469a, ((f) hVar).f22464a, w4l.h.f294642c, 4), new c8i.c(this, 4)), new d(this, kVar, 0));
    }
}
