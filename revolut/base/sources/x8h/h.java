package x8h;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountBalance;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalanceBreakdown;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303345a;

    public /* synthetic */ h(int i) {
        this.f303345a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        wel.j jVar;
        Parcelable personal;
        Parcelable pea2;
        xzg.o0 o0Var;
        switch (this.f303345a) {
            case 0:
                WealthAccount.Commodities account = (WealthAccount.Commodities) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                if (!account.H6() && !account.Q2()) {
                    return zhm.f0.f322471a;
                }
                xi0.b.Companion.getClass();
                return zhm.u.c(xi0.b.i);
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zhm.f0.f322471a;
            case 3:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                xi0.a aVar = xi0.b.Companion;
                ArrayList arrayList = new ArrayList(zhm.w.t(linkedHashSet, 10));
                Iterator it10 = linkedHashSet.iterator();
                while (it10.hasNext()) {
                    t61.a.A(aVar, (String) it10.next(), arrayList);
                }
                return arrayList;
            case 4:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Pair(xzg.d0.MOST_TRADED, it11);
            case 5:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Pair(xzg.d0.MOST_BOUGHT, it12);
            case 6:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Pair(xzg.d0.MOST_SOLD, it13);
            case 7:
                e7l.f config2 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                LinkedHashSet linkedHashSet2 = config2.M;
                xi0.a aVar2 = xi0.b.Companion;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(linkedHashSet2, 10));
                Iterator it14 = linkedHashSet2.iterator();
                while (it14.hasNext()) {
                    t61.a.A(aVar2, (String) it14.next(), arrayList2);
                }
                return arrayList2;
            case 8:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                List<xzg.p> list = it15;
                int iB = zhm.q0.b(zhm.w.t(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (xzg.p pVar : list) {
                    linkedHashMap.put(kotlin.jvm.internal.s.l(pVar), pVar.getMid());
                }
                return linkedHashMap;
            case 9:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                List<Pair> list2 = it16;
                int iB2 = zhm.q0.b(zhm.w.t(list2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Pair pair : list2) {
                    linkedHashMap2.put(pair.f186385a, pair.f186386b);
                }
                return linkedHashMap2;
            case 10:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new xzg.h0((List) pair2.f186385a, (List) pair2.f186386b);
            case 11:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : it17) {
                    if (obj3 instanceof vel.e) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 12:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return zhm.d0.E0((List) pair3.f186386b, (List) pair3.f186385a);
            case 13:
                List list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                List<wbl.h> list4 = list3;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                for (wbl.h hVar : list4) {
                    arrayList4.add(new j0(new vel.g(hVar.f296265a.f214596b, vel.h.STOCK, (dj0.d) null, 12), hVar.f296266b));
                }
                return arrayList4;
            case 14:
                List<uv5.i> list5 = (List) obj2;
                Intrinsics.checkNotNullParameter(list5, "list");
                ArrayList arrayList5 = new ArrayList();
                for (uv5.i iVar : list5) {
                    j0 j0Var = cp5.d.y(iVar.f283321a) ? new j0(new vel.g(iVar.f283321a.f306286a, vel.h.CURRENCY, (dj0.d) null, 12), iVar.f283322b) : null;
                    if (j0Var != null) {
                        arrayList5.add(j0Var);
                    }
                }
                return arrayList5;
            case 15:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return zhm.f0.f322471a;
            case 16:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                String str = portfolio.f296818a;
                wel.h hVar2 = portfolio.f.f296826a;
                if (hVar2 == null || (jVar = hVar2.f296829c) == null) {
                    jVar = wel.j.DISABLED;
                }
                return new m0(str, jVar);
            case 17:
                TradingLegalEntityInformation info = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(info, "info");
                hel.b bVar = info.f105106a;
                if ((bVar == null ? -1 : o0.f303370a[bVar.ordinal()]) != 1) {
                    return zhm.h0.f322473a;
                }
                xi0.b.Companion.getClass();
                return y0.b(xi0.b.D);
            case 18:
                List list6 = (List) obj2;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("it", list6);
                int size = list6.size();
                for (int i = 0; i < size; i++) {
                    Object obj4 = list6.get(i);
                    if (((WealthAccount) ((Pair) obj4).f186385a) instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
                        arrayListY.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                int size2 = list6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj5 = list6.get(i2);
                    if (((WealthAccount) ((Pair) obj5).f186385a).d9()) {
                        arrayList6.add(obj5);
                    }
                }
                return new WealthAccountsBalanceBreakdown(t0.a(list6), t0.a(arrayListY), t0.a(arrayList6));
            case 19:
                del.b it19 = (del.b) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new WealthAccountBalance(mif.a.Q(it19.f113708a), mif.a.Q(it19.f113710c));
            case 20:
                jt5.a commodityPortfolioBalance = (jt5.a) obj2;
                Intrinsics.checkNotNullParameter(commodityPortfolioBalance, "commodityPortfolioBalance");
                return new WealthAccountBalance(commodityPortfolioBalance.f178351a, commodityPortfolioBalance.f178352b);
            case 21:
                wel.e it20 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(i2b.a.m(it20));
            case 22:
                y49.f it21 = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new WealthAccountBalance(it21.f310846c, it21.f310844a);
            case 23:
                WealthAccount it22 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.TRUE;
            case 24:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return t0.a(it23);
            case 25:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                TradingAccounts tradingAccounts = (TradingAccounts) pair4.f186385a;
                WealthAccount.Commodities commodities = (WealthAccount.Commodities) pair4.f186386b;
                List list7 = tradingAccounts.f105278a;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : list7) {
                    TradingAccount tradingAccount = (TradingAccount) obj6;
                    if (tradingAccount.getD() != cfl.b.TERMINATED && w8h.c.a(tradingAccount.W()) && (!(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) || !com.revolut.shared.feature.wealth.models.trading_accounts.d.b(((TradingAccount.TaxAdvantage.JIsa.Custodian) tradingAccount).e))) {
                        arrayList7.add(obj6);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it24 = arrayList7.iterator();
                while (it24.hasNext()) {
                    WealthAccount wealthAccountB = w8h.c.b((TradingAccount) it24.next());
                    if (wealthAccountB != null) {
                        arrayList8.add(wealthAccountB);
                    }
                }
                List list8 = tradingAccounts.f105279b;
                ArrayList<TradingAccountAvailableToOnboard> arrayList9 = new ArrayList();
                for (Object obj7 : list8) {
                    if (w8h.c.a(((TradingAccountAvailableToOnboard) obj7).d)) {
                        arrayList9.add(obj7);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                for (TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard : arrayList9) {
                    Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
                    TradingAccountType tradingAccountType = tradingAccountAvailableToOnboard.d;
                    cfl.j jVar2 = tradingAccountAvailableToOnboard.e;
                    if (Intrinsics.f(tradingAccountType, TradingAccountType.Gia.f105270a)) {
                        personal = new WealthAccount.Securities(xzg.o0.AVAILABLE, w8h.c.c(jVar2), null, null, tradingAccountAvailableToOnboard.f105265a);
                    } else if (Intrinsics.f(tradingAccountType, TradingAccountType.Robo.f105274a)) {
                        personal = new WealthAccount.Robo(null, xzg.o0.AVAILABLE, zhm.f0.f322471a, w8h.c.c(jVar2));
                    } else if (Intrinsics.f(tradingAccountType, TradingAccountType.Margin.f105271a)) {
                        personal = new WealthAccount.Margin(xzg.o0.AVAILABLE, null, null, w8h.c.c(jVar2));
                    } else {
                        if (tradingAccountType instanceof TradingAccountType.Taa) {
                            if (com.revolut.shared.feature.wealth.models.trading_accounts.b.a(tradingAccountAvailableToOnboard)) {
                                pea2 = new WealthAccount.TaxAdvantageWealthAccount.Isa(null, tradingAccountAvailableToOnboard.f105265a, xzg.o0.AVAILABLE, null, null, tradingAccountAvailableToOnboard.f105269h, w8h.c.c(jVar2));
                            } else if (com.revolut.shared.feature.wealth.models.trading_accounts.b.f(tradingAccountAvailableToOnboard)) {
                                pea2 = new WealthAccount.TaxAdvantageWealthAccount.Pea(null, tradingAccountAvailableToOnboard.f105265a, xzg.o0.AVAILABLE, null, null, tradingAccountAvailableToOnboard.f105269h, w8h.c.c(jVar2));
                            } else if (com.revolut.shared.feature.wealth.models.trading_accounts.b.c(tradingAccountAvailableToOnboard)) {
                                personal = tradingAccountAvailableToOnboard.f105269h.f105177c == cfl.a.SELF ? new WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal(null, tradingAccountAvailableToOnboard.f105265a, xzg.o0.AVAILABLE, null, null, tradingAccountAvailableToOnboard.f105269h, w8h.c.c(jVar2)) : new WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian(null, tradingAccountAvailableToOnboard.f105265a, xzg.o0.AVAILABLE, null, null, tradingAccountAvailableToOnboard.f105269h, w8h.c.c(jVar2));
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("available to onboard toWealthAccount TAX_ADVANTAGED not supported");
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                            personal = pea2;
                        } else {
                            if (!(tradingAccountType instanceof TradingAccountType.PaperTrading) && !(tradingAccountType instanceof TradingAccountType.Unknown) && !Intrinsics.f(tradingAccountType, TradingAccountType.MoneyMarketFunds.f105272a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("available to onboard toWealthAccount ", tradingAccountType.getLabel(), " not supported"));
                            zhm.h0 h0Var2 = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        }
                        personal = null;
                    }
                    if (personal != null) {
                        arrayList10.add(personal);
                    }
                }
                return zhm.d0.E0(arrayList10, zhm.d0.F0(commodities, arrayList8));
            case 26:
                uj3.a it25 = (uj3.a) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                int i3 = u0.f303392a[it25.ordinal()];
                if (i3 == 1) {
                    o0Var = xzg.o0.UNAVAILABLE;
                } else if (i3 == 2) {
                    o0Var = xzg.o0.AVAILABLE;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0Var = xzg.o0.ACTIVE;
                }
                return new WealthAccount.Commodities(o0Var);
            case 27:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                return new xzg.r0((List) pair5.f186386b, (TradingLegalEntityInformation) pair5.f186385a);
            case 28:
                Data it26 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                Object content = it26.getContent();
                Intrinsics.h(content);
                return (List) content;
            default:
                Data it27 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                Throwable error = it27.getError();
                if (error == null) {
                    return new Data(it27.getContent(), null, false, 6, null);
                }
                throw error;
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f303345a = i;
    }
}
