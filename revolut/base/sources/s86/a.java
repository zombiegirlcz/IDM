package s86;

import afj.x0;
import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.drawables.AnimatedDrawable;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreenContract$InputData;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$InputData;
import com.revolut.feature.apm.spin.impl.ui.SpinFlow;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlow;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlowContract$InputData;
import com.revolut.feature.card.terminate.impl.ui.flow.CardTerminateFlow;
import com.revolut.feature.card.terminate.impl.ui.flow.CardTerminateFlowContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreenContract$InputData;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.feature.devicemanagement.impl.ui.details.DeviceDetailsController;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlow;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlow;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$InputData;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchController;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchControllerContract$InputData;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsContract$InputData;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsScreen;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreen;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreenContract$Input;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel.LinkedWalletCardCancelScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel.LinkedWalletCardCancelScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.TripsRemoveConfirmationContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.TripsRemoveConfirmationController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewController;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerInputData;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsControllerContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreenContract$InputData;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreen;
import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.occupation.flow.OccupationChooserFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlowContract$InputData;
import dmc.s;
import g9g.a0;
import g9g.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import oai.i0;
import oai.u;
import p7c.x;
import ppd.c1;
import ppd.e1;
import ppd.j0;
import ppd.k0;
import rlm.r;
import vtc.t;
import yp0.v;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f260901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f260902c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f260900a = i;
        this.f260901b = obj2;
        this.f260902c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        String lowerCase;
        String[] strArrNames;
        int i = this.f260900a;
        Object obj2 = this.f260902c;
        Object obj3 = this.f260901b;
        switch (i) {
            case 0:
                DeviceDetailsController deviceDetailsController = (DeviceDetailsController) obj3;
                DeviceManagementDestination.Config.DeviceDetails deviceDetails = (DeviceManagementDestination.Config.DeviceDetails) obj2;
                KProperty[] kPropertyArr = DeviceDetailsController.S;
                phm.a aVar2 = (phm.a) ue0.e.j(deviceDetailsController.m2()).a().get(n86.h.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                }
                n86.a aVarA = ((n86.h) aVar.b()).a();
                deviceDetails.getClass();
                aVarA.f213227c = deviceDetails;
                aVarA.f213226b = deviceDetailsController;
                return (t86.a) aVarA.mo3783build();
            case 1:
                ManagedPortfoliosTopHoldingsControllerContract$InputData managedPortfoliosTopHoldingsControllerContract$InputData = (ManagedPortfoliosTopHoldingsControllerContract$InputData) obj2;
                KProperty[] kPropertyArr2 = ManagedPortfoliosTopHoldingsController.S;
                phm.a aVar3 = (phm.a) ue0.e.j(((ManagedPortfoliosTopHoldingsController) obj3).m2()).a().get(w5f.m.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new w5f.q(((w5f.m) aVar.b()).f295201s, managedPortfoliosTopHoldingsControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
            case 2:
                PaymentBalancePickerInputData paymentBalancePickerInputData = (PaymentBalancePickerInputData) obj2;
                KProperty[] kPropertyArr3 = PaymentBalancePickerScreen.S;
                phm.a aVar4 = (phm.a) ue0.e.j(((PaymentBalancePickerScreen) obj3).m2()).a().get(f9e.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
                }
                i9e.o oVar = ((i9e.o) aVar.b()).G;
                paymentBalancePickerInputData.getClass();
                return new i9e.p(oVar, paymentBalancePickerInputData);
            case 3:
                ((RecyclerView.Adapter) obj3).unregisterAdapterDataObserver((sb0.a) obj2);
                return Unit.f186387a;
            case 4:
                ((RecyclerView) obj3).removeOnScrollListener((v) obj2);
                return Unit.f186387a;
            case 5:
                OccupationChooserFlowInputData occupationChooserFlowInputData = (OccupationChooserFlowInputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((OccupationChooserFlow) obj3).m2()).a().get(i0.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                }
                i0 i0Var = ((i0) aVar.b()).f223710r;
                occupationChooserFlowInputData.getClass();
                return new u(i0Var, occupationChooserFlowInputData);
            case 6:
                RevolutPayMerchantsSearchControllerContract$InputData revolutPayMerchantsSearchControllerContract$InputData = (RevolutPayMerchantsSearchControllerContract$InputData) obj2;
                KProperty[] kPropertyArr4 = RevolutPayMerchantsSearchController.R;
                phm.a aVar6 = (phm.a) ue0.e.j(((RevolutPayMerchantsSearchController) obj3).m2()).a().get(jcc.e.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new jcc.d(((jcc.e) aVar.b()).f172773j, revolutPayMerchantsSearchControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
            case 7:
                SpinNavigation$InputData spinNavigation$InputData = (SpinNavigation$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((SpinFlow) obj3).m2()).a().get(qd2.f.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", qd2.f.class, " is not found"));
                }
                qd2.f fVar = ((qd2.f) aVar.b()).k;
                spinNavigation$InputData.getClass();
                return new qd2.h(fVar, spinNavigation$InputData);
            case 8:
                CashbackTransactionsScreen cashbackTransactionsScreen = (CashbackTransactionsScreen) obj3;
                KProperty[] kPropertyArr5 = CashbackTransactionsScreen.f65722e0;
                qji.b bVarQ2 = cashbackTransactionsScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.di.CashbackTransactionsScreenInjector");
                yc3.h hVar = (yc3.h) bVarQ2;
                return new yc3.d(hVar.f312486b, hVar.f312487c, cashbackTransactionsScreen, (CashbackTransactionsScreenContract$InputData) obj2);
            case 9:
                TravelHotelsPropertyGuestsReviewsScreen travelHotelsPropertyGuestsReviewsScreen = (TravelHotelsPropertyGuestsReviewsScreen) obj3;
                KProperty[] kPropertyArr6 = TravelHotelsPropertyGuestsReviewsScreen.R;
                qji.b bVarU2 = travelHotelsPropertyGuestsReviewsScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.di.TravelHotelsPropertyGuestsReviewsScreenInjector");
                z zVar = (z) bVarU2;
                return new a0(zVar.f141862b, zVar.f141863c, travelHotelsPropertyGuestsReviewsScreen, (TravelHotelsPropertyGuestsReviewsScreenContract$InputData) obj2);
            case 10:
                KProperty[] kPropertyArr7 = DeliveryMethodsScreen.U;
                qji.b bVarU22 = ((DeliveryMethodsScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.di.DeliveryMethodsScreenInjector");
                x xVar = (x) bVarU22;
                return new p7c.f(xVar.f233742b, xVar.f233743c, (DeliveryMethodsContract$InputData) obj2);
            case 11:
                SharedAlertsFlow sharedAlertsFlow = (SharedAlertsFlow) obj3;
                SharedAlertsFlowContract$InputData sharedAlertsFlowContract$InputData = (SharedAlertsFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(sharedAlertsFlow.m2()).a().get(ned.e.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new ned.g(((ned.e) aVar.b()).i, sharedAlertsFlow, new SharedAlertsDestination.InputData(sharedAlertsFlowContract$InputData.f86703a));
                }
                throw new IllegalStateException(a0.d.q("Api ", ned.e.class, " is not found"));
            case 12:
                KProperty[] kPropertyArr8 = AddNoteScreen.f91820d0;
                qji.b bVarQ22 = ((AddNoteScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.di.AddNoteScreenInjector");
                jef.g gVar = (jef.g) bVarQ22;
                return new jef.a(gVar.f173380b, gVar.f173381c, (AddNoteScreenContract$InputData) obj2);
            case 13:
                UpiIntentPaymentFlowContract$InputData upiIntentPaymentFlowContract$InputData = (UpiIntentPaymentFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((UpiIntentPaymentFlow) obj3).m2()).a().get(if2.f.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new if2.i(((if2.f) aVar.b()).f160865w, upiIntentPaymentFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
            case 14:
                EsimSubscriptionFlow esimSubscriptionFlow = (EsimSubscriptionFlow) obj3;
                EsimSubscriptionFlowContract$InputData esimSubscriptionFlowContract$InputData = (EsimSubscriptionFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(esimSubscriptionFlow.m2()).a().get(afj.b.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new x0(((afj.b) aVar.b()).D, esimSubscriptionFlow, esimSubscriptionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
            case 15:
                uii.b bVar = ((com.revolut.kompot.common.flow.permissions.c) obj3).f98354y;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((PermissionsFlowContract$Permission) it8.next()).f98347a);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                bVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
                return Unit.f186387a;
            case 16:
                ((com.revolut.kompot.common.flow.permissions.c) obj3).f98354y.b(((PermissionsFlowContract$Permission) obj2).f98347a);
                return Unit.f186387a;
            case 17:
                PseFlowContract$InputData pseFlowContract$InputData = (PseFlowContract$InputData) obj2;
                phm.a aVar11 = (phm.a) ue0.e.j(((PseFlow) obj3).m2()).a().get(vk6.b.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new vk6.c(((vk6.b) aVar.b()).f, pseFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vk6.b.class, " is not found"));
            case 18:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj3;
                Json json = (Json) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z = json.f187948a.i && Intrinsics.f(serialDescriptor.getKind(), olm.j.f226486b);
                slm.q.p(serialDescriptor, json);
                int iC = serialDescriptor.c();
                for (int i2 = 0; i2 < iC; i2++) {
                    List listH = serialDescriptor.h(i2);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : listH) {
                        if (obj4 instanceof r) {
                            arrayList2.add(obj4);
                        }
                    }
                    r rVar = (r) d0.M0(arrayList2);
                    if (rVar != null && (strArrNames = rVar.names()) != null) {
                        for (String lowerCase2 : strArrNames) {
                            if (z) {
                                lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            }
                            slm.q.f(linkedHashMap, serialDescriptor, lowerCase2, i2);
                        }
                    }
                    if (z) {
                        lowerCase = serialDescriptor.d(i2).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        slm.q.f(linkedHashMap, serialDescriptor, lowerCase, i2);
                    }
                }
                return linkedHashMap.isEmpty() ? r0.g() : linkedHashMap;
            case 19:
                VerifyEmailFlowContract$InputData verifyEmailFlowContract$InputData = (VerifyEmailFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((VerifyEmailFlow) obj3).m2()).a().get(fma.h.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new fma.i(((fma.h) aVar.b()).v, verifyEmailFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fma.h.class, " is not found"));
            case 20:
                SettingsScreen settingsScreen = (SettingsScreen) obj3;
                SettingsScreenContract$Input settingsScreenContract$Input = (SettingsScreenContract$Input) obj2;
                KProperty[] kPropertyArr9 = SettingsScreen.f85199d0;
                phm.a aVar13 = (phm.a) ue0.e.j(settingsScreen.m2()).a().get(dmc.r.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new s(((dmc.r) aVar.b()).f116039s, settingsScreen, settingsScreenContract$Input);
                }
                throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
            case 21:
                BPayReviewScreenContract$InputData bPayReviewScreenContract$InputData = (BPayReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = BPayReviewScreen.R;
                qji.b bVarU23 = ((BPayReviewScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.review.review.di.BPayReviewScreenInjector");
                ao1.e eVar = (ao1.e) bVarU23;
                ao1.d dVar = eVar.f7883b;
                ao1.e eVar2 = eVar.f7884c;
                bPayReviewScreenContract$InputData.getClass();
                return new ao1.f(dVar, eVar2, bPayReviewScreenContract$InputData);
            case 22:
                KProperty[] kPropertyArr11 = TripsRemoveConfirmationController.R;
                qji.b bVarU24 = ((TripsRemoveConfirmationController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.di.TripsRemoveConfirmationScreenInjector");
                c1 c1Var = (c1) bVarU24;
                return new e1(c1Var.f238386b, c1Var.f238387c, (TripsRemoveConfirmationContract$InputData) obj2);
            case 23:
                int i3 = AnimatedDrawable.e;
                Animator animator = (Animator) ((Function0) obj3).invoke();
                animator.addListener(new aq0.k((AnimatedDrawable) obj2, 14));
                return animator;
            case 24:
                KProperty[] kPropertyArr12 = IncomeSorterReviewController.S;
                qji.b bVarU25 = ((IncomeSorterReviewController) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.di.IncomeSorterReviewInjector");
                j0 j0Var = (j0) bVarU25;
                return new k0(j0Var.f238443b, j0Var.f238444c, (sqd.d) obj2);
            case 25:
                ReferenceScreen referenceScreen = (ReferenceScreen) obj3;
                ReferenceInputData referenceInputData = (ReferenceInputData) obj2;
                KProperty[] kPropertyArr13 = ReferenceScreen.f92217b0;
                phm.a aVar14 = (phm.a) ue0.e.j(referenceScreen.m2()).a().get(wof.a.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return (lpf.s) ((tqf.a) ((tqf.b) aVar.b()).y().S(referenceScreen)).c(referenceInputData).mo3800build();
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 26:
                CardTerminateFlowContract$InputData cardTerminateFlowContract$InputData = (CardTerminateFlowContract$InputData) obj2;
                phm.a aVar15 = (phm.a) ue0.e.j(((CardTerminateFlow) obj3).m2()).a().get(ou2.a.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ou2.a.class, " is not found"));
                }
                kge.d dVarA = ((ou2.a) aVar.b()).a();
                dVarA.getClass();
                dVarA.f183975c = cardTerminateFlowContract$InputData;
                vc.s.h((CardTerminateFlowContract$InputData) dVarA.f183975c, CardTerminateFlowContract$InputData.class);
                return new ou2.e((ou2.d) dVarA.f183974b, (CardTerminateFlowContract$InputData) dVarA.f183975c);
            case 27:
                LinkedWalletCardCancelScreenContract$InputData linkedWalletCardCancelScreenContract$InputData = (LinkedWalletCardCancelScreenContract$InputData) obj2;
                int i5 = LinkedWalletCardCancelScreen.U;
                phm.a aVar16 = (phm.a) ue0.e.j(((LinkedWalletCardCancelScreen) obj3).m2()).a().get(t.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new vtc.i(((t) aVar.b()).M, linkedWalletCardCancelScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 28:
                int i6 = TimelineQuestionScreen.X;
                qji.b bVarU26 = ((TimelineQuestionScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.di.TimelineQuestionScreenInjector");
                euh.e eVar3 = (euh.e) bVarU26;
                return new euh.g(eVar3.f129583b, eVar3.f129584c, (BaseQuestionScreenContract$InputData) obj2);
            default:
                sv0.c.o((sv0.c) obj3, (rv0.g) obj2, 2);
                return Unit.f186387a;
        }
    }
}
