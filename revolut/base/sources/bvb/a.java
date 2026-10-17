package bvb;

import android.os.Build;
import androidx.camera.core.featuregroup.GroupableFeature;
import bzg.y;
import cie.c0;
import cmi.z;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlow;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackActivity;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlow;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlow;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.io.IOException;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.f0;
import ql7.x;
import rp0.g1;
import rp0.k1;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18979b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f18978a = i;
        this.f18979b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        ServerErrorParams serverErrorParams;
        String strJ;
        String value;
        int i = this.f18978a;
        Object obj2 = this.f18979b;
        switch (i) {
            case 0:
                int i2 = RevPointsBuyingControllerScreen.X;
                return (k) ((vub.b) ((RevPointsBuyingControllerScreen) obj2).V.getValue()).f292290c.get();
            case 1:
                bwd.c cVar = (bwd.c) obj2;
                return ((ze0.c) cVar.d).a(cVar.f19321c, 900000L);
            case 2:
                KProperty[] kPropertyArr = TransportHubFlow.X;
                return (bwf.g) ((hvf.r) ((TransportHubFlow) obj2).V.getValue()).e.get();
            case 3:
                int i3 = CancellationFeedbackActivity.f76246w0;
                boolean z = false;
                return new koi.h(new koi.c(zhm.u.c((InputChecklistDelegate) ((CancellationFeedbackActivity) obj2).u0.getValue())), z, z, 6);
            case 4:
                return Boolean.valueOf(((jte.d) ((y) obj2).f).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c));
            case 5:
                return Integer.valueOf(GroupableFeature.featureType_delegate$lambda$0((GroupableFeature) obj2));
            case 6:
                return (c10.e) ((c00.a) obj2).i.get();
            case 7:
                return (c23.d) ((x13.q) ((CardOrderFlow) obj2).Q.getValue()).f302182q.get();
            case 8:
                n02.b bVarL1 = ((c42.l) obj2).f20988p.l1();
                if (bVarL1 != null) {
                    return bVarL1;
                }
                return null;
            case 9:
                KProperty[] kPropertyArr2 = MoneyRequestRejectWithReasonScreen.c0;
                return (c7k.b) ((t6k.d) ((MoneyRequestRejectWithReasonScreen) obj2).Y.getValue()).f268381h.get();
            case 10:
                z1 z1VarA = vkm.q.a(1, 1, ukm.f.DROP_OLDEST);
                z1VarA.k(((c84.b) obj2).f22074l);
                return z1VarA;
            case 11:
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) obj2).u2();
                return Unit.f186387a;
            case 12:
                return Boolean.valueOf(((jte.d) ((cbh.y) obj2).v).c(FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c));
            case 13:
                ServerError serverError = (ServerError) obj2;
                if (serverError == null || (serverErrorParams = serverError.f51364c) == null) {
                    return null;
                }
                return serverErrorParams.f51370a;
            case 14:
                g1 g1Var = ((com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) obj2).z;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.account_detail_alert_copied_clipboard, null, null, 14);
                int i5 = R$drawable.uikit_icn_24_copy;
                Float fValueOf = Float.valueOf(16.0f);
                ((k1) g1Var).d(new ShotDialogDisplayer$Configuration("ID_COPIED_TO_CLIPBOARD", textLocalisedClause, new ConfigurableResourceImage(i5, null, fValueOf, fValueOf, 926), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                return Unit.f186387a;
            case 15:
                int i6 = SelectTaxRateScreen.V;
                return (cf1.e) ((ld1.v) ((SelectTaxRateScreen) obj2).Q.getValue()).f194005c.get();
            case 16:
                HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = (HotelsPropertyRoomOccupancyRatesSelection) obj2;
                cgi.j jVar = new cgi.j();
                jVar.a(hotelsPropertyRoomOccupancyRatesSelection.f98104a);
                jVar.b(hotelsPropertyRoomOccupancyRatesSelection.f98105b);
                return jVar.e();
            case 17:
                cgi.g gVar = (cgi.g) obj2;
                cgi.j jVar2 = new cgi.j();
                jVar2.a(gVar.f23994a);
                jVar2.b(gVar.f23995b);
                return jVar2.e();
            case 18:
                return Boolean.valueOf(((jte.d) ((c0) obj2).f24455a).c(PricingPlansUiApi$Toggles.PlanOnboardingHomeIntro.f102636c));
            case 19:
                BaseBottomSheetRecyclerController baseBottomSheetRecyclerController = (BaseBottomSheetRecyclerController) obj2;
                int i21 = BaseBottomSheetRecyclerController.P;
                return dli.f.a(baseBottomSheetRecyclerController, baseBottomSheetRecyclerController.R2(), baseBottomSheetRecyclerController.getU(), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 24);
            case 20:
                oki.h.D2(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c) obj2).u);
                return Unit.f186387a;
            case 21:
                int i22 = ShopsCampaignCheckoutScreen.W;
                return (cjd.e) ((did.f) ((ShopsCampaignCheckoutScreen) obj2).U.getValue()).f115013c.get();
            case 22:
                ck0.b bVar = (ck0.b) obj2;
                rj0.a aVar = bVar.d;
                ij0.a aVar2 = bVar.f24737c;
                if (aVar.b()) {
                    strJ = null;
                } else {
                    String str = (String) d0.d0(bVar.f24735a.c(null));
                    if (str != null) {
                        Locale locale = Locale.ENGLISH;
                        strJ = v0.a.j(locale, "ENGLISH", str, locale, "toUpperCase(...)");
                    } else {
                        strJ = null;
                    }
                    String str2 = (String) ck0.b.f24734g.get(strJ);
                    if (str2 != null) {
                        strJ = str2;
                    }
                }
                kotlin.text.o oVarB = ck0.b.f.b((CharSequence) aVar2.getVersionName().invoke());
                if (oVarB == null || (value = oVarB.getValue()) == null) {
                    throw new IllegalStateException("Wrong version name format");
                }
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                String strU0 = f0.U0(150, MODEL);
                String MANUFACTURER = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                String str3 = Build.VERSION.RELEASE;
                String[] elements = {strU0, t61.a.p(str3, "RELEASE", "Android ", str3), j6.a.q("sp:", gh0.d.GOOGLE.a()), strJ != null ? "cf:".concat(strJ) : null, j6.a.q("mf:", MANUFACTURER)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                String strK0 = d0.k0(kotlin.collections.d.L(elements), "; ", null, null, 0, null, 62);
                String strA = bVar.f24736b.a();
                int versionCode = aVar2.getVersionCode();
                StringBuilder sbM = v0.a.m("Revolut/", strA, " ", value, " ");
                sbM.append(versionCode);
                sbM.append(" (");
                sbM.append(strK0);
                sbM.append(")");
                return sbM.toString();
            case 23:
                z1 z1VarA2 = vkm.q.a(1, 15, ukm.f.DROP_OLDEST);
                z1VarA2.k(((cki.a) obj2).Z2());
                return z1VarA2;
            case 24:
                cli.v vVar = (cli.v) obj2;
                if (vVar.c()) {
                    vVar.f.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 25:
                return (cm7.b) ((x) ((DeliveryFlow) obj2).Q.getValue()).f247519h.get();
            case 26:
                yk5.a aVar3 = ((cmf.d) obj2).f25225b;
                return aVar3 != null ? new cmf.c(aVar3) : cmf.l.f25244a;
            case 27:
                z zVar = (z) obj2;
                return zVar.f25311a.b("deeplink_coordinator_state", zVar.f25312b, 1);
            case 28:
                return (cn7.a) ((ql7.o) ((CarPolicyFlow) obj2).P.getValue()).e.get();
            default:
                return (cna.a) ((fma.a) ((ChangeNameFlow) obj2).P.getValue()).f136036b.get();
        }
    }
}
