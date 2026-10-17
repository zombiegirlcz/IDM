package i5f;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jtd.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kwg.l;
import kye.n3;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.a1;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f158829b;

    public /* synthetic */ g(int i, xi0.b bVar) {
        this.f158828a = i;
        this.f158829b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        Object next;
        Object next2;
        Set setD2;
        Object next3;
        Object next4;
        int i = this.f158828a;
        boolean z = false;
        xi0.b currency = this.f158829b;
        switch (i) {
            case 0:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                try {
                    m.Companion companion = m.INSTANCE;
                    ArrayList arrayList = portfolio.e;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (obj3 instanceof kel.b) {
                            arrayList2.add(obj3);
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                for (Object obj4 : arrayList2) {
                    if (Intrinsics.f(((kel.b) obj4).f183148a.e, currency.f306286a)) {
                        objA = (kel.b) obj4;
                        Throwable thA = m.a(objA);
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        return (kel.b) (objA instanceof n ? null : objA);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                dj0.d it8 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!Intrinsics.f(it8.f115083b, currency));
            case 2:
                dj0.d it9 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9.f115083b, currency);
            case 3:
                dgi.c searchParams = (dgi.c) obj2;
                Intrinsics.checkNotNullParameter(searchParams, "searchParams");
                return dgi.c.a(searchParams, null, null, null, null, null, null, null, false, currency.f306286a, null, null, null, null, 16646143);
            case 4:
                j0i.a update = (j0i.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Set set = update.i;
                return j0i.a.a(update, null, null, null, null, null, null, null, null, set.contains(currency) ? a1.j(set, currency) : a1.m(set, currency), null, 767);
            case 5:
                io3.d it10 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new dj0.d(it10.i, currency);
            case 6:
                List pocketBalances = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                return new Pair(pocketBalances, currency);
            case 7:
                BalanceWrapper it11 = (BalanceWrapper) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (Intrinsics.f(it11.getF99406c(), currency)) {
                    Long l2 = it11.f99405b;
                    if ((l2 != null ? l2.longValue() : 0L) > 0) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                e7l.f it12 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                dj0.d dVar = it12.f123402x0;
                if (dVar != null) {
                    return dVar;
                }
                if (!cp5.d.A(currency)) {
                    return gk3.h.f144326a;
                }
                dj0.d dVar2 = gk3.h.f144326a;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new dj0.d(cp5.d.k(currency) * 99999999, currency);
            case 9:
                List enabledCurrencies = (List) obj2;
                Intrinsics.checkNotNullParameter(enabledCurrencies, "enabledCurrencies");
                return Boolean.valueOf(enabledCurrencies.contains(currency));
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar = (xi0.b) pair.f186385a;
                Iterator it13 = ((List) pair.f186386b).iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next = it13.next();
                        qta.c cVar = (qta.c) next;
                        if (!Intrinsics.f(cVar.f249046a, bVar) || !Intrinsics.f(cVar.f249047b, currency)) {
                        }
                    } else {
                        next = null;
                    }
                }
                qta.c cVar2 = (qta.c) next;
                BigDecimal bigDecimalMovePointRight = cVar2 != null ? cVar2.f249048c : null;
                if (bigDecimalMovePointRight == null || !e1.G(bigDecimalMovePointRight)) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                BigDecimal bigDecimalMovePointRight2 = BigDecimal.ONE;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0.1d);
                while (bigDecimalMovePointRight.compareTo(bigDecimalValueOf) < 0) {
                    bigDecimalMovePointRight2 = bigDecimalMovePointRight2.movePointRight(1);
                    bigDecimalMovePointRight = bigDecimalMovePointRight.movePointRight(1);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointRight, "movePointRight(...)");
                }
                BigDecimal bigDecimalMovePointRight3 = bigDecimalMovePointRight2.movePointRight(bVar.c());
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                long jLongValue = bigDecimalMovePointRight3.setScale(0, roundingMode).longValue();
                long jLongValue2 = bigDecimalMovePointRight.movePointRight(currency.c()).setScale(0, roundingMode).longValue();
                dj0.d dVar3 = new dj0.d(jLongValue, bVar);
                dj0.d dVar4 = new dj0.d(jLongValue2, currency);
                od0.h hVar = od0.i.Companion;
                q qVar = new q(bVar, currency, dVar3, dVar4);
                hVar.getClass();
                return od0.h.a(qVar);
            case 11:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new Pair(currency, it14);
            case 12:
                List<io3.d> pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                for (io3.d dVar5 : pockets) {
                    if (Intrinsics.f(dVar5.f163147c, currency.f306286a)) {
                        return z92.f.j(dVar5);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 13:
                Optional it15 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return l.d((TotalValueChart) gj7.b.m(it15), currency);
            case 14:
                Optional it16 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return l.d((TotalValueChart) gj7.b.m(it16), currency);
            case 15:
                Optional it17 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return l.d((TotalValueChart) gj7.b.m(it17), currency);
            case 16:
                List ratesList = (List) obj2;
                Intrinsics.checkNotNullParameter(ratesList, "ratesList");
                n9l.a aVar = (n9l.a) d0.d0(ratesList);
                if (aVar == null) {
                    return null;
                }
                double d = aVar.f213663c;
                od0.h hVar2 = od0.i.Companion;
                n3 n3Var = new n3(d, currency);
                hVar2.getClass();
                return od0.h.a(n3Var);
            case 17:
                return kye.m.a((kye.m) obj2, false, null, currency.f306286a, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -5, 63);
            case 18:
                CryptoCommodityPositions it18 = (CryptoCommodityPositions) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.h hVar3 = od0.i.Companion;
                Iterator it19 = it18.f71383b.iterator();
                while (true) {
                    if (it19.hasNext()) {
                        next2 = it19.next();
                        if (Intrinsics.f(((CryptoCommodityPosition) next2).f71379a, currency)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                CryptoCommodityPosition cryptoCommodityPosition = (CryptoCommodityPosition) next2;
                ej0.b bVar2 = cryptoCommodityPosition != null ? cryptoCommodityPosition.d : null;
                hVar3.getClass();
                return od0.h.a(bVar2);
            case 19:
                return new dj0.d((long) ((Float) obj2).floatValue(), currency);
            case 20:
                return new dj0.d((long) ((Float) obj2).floatValue(), currency);
            case 21:
                lu6.l update2 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update2.f200048b;
                if (acquiringOrderFilter == null || (setD2 = acquiringOrderFilter.d2()) == null) {
                    setD2 = h0.f322473a;
                }
                LinkedHashSet linkedHashSetA = gc0.c.A(setD2, currency);
                return lu6.l.a(update2, null, linkedHashSetA.isEmpty() ? acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.Currency.class)) : null : com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter, new AcquiringOrderFilter.Currency(linkedHashSetA)), 5);
            case 22:
                return m3g.n.a((m3g.n) obj2, null, null, this.f158829b, null, null, null, null, null, null, false, 1019);
            case 23:
                ((m66.d) obj2).getClass();
                return new m66.d(currency);
            case 24:
                CryptoCommodityPositions it20 = (CryptoCommodityPositions) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                od0.h hVar4 = od0.i.Companion;
                Iterator it21 = it20.f71383b.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        next3 = it21.next();
                        if (Intrinsics.f(((CryptoCommodityPosition) next3).f71379a, currency)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                CryptoCommodityPosition cryptoCommodityPosition2 = (CryptoCommodityPosition) next3;
                ej0.b bVar3 = cryptoCommodityPosition2 != null ? cryptoCommodityPosition2.d : null;
                hVar4.getClass();
                return od0.h.a(bVar3);
            case 25:
                List it22 = (List) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                wk5.a aVar2 = (wk5.a) d0.d0(it22);
                if (aVar2 != null) {
                    return aVar2;
                }
                throw new IllegalStateException(p.a.p("Currency ", currency.f306286a, " is shown as available to Deposit, but actually doesn't have a deposit blockchain"));
            case 26:
                List pocketBalances2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketBalances2, "pocketBalances");
                return new Pair(pocketBalances2, currency);
            case 27:
                xi0.b walletBaseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(walletBaseCurrency, "walletBaseCurrency");
                if (!Intrinsics.f(walletBaseCurrency, currency)) {
                    xi0.b.Companion.getClass();
                    walletBaseCurrency = xi0.b.i;
                }
                xi0.b bVar4 = walletBaseCurrency;
                Intrinsics.h(bVar4);
                return new Data(bVar4, null, false, 6, null);
            case 28:
                wel.e portfolio2 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                ArrayList arrayList3 = portfolio2.e;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : arrayList3) {
                    if (obj5 instanceof kel.b) {
                        arrayList4.add(obj5);
                    }
                }
                Iterator it23 = arrayList4.iterator();
                while (true) {
                    if (it23.hasNext()) {
                        next4 = it23.next();
                        if (Intrinsics.f(((kel.b) next4).f183148a.e, currency.f306286a)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                kel.b bVar5 = (kel.b) next4;
                return bVar5 != null ? new t1h.g(bVar5.e, bVar5.f183149b) : new t1h.g(new dj0.d(0L, currency), null);
            default:
                for (io3.d dVar6 : (List) ((Pair) obj2).f186386b) {
                    if (dVar6.f163149h == io3.i.INTERNAL && dVar6.e == io3.l.CURRENT && Intrinsics.f(dVar6.f163147c, currency.f306286a)) {
                        return dVar6;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public /* synthetic */ g(Object obj2, xi0.b bVar, int i) {
        this.f158828a = i;
        this.f158829b = bVar;
    }

    public /* synthetic */ g(xi0.b bVar, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar) {
        this.f158828a = 21;
        this.f158829b = bVar;
    }
}
