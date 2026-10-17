package ocb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$State;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import com.youTransactor.uCube.rpc.Constants;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.sx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mx0.f3;
import mx0.h3;
import o97.e0;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f224194b;

    public /* synthetic */ u(Object obj2, boolean z, int i) {
        this.f224193a = i;
        this.f224194b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        ArrayList arrayList;
        Object next2;
        switch (this.f224193a) {
            case 0:
                return g.a((g) obj2, null, false, null, false, false, null, null, null, null, false, false, false, null, false, new i(this.f224194b), 16383);
            case 1:
                return g.a((g) obj2, null, this.f224194b, null, false, false, null, null, null, null, false, false, false, null, false, null, 32765);
            case 2:
                return g.a((g) obj2, null, false, null, false, false, null, null, null, null, false, false, this.f224194b, null, false, null, 30719);
            case 3:
                return g.a((g) obj2, null, false, null, this.f224194b, false, null, null, null, null, false, false, false, null, false, null, 32759);
            case 4:
                return oph.a.a((oph.a) obj2, null, this.f224194b, null, null, 27);
            case 5:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i = 0; i < 4; i++) {
                    pb0 pb0VarB = nb0.b(pb0.Companion, a0.d.n("screener-collections-page-loading-", i), false, 0, false, 30);
                    yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(pb0VarB);
                }
                return oph.o.a(arrayListP, this.f224194b);
            case 6:
                return jsl.x.a((jsl.x) obj2, null, null, null, this.f224194b, null, null, 55);
            case 7:
                oul.k update = (oul.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                TargetPriceInputValue targetPriceInputValue = update.f229907c;
                boolean z = this.f224194b;
                return oul.k.a(update, TargetPriceInputValue.a(targetPriceInputValue, null, Boolean.valueOf(z), z ? false : update.f229907c.f106874c, false, 9), null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 8:
                return ox5.l.a((ox5.l) obj2, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, this.f224194b, 16383);
            case 9:
                dj0.d dVar = (dj0.d) obj2;
                if (dVar != null) {
                    return pb2.c.f(pb2.c.k(dVar), this.f224194b);
                }
                return null;
            case 10:
                phg.g update2 = (phg.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return phg.g.a(update2, null, null, this.f224194b, 3);
            case 11:
                List searchResults = (List) obj2;
                Intrinsics.checkNotNullParameter(searchResults, "searchResults");
                Intrinsics.checkNotNullParameter(searchResults, "searchResults");
                if (searchResults.isEmpty()) {
                    return f0.f322471a;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = searchResults.iterator();
                while (true) {
                    RowDelegate.Model modelA = null;
                    if (!it8.hasNext()) {
                        if (arrayList2.isEmpty()) {
                            return f0.f322471a;
                        }
                        List listC = zhm.u.c(new o97.f0(new TextLocalisedClause(R$string.shops_platform_screens_shops_title, null, null, 14), "LIST_ID_SEARCH_TITLE"));
                        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                        return d0.F0(new e0(arrayList2), listC);
                    }
                    mid.q qVar = (mid.q) it8.next();
                    String str = qVar.d;
                    ShopsContext shopsContext = qVar.e;
                    mid.h hVar = new mid.h(Integer.valueOf(qVar.f), str, qVar.i, qVar.f205750h);
                    if (shopsContext instanceof ShopsCampaignOffer) {
                        ShopsCampaignOffer shopsCampaignOffer = (ShopsCampaignOffer) shopsContext;
                        modelA = pid.a.a(qVar, hVar, a0.d.s("campaignOfferId=", shopsCampaignOffer.f87023a, ", campaignOfferSource=", shopsCampaignOffer.u), new RowDelegate.Model.c.a(hjd.z.a(shopsCampaignOffer.f87031n, this.f224194b), null, false, 6));
                    } else if (shopsContext instanceof ShopsDeeplinkOffer) {
                        modelA = pid.a.a(qVar, hVar, "deeplinkOffer=" + ((ShopsDeeplinkOffer) shopsContext).f87042a, null);
                    }
                    if (modelA != null) {
                        arrayList2.add(modelA);
                    }
                }
                break;
            case 12:
                return pij.v.a((pij.v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f224194b), 1048575);
            case 13:
                pni.l update3 = (pni.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return pni.l.a(update3, null, this.f224194b, null, 47);
            case 14:
                pqg.o updateState = (pqg.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return pqg.o.b(updateState, null, null, 0L, null, null, null, null, null, false, this.f224194b, null, 49151);
            case 15:
                IntroductionScreenContract$State update4 = (IntroductionScreenContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                return new IntroductionScreenContract$State(this.f224194b);
            case 16:
                return q23.q.a((q23.q) obj2, null, this.f224194b, null, null, null, null, null, null, null, false, null, 4093);
            case 17:
                q4a.f update5 = (q4a.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return q4a.f.a(update5, this.f224194b, false, null, null, null, false, null, null, 510);
            case 18:
                qb7.d update6 = (qb7.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                boolean z3 = this.f224194b;
                boolean z4 = false;
                if (!z3 && update6.f244125a.length() > 0 && update6.f244125a.length() < 6) {
                    z4 = true;
                }
                return qb7.d.a(update6, null, null, z4, false, z3, false, 43);
            case 19:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                if (!this.f224194b) {
                    return m72.b.x(cards, od0.i.Companion);
                }
                od0.h hVar2 = od0.i.Companion;
                Iterator it9 = cards.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((h93.f0) next).X()) {
                        }
                    } else {
                        next = null;
                    }
                }
                h93.f0 f0Var = (h93.f0) next;
                if (f0Var == null) {
                    f0Var = (h93.f0) d0.d0(cards);
                }
                hVar2.getClass();
                return od0.h.a(f0Var);
            case 20:
                return qcc.e.a((qcc.e) obj2, null, r0.g(), null, this.f224194b, 5);
            case 21:
                return qcc.e.a((qcc.e) obj2, null, null, null, this.f224194b, 7);
            case 22:
                qgf.h update7 = (qgf.h) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return qgf.h.a(update7, null, null, this.f224194b, null, false, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 23:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it10 = tradingAccounts.f105278a.iterator();
                while (true) {
                    arrayList = null;
                    if (it10.hasNext()) {
                        next2 = it10.next();
                        if (((TradingAccount) next2) instanceof TradingAccount.Robo.Regular) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                TradingAccount tradingAccount = (TradingAccount) next2;
                List listC0 = tradingAccount != null ? tradingAccount.c0() : null;
                if (!this.f224194b && ue0.e.n(listC0)) {
                    List list = tradingAccounts.f105279b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((TradingAccountAvailableToOnboard) obj3).d instanceof TradingAccountType.Robo) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList = new ArrayList();
                    Iterator it11 = arrayList3.iterator();
                    while (it11.hasNext()) {
                        zhm.a0.x(((TradingAccountAvailableToOnboard) it11.next()).f, arrayList);
                    }
                }
                if (listC0 == null) {
                    listC0 = arrayList;
                }
                if (listC0 != null) {
                    return listC0;
                }
                throw new IllegalStateException("ROBO trading account not found");
            case 24:
                return qna.f.a((qna.f) obj2, null, null, null, null, null, null, this.f224194b, 63);
            case 25:
                qwd.m update8 = (qwd.m) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return qwd.m.a(update8, 0L, null, null, !this.f224194b, null, null, null, null, 1007);
            case 26:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new f3(null, null, null, this.f224194b, h3.LOADING, false);
            case 27:
                return AirportLoungePassDetailsFlowContract$State.a((AirportLoungePassDetailsFlowContract$State) obj2, this.f224194b, null, null, null, 62);
            case 28:
                r4g.g update9 = (r4g.g) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return r4g.g.a(update9, null, null, this.f224194b, 3);
            default:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                s0 s0Var = new s0(2);
                gu guVar = new gu("LOADING_PRICE_TARGETS_WIDGET_HEADER_LIST_ID", 0, 0, 30);
                if (!this.f224194b) {
                    guVar = null;
                }
                s0Var.a(guVar);
                List listC2 = zhm.u.c(new sx("LOADING_MULTI_TARGET_FAN_CHART_DELEGATE"));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                s0Var.b(listC2.toArray(new sx[0]));
                ArrayList arrayList4 = s0Var.f186433a;
                return zhm.v.m(arrayList4.toArray(new qv0.i[arrayList4.size()]));
        }
    }

    public /* synthetic */ u(boolean z, int i) {
        this.f224193a = i;
        this.f224194b = z;
    }
}
