package xo8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import ip0.nb0;
import ip0.pb0;
import ip0.vd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import mx0.lc;
import mx0.mc;
import xme.e;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307707a;

    public /* synthetic */ i0(int i) {
        this.f307707a = i;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xp3.b bVar = null;
        switch (this.f307707a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return q.f307725a;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.a(nb0Var, "LOADING_ITEM_LIST_ID_0", false, 6), nb0.a(nb0Var, "LOADING_ITEM_LIST_ID_1", false, 6), nb0.a(nb0Var, "LOADING_ITEM_LIST_ID_2", false, 6), nb0.a(nb0Var, "LOADING_ITEM_LIST_ID_3", false, 6), nb0.a(nb0Var, "LOADING_ITEM_LIST_ID_4", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                List listC = zhm.u.c(nb0.a(pb0.Companion, "REMOVE_POCKET_LOADING_ITEM_LIST_ID", false, 6));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 3:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ArrayList arrayListD = qee.s.d(3);
                yp0.b.k(arrayListD, 0, 0, 0, 0, 31);
                ArrayList arrayListD2 = qee.s.d(5);
                yp0.b.k(arrayListD2, 0, 0, 0, 0, 31);
                return new xob.q(zhm.d0.E0(arrayListD2, arrayListD), new xob.h(null, new TextLocalisedClause(R$string.savings_details_title, null, null, 14), true));
            case 4:
                snb.b it12 = (snb.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it12);
            case 5:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return e.a.f307232a;
            case 6:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 7:
                od0.i.Companion.getClass();
                return od0.h.a((SavingsChallenge) obj2);
            case 8:
                String str = (String) obj2;
                ScreenerAllFiltersFlow.Companion aVar = ScreenerAllFiltersFlow.INSTANCE;
                Intrinsics.h(str);
                return Long.valueOf(!kotlin.text.d0.W(str) ? 300L : 0L);
            case 9:
                xoh.j it15 = (xoh.j) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.d;
            case 10:
                InputTextDelegate.Model it16 = (InputTextDelegate.Model) obj2;
                ScheduleTransferScreen.Companion aVar2 = ScheduleTransferScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f52580a;
            case 11:
                vd it17 = (vd) obj2;
                ScheduleTransferScreen.Companion aVar3 = ScheduleTransferScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it17, "it");
                String str2 = it17.f166806a.f54184a;
                LocalDate localDate = it17.f166807b;
                return new Pair(str2, LocalDate.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()));
            case 12:
                mc it18 = (mc) obj2;
                KProperty[] kPropertyArr = RateDetailsScreen.f103723e0;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(((lc) it18).f209806a, "CHART_TAB_ACTION_ADVANCED_CHART_ID"));
            case 13:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                it3.g gVar = it3.i.Companion;
                it3.h hVar = it3.h.MAINTENANCE;
                gVar.getClass();
                return it3.g.a(hVar);
            case 14:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                cs3.b.Companion.getClass();
                return cs3.b.f108440g;
            case 15:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return zhm.f0.f322471a;
            case 16:
                Throwable it22 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return zhm.f0.f322471a;
            case 17:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_unplugged_title, null, null, 14);
                nb0 nb0Var2 = pb0.Companion;
                List listK2 = zhm.v.k(nb0.b(nb0Var2, "LOADING_STATE_ID_1", false, 0, false, 30), nb0.b(nb0Var2, "LOADING_STATE_ID_2", false, 0, false, 30), nb0.b(nb0Var2, "LOADING_STATE_ID_3", false, 0, false, 30));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return new xq7.f(null, textLocalisedClause, listK2);
            case 18:
                fo3.c it24 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.d;
            case 19:
                Function0 it25 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return iii.c.c(5);
            case 20:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list2) {
                    linkedHashMap.put(new RegisteredIdentityId(((TeenProfile) obj3).f90334a), obj3);
                }
                return linkedHashMap;
            case 21:
                er3.b it26 = (er3.b) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                od0.h hVar2 = od0.i.Companion;
                er3.a offer = it26.getOffer();
                if (offer != null) {
                    Object obj4 = nr3.a.f218526a;
                    Intrinsics.checkNotNullParameter(offer, "<this>");
                    bVar = new xp3.b(offer.getId(), offer.getDescription(), (xp3.a) u1.u(offer.getState(), nr3.a.f218526a));
                }
                hVar2.getClass();
                return od0.h.a(bVar);
            case 22:
                List it27 = (List) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                List list3 = it27;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it28 = list3.iterator();
                while (it28.hasNext()) {
                    arrayList.add(mra.d.U((lqa.f) it28.next()));
                }
                return arrayList;
            case 23:
                List it29 = (List) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : it29) {
                    if (((CardOwner) obj5).f != wpa.a.LINKED) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 24:
                CardOwner response = (CardOwner) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return new fqa.m(response, false);
            case 25:
                r7a.i permissionFlowOutput = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                if (!(permissionFlowOutput instanceof r7a.e) && !(permissionFlowOutput instanceof r7a.f) && !(permissionFlowOutput instanceof r7a.h)) {
                    if (!(permissionFlowOutput instanceof r7a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.D("Unhandled secondary click");
                }
                return Unit.f186387a;
            case 26:
                nel.n it30 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                return Boolean.valueOf(!io3.h.j(it30.f214597c));
            case 27:
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return instrument.e;
            case 28:
                OrderQuote quote = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return e1.l(quote);
            default:
                FiatExchangeOrderQuote quote2 = (FiatExchangeOrderQuote) obj2;
                Intrinsics.checkNotNullParameter(quote2, "quote");
                Amount amountA = qcf.a.a(quote2);
                if (amountA != null) {
                    return amountA;
                }
                throw new IllegalStateException("Maximum buy quote does not contain a cash amount");
        }
    }

    public /* synthetic */ i0(Object obj2, int i) {
        this.f307707a = i;
    }
}
