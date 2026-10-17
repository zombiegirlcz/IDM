package wp0;

import a82.s;
import androidx.compose.material3.TextFieldColors;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.internal.views.chart.charttracker.chart.StepChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlow;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonActivity;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlowContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewActivity;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreen;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesFragment;
import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreen;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import com.revolut.feature.transfer.core.impl.ui.transfer.cancellation.TransferCancellationDialogScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreen;
import com.revolut.feature_restricted_access_malware.impl.flow.MaliciousSoftwarePromptFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlow;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import dwi.b0;
import dwi.j0;
import dwi.n0;
import efm.r;
import eq5.e0;
import erj.n;
import g9g.t0;
import hwi.v0;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import mb3.o;
import mb3.p;
import org.jmrtd.lds.LDSFile;
import r6e.t;
import rp0.f1;
import te0.w;
import vy5.d0;
import vz4.m;
import wp4.i0;
import wrh.f;
import wrh.k;
import wwi.q;
import yji.l;
import yki.i;
import z4l.j;
import zhm.q0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f298988b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f298987a = i;
        this.f298988b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f298987a;
        int i2 = 15;
        int i3 = 2;
        int i5 = 1;
        Continuation continuation = null;
        int i6 = 0;
        Object obj2 = this.f298988b;
        switch (i) {
            case 0:
                vp0.h hVar = h.f299001a;
                ((oii.b) obj2).invoke();
                return Unit.f186387a;
            case 1:
                i0 i0Var = (i0) obj2;
                i0Var.getClass();
                l.b1(i0Var, i0Var.X1(new mii.f("back-up-card-status-changed-shot-dialog", new TextLocalisedClause(R$string.credit_card_back_up_card_disabled, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG)), null, null, 7);
                return Unit.f186387a;
            case 2:
                int i21 = CryptoWithdrawToAddressReviewActivity.A0;
                return new j(7, ((e0) ((CryptoWithdrawToAddressReviewActivity) obj2).c1()).a(), false);
            case 3:
                KProperty[] kPropertyArr = PagoPABillInputScreen.f61486d0;
                return (wq1.l) ((tq1.f) ((PagoPABillInputScreen) obj2).Y.getValue()).f273493g.get();
            case 4:
                return (wqf.d) ((lpf.h) ((TransferCancellationDialogScreen) obj2).P.getValue()).f199033g.get();
            case 5:
                ((k) obj2).v2(f.c.f299585a);
                return Unit.f186387a;
            case 6:
                KProperty[] kPropertyArr2 = UpcomingPaymentsScreen.f101528d0;
                return (wrj.b) ((n) ((UpcomingPaymentsScreen) obj2).Z.getValue()).d.get();
            case 7:
                StepChartView.Companion aVar = StepChartView.INSTANCE;
                ((StepChartView) obj2).invalidate();
                return Unit.f186387a;
            case 8:
                return (ws1.a) ((ms1.n) ((BizumRegistrationFlow) obj2).P.getValue()).f.get();
            case 9:
                ((ww0.b) obj2).f(h01.d.MANUAL);
                return Unit.f186387a;
            case 10:
                q qVar = (q) obj2;
                r queryObservable = rd0.e.c(vkm.q.q(new d0(qVar.q2(), 11)), kotlin.coroutines.g.f186406a);
                b0 b0Var = qVar.f300688p;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(queryObservable, "queryObservable");
                n0 n0Var = b0Var.f120409a;
                Intrinsics.checkNotNullParameter(queryObservable, "queryObservable");
                r rVarDistinctUntilChanged = queryObservable.map(new dv5.n(new j0(n0Var, i5), i2)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                return rd0.e.b(nim.a.w(w.v0(u1.d(rVarDistinctUntilChanged, nim.a.w(((w4l.f) ((v0) n0Var.f120441a).f.getValue()).f(Unit.f186387a, false), new j0(n0Var, i3)))), new j0(n0Var, i6)));
            case 11:
                i iVar = ((com.revolut.feature.payments.send_from_clipboard.impl.flow.a) obj2).o;
                if (iVar.d() == null) {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 12:
                EvidenceTypesFragment.Companion companion = EvidenceTypesFragment.INSTANCE;
                return new SelectableDelegate((RowDelegate) ((EvidenceTypesFragment) obj2).f0.getValue());
            case 13:
                return (String) ((m) ((vz4.b) obj2)).b0().get();
            case 14:
                int i22 = CardSelectReplaceReasonActivity.f64920w0;
                return new j(7, v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), (InputDisclosureDelegate) ((CardSelectReplaceReasonActivity) obj2).u0.getValue()), false);
            case 15:
                return ((TextFieldColors) obj2).textSelectionColors;
            case 16:
                ExchangeOrder exchangeOrderA = ((s2i.h) ((x2i.r) obj2).i).a();
                ExchangeOrderInfo f72134a = exchangeOrderA != null ? exchangeOrderA.getF72134a() : null;
                return new ActionsView.Item("CANCEL_ACTION", (f72134a != null && hx7.q.L(f72134a) && hx7.q.O(f72134a)) ? mx0.d.NEGATIVE : mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
            case 17:
                KProperty[] kPropertyArr3 = UserPermissionSelectorScreen.f89049d0;
                return (x7e.i) ((t) ((UserPermissionSelectorScreen) obj2).Y.getValue()).f251806g.get();
            case 18:
                com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar2 = (com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) obj2;
                return l.a1(aVar2, vkm.q.Q(v7.w(aVar2.u.B(new x64.a(i2))), new x82.n(i3, aVar2, continuation)), null, null, new s(aVar2, continuation, 17), 3);
            case 19:
                ((x92.j) obj2).f303540a.getClass();
                try {
                    Object objNewInstance = Class.forName("com.revolut.feature.apm.multibanco.sdk.impl.MBWaySdkWrapperImpl").getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.sdk.proxy.MBWaySdkWrapper");
                    return (x92.l) objNewInstance;
                } catch (Exception e) {
                    throw new MBWaySdkUnavailable("AREA", e);
                }
            case 20:
                return (x9i.b) ((w9i.c) ((y9i.a) ((MaliciousSoftwarePromptFlow) obj2).P.getValue())).f295742c.get();
            case 21:
                return Boolean.valueOf(((ii0.b) ((com.revolut.feature_restricted_access_malware.impl.flow.a) obj2).u).b("MALICIOUS_SOFTWARE_GENERIC_DESCRIPTION"));
            case 22:
                return ((TransferOutFeatureConfig.TransferOut) obj2).f91540a;
            case 23:
                o oVar = (o) ((CashTopUpFlow) obj2).P.getValue();
                CashTopUpFlowContract$InputData cashTopUpFlowContract$InputData = oVar.f204089a;
                p pVar = oVar.f204090b;
                nb3.b bVarC = pVar.f204093c.c();
                dj3.a aVarA = pVar.f204091a.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.cash_topup.impl.ui.flow.a(cashTopUpFlowContract$InputData, bVarC, aVarA, pVar.f204092b.a());
            case 24:
                KProperty[] kPropertyArr4 = CharitiesCollectionDetailsScreen.c0;
                return (xb6.h) ((pa6.h) ((CharitiesCollectionDetailsScreen) obj2).W.getValue()).f234372c.get();
            case 25:
                com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar3 = (com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a) obj2;
                r70.c.b(aVar3.f78505r, 3);
                l.b1(aVar3, aVar3.X1(new mii.k("copy_to_clipboard_dialog_id", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 12)), null, null, 7);
                return Unit.f186387a;
            case 26:
                xbf.f fVar = (xbf.f) obj2;
                mbf.b[] bVarArrValues = mbf.b.values();
                int iB = q0.b(bVarArrValues.length);
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                int length = bVarArrValues.length;
                while (i6 < length) {
                    mbf.b bVar = bVarArrValues[i6];
                    Boolean bool = Boolean.FALSE;
                    Type type = new TypeToken<Boolean>() { // from class: com.revolut.feature.trading_add_ons.impl.domain.providers.TradingProUpsellingBannerProviderImpl$bannerClosedByType_delegate$lambda$0$0$$inlined$provide$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    linkedHashMap.put(bVar, fVar.f304074a.a(bool, "trading_add_ons_banner_closed_" + bVar, type));
                    i6++;
                }
                return linkedHashMap;
            case 27:
                int i32 = TravelHotelsBedOptionsSelectionScreen.T;
                t0 t0Var = (t0) ((TravelHotelsBedOptionsSelectionScreen) obj2).R.getValue();
                switch (t0Var.f141815a) {
                    case 0:
                        return (xbg.d) t0Var.d.get();
                    case 1:
                        return (xbg.d) t0Var.d.get();
                    default:
                        return (xbg.d) t0Var.d.get();
                }
            case 28:
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) obj2).C2(b.C0450b.f60737a);
                return Unit.f186387a;
            default:
                return (xfj.b) ((afj.m) ((EsimHomeFlow) obj2).P.getValue()).d.get();
        }
    }
}
