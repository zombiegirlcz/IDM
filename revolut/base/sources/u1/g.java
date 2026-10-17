package u1;

import android.content.Context;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.MutableState;
import aw0.o9;
import b3j.s;
import b3j.t;
import com.google.android.gms.wallet.Wallet;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreenContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountController;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlow;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlowContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptController;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsControllerContract$InputData;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.repeater_dropdown.RepeaterDropdownSelectionScreen;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginController;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginControllerContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreen;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser.PaymentsCountryChooserScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import dw3.r3;
import dw3.s3;
import h30.q;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import p12.h0;
import p12.v;
import p2k.w;
import p2k.x;
import pr6.k;
import r6e.j;
import t17.l;
import t17.o;
import u17.m;
import u45.r;
import x8j.n;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f276229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f276230c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f276228a = i;
        this.f276229b = obj2;
        this.f276230c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f276228a;
        Object obj2 = this.f276230c;
        Object obj3 = this.f276229b;
        switch (i) {
            case 0:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1((CoroutineScope) obj3, (Function1) obj2);
            case 1:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$3$0((TextFieldSelectionManager) obj3, (MutableState) obj2);
            case 2:
                return ((u17.c) obj3).f276355a.q((k) d0.a0((Set) obj2)).f267205a;
            case 3:
                l lVarP = ((u17.d) obj3).f276356a.p((lr6.a) d0.a0((Set) obj2));
                if (lVarP != null) {
                    return lVarP.f267205a;
                }
                return null;
            case 4:
                String strA = ((u17.h) obj3).f276357a.a((xi0.b) d0.a0((Set) obj2));
                if (strA == null) {
                    strA = "";
                }
                return new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 5:
                return ((o) ((m) obj3).f276362a).b((cs6.e) d0.b0((List) obj2)).f267205a;
            case 6:
                return ((o) ((u17.o) obj3).f276364a).d((cs6.h) d0.b0((List) obj2)).f267205a;
            case 7:
                KProperty[] kPropertyArr = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                qji.b bVarQ2 = ((PaymentOptionsVaultWithdrawalScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.payment_options.impl.ui.screens.vault.di.PaymentOptionsVaultWithdrawalScreenInjector");
                q1k.b bVar = (q1k.b) bVarQ2;
                return new q1k.d(bVar.f241458b, bVar.f241459c, (PaymentOptionsVaultWithdrawalScreenContract$InputData) obj2);
            case 8:
                ApmSelectAccountContract$InputData apmSelectAccountContract$InputData = (ApmSelectAccountContract$InputData) obj2;
                int i2 = ApmSelectAccountController.U;
                phm.a aVar2 = (phm.a) ue0.e.j(((ApmSelectAccountController) obj3).m2()).a().get(v.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new h0(((v) aVar.b()).K, apmSelectAccountContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
            case 9:
                StoreBrandDetailMsiScreen storeBrandDetailMsiScreen = (StoreBrandDetailMsiScreen) obj3;
                StoreBrandDetailMsiScreenContract$InputData storeBrandDetailMsiScreenContract$InputData = (StoreBrandDetailMsiScreenContract$InputData) obj2;
                q qVar = storeBrandDetailMsiScreen.K;
                qVar.getClass();
                storeBrandDetailMsiScreenContract$InputData.getClass();
                qVar.e = storeBrandDetailMsiScreenContract$InputData;
                qVar.d = storeBrandDetailMsiScreen;
                return (k2e.e) qVar.mo3783build();
            case 10:
                CfdMaintenanceMarginControllerContract$InputData cfdMaintenanceMarginControllerContract$InputData = (CfdMaintenanceMarginControllerContract$InputData) obj2;
                KProperty[] kPropertyArr2 = CfdMaintenanceMarginController.P;
                phm.a aVar3 = (phm.a) ue0.e.j(((CfdMaintenanceMarginController) obj3).m2()).a().get(m2b.v.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new m2b.k(((m2b.v) aVar.b()).C, cfdMaintenanceMarginControllerContract$InputData, new h5b.c(cfdMaintenanceMarginControllerContract$InputData.f82222a));
                }
                throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
            case 11:
                PaymentsCountryChooserScreen paymentsCountryChooserScreen = (PaymentsCountryChooserScreen) obj3;
                d2k.k kVar = (d2k.k) obj2;
                KProperty[] kPropertyArr3 = PaymentsCountryChooserScreen.S;
                phm.a aVar4 = (phm.a) ue0.e.j(paymentsCountryChooserScreen.m2()).a().get(p2k.h0.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", p2k.h0.class, " is not found"));
                }
                x xVar = ((x) aVar.b()).K;
                kVar.getClass();
                paymentsCountryChooserScreen.K.getClass();
                return new w(xVar, kVar);
            case 12:
                CfdWithdrawScreen cfdWithdrawScreen = (CfdWithdrawScreen) obj3;
                KProperty[] kPropertyArr4 = CfdWithdrawScreen.V;
                qji.b bVarU2 = cfdWithdrawScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.withdraw.di.CfdWithdrawScreenInjector");
                m2b.w wVar = (m2b.w) bVarU2;
                m2b.v vVar = wVar.f201939b;
                m2b.w wVar2 = wVar.f201940c;
                eqd.e eVar = cfdWithdrawScreen.Q;
                eVar.getClass();
                return new m2b.x(vVar, wVar2, (CfdWithdrawScreenContract$InputData) obj2, eVar);
            case 13:
                BeneficiaryCreationKompotInputData beneficiaryCreationKompotInputData = (BeneficiaryCreationKompotInputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((BeneficiaryCreationFlow) obj3).m2()).a().get(t.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new s(((t) aVar.b()).f12108t, beneficiaryCreationKompotInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 14:
                ni0.k kVar2 = ((u53.b) obj3).f277378a;
                Wallet.WalletOptions.Builder internal = new Wallet.WalletOptions.Builder();
                Intrinsics.checkNotNullParameter(internal, "<this>");
                Intrinsics.checkNotNullParameter(internal, "internal");
                internal.setEnvironment(1);
                Wallet.WalletOptions walletOptionsBuild = internal.build();
                Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "build(...)");
                Intrinsics.checkNotNullParameter(walletOptionsBuild, "<this>");
                return kVar2.a((Context) obj2, new ni0.c(walletOptionsBuild));
            case 15:
                KProperty[] kPropertyArr5 = LoanDocumentsController.R;
                qji.b bVarU22 = ((LoanDocumentsController) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.di.DocumentsControllerInjector");
                r rVar = (r) bVarU22;
                return new u45.f(rVar.f277205b, rVar.f277206c, (LoanDocumentsControllerContract$InputData) obj2);
            case 16:
                OrderOptionsScreenContract$InputData orderOptionsScreenContract$InputData = (OrderOptionsScreenContract$InputData) obj2;
                int i3 = OrderOptionsScreen.U;
                phm.a aVar6 = (phm.a) ue0.e.j(((OrderOptionsScreen) obj3).m2()).a().get(u7i.l.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new u7i.q(((u7i.l) aVar.b()).f277829h0, orderOptionsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u7i.l.class, " is not found"));
            case 17:
                PaymentLinkDetailsContract$InputData paymentLinkDetailsContract$InputData = (PaymentLinkDetailsContract$InputData) obj2;
                KProperty[] kPropertyArr6 = PaymentLinkDetailsScreen.S;
                phm.a aVar7 = (phm.a) ue0.e.j(((PaymentLinkDetailsScreen) obj3).m2()).a().get(q7k.c.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new q7k.a(((q7k.c) aVar.b()).i, paymentLinkDetailsContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", q7k.c.class, " is not found"));
            case 18:
                qji.b bVarU23 = ((AskLocationSecurityPromptController) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.prompts.location_security.di.AskLocationSecurityPromptScreenInjector");
                t83.b bVar2 = (t83.b) bVarU23;
                return new t83.a(bVar2.f268816b, bVar2.f268817c, (AskLocationSecurityPromptScreenContract$InputData) obj2);
            case 19:
                IndexOverviewScreen indexOverviewScreen = (IndexOverviewScreen) obj3;
                KProperty[] kPropertyArr7 = IndexOverviewScreen.f74610a0;
                qji.b bVarU24 = indexOverviewScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.screen.index_overview.di.IndexOverviewScreenInjector");
                y77.e eVar2 = (y77.e) bVarU24;
                return new y77.f(eVar2.f311381b, eVar2.f311382c, indexOverviewScreen, (IndexOverviewScreenContract$InputData) obj2);
            case 20:
                KProperty[] kPropertyArr8 = FaqSomethingElseScreen.f86300d0;
                qji.b bVarQ22 = ((FaqSomethingElseScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.di.FaqSomethingElseInjector");
                r7d.t tVar = (r7d.t) ((v7d.a) bVarQ22);
                return new r7d.k(tVar.f252174b, tVar.f252175c, (FaqSomethingElseContract$InputData) obj2);
            case 21:
                RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = (RecurringTransferFlowContract$FlowInput) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((RecurringTransferFlow) obj3).m2()).a().get(r6e.o.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new j(((r6e.o) aVar.b()).K, recurringTransferFlowContract$FlowInput);
                }
                throw new IllegalStateException(a0.d.q("Api ", r6e.o.class, " is not found"));
            case 22:
                og5.d dVar = (og5.d) obj2;
                n nVar = ((com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) obj3).D;
                if (dVar instanceof og5.b) {
                    nVar.d3(((og5.b) dVar).f225033a);
                } else {
                    if (!(dVar instanceof og5.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.g3(((og5.c) dVar).f225034a, false);
                }
                return Unit.f186387a;
            case 23:
                ((com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c) obj3).J2((wi0.b) obj2);
                return Unit.f186387a;
            case 24:
                qji.b bVarQ23 = ((CardReaderUpdatingScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.di.CardReaderUpdatingScreenInjector");
                xb1.h hVar = (xb1.h) bVarQ23;
                return new xb1.q(hVar.f303929b, hVar.f303930c, (CardReaderUpdatingScreenContract$InputData) obj2);
            case 25:
                KontomatikPopupScreen kontomatikPopupScreen = (KontomatikPopupScreen) obj3;
                qji.b bVarQ24 = kontomatikPopupScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.di.KontomatikScreenInjector");
                r3 r3Var = (r3) bVarQ24;
                return new s3(r3Var.f119647c, r3Var.d, kontomatikPopupScreen, (KontomatikPopupScreenContract$InputData) obj2);
            case 26:
                KProperty[] kPropertyArr9 = BeforeAfterScreen.c0;
                qji.b bVarQ25 = ((BeforeAfterScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.di.BeforeAfterScreenInjector");
                jef.g gVar = (jef.g) bVarQ25;
                return new jef.b(gVar.f173380b, gVar.f173381c, (BeforeAfterScreenContract$InputData) obj2);
            case 27:
                int i5 = RepeaterDropdownSelectionScreen.U;
                qji.b bVarU25 = ((RepeaterDropdownSelectionScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.repeater_dropdown.di.RepeaterDropdownSelectionScreenInjector");
                lf9.h hVar2 = (lf9.h) bVarU25;
                return new lf9.s(hVar2.f194717b, hVar2.f194718c, (ug9.c) obj2);
            case 28:
                EsimConnectivityTroubleshootingFlow esimConnectivityTroubleshootingFlow = (EsimConnectivityTroubleshootingFlow) obj3;
                EsimConnectivityTroubleshootingFlowContract$InputData esimConnectivityTroubleshootingFlowContract$InputData = (EsimConnectivityTroubleshootingFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(esimConnectivityTroubleshootingFlow.m2()).a().get(afj.b.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new afj.f(((afj.b) aVar.b()).D, esimConnectivityTroubleshootingFlow, esimConnectivityTroubleshootingFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
            default:
                WeroHomeFlowContract$InputData weroHomeFlowContract$InputData = (WeroHomeFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((WeroHomeFlow) obj3).m2()).a().get(nh2.h.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new nh2.s(((nh2.o) ((nh2.h) aVar.b())).f215326t, weroHomeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
        }
    }
}
