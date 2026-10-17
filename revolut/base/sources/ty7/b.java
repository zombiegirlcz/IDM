package ty7;

import android.os.Parcelable;
import android.view.View;
import au0.n4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesActivity;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation.PetPlanConfirmPurchaseActivity;
import com.revolut.feature.support.api.navigation.InboundTransferTrackerDestination;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import grl.k9;
import ip0.tm0;
import ip0.um0;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mri.w;
import rp0.t;
import rp0.y;
import ueg.z;
import up5.a0;
import v3e.d0;
import v6l.s;
import vea.x;
import vkm.z1;
import x2i.r;
import yt0.v;
import z1i.b0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f275491b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f275490a = i;
        this.f275491b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kfm.a
    public final void run() {
        TextLocalisedClause textLocalisedClause;
        ExchangeOrderInfo f72134a;
        wd6.h hVar;
        int i;
        int i2 = this.f275490a;
        boolean z = true;
        Object obj2 = this.f275491b;
        switch (i2) {
            case 0:
                PetEditReviewChangesActivity petEditReviewChangesActivity = (PetEditReviewChangesActivity) obj2;
                int i3 = PetEditReviewChangesActivity.B0;
                petEditReviewChangesActivity.Z0().smoothScrollToPosition(((z4l.j) petEditReviewChangesActivity.f76308x0.getValue()).getItemCount());
                return;
            case 1:
                ubj.h hVar2 = (ubj.h) obj2;
                for (Object obj3 : hVar2.f278922b.getAll()) {
                    if (obj3 instanceof CryptoDepositAddress) {
                        String pocketId = ((CryptoDepositAddress) obj3).f100037a;
                        for (wk5.a blockchain : wk5.a.values()) {
                            ne0.j jVar = hVar2.f278922b;
                            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                            jVar.remove("CACHE_KEY_CRYPTO_ADDRESSES" + pocketId + blockchain.name());
                        }
                    }
                }
                return;
            case 2:
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = (TravelHotelsSearchResultsMapScreen) obj2;
                travelHotelsSearchResultsMapScreen.N = true;
                travelHotelsSearchResultsMapScreen.l3().g0(new ah0.a(40.6963d, -73.9988d), 15.0f, false);
                z zVar = travelHotelsSearchResultsMapScreen.O;
                if (zVar != null) {
                    travelHotelsSearchResultsMapScreen.n3(zVar, null);
                }
                travelHotelsSearchResultsMapScreen.O = null;
                View viewFindViewWithTag = travelHotelsSearchResultsMapScreen.l3().findViewWithTag("GoogleWatermark");
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                    return;
                }
                return;
            case 3:
                ((ugc.g) obj2).f280011h.onNext(Unit.f186387a);
                return;
            case 4:
                ((uhl.e) obj2).a();
                return;
            case 5:
                ((a0) obj2).u.onNext(Unit.f186387a);
                return;
            case 6:
                fwj.d dVar = (fwj.d) ((uc.d) obj2).f278953b;
                ((com.revolut.analytics.tracking.v3.f) dVar.f138660a).e(-1L, dVar.f138662c, false);
                return;
            case 7:
                ux7.o oVar = (ux7.o) obj2;
                KProperty[] kPropertyArr = ux7.o.e;
                te0.j jVar2 = oVar.f283906b;
                KProperty[] kPropertyArr2 = ux7.o.e;
                jVar2.getValue(oVar, kPropertyArr2[0]).set("");
                oVar.f283907c.getValue(oVar, kPropertyArr2[1]).set(ux7.o.f);
                return;
            case 8:
                ((uz7.p) obj2).i.onNext(Unit.f186387a);
                return;
            case 9:
                d0 d0Var = (d0) obj2;
                d0Var.f285881j.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), (NaviCommand) d0Var.f285880h.l0().get()));
                return;
            case 10:
                s sVar = (s) obj2;
                sVar.f286496b.clear();
                sVar.f286497c.clear();
                return;
            case 11:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((vbj.c) obj2).f287529a, "CRYPTO_DEPOSIT_NETWORK_WARNING_ACCEPTED", Boolean.TRUE);
                return;
            case 12:
                TravelHotelsPropertyMapPreviewScreen travelHotelsPropertyMapPreviewScreen = (TravelHotelsPropertyMapPreviewScreen) obj2;
                travelHotelsPropertyMapPreviewScreen.M = true;
                vcg.e eVar = travelHotelsPropertyMapPreviewScreen.N;
                if (eVar != null) {
                    travelHotelsPropertyMapPreviewScreen.e3(eVar, null);
                }
                travelHotelsPropertyMapPreviewScreen.N = null;
                return;
            case 13:
                ((vde.a) obj2).f287917a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) InboundTransferTrackerDestination.f89356a, false, (Integer) null, 0, 61)));
                return;
            case 14:
                ((vea.l) obj2).f288210l.onNext(Boolean.valueOf(!pd.b.j((Boolean) r1.f())));
                return;
            case 15:
                ((x) obj2).f288249l.onNext(Boolean.valueOf(!pd.b.j((Boolean) r1.f())));
                return;
            case 16:
                ((vz4.l) obj2).k.onNext(new FinishCommand(null, null, null, 7));
                return;
            case 17:
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType withTradingAccountType = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType(TradingAccountType.Gia.f105270a);
                EndPromptParams endPromptParams = new EndPromptParams(true, EndPromptType.TRADING);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ((w0l.a) obj2).A2(new BridgeDestination(new FeatureCommand(new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(finishCommand, withTradingAccountType, null, endPromptParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)))));
                return;
            case 18:
                ((w21.o) obj2).f293933c.I0("WORKFLOW_ID_KEY");
                return;
            case 19:
                ((wc7.g) obj2).f296358a.b(new fc7.d(InsuranceHomeDestinations$Home.f76154a));
                return;
            case 20:
                ((opi.b) ((wm.l) obj2).f298581j).N().f256122j = true;
                return;
            case 21:
                z1 z1Var = ((wz2.d) obj2).o;
                od0.i.Companion.getClass();
                z1Var.k(od0.i.f224256b);
                return;
            case 22:
                r rVar = (r) obj2;
                opi.d dVar2 = rVar.f302594n;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.fx_orders_auto_exchange_confirmation_title, null, null, 14);
                ExchangeOrder exchangeOrderA = ((s2i.h) rVar.i).a();
                if (exchangeOrderA == null || (f72134a = exchangeOrderA.getF72134a()) == null || (hVar = f72134a.f72139c) == null) {
                    textLocalisedClause = null;
                } else {
                    int i5 = x2i.g.f302580a[hVar.ordinal()];
                    if (i5 == 1) {
                        i = R$string.fx_orders_auto_exchange_confirmation_limit_order_subtitle;
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("please add the explicit logic for a new order type");
                        }
                        i = R$string.fx_orders_auto_exchange_confirmation_stop_order_subtitle;
                    }
                    textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                }
                String str = null;
                ((opi.b) dVar2).Z(new y(u.c(new um0("CANCEL_DIALOG_BUTTONS_ITEM_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.fx_orders_auto_exchange_confirmation_action_no, null, null, 14), false, null, str, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.fx_orders_auto_exchange_confirmation_action_yes, null, null, 14), false, str, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(textLocalisedClause2, textLocalisedClause, null, 28), rp0.l.WINDOW, null, null, null, 1016));
                return;
            case 23:
                ((nzl.a) ((w) obj2)).f221092a.cancelUniqueWork("Prefetch stories");
                return;
            case 24:
                ((xif.s) obj2).f306382j.onNext(Unit.f186387a);
                return;
            case 25:
                fc.g gVar = (fc.g) obj2;
                if (jh.d.h(((asi.d) gVar.e).a())) {
                    ((ThreadPoolExecutor) gVar.i).submit(new n4(z, gVar, 10));
                    return;
                }
                return;
            case 26:
                PetPlanConfirmPurchaseActivity petPlanConfirmPurchaseActivity = (PetPlanConfirmPurchaseActivity) obj2;
                int i6 = PetPlanConfirmPurchaseActivity.z0;
                petPlanConfirmPurchaseActivity.Z0().smoothScrollToPosition(((z4l.j) petPlanConfirmPurchaseActivity.y0.getValue()).getItemCount());
                return;
            case 27:
                yrk.g gVar2 = (yrk.g) obj2;
                gVar2.d.onNext(Unit.f186387a);
                xrk.k kVar = (xrk.k) gVar2.f316331a;
                te0.e eVarX0 = kVar.x0();
                csk.f.Companion.getClass();
                eVarX0.set(csk.e.f108514b);
                te0.j jVar3 = kVar.e;
                KProperty[] kPropertyArr3 = xrk.k.i;
                te0.e value = jVar3.getValue(kVar, kPropertyArr3[3]);
                StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState = csk.e.f108515c;
                value.set(stockFinancialsStatementPeriodState);
                kVar.f.getValue(kVar, kPropertyArr3[4]).set(stockFinancialsStatementPeriodState);
                kVar.f308372g.getValue(kVar, kPropertyArr3[5]).set(r0.g());
                return;
            case 28:
                v vVar = (v) obj2;
                vVar.m().f58780a.e(vVar.o);
                return;
            default:
                b0 b0Var = (b0) obj2;
                ((opi.b) b0Var.f318810s).Z(b0Var.f318811t.f149568b.a(null));
                return;
        }
    }
}
