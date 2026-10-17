package aed;

import aee.s;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.Action;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreen;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import ip0.ru;
import ip0.s7;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import pcd.q;
import pcd.v;
import pcd.x;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3523a;

    public /* synthetic */ a(int i) {
        this.f3523a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LocalDateTime localDateTimeY;
        LocalDateTime localDateTime;
        TextLocalisedClause textLocalisedClause;
        LocalDateTime localDateTimeY2 = null;
        boolean z = false;
        switch (this.f3523a) {
            case 0:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<zdd.o> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (zdd.o oVar : list2) {
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    String strD = oVar.getVaultId();
                    String strE = oVar.getVaultName();
                    xi0.a aVar = xi0.b.Companion;
                    String strC = oVar.getPocket().getCurrency();
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(strC);
                    x xVarK = ydd.b.k(oVar.getInvitee());
                    List listB = oVar.getMembers();
                    ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                    Iterator it8 = listB.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(ydd.b.k((zdd.l) it8.next()));
                    }
                    arrayList.add(new v(strD, strE, bVarA, xVarK, arrayList2));
                }
                return arrayList;
            case 1:
                vdd.i it9 = (vdd.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ydd.b.h(it9);
            case 2:
                zdd.c it10 = (zdd.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                Long accruesInterestSince = it10.getAccruesInterestSince();
                if (accruesInterestSince != null) {
                    try {
                        localDateTimeY = oi0.d.Y(accruesInterestSince.longValue());
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        localDateTimeY = null;
                    }
                    localDateTime = localDateTimeY;
                    break;
                } else {
                    localDateTime = null;
                }
                Long executedDate = it10.getExecutedDate();
                if (executedDate != null) {
                    try {
                        localDateTimeY2 = oi0.d.Y(executedDate.longValue());
                    } catch (Exception e2) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                    }
                    break;
                }
                return new q(localDateTime, localDateTimeY2);
            case 3:
                ty0.a it11 = (ty0.a) obj2;
                TransferTrackerEstimationResultScreen.Companion aVar2 = TransferTrackerEstimationResultScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj3 = it11.d;
                if (obj3 instanceof Action) {
                    return (Action) obj3;
                }
                return null;
            case 4:
                Action action = (Action) obj2;
                if (action == null) {
                    return null;
                }
                int i = s.f3573a[action.f89364a.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_output_view_account_details_action, null, new Click(28, (Integer) null, (Object) action, "STEP_ACTION_ID", false), 10);
                } else if (i == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_output_see_required_details_action, null, new Click(28, (Integer) null, (Object) action, "STEP_ACTION_ID", false), 10);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_output_confirmation_action, null, new Click(28, (Integer) null, (Object) action, "STEP_ACTION_ID", false), 10);
                }
                return textLocalisedClause;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                ru ruVar = new ru("ROOM_LOADING_ID");
                yp0.b.l(ruVar, 0, 0, 0, 0, null, false, 63);
                eVarB.add(ruVar);
                ArrayList arrayList3 = new ArrayList(4);
                for (int i2 = 0; i2 < 4; i2++) {
                    arrayList3.add(new s7(a0.d.n("CELL_DETAILS_LOADING_ITEM_ID_", i2), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return new aeg.e(u.a(eVarB), new aeg.d(f0.f322471a), false);
            case 6:
                HotelsAmenity it12 = (HotelsAmenity) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f97839c;
            case 7:
                wel.e it13 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 8:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (InstrumentTicker) d0.b0(it14);
            case 9:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                return instruments;
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                List list4 = (List) pair.f186386b;
                int iB = q0.b(w.t(list4, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj4 : list4) {
                    linkedHashMap.put(((InstrumentTicker) obj4).f105112b, obj4);
                }
                List<nel.n> list5 = list3;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                for (nel.n nVar : list5) {
                    arrayList4.add(new a0(nVar, (InstrumentTicker) linkedHashMap.get(nVar.f214596b)));
                }
                return arrayList4;
            case 11:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list6 = (List) pair2.f186385a;
                List list7 = (List) pair2.f186386b;
                int iB2 = q0.b(w.t(list7, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj5 : list7) {
                    linkedHashMap2.put(((InstrumentTicker) obj5).f105112b, obj5);
                }
                List<nel.n> list8 = list6;
                ArrayList arrayList5 = new ArrayList(w.t(list8, 10));
                for (nel.n nVar2 : list8) {
                    arrayList5.add(new a0(nVar2, (InstrumentTicker) linkedHashMap2.get(nVar2.f214596b)));
                }
                return arrayList5;
            case 12:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Data(null, it15, false, 1, null);
            case 13:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                ArrayList arrayList6 = portfolio.e;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : arrayList6) {
                    kel.g gVar = (kel.g) obj6;
                    if (gVar instanceof kel.b) {
                        if (((kel.b) gVar).f183149b.f115082a > 0) {
                            arrayList7.add(obj6);
                        }
                    } else if ((gVar instanceof kel.n) && ((kel.n) gVar).f183174b.compareTo(BigDecimal.ZERO) > 0) {
                        arrayList7.add(obj6);
                    }
                }
                return arrayList7;
            case 14:
                wel.e portfolio2 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                ArrayList arrayList8 = portfolio2.e;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : arrayList8) {
                    kel.g gVar2 = (kel.g) obj7;
                    if ((gVar2 instanceof kel.b) || ((gVar2 instanceof kel.n) && ((kel.n) gVar2).f183174b.compareTo(BigDecimal.ZERO) > 0)) {
                        arrayList9.add(obj7);
                    }
                }
                return arrayList9;
            case 15:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Data(null, it16, false, 1, null);
            case 16:
                kel.g holding = (kel.g) obj2;
                Intrinsics.checkNotNullParameter(holding, "holding");
                return ((kel.n) holding).f183174b;
            case 17:
                List data = (List) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                ArrayList arrayList10 = new ArrayList();
                for (Object obj8 : data) {
                    if (((wbl.h) obj8).f296265a.f.d) {
                        arrayList10.add(obj8);
                    }
                }
                return arrayList10;
            case 18:
                Map it17 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new ybl.g(it17);
            case 19:
                cfl.v productState = (cfl.v) obj2;
                Intrinsics.checkNotNullParameter(productState, "productState");
                Intrinsics.checkNotNullParameter(productState, "<this>");
                switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105340c[productState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        z = true;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 20:
                cfl.v productState2 = (cfl.v) obj2;
                Intrinsics.checkNotNullParameter(productState2, "productState");
                Intrinsics.checkNotNullParameter(productState2, "<this>");
                switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105340c[productState2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                        break;
                    case 5:
                        z = true;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 21:
                cfl.v productState3 = (cfl.v) obj2;
                Intrinsics.checkNotNullParameter(productState3, "productState");
                Intrinsics.checkNotNullParameter(productState3, "<this>");
                switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105340c[productState3.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                        break;
                    case 6:
                        z = true;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 22:
                String userId = (String) obj2;
                Intrinsics.checkNotNullParameter(userId, "userId");
                od0.i.Companion.getClass();
                return od0.h.a(userId);
            case 23:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                List list9 = tradingAccounts.f105278a;
                if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                    Iterator it18 = list9.iterator();
                    while (true) {
                        if (it18.hasNext()) {
                            TradingAccount tradingAccount = (TradingAccount) it18.next();
                            if (Intrinsics.f(tradingAccount.W(), TradingAccountType.Gia.f105270a) && com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 24:
                List tradingAccounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts2, "tradingAccounts");
                od0.h hVar = od0.i.Companion;
                Object objO0 = d0.o0(tradingAccounts2);
                hVar.getClass();
                return od0.h.a(objO0);
            case 25:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List<hel.a> list10 = (List) pair3.f186385a;
                String str = (String) pair3.f186386b;
                for (hel.a aVar3 : list10) {
                    if (Intrinsics.f(aVar3.f151717b, str)) {
                        return aVar3;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 26:
                hel.a it19 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Float.valueOf(it19.f151718c / 1000000);
            case 27:
                Float it20 = (Float) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Float.valueOf(it20.floatValue() + 1);
            case 28:
                hel.a it21 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.d;
            default:
                hel.a it22 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.e;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f3523a = i;
    }
}
