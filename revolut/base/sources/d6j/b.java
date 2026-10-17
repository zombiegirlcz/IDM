package d6j;

import b8e.d;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mx0.lc;
import mx0.mc;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111550a;

    public /* synthetic */ b(int i) {
        this.f111550a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        Object objC;
        switch (this.f111550a) {
            case 0:
                mc it8 = (mc) obj2;
                CommodityAssetDetailsScreen.Companion aVar = CommodityAssetDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(((lc) it8).f209806a, "ACTION_CHART_SETTING_ID"));
            case 1:
                List<z5l.e> it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                ArrayList arrayList = new ArrayList();
                for (z5l.e eVar : it9) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = ebm.a.J(eVar);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    w5l.a aVar2 = (w5l.a) objA;
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                    break;
                }
                return arrayList;
            case 2:
                ((Boolean) obj2).getClass();
                d6l.e eVar2 = d6l.h.Companion;
                return Boolean.TRUE;
            case 3:
                Intrinsics.checkNotNullParameter((d6l.d) obj2, "it");
                return Boolean.TRUE;
            case 4:
                String str = (String) obj2;
                return a10.b.t(str, "state", "state=", str);
            case 5:
                Data designsOptionalData = (Data) obj2;
                Intrinsics.checkNotNullParameter(designsOptionalData, "designsOptionalData");
                od0.h hVar = od0.i.Companion;
                od0.i iVar = (od0.i) designsOptionalData.getContent();
                objC = iVar != null ? (e93.e) iVar.f224257a : null;
                hVar.getClass();
                return Data.copy$default(designsOptionalData, od0.h.a(objC), null, false, 6, null);
            case 6:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf((it10.getLoading() && it10.getContent() == null) ? false : true);
            case 7:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.h hVar2 = od0.i.Companion;
                n38.a aVar3 = (n38.a) it11.getContent();
                objC = aVar3 != null ? l38.a.c(aVar3) : null;
                hVar2.getClass();
                return od0.h.a(objC);
            case 8:
                bla.c it12 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 == bla.c.ENABLED);
            case 9:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return Boolean.valueOf(config.K1);
            case 10:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (it13.getContent() != null) {
                    return it13;
                }
                od0.i.Companion.getClass();
                return Data.copy$default(it13, od0.i.f224256b, null, false, 6, null);
            case 11:
                d74.f update = (d74.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data preferences = new Data(null, null, true, 3, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(preferences, "preferences");
                return new d74.f(preferences);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_consents_preferences_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_consents_preferences_subtitle, null, null, 14);
                IntRange intRange = new IntRange(1, 2, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it14 = intRange.iterator();
                while (it14.f289625c) {
                    pb0 pb0Var = new pb0(a0.d.n("consent-preferences-loading-", it14.nextInt()));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(pb0Var);
                }
                return new d74.l(textLocalisedClause, textLocalisedClause2, null, arrayList2, false);
            case 13:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 14:
                List localAccounts = (List) obj2;
                Intrinsics.checkNotNullParameter(localAccounts, "localAccounts");
                return localAccounts.isEmpty() ? zhm.u.c(d88.h.b()) : localAccounts;
            case 15:
                return new go.g(zhm.f0.f322471a, 2);
            case 16:
                JuniorBankingProfile it15 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new b8e.e(it15);
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return d.a.f13205a;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = zhm.v.k(new s7("PerformanceDetailsStateMapper_contributions_loading", 0, 0, 0, 0, false, null, 126), new s7("PerformanceDetailsStateMapper_withdrawals_loading", 0, 0, 0, 0, false, null, 126), new s7("PerformanceDetailsStateMapper_total_return_loading", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new d7f.i(null, null, null, listK);
            case 19:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                od0.h hVar3 = od0.i.Companion;
                ExchangePocket exchangePocket = new ExchangePocket(pocket.f163145a, pocket.f163147c, pocket.i, wd6.i.CURRENT);
                hVar3.getClass();
                return od0.h.a(exchangePocket);
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 21:
                d7j.w it16 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f112067a;
            case 22:
                d7j.w it17 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                ExchangeOrderDraft exchangeOrderDraftA = it17.f112070g.a();
                if (exchangeOrderDraftA != null) {
                    return exchangeOrderDraftA.e;
                }
                return null;
            case 23:
                d7j.w it18 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                ExchangeOrderDraft exchangeOrderDraftA2 = it18.f112070g.a();
                if (exchangeOrderDraftA2 != null) {
                    return exchangeOrderDraftA2.f99892m;
                }
                return null;
            case 24:
                d7j.w it19 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f112070g.a();
            case 25:
                d7j.w it20 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f112069c;
            case 26:
                d7j.w it21 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f112070g.a();
            case 27:
                d7j.w it22 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f112070g.a();
            case 28:
                d7j.w it23 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                ExchangeOrderDraft exchangeOrderDraftA3 = it23.f112070g.a();
                if (exchangeOrderDraftA3 != null) {
                    return exchangeOrderDraftA3.e;
                }
                return null;
            default:
                d7j.w it24 = (d7j.w) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f112070g.a();
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f111550a = i;
    }
}
