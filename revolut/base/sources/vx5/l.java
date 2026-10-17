package vx5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks8.j;
import vrl.v0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f292820b;

    public /* synthetic */ l(x xVar, int i) {
        this.f292819a = i;
        this.f292820b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String currencyCode;
        pfm.h hVar;
        int i = this.f292819a;
        pfm.m mVar = pfm.m.f235744a;
        int i2 = 2;
        x xVar = this.f292820b;
        switch (i) {
            case 0:
                Boolean searchActive = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(searchActive, "searchActive");
                if (!searchActive.booleanValue()) {
                    return xVar.N();
                }
                xx5.c cVar = xVar.i;
                zx5.a currencyMode = xVar.f292833h.f71586b;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
                efm.i flowable = cVar.f309402a.w0().c(te0.s.f270018a).toFlowable(efm.a.LATEST);
                xt1.a aVar = new xt1.a(27, new xpe.c(cVar, currencyMode, 22));
                int i3 = efm.i.f125385a;
                j01.b bVar = new j01.b(flowable.f(aVar, i3, i3), 7);
                Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
                efm.r rVarSwitchMap = bVar.switchMap(new v0(26, new l(xVar, i2)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap;
            case 1:
                Data currenciesData = (Data) obj2;
                Intrinsics.checkNotNullParameter(currenciesData, "currenciesData");
                List list = (List) currenciesData.getContent();
                List list2 = list;
                return (list2 == null || list2.isEmpty()) ? te0.w.h(((k) xVar.f292837n).a()) : xVar.O(list, false);
            case 2:
                d dVar = xVar.f292837n;
                Data searchResultData = (Data) obj2;
                Intrinsics.checkNotNullParameter(searchResultData, "searchResultData");
                h hVar2 = (h) searchResultData.getContent();
                if (hVar2 == null) {
                    return te0.w.h(((k) dVar).a());
                }
                ArrayList arrayList = hVar2.f292817a;
                String query = hVar2.f292818b;
                if (!arrayList.isEmpty()) {
                    return xVar.O(arrayList, true);
                }
                ((k) dVar).getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                return te0.w.h(zhm.u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_LIST_ID", new TextLocalisedClause(R$string.wealth_crypto_search_no_results, zhm.u.c(query), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756)));
            case 3:
                g gVar = xVar.f292834j;
                ks8.j result = (ks8.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ks8.i) {
                    FeatureCommand naviCommand = ((ks8.i) result).f189312a;
                    y yVar = (y) gVar;
                    yVar.getClass();
                    Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                    pfm.h hVar3 = new pfm.h(new v3e.t(yVar, naviCommand, 12), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                    return hVar3;
                }
                if (!(result instanceof j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVar2 = (y) gVar;
                yVar2.getClass();
                pfm.h hVar4 = new pfm.h(new v3e.t(yVar2, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CommoditiesOnboardingDestination$Risks(new FinishCommand(null, null, null, 7)), false, (Integer) null, 0, 61)), 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            case 4:
                RowDelegate.Model rowDelegateModel = (RowDelegate.Model) obj2;
                ny5.i iVar = xVar.f292835l;
                Intrinsics.h(rowDelegateModel);
                oy5.b router = xVar.f292840r;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(rowDelegateModel, "rowDelegateModel");
                Intrinsics.checkNotNullParameter(router, "router");
                Object obj3 = rowDelegateModel.u;
                zv5.a aVar2 = obj3 instanceof zv5.a ? (zv5.a) obj3 : null;
                if (aVar2 == null || (currencyCode = aVar2.f325574a) == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "CryptoCommodityRateTilesPresenterDelegate", a0.d.m(obj3, "Cannot handle click, unexpected parcel: "), null, null, 16);
                    return mVar;
                }
                xi0.b.Companion.getClass();
                xi0.b bVarA = xi0.a.a(currencyCode);
                if (!cp5.d.z(bVarA) && !cp5.d.y(bVarA)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "CryptoCommodityRateTilesPresenterDelegate", "Cannot handle currency ".concat(currencyCode), null, null, 16);
                    return mVar;
                }
                router.getClass();
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                xi0.b.Companion.getClass();
                xi0.b bVarA2 = xi0.a.a(currencyCode);
                if (cp5.d.z(bVarA2)) {
                    hVar = new pfm.h(new ne0.o(router, new FeatureCommand(new CryptoAssetDetailsFeatureConfig.AssetDetails(bVarA2, (BuyFundingCurrencyPrefill) null, 6)), 22), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                } else {
                    hVar = new pfm.h(new ne0.o(router, new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(bVarA2, null, null, null, 62)), 22), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                }
                return hVar;
            case 5:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                y yVar3 = (y) xVar.f292834j;
                yVar3.getClass();
                pfm.h hVar5 = new pfm.h(new v3e.t(yVar3, new FinishCommand(null, null, null, 7), 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                return hVar5;
            case 6:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                sy5.c cVar2 = xVar.o;
                NavBarWithToolbar navBarWithToolbar = cVar2.i;
                if (navBarWithToolbar == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                if (navBarWithToolbar.f59421x0) {
                    cVar2.N();
                    return mVar;
                }
                y yVar4 = (y) xVar.f292834j;
                yVar4.getClass();
                pfm.h hVar6 = new pfm.h(new v3e.t(yVar4, new FinishCommand(null, null, null, 7), 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar6, "fromAction(...)");
                return hVar6;
            case 7:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                y yVar5 = (y) xVar.f292834j;
                yVar5.getClass();
                pfm.h hVar7 = new pfm.h(new v3e.t(yVar5, new FinishCommand(null, null, null, 7), 12), 2);
                Intrinsics.checkNotNullExpressionValue(hVar7, "fromAction(...)");
                return hVar7;
            default:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                pfm.a aVar3 = new pfm.a(ks8.m.a(xVar.f292839q), new v0(27, new l(xVar, 3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
        }
    }
}
