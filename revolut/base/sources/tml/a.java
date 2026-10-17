package tml;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import au0.a5;
import au0.f4;
import au0.y3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreen;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreenContract$InputData;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlowContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreenContract$InputData;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreen;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreen;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.SalaryDisputeScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.SalaryDisputeScreenContract$InputData;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.SecurityDelayScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorController;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorControllerContract$InputData;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigScreen;
import com.revolut.feature_account_widget.impl.configuration.WidgetIdInputData;
import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlow;
import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreenContract$InputData;
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlow;
import jm4.a3;
import jm4.j3;
import jm4.k3;
import jm4.n4;
import jm4.o1;
import jm4.o4;
import jm4.p1;
import jm4.t3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.q0;
import prk.g0;
import prk.n0;
import ql7.a2;
import ql7.x;
import ql7.z;
import ql7.z1;
import ro0.e0;
import ts6.s0;
import tw0.h1;
import tw0.j1;
import tw0.l1;
import us6.f0;
import vtc.i0;
import vtc.k0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f272241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f272242c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f272240a = i;
        this.f272241b = obj2;
        this.f272242c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f272240a;
        Object obj2 = this.f272242c;
        Object obj3 = this.f272241b;
        switch (i) {
            case 0:
                ChangeEmailFlow changeEmailFlow = (ChangeEmailFlow) obj3;
                return new ljl.f(((q0) kli.a.n(changeEmailFlow.m2())).E, changeEmailFlow, (ChangeEmailInputData) obj2);
            case 1:
                KProperty[] kPropertyArr = DocumentDeliveryTrackingScreen.f75519b0;
                qji.b bVarQ2 = ((DocumentDeliveryTrackingScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.di.DocumentDeliveryTrackingScreenInjector");
                x xVar = (x) bVarQ2;
                return new z(xVar.f247516b, xVar.f247517c, (DocumentDeliveryTrackingScreenContract$InputData) obj2);
            case 2:
                ConfirmEmailWithOtpFlowContract$InputData confirmEmailWithOtpFlowContract$InputData = (ConfirmEmailWithOtpFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((ConfirmEmailWithOtpFlow) obj3).m2()).a().get(ini.f.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new ini.a(((ini.f) aVar.b()).d, confirmEmailWithOtpFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ini.f.class, " is not found"));
            case 3:
                BinaryQuestionsScreen binaryQuestionsScreen = (BinaryQuestionsScreen) obj3;
                BinaryQuestionsScreenContract$InputData binaryQuestionsScreenContract$InputData = (BinaryQuestionsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = BinaryQuestionsScreen.c0;
                qji.b bVarQ22 = binaryQuestionsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.di.BinaryQuestionsScreenInjector");
                z1 z1Var = (z1) ((up7.a) bVarQ22).b().S(binaryQuestionsScreen);
                switch (z1Var.f247550a) {
                    case 0:
                        z1Var.d = binaryQuestionsScreenContract$InputData;
                        break;
                    default:
                        z1Var.d = binaryQuestionsScreenContract$InputData;
                        break;
                }
                return (a2) z1Var.mo3800build();
            case 4:
                KProperty[] kPropertyArr3 = ChallengeEditFrequencyScreen.Q;
                qji.b bVarU2 = ((ChallengeEditFrequencyScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.di.ChallengeEditFrequencyScreenComponent.Injector");
                gp8.i iVar = (gp8.i) bVarU2;
                return new gp8.g(iVar.f145310b, iVar.f145311c, (ChallengeEditFrequencyScreenContract$InputData) obj2);
            case 5:
                CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = (CreditCardLimitDecreaseAmountScreen) obj3;
                CreditCardLimitDecreaseAmountScreenContract$InputData creditCardLimitDecreaseAmountScreenContract$InputData = (CreditCardLimitDecreaseAmountScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = CreditCardLimitDecreaseAmountScreen.S;
                phm.a aVar3 = (phm.a) ue0.e.j(creditCardLimitDecreaseAmountScreen.m2()).a().get(a3.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return (t3) ((uq4.a) ((uq4.b) aVar.b()).b().mo3808a(creditCardLimitDecreaseAmountScreen)).q0(creditCardLimitDecreaseAmountScreenContract$InputData).mo3783build();
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 6:
                KProperty[] kPropertyArr5 = ActivateTelematicsDeviceScreen.f75673b0;
                qji.b bVarQ23 = ((ActivateTelematicsDeviceScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.di.ActivateTelematicsDeviceScreenInjector");
                ql7.o oVar = (ql7.o) bVarQ23;
                return new ql7.d(oVar.f247408b, oVar.f247409c, (ActivateTelematicsDeviceScreenContract$InputData) obj2);
            case 7:
                KProperty[] kPropertyArr6 = SalaryDisputeScreen.P;
                qji.b bVarU22 = ((SalaryDisputeScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.di.SalaryDisputeScreenInjector");
                zpc.l lVar = (zpc.l) bVarU22;
                return new zpc.g(lVar.f324270b, lVar.f324271c, (SalaryDisputeScreenContract$InputData) obj2);
            case 8:
                RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = (RecurringTransferFlowContract$FlowInput) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((RecurringTransferFlow) obj3).m2()).a().get(fpg.c.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new wpg.i(((wpg.l) aVar.b()).F, recurringTransferFlowContract$FlowInput);
                }
                throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
            case 9:
                KProperty[] kPropertyArr7 = InstalmentConfirmationScreen.U;
                qji.b bVarU23 = ((InstalmentConfirmationScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.confirmation.di.InstalmentConfirmationScreenInjector");
                k3 k3Var = (k3) bVarU23;
                return new j3(k3Var.f176172b, k3Var.f176173c, (InstalmentConfirmationScreenContract$InputData) obj2);
            case 10:
                return HistogramView.c((Context) obj3, (HistogramView) obj2);
            case 11:
                boolean z = false;
                return s0.m((s0) obj3, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, new CardScreenAction.Select((String) obj2, 6, z, z), 11));
            case 12:
                KProperty[] kPropertyArr8 = CreditCardLimitHubManageScreen.T;
                qji.b bVarU24 = ((CreditCardLimitHubManageScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.limit_hub.manage.di.CreditCardLimitHubManageScreenInjector");
                o1 o1Var = (o1) bVarU24;
                return new p1(o1Var.f176227b, o1Var.f176228c, (CreditCardLimitHubManageScreenContract$InputData) obj2);
            case 13:
                InsuranceDetailsScreen insuranceDetailsScreen = (InsuranceDetailsScreen) obj3;
                KProperty[] kPropertyArr9 = InsuranceDetailsScreen.Y;
                qji.b bVarU25 = insuranceDetailsScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.details.di.InsuranceDetailsScreenInjector");
                bt7.j jVar = (bt7.j) bVarU25;
                return new bt7.k(jVar.f18442b, jVar.f18443c, insuranceDetailsScreen, (InsuranceDetailsScreenContract$InputData) obj2);
            case 14:
                CardTerminateScreen cardTerminateScreen = (CardTerminateScreen) obj3;
                qji.b bVarQ24 = cardTerminateScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.card.terminate.impl.ui.flow.screen.di.CardTerminateScreenInjector");
                ou2.e eVar = (ou2.e) bVarQ24;
                return new ou2.f(eVar.f229777b, eVar.f229778c, cardTerminateScreen, (CardTerminateScreenContract$InputData) obj2);
            case 15:
                EmbeddedDetailFlowContract$InputData embeddedDetailFlowContract$InputData = (EmbeddedDetailFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((EmbeddedDetailFlow) obj3).m2()).a().get(lu7.s.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new lu7.i(((lu7.s) aVar.b()).o, embeddedDetailFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", lu7.s.class, " is not found"));
            case 16:
                AttributesScreenContract$InputData attributesScreenContract$InputData = (AttributesScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = AttributesScreen.f103883d0;
                phm.a aVar6 = (phm.a) ue0.e.j(((AttributesScreen) obj3).m2()).a().get(n0.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new prk.h(((g0) ((n0) aVar.b())).N, attributesScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
            case 17:
                FrameLayout frameLayout = (FrameLayout) obj3;
                frameLayout.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                frameLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
                frameLayout.setVisibility(8);
                ((s86.a) obj2).invoke();
                return Unit.f186387a;
            case 18:
                CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen = (CreditCardStatementTransactionsScreen) obj3;
                CreditCardStatementTransactionsScreenContract$InputData creditCardStatementTransactionsScreenContract$InputData = (CreditCardStatementTransactionsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CreditCardStatementTransactionsScreen.U;
                qji.b bVarU26 = creditCardStatementTransactionsScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.transactions.di.CreditCardStatementTransactionsScreenInjector");
                n4 n4Var = (n4) ((uv4.a) bVarU26).b().mo3808a(creditCardStatementTransactionsScreen);
                switch (n4Var.f176221a) {
                    case 0:
                        n4Var.d = creditCardStatementTransactionsScreenContract$InputData;
                        break;
                    default:
                        n4Var.d = creditCardStatementTransactionsScreenContract$InputData;
                        break;
                }
                return (o4) n4Var.mo3783build();
            case 19:
                SecurityDelayInputData securityDelayInputData = (SecurityDelayInputData) obj2;
                KProperty[] kPropertyArr12 = SecurityDelayScreen.P;
                phm.a aVar7 = (phm.a) ue0.e.j(((SecurityDelayScreen) obj3).m2()).a().get(k0.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new i0(((k0) aVar.b()).i, securityDelayInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", k0.class, " is not found"));
            case 20:
                WidgetIdInputData widgetIdInputData = (WidgetIdInputData) obj2;
                KProperty[] kPropertyArr13 = AccountWidgetConfigScreen.f96617a0;
                phm.a aVar8 = (phm.a) ue0.e.j(((AccountWidgetConfigScreen) obj3).m2()).a().get(uvh.a.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new uvh.d(((uvh.e) aVar.b()).f, Integer.valueOf(widgetIdInputData.f96619a));
                }
                throw new IllegalStateException(a0.d.q("Api ", uvh.a.class, " is not found"));
            case 21:
                ((tw0.s0) obj3).dispatchAddFinished((RecyclerView.ViewHolder) obj2);
                return Unit.f186387a;
            case 22:
                ((h1) obj3).dispatchAddFinished((RecyclerView.ViewHolder) obj2);
                return Unit.f186387a;
            case 23:
                l1 l1Var = (l1) obj3;
                l1Var.startDrag((RecyclerView.ViewHolder) obj2);
                l1Var.f274845b = BitmapDescriptorFactory.HUE_RED;
                l1Var.f274846c = BitmapDescriptorFactory.HUE_RED;
                l1Var.e = null;
                RecyclerView recyclerView = l1Var.d;
                if (recyclerView != null) {
                    recyclerView.removeOnItemTouchListener(l1Var.f274847g);
                }
                l1Var.f = j1.IDLE;
                return Unit.f186387a;
            case 24:
                NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) obj3;
                Context context = (Context) obj2;
                NavBarWithContainerHeaderView.Companion companion = NavBarWithContainerHeaderView.INSTANCE;
                return ((Boolean) jo0.g.D.getValue()).booleanValue() ? new f4(navBarWithContainerHeaderView, navBarWithContainerHeaderView, new sz5.f(navBarWithContainerHeaderView.f59386m, navBarWithContainerHeaderView.f59380g, navBarWithContainerHeaderView.f59375b, navBarWithContainerHeaderView, navBarWithContainerHeaderView.o), v.k(navBarWithContainerHeaderView.o, navBarWithContainerHeaderView.f59386m, navBarWithContainerHeaderView.f59380g), navBarWithContainerHeaderView.f59387n) : ro0.g0.b(context, e0.NAV_BAR) ? new y3(navBarWithContainerHeaderView) : new a5(navBarWithContainerHeaderView);
            case 25:
                ComplexAnalyticsSectorContributorControllerContract$InputData complexAnalyticsSectorContributorControllerContract$InputData = (ComplexAnalyticsSectorContributorControllerContract$InputData) obj2;
                KProperty[] kPropertyArr14 = ComplexAnalyticsSectorContributorController.Q;
                phm.a aVar9 = (phm.a) ue0.e.j(((ComplexAnalyticsSectorContributorController) obj3).m2()).a().get(ewg.p.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ewg.p.class, " is not found"));
                }
                ewg.h hVar = ((ewg.h) ((ewg.p) aVar.b())).f130214x;
                complexAnalyticsSectorContributorControllerContract$InputData.getClass();
                gwg.a aVar10 = complexAnalyticsSectorContributorControllerContract$InputData.e;
                aVar10.getClass();
                return new ewg.d(hVar, complexAnalyticsSectorContributorControllerContract$InputData, aVar10);
            case 26:
                DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen = (DirectDebitAccountSelectionScreen) obj3;
                DirectDebitAccountSelectionScreenContract$InputData directDebitAccountSelectionScreenContract$InputData = (DirectDebitAccountSelectionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr15 = DirectDebitAccountSelectionScreen.g0;
                qji.b bVarQ25 = directDebitAccountSelectionScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.account_selection.di.AccountSelectionScreenInjector");
                dw3.n nVar = (dw3.n) ((uy4.a) bVarQ25).c().S(directDebitAccountSelectionScreen);
                switch (nVar.f119303a) {
                    case 0:
                        nVar.f119305c = directDebitAccountSelectionScreenContract$InputData;
                        break;
                    case 1:
                        nVar.f119305c = directDebitAccountSelectionScreenContract$InputData;
                        break;
                    default:
                        nVar.f119305c = directDebitAccountSelectionScreenContract$InputData;
                        break;
                }
                return (dw3.o) nVar.mo3800build();
            case 27:
                TrustdockScreenContract$InputData trustdockScreenContract$InputData = (TrustdockScreenContract$InputData) obj2;
                TrustdockScreen.Companion aVar11 = TrustdockScreen.INSTANCE;
                phm.a aVar12 = (phm.a) ue0.e.j(((TrustdockScreen) obj3).m2()).a().get(qy8.a.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new qy8.d(((qy8.a) aVar.b()).d, trustdockScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", qy8.a.class, " is not found"));
            case 28:
                RevPointsAccountMigrationChecklistScreenContract$InputData revPointsAccountMigrationChecklistScreenContract$InputData = (RevPointsAccountMigrationChecklistScreenContract$InputData) obj2;
                int i2 = RevPointsAccountMigrationChecklistScreen.T;
                phm.a aVar13 = (phm.a) ue0.e.j(((RevPointsAccountMigrationChecklistScreen) obj3).m2()).a().get(zxb.e.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new zxb.b(((zxb.e) aVar.b()).V, revPointsAccountMigrationChecklistScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
            default:
                KProperty[] kPropertyArr16 = FreelancerPerksDetailsScreen.S;
                qji.b bVarU27 = ((FreelancerPerksDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.perks.details.di.FreelancerPerksDetailsScreenInjector");
                us6.g0 g0Var = (us6.g0) bVarU27;
                return new f0(g0Var.f282547b, g0Var.f282548c, (FreelancerPerksDetailsScreenContract$InputData) obj2);
        }
    }
}
