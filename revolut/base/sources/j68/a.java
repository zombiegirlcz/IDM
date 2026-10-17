package j68;

import android.os.Handler;
import com.revolut.core.backend_flow.impl.ui.entities_selection.EntitiesSelectionController;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreenContract$InputData;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.apm.services.ideal.impl.ui.flow.IDealFlow;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$InputData;
import com.revolut.feature.apm.swish.impl.ui.SwishFlow;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreenContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$InputData;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreen;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlow;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreenContract$InputData;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateController;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateControllerContract$InputData;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlowContract$Step;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlow;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlow;
import com.revolut.feature.subscriptions.impl.block_card_subscription.BlockCardSubscriptionFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreenContract$InputData;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreen;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreenContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreen;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import dw3.c1;
import dw3.o8;
import fa0.n;
import g9g.z;
import i72.u;
import i72.y;
import i9e.o;
import jm4.i0;
import jm4.i3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pa6.p;
import qbj.v;
import qbj.x;
import ql7.o1;
import ql7.p1;
import r7d.m;
import r7d.t;
import tfm.z0;
import u7i.l;
import xf6.q2;
import xf6.w1;
import xf6.w2;
import xf6.y1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171684c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f171682a = i;
        this.f171683b = obj2;
        this.f171684c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r5v40 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f171682a;
        int i2 = 26;
        Object obj2 = this.f171684c;
        Object obj3 = this.f171683b;
        switch (i) {
            case 0:
                EditBirthDateControllerContract$InputData editBirthDateControllerContract$InputData = (EditBirthDateControllerContract$InputData) obj2;
                KProperty[] kPropertyArr = EditBirthDateController.Q;
                phm.a aVar = (phm.a) ue0.e.j(((EditBirthDateController) obj3).m2()).a().get(o58.a.class);
                 = aVar != null ? (b60.a) aVar.get() : 0;
                if ( != 0) {
                    return new z58.h(((z58.j) b()).o, editBirthDateControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
            case 1:
                KProperty[] kPropertyArr2 = CommodityOrderTypeSelectionScreen.S;
                qji.b bVarU2 = ((CommodityOrderTypeSelectionScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.di.CommodityOrderTypeSelectionScreenInjector");
                r6j.d dVar = (r6j.d) bVarU2;
                return new r6j.f(dVar.f251895b, dVar.f251896c, (CommodityOrderTypeSelectionScreenContract$InputData) obj2);
            case 2:
                KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.S;
                qji.b bVarU22 = ((PendingPaymentConfirmationScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.di.PendingPaymentConfirmationScreenInjector");
                u uVar = (u) bVarU22;
                return new y(uVar.f159168b, uVar.f159169c, (PendingPaymentConfirmationScreenContract$InputData) obj2);
            case 3:
                KProperty[] kPropertyArr4 = TerminatedCardChargebackScreen.f65492e0;
                qji.b bVarQ2 = ((TerminatedCardChargebackScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.di.TerminatedCardChargebackScreenInjector");
                z73.c cVar = (z73.c) bVarQ2;
                return new z73.h(cVar.f319876b, cVar.f319877c, (TerminatedCardChargebackScreenContract$InputData) obj2);
            case 4:
                KProperty[] kPropertyArr5 = FaqFormChooserScreen.c0;
                qji.b bVarQ22 = ((FaqFormChooserScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.di.FaqFormChooserScreenInjector");
                t tVar = (t) ((v7d.a) bVarQ22);
                return new r7d.h(tVar.f252174b, tVar.f252175c, (FaqFormChooserScreenContract$InputData) obj2);
            case 5:
                MoveMoneyEditNoteScreenContract$InputData moveMoneyEditNoteScreenContract$InputData = (MoveMoneyEditNoteScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = MoveMoneyEditNoteScreen.Q;
                phm.a aVar2 = (phm.a) ue0.e.j(((MoveMoneyEditNoteScreen) obj3).m2()).a().get(l.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new u7i.k(((l) aVar3.b()).f277829h0, moveMoneyEditNoteScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 6:
                HelpFlow helpFlow = (HelpFlow) obj3;
                HelpFlowContract$InputData helpFlowContract$InputData = (HelpFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(helpFlow.m2()).a().get(r7d.l.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 != null) {
                    return new m(((r7d.l) aVar5.b()).f252135l, helpFlow, helpFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", r7d.l.class, " is not found"));
            case 7:
                BlockCardSubscriptionFlowContract$InputData blockCardSubscriptionFlowContract$InputData = (BlockCardSubscriptionFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((BlockCardSubscriptionFlow) obj3).m2()).a().get(f9e.a.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 != null) {
                    return new i9e.h(((o) aVar7.b()).G, blockCardSubscriptionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
            case 8:
                new Handler().post(new d0.c((z0) obj3, (NewRevolutCardView) obj2, i2));
                return Unit.f186387a;
            case 9:
                EntitiesSelectionController entitiesSelectionController = (EntitiesSelectionController) obj3;
                FormScreen formScreen = (FormScreen) obj2;
                int i3 = EntitiesSelectionController.f51262b0;
                qji.b bVarU23 = entitiesSelectionController.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.entities_selection.di.EntitiesSelectionControllerInjector");
                n nVarX = ((na0.d) bVarU23).X();
                switch (nVarX.f133115a) {
                    case 0:
                        nVarX.d = formScreen;
                        break;
                    default:
                        nVarX.d = formScreen;
                        break;
                }
                return (fa0.o) ((n) nVarX.mo3808a(entitiesSelectionController)).mo3783build();
            case 10:
                KProperty[] kPropertyArr7 = CheckoutScreen.c0;
                qji.b bVarQ23 = ((CheckoutScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.di.CheckoutScreenInjector");
                db1.c cVar2 = (db1.c) bVarQ23;
                return new db1.e(cVar2.f112647a, cVar2.f112648b, (CheckoutScreenContract$InputData) obj2);
            case 11:
                qji.b bVarQ24 = ((CardReaderConnectingScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.di.CardReaderConnectingScreenInjector");
                xb1.h hVar = (xb1.h) bVarQ24;
                return new xb1.g(hVar.f303929b, hVar.f303930c, (CardReaderConnectingScreenContract$InputData) obj2);
            case 12:
                ((jc1.h) obj3).v2(new jc1.b((PairingInfo) obj2));
                return Unit.f186387a;
            case 13:
                KProperty[] kPropertyArr8 = RecurringDonationAmountScreen.f72100e0;
                qji.b bVarQ25 = ((RecurringDonationAmountScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.di.RecurringDonationAmountScreenInjector");
                pa6.e eVar = (pa6.e) bVarQ25;
                return new p(eVar.f234362b, eVar.f234363c, (RecurringDonationAmountScreenContract$InputData) obj2);
            case 14:
                KProperty[] kPropertyArr9 = ReturnCryptoDepositSummaryScreen.R;
                qji.b bVarU24 = ((ReturnCryptoDepositSummaryScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.di.ReturnCryptoDepositSummaryScreenInjector");
                v vVar = (v) bVarU24;
                return new x(vVar.f244363b, vVar.f244364c, (ReturnCryptoDepositSummaryScreenContract$InputData) obj2);
            case 15:
                IDealFlowDestination.InputData inputData = (IDealFlowDestination.InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((IDealFlow) obj3).m2()).a().get(fd2.g.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", fd2.g.class, " is not found"));
                }
                fd2.g gVar = ((fd2.g) aVar9.b()).e;
                inputData.getClass();
                return new fd2.j(gVar, inputData);
            case 16:
                LoadingScreenContract$InputData loadingScreenContract$InputData = (LoadingScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = LoadingScreen.f67877b0;
                phm.a aVar10 = (phm.a) ue0.e.j(((LoadingScreen) obj3).m2()).a().get(dw3.e.class);
                b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar11 != null) {
                    return new o8(((c1) ((dw3.e) aVar11.b())).m0, loadingScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
            case 17:
                KProperty[] kPropertyArr11 = TravelHotelsAdditionalDetailsScreen.P;
                qji.b bVarU25 = ((TravelHotelsAdditionalDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.di.TravelHotelsAdditionalDetailsScreenInjector");
                z zVar = (z) bVarU25;
                return new g9g.b(zVar.f141862b, zVar.f141863c, (TravelHotelsAdditionalDetailsScreenContract$InputData) obj2);
            case 18:
                KProperty[] kPropertyArr12 = CategoryDetailsScreen.R;
                qji.b bVarU26 = ((CategoryDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.di.CategoryDetailsScreenInjector");
                ld1.c cVar3 = (ld1.c) bVarU26;
                return new ld1.e(cVar3.f193928b, cVar3.f193929c, (CategoryDetailsScreenContract$InputData) obj2);
            case 19:
                SwishNavigation$InputData swishNavigation$InputData = (SwishNavigation$InputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((SwishFlow) obj3).m2()).a().get(he2.c.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", he2.c.class, " is not found"));
                }
                he2.c cVar4 = ((he2.c) aVar13.b()).f151532h;
                swishNavigation$InputData.getClass();
                return new he2.f(cVar4);
            case 20:
                je5.h hVar2 = (je5.h) obj2;
                KProperty[] kPropertyArr13 = CryptoCurrencyPairPickerScreen.T;
                phm.a aVar14 = (phm.a) ue0.e.j(((CryptoCurrencyPairPickerScreen) obj3).m2()).a().get(fe5.a.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new fe5.b(((fe5.a) aVar15.b()).d, hVar2);
                }
                throw new IllegalStateException(a0.d.q("Api ", fe5.a.class, " is not found"));
            case 21:
                SharedConverterScreen sharedConverterScreen = (SharedConverterScreen) obj3;
                KProperty[] kPropertyArr14 = SharedConverterScreen.f86850h0;
                qji.b bVarQ26 = sharedConverterScreen.Q2();
                Intrinsics.i(bVarQ26, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenInjector");
                fgd.f fVar = (fgd.f) ((hgd.a) bVarQ26);
                fgd.d dVar2 = fVar.f135048b;
                fgd.f fVar2 = fVar.f135049c;
                ScreenContentRecyclerView recyclerView = sharedConverterScreen.h3().f174540c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                return new fgd.g(dVar2, fVar2, recyclerView, (SharedConverterScreenContract$InputData) obj2);
            case 22:
                MandateResultScreenContract$InputData mandateResultScreenContract$InputData = (MandateResultScreenContract$InputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(((MandateResultScreen) obj3).m2()).a().get(je6.j.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new w1(((y1) aVar17.b()).i, mandateResultScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
            case 23:
                OpenBankingAuthAccountsFlowContract$InputData openBankingAuthAccountsFlowContract$InputData = (OpenBankingAuthAccountsFlowContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(((OpenBankingAuthAccountsFlow) obj3).m2()).a().get(w2.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new q2(((w2) aVar19.b()).J, openBankingAuthAccountsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
            case 24:
                KProperty[] kPropertyArr15 = InputAmountScreen.U;
                qji.b bVarU27 = ((InputAmountScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.amount.input.di.InputAmountScreenInjector");
                i0 i0Var = (i0) bVarU27;
                return new i3(i0Var.f176114b, i0Var.f176115c, (InputAmountScreenContract$InputData) obj2);
            case 25:
                CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen = (CFACInsuranceSupportingDocumentsScreen) obj3;
                CFACInsuranceSupportingDocumentsScreenContract$InputData cFACInsuranceSupportingDocumentsScreenContract$InputData = (CFACInsuranceSupportingDocumentsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr16 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                qji.b bVarQ27 = cFACInsuranceSupportingDocumentsScreen.Q2();
                Intrinsics.i(bVarQ27, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.di.CFACInsuranceSupportingDocumentsScreenInjector");
                nk7.x xVar = (nk7.x) ((kk7.a) bVarQ27).b().S(cFACInsuranceSupportingDocumentsScreen);
                switch (xVar.f216739a) {
                    case 0:
                        xVar.d = cFACInsuranceSupportingDocumentsScreenContract$InputData;
                        break;
                    default:
                        xVar.d = cFACInsuranceSupportingDocumentsScreenContract$InputData;
                        break;
                }
                return (nk7.y) xVar.mo3800build();
            case 26:
                jlk.p pVar = (jlk.p) obj3;
                pVar.l2(new jlk.o(pVar, (String) obj2, , 0), new yi5.b(i2));
                return Unit.f186387a;
            case 27:
                jmc.d dVar3 = ((com.revolut.feature.robo.impl.ui.flow.edit_goal.f) obj2).f85115q;
                EditGoalFlowContract$Step.Projections projections = (EditGoalFlowContract$Step.Projections) ((EditGoalFlowContract$Step) obj3);
                com.revolut.feature.robo.impl.ui.flow.edit_goal.a aVar20 = projections.f85104b;
                PortfolioGoal goal = projections.f85103a;
                int i5 = com.revolut.feature.robo.impl.ui.flow.edit_goal.d.f85111a[aVar20.ordinal()];
                if (i5 == 1) {
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(goal, "goal");
                    return jmc.d.b(goal, R$string.wealth_robo_edit_goal_success_update_dialog_title);
                }
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(goal, "goal");
                return jmc.d.b(goal, R$string.wealth_robo_edit_goal_success_create_dialog_title);
            case 28:
                jmc.d dVar4 = ((com.revolut.feature.robo.impl.ui.flow.edit_goal.f) obj3).f85115q;
                PortfolioGoal goal2 = ((anc.k) ((anc.l) obj2)).f6750a;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(goal2, "goal");
                return jmc.d.b(goal2, R$string.wealth_robo_edit_goal_success_update_dialog_title);
            default:
                BenefitDetailsScreen benefitDetailsScreen = (BenefitDetailsScreen) obj3;
                BenefitDetailsScreenContract$InputData benefitDetailsScreenContract$InputData = (BenefitDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr17 = BenefitDetailsScreen.c0;
                qji.b bVarQ28 = benefitDetailsScreen.Q2();
                Intrinsics.i(bVarQ28, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.di.BenefitDetailsScreenInjector");
                o1 o1Var = (o1) ((kn7.a) bVarQ28).j().S(benefitDetailsScreen);
                switch (o1Var.f247416a) {
                    case 0:
                        o1Var.d = benefitDetailsScreenContract$InputData;
                        break;
                    default:
                        o1Var.d = benefitDetailsScreenContract$InputData;
                        break;
                }
                return (p1) o1Var.mo3800build();
        }
    }
}
