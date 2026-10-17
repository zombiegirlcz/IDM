package h1g;

import afj.d1;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import com.revolut.feature.address.common.impl.flow.screen.add.address_type.AddressTypeBottomSheetScreen;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsController;
import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.SharedConverterFlow;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreen;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer.TravelHotelsPartnerTaxesDisclaimerScreen;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreen;
import com.revolut.retail.operation_status.modal_screen.StatusViewScreenActivity;
import com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.ConnectedAppRevokeAccessBottomSheet;
import dy0.t;
import g9g.w;
import gvc.m;
import hee.j;
import hh6.p;
import hhd.n;
import hk9.q;
import ho.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l0k.k;
import ld1.y;
import mii.i;
import p12.n0;
import r6e.s;
import vkm.j2;
import xf6.u1;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148554b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f148553a = i;
        this.f148554b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f148553a;
        int i2 = 1;
        Continuation continuation = null;
        Object obj2 = this.f148554b;
        switch (i) {
            case 0:
                return (b) ((z0g.f) ((TravelExperiencesCheckoutFlow) obj2).P.getValue()).e.get();
            case 1:
                k kVar = (k) ((WealthAssetTypeNewsScreen) obj2).Y.getValue();
                switch (kVar.f191303a) {
                    case 0:
                        return (h1k.h) kVar.f191308j.get();
                    default:
                        return (h1k.h) kVar.f191308j.get();
                }
            case 2:
                int i3 = BreakdownDetailsController.V;
                return (h22.a) ((n0) ((BreakdownDetailsController) obj2).U.getValue()).f231733c.get();
            case 3:
                int i5 = StatusViewScreenActivity.f104327t0;
                return ((StatusViewScreenContract$Configuration) ((StatusViewScreenActivity) obj2).G0()).getF104337a();
            case 4:
                ((com.revolut.feature.defi.exchange.impl.ui.flow.a) obj2).I2();
                return Unit.f186387a;
            case 5:
                h60.f fVar = (h60.f) obj2;
                LottieAnimationView lottieAnimationView = new LottieAnimationView(fVar.f149580c.m2());
                lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                lottieAnimationView.addAnimatorListener(new t(fVar, lottieAnimationView, i2));
                return lottieAnimationView;
            case 6:
                KProperty[] kPropertyArr = UserPermissionEditScreen.f89078d0;
                return (h8e.f) ((s) ((UserPermissionEditScreen) obj2).Y.getValue()).f251802g.get();
            case 7:
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b bVar = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b) obj2;
                l.a1(bVar, bVar.X1(new i("COPIED_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 8:
                fd6.b modelExtension = ((h9c.b) obj2).f150226c.e();
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                return new fd6.a(modelExtension);
            case 9:
                KProperty[] kPropertyArr2 = TravelHotelsPartnerTaxesDisclaimerScreen.U;
                return (hdg.c) ((w) ((TravelHotelsPartnerTaxesDisclaimerScreen) obj2).S.getValue()).f141838b.get();
            case 10:
                KProperty[] kPropertyArr3 = CatalogueManagementScreen.f60782e0;
                qji.b bVarQ2 = ((CatalogueManagementScreen) obj2).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.di.CatalogueManagementScreenInjector");
                ld1.d dVar = (ld1.d) bVarQ2;
                return new y(dVar.f193930a, dVar.f193931b);
            case 11:
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) obj2;
                aVar.X1(aVar.J.a());
                return Unit.f186387a;
            case 12:
                return (j) ((j2) ((com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) obj2).v.f22677a).getValue();
            case 13:
                oki.h.D2(((com.revolut.feature.retail.reverywhere.impl.onboarding.a) obj2).f82913s);
                return Unit.f186387a;
            case 14:
                return (hgd.b) ((fgd.f) ((hgd.a) ((SharedConverterFlow) obj2).P.getValue())).d.get();
            case 15:
                MandateDetailsScreen.a aVar2 = MandateDetailsScreen.Companion;
                return (hh6.k) ((u1) ((MandateDetailsScreen) obj2).Z.getValue()).f305108h.get();
            case 16:
                p pVar = (p) obj2;
                oe6.j jVar = pVar.v;
                String institutionId = pVar.f152268p.f72463a.f72225b;
                xg6.s sVar = (xg6.s) jVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                ((com.revolut.retail.analytics.tracking.impl.b) sVar.f305601a).e2(new o(frl.c.TopUp, "RemoveAuthorisation", frl.b.clicked, a0.d.x("BankName", institutionId)));
                pVar.n2(new m(pVar, continuation, 18), new whi.b(6));
                return Unit.f186387a;
            case 17:
                KProperty[] kPropertyArr4 = EsimCountryPickerScreen.f100947b0;
                d1 d1Var = (d1) ((EsimCountryPickerScreen) obj2).X.getValue();
                switch (d1Var.f4203a) {
                    case 0:
                        return (hhj.e) d1Var.f.get();
                    case 1:
                        return (hhj.e) d1Var.f.get();
                    case 2:
                        return (hhj.e) d1Var.f.get();
                    case 3:
                        return (hhj.e) d1Var.f.get();
                    case 4:
                        return (hhj.e) d1Var.f.get();
                    default:
                        return (hhj.e) d1Var.f.get();
                }
            case 18:
                AddressTypeBottomSheetScreen addressTypeBottomSheetScreen = (AddressTypeBottomSheetScreen) obj2;
                return new hi1.h(addressTypeBottomSheetScreen.Q, new hi1.g(addressTypeBottomSheetScreen.R));
            case 19:
                return new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, Integer.valueOf(kli.a.s(R$attr.uikit_colorGreyTone50, ((hj1.c) obj2).f152644a.f22265a)), (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R.string.address_widget_postal_code_default_hint, null, null, 14), 122);
            case 20:
                ((q) obj2).I2();
                return Unit.f186387a;
            case 21:
                return nim.a.w(((hma.g) obj2).d.k(false), new n(26)).replay(1).e();
            case 22:
                return Boolean.valueOf(((hma.s) obj2).f.a(CryptoOnboardingApi$Toggles.CryptoMarketNotificationSettings.f70883c));
            case 23:
                return Boolean.valueOf(((jte.d) ((hmc.e) obj2).f153639q).c(RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c));
            case 24:
                return Boolean.valueOf(((jte.d) ((hmc.m) obj2).f153649a).c(RoboApi$Toggles.RoboOnboardingReassessment.f85022c));
            case 25:
                KProperty[] kPropertyArr5 = CoparentsSettingsScreen.f77295d0;
                return (ho8.f) ((mn8.c) ((CoparentsSettingsScreen) obj2).X.getValue()).f207422g.get();
            case 26:
                ArrayList arrayList = ((hoc.b) obj2).f154267a.d;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new hoc.f((pdh.a) it8.next()));
                }
                return arrayList2;
            case 27:
                List list = ((hoc.c) obj2).f154270a.f95004c;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(new hoc.g((TotalValueChartPoint) it9.next()));
                }
                return arrayList3;
            case 28:
                return pyd.c.x(((hoc.g) obj2).f154275a.f95007c);
            default:
                int i6 = ConnectedAppRevokeAccessBottomSheet.T;
                return (hpl.c) ((mjl.e) ((ConnectedAppRevokeAccessBottomSheet) obj2).Q.getValue()).f206077b.get();
        }
    }
}
