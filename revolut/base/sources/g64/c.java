package g64;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoOverview;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Source;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Buy;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Earning;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Holding;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Stake;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.um0;
import ip0.za0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140841a;

    public /* synthetic */ c(int i) {
        this.f140841a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f140841a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.FALSE;
            case 1:
                Unit args = (Unit) obj2;
                Intrinsics.checkNotNullParameter(args, "args");
                return new g67.a();
            case 2:
                g6f.b it8 = (g6f.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f140920a;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 4:
                um0 it9 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.d;
                if (obj3 instanceof i6k.e) {
                    return (i6k.e) obj3;
                }
                return null;
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                of8.b bVar = (of8.b) pair.f186386b;
                List list = (List) pair2.f186386b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList.add(((io3.d) it10.next()).f163147c);
                }
                return Boolean.valueOf(d0.i1(arrayList).size() > 1 && i26.l.j(bVar.f224757p.f235515a));
            case 6:
                g7b.n it11 = (g7b.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = it11.f141153b;
                if (cobrandedCardsPlanHubPlan != null) {
                    return cobrandedCardsPlanHubPlan.f82415a;
                }
                return null;
            case 7:
                g7b.n it12 = (g7b.n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                CobrandedCardsPlanHubInfoOverview cobrandedCardsPlanHubInfoOverview = (CobrandedCardsPlanHubInfoOverview) it12.f141152a.getContent();
                if (cobrandedCardsPlanHubInfoOverview != null) {
                    return cobrandedCardsPlanHubInfoOverview.f82384g;
                }
                return null;
            case 8:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                hx7.e.n(it13);
                return Boolean.TRUE;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new gu("list_id_card_benefits_header_loading", 0, 0, 30));
                pb0 pb0Var = new pb0("LOADING_ID_CARD_ITEM");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(pb0Var, nb0.a(nb0Var, "LOADING_PREFIX_ID_CARD_ITEM0", false, 4), nb0.a(nb0Var, "LOADING_PREFIX_ID_CARD_ITEM1", false, 4), nb0.a(nb0Var, "LOADING_PREFIX_ID_CARD_ITEM2", false, 4));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return zhm.u.a(eVarB);
            case 10:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return f0.f322471a;
            case 11:
                g7f.c it14 = (g7f.c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 13:
                Map it15 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : it15.entrySet()) {
                    if (ta6.a.x((JuniorBankingProfile) entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            case 14:
                PdfViewContract$Source it16 = (PdfViewContract$Source) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                if (it16 instanceof PdfViewContract$Source.Remote) {
                    return (PdfViewContract$Source.Remote) it16;
                }
                return null;
            case 15:
                File it17 = (File) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zi0.c.P(it17, false, null, 3);
            case 16:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Data(null, it18, false, 5, null);
            case 17:
                RowDelegate.Model it19 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj4 = it19.u;
                if (obj4 instanceof AssetDetailsInvestmentContract$ClickParcel$Holding) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Holding) obj4;
                }
                return null;
            case 18:
                RowDelegate.Model it20 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                Object obj5 = it20.u;
                AssetDetailsInvestmentContract$ClickParcel$Earning assetDetailsInvestmentContract$ClickParcel$Earning = obj5 instanceof AssetDetailsInvestmentContract$ClickParcel$Earning ? (AssetDetailsInvestmentContract$ClickParcel$Earning) obj5 : null;
                if (assetDetailsInvestmentContract$ClickParcel$Earning != null) {
                    return assetDetailsInvestmentContract$ClickParcel$Earning.f99976a;
                }
                return null;
            case 19:
                RowDelegate.Model it21 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                Object obj6 = it21.u;
                if (obj6 instanceof AssetDetailsInvestmentContract$ClickParcel$Stake) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Stake) obj6;
                }
                return null;
            case 20:
                RowDelegate.Model it22 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                Object obj7 = it22.u;
                if (obj7 instanceof AssetDetailsInvestmentContract$ClickParcel$Buy) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Buy) obj7;
                }
                return null;
            case 21:
                RowDelegate.Model it23 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                RowDelegate.Model.c cVar = it23.k;
                pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                Object obj8 = pfVar != null ? pfVar.f : null;
                if (obj8 instanceof AssetDetailsInvestmentContract$ClickParcel$Buy) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Buy) obj8;
                }
                return null;
            case 22:
                RowDelegate.Model it24 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                RowDelegate.Model.c cVar2 = it24.k;
                pf pfVar2 = cVar2 instanceof pf ? (pf) cVar2 : null;
                Object obj9 = pfVar2 != null ? pfVar2.f : null;
                if (obj9 instanceof AssetDetailsInvestmentContract$ClickParcel$Stake) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Stake) obj9;
                }
                return null;
            case 23:
                NewProductSmallDelegate.Model it25 = (NewProductSmallDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                Object obj10 = it25.e;
                if (obj10 instanceof AssetDetailsInvestmentContract$ClickParcel$Stake) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Stake) obj10;
                }
                return null;
            case 24:
                NewProductSmallDelegate.Model it26 = (NewProductSmallDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                Object obj11 = it26.e;
                if (obj11 instanceof AssetDetailsInvestmentContract$ClickParcel$Buy) {
                    return (AssetDetailsInvestmentContract$ClickParcel$Buy) obj11;
                }
                return null;
            case 25:
                List it27 = (List) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return ofm.q.f0((qta.c) d0.b0(it27));
            case 26:
                OnboardingFlowContract$State update = (OnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return OnboardingFlowContract$State.a(update, null, null, null, 11);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var2 = pb0.Companion;
                return zhm.v.k(nb0.b(nb0Var2, "MANAGEMENT_PAYMENT_METHOD_LOADING_LIST_ID", false, 0, false, 30), nb0.b(nb0Var2, "MANAGEMENT_SHIPPING_ADDRESS_LOADING_LIST_ID", false, 0, false, 30));
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB2 = zhm.u.b();
                IntRange intRange = new IntRange(1, 8, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it28 = intRange.iterator();
                while (it28.f289625c) {
                    arrayList2.add(new pe(j6.a.l(it28.nextInt(), "ID_", "_LOADING_GRID_ITEM")));
                }
                eVarB2.add(new za0("ID_MERCHANTS_LOADING_GRID", arrayList2));
                return yp0.b.g(zhm.u.a(eVarB2), gac.j.a(false), null, 0, 0, 126);
        }
    }
}
