package ot1;

import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.content.NavBackStackEntry;
import androidx.content.compose.DialogHostKt;
import androidx.content.compose.DialogNavigator;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreenContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewScreen;
import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlow;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreenContract$InputData;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreen;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$InputData;
import com.revolut.feature.card.verification.impl.screen.transaction_code_info.TransactionCodeInfoScreen;
import com.revolut.feature.card_payment_method.api.declaration.PaymentMethodInfoInputData;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.info.CardPaymentMethodInfoScreen;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$Step;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeController;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.statement_of_fees.screen.StatementOfFeesScreen;
import com.revolut.feature.store.impl.ui.root.StoreFlow;
import com.revolut.feature.store.impl.ui.root.StoreFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreen;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsControllerContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreenContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreen;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreenContract$Input;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.multi_text.MultiTextQuestionScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreenContract$InputData;
import dw3.b4;
import dw3.z6;
import fa1.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import prk.g0;
import prk.n0;
import u45.s0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f229419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f229420c;

    public /* synthetic */ p(Object obj2, Object obj3, int i) {
        this.f229418a = i;
        this.f229419b = obj2;
        this.f229420c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        xb1.p pVarG;
        int i = this.f229418a;
        Object obj2 = this.f229420c;
        Object obj3 = this.f229419b;
        switch (i) {
            case 0:
                BizumTransferReviewScreen bizumTransferReviewScreen = (BizumTransferReviewScreen) obj3;
                BizumTransferReviewContract$InputData bizumTransferReviewContract$InputData = (BizumTransferReviewContract$InputData) obj2;
                KProperty[] kPropertyArr = BizumTransferReviewScreen.c0;
                qji.b bVarQ2 = bizumTransferReviewScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.transfer.review.di.BizumTransferReviewScreenInjector");
                ms1.t tVar = (ms1.t) bVarQ2;
                ms1.j jVar = tVar.f208589b;
                ms1.t tVar2 = tVar.f208590c;
                bizumTransferReviewContract$InputData.getClass();
                return new ms1.u(jVar, tVar2, bizumTransferReviewScreen, bizumTransferReviewContract$InputData);
            case 1:
                BlikFlowDestination.InputData inputData = (BlikFlowDestination.InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((BlikFlow) obj3).m2()).a().get(cu1.k.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", cu1.k.class, " is not found"));
                }
                cu1.k kVar = ((cu1.k) aVar.b()).f108754t;
                inputData.getClass();
                return new cu1.o(kVar, inputData);
            case 2:
                int i2 = MultiTextQuestionScreen.U;
                qji.b bVarU2 = ((MultiTextQuestionScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.rfi.impl.ui.multi_text.di.MultiTextQuestionScreenInjector");
                euh.e eVar = (euh.e) bVarU2;
                return new euh.c(eVar.f129583b, eVar.f129584c, (BaseQuestionScreenContract$InputData) obj2);
            case 3:
                com.revolut.feature.apm.breb.impl.flow.a aVar3 = (com.revolut.feature.apm.breb.impl.flow.a) obj3;
                oki.h.t2(aVar3, (yki.l) obj2, com.revolut.feature.apm.breb.impl.flow.a.I2(aVar3.o), false, TransitionAnimation.FADE.f98392a, false, 8);
                return Unit.f186387a;
            case 4:
                KProperty[] kPropertyArr2 = TransactionCodeInfoScreen.P;
                qji.b bVarU22 = ((TransactionCodeInfoScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.card.verification.impl.screen.transaction_code_info.di.TransactionCodeInfoScreenInjector");
                ev2.d dVar = (ev2.d) bVarU22;
                return new ev2.e(dVar.f129691b, dVar.f129692c, (ov2.d) obj2);
            case 5:
                RevPointsExclusiveStoreProductCheckoutScreenContract$InputData revPointsExclusiveStoreProductCheckoutScreenContract$InputData = (RevPointsExclusiveStoreProductCheckoutScreenContract$InputData) obj2;
                int i3 = RevPointsExclusiveStoreProductCheckoutScreen.X;
                phm.a aVar4 = (phm.a) ue0.e.j(((RevPointsExclusiveStoreProductCheckoutScreen) obj3).m2()).a().get(kvb.b.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new kvb.c(((kvb.b) aVar.b()).f190066m, revPointsExclusiveStoreProductCheckoutScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", kvb.b.class, " is not found"));
            case 6:
                GlossaryScreenContract$InputData glossaryScreenContract$InputData = (GlossaryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = GlossaryScreen.f103997b0;
                phm.a aVar5 = (phm.a) ue0.e.j(((GlossaryScreen) obj3).m2()).a().get(n0.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                }
                g0 g0Var = ((g0) ((n0) aVar.b())).N;
                glossaryScreenContract$InputData.getClass();
                return new prk.v(g0Var, glossaryScreenContract$InputData);
            case 7:
                CryptoTradeScreen cryptoTradeScreen = (CryptoTradeScreen) obj3;
                iw5.j jVar2 = (iw5.j) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(cryptoTradeScreen.m2()).a().get(ix5.d.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ix5.d.class, " is not found"));
                }
                ix5.d dVar2 = ((ix5.d) aVar.b()).f169353n;
                CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = cryptoTradeScreen.K;
                cryptoTradeFlowContract$InputData.getClass();
                jVar2.getClass();
                return new ix5.f(dVar2, new x0h.a(), cryptoTradeScreen, cryptoTradeFlowContract$InputData, jVar2);
            case 8:
                KProperty[] kPropertyArr4 = AutoTopUpMethodsScreen.Q;
                qji.b bVarU23 = ((AutoTopUpMethodsScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.di.AutoTopUpMethodsScreenComponent.Injector");
                jxd.a aVar7 = (jxd.a) bVarU23;
                return new jxd.b(aVar7.f179136b, aVar7.f179137c, (AutoTopUpMethodsScreenContract$InputData) obj2);
            case 9:
                return AeFpsRangeLegacyQuirk.range_delegate$lambda$0((CameraMetadata) obj3, (AeFpsRangeLegacyQuirk) obj2);
            case 10:
                StatementOfFeesScreen statementOfFeesScreen = (StatementOfFeesScreen) obj3;
                KProperty[] kPropertyArr5 = StatementOfFeesScreen.P;
                qji.b bVarU24 = statementOfFeesScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.statement_of_fees.screen.di.StatementOfFeesScreenInjector");
                eyd.x xVar = (eyd.x) bVarU24;
                return new eyd.y(xVar.f130838b, xVar.f130839c, statementOfFeesScreen, (p0e.e) obj2);
            case 11:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$0$0((TextContextMenuDataProvider) obj3, (Function0) obj2);
            case 12:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$1((TextContextMenuItem) obj3, (TextContextMenuSession) obj2);
            case 13:
                TravelExperiencesBookingsScreen travelExperiencesBookingsScreen = (TravelExperiencesBookingsScreen) obj3;
                TravelExperiencesBookingsScreenContract$InputData travelExperiencesBookingsScreenContract$InputData = (TravelExperiencesBookingsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = TravelExperiencesBookingsScreen.U;
                qji.b bVarU25 = travelExperiencesBookingsScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.bookings.di.TravelExperiencesBookingsScreenInjector");
                z0g.w wVarC = ((q1g.a) bVarU25).c();
                switch (wVarC.f318463a) {
                    case 0:
                        wVarC.d = travelExperiencesBookingsScreenContract$InputData;
                        break;
                    default:
                        wVarC.d = travelExperiencesBookingsScreenContract$InputData;
                        break;
                }
                return (z0g.x) ((z0g.w) wVarC.mo3808a(travelExperiencesBookingsScreen)).mo3783build();
            case 14:
                RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData = (RevPointsSpareChangeControllerApi$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((RevPointsSpareChangeController) obj3).m2()).a().get(w1c.a.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                }
                w1c.a aVar9 = ((w1c.a) aVar.b()).f293821h;
                revPointsSpareChangeControllerApi$InputData.getClass();
                return new w1c.c(aVar9, revPointsSpareChangeControllerApi$InputData);
            case 15:
                StoreFlowContract$InputData storeFlowContract$InputData = (StoreFlowContract$InputData) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((StoreFlow) obj3).m2()).a().get(k2e.j.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new k2e.k(((k2e.j) aVar.b()).f180521r, storeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
            case 16:
                PaymentMethodInfoInputData paymentMethodInfoInputData = (PaymentMethodInfoInputData) obj2;
                KProperty[] kPropertyArr7 = CardPaymentMethodInfoScreen.f65289a0;
                phm.a aVar11 = (phm.a) ue0.e.j(((CardPaymentMethodInfoScreen) obj3).m2()).a().get(c43.h.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", c43.h.class, " is not found"));
                }
                c43.h hVar = ((c43.h) aVar.b()).f21028w;
                paymentMethodInfoInputData.getClass();
                return new c43.i(hVar, paymentMethodInfoInputData);
            case 17:
                return DialogHostKt.DialogHost$lambda$5$lambda$4$lambda$3((DialogNavigator) obj3, (NavBackStackEntry) obj2);
            case 18:
                KProperty[] kPropertyArr8 = IrisSettingsScreen.S;
                qji.b bVarU26 = ((IrisSettingsScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.apm.iris.impl.ui.settings.di.IrisSettingsScreenInjector");
                z52.m mVar = (z52.m) bVarU26;
                return new z52.r(mVar.f319454b, mVar.f319455c, (IrisSettingsScreenContract$InputData) obj2);
            case 19:
                RenameLoanScreenContract$InputData renameLoanScreenContract$InputData = (RenameLoanScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = RenameLoanScreen.f70484b0;
                phm.a aVar12 = (phm.a) ue0.e.j(((RenameLoanScreen) obj3).m2()).a().get(u45.h.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new s0(((u45.h) aVar.b()).B, renameLoanScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
            case 20:
                TacticalAllocationsControllerContract$InputData tacticalAllocationsControllerContract$InputData = (TacticalAllocationsControllerContract$InputData) obj2;
                KProperty[] kPropertyArr10 = TacticalAllocationsController.S;
                phm.a aVar13 = (phm.a) ue0.e.j(((TacticalAllocationsController) obj3).m2()).a().get(w5f.m.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                }
                w5f.m mVar2 = ((w5f.m) aVar.b()).f295201s;
                tacticalAllocationsControllerContract$InputData.getClass();
                return new w5f.b0(mVar2, tacticalAllocationsControllerContract$InputData);
            case 21:
                WhatWillHappenScreenContract$InputData whatWillHappenScreenContract$InputData = (WhatWillHappenScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = WhatWillHappenScreen.f89169a0;
                qji.b bVarQ22 = ((WhatWillHappenScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.di.WhatWillHappenScreenInjector");
                i9e.h hVar2 = (i9e.h) bVarQ22;
                i9e.o oVar = hVar2.f159679b;
                i9e.h hVar3 = hVar2.f159680c;
                whatWillHappenScreenContract$InputData.getClass();
                return new i9e.x(oVar, hVar3, whatWillHappenScreenContract$InputData);
            case 22:
                CountryOfResidenceFlowContract$Step.Disclaimer disclaimer = (CountryOfResidenceFlowContract$Step.Disclaimer) obj2;
                ((com.revolut.feature.onboarding.impl.onboarding.country.flow.c) obj3).C2(new pa9.d(disclaimer.f78405a, disclaimer.f78406b));
                return Unit.f186387a;
            case 23:
                PayToConfirmationScreenContract$InputData payToConfirmationScreenContract$InputData = (PayToConfirmationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = PayToConfirmationScreen.S;
                phm.a aVar14 = (phm.a) ue0.e.j(((PayToConfirmationScreen) obj3).m2()).a().get(nb2.b.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new nb2.c(((nb2.b) aVar.b()).f213966m, payToConfirmationScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nb2.b.class, " is not found"));
            case 24:
                CardReaderPaymentScreen cardReaderPaymentScreen = (CardReaderPaymentScreen) obj3;
                CardReaderPaymentScreenContract$InputData cardReaderPaymentScreenContract$InputData = (CardReaderPaymentScreenContract$InputData) obj2;
                try {
                    phm.a aVar15 = (phm.a) ue0.e.j(cardReaderPaymentScreen.m2()).a().get(qb1.a.class);
                    aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                } catch (Exception unused) {
                    pVarG = xb1.b.Companion.g();
                }
                if (aVar != null) {
                    pVarG = (xb1.p) aVar.b();
                    return new xb1.k(pVarG.f303958g, cardReaderPaymentScreen, cardReaderPaymentScreenContract$InputData);
                }
                throw new IllegalStateException("Api " + qb1.a.class + " is not found");
            case 25:
                pc1.q qVar = (pc1.q) obj3;
                dj0.d amount = qVar.y2();
                Throwable th10 = ((o.e) ((fa1.o) obj2)).f133200a;
                pc1.q.z2("Payment failed");
                pc1.q.z2("Payment failed");
                pc1.b bVar = qVar.u;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                yji.l.b1(qVar, qVar.X1(pc1.b.f(bVar.g(th10), amount)), null, new pc1.o(qVar, null), 3);
                return Unit.f186387a;
            case 26:
                CashTopUpSearchLocationScreenContract$InputData cashTopUpSearchLocationScreenContract$InputData = (CashTopUpSearchLocationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = CashTopUpSearchLocationScreen.f65680a0;
                phm.a aVar16 = (phm.a) ue0.e.j(((CashTopUpSearchLocationScreen) obj3).m2()).a().get(bb3.a.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new mb3.t(((mb3.p) aVar.b()).i, cashTopUpSearchLocationScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
            case 27:
                PocketPickerScreen pocketPickerScreen = (PocketPickerScreen) obj3;
                PocketPickerScreenContract$Input pocketPickerScreenContract$Input = (PocketPickerScreenContract$Input) obj2;
                KProperty[] kPropertyArr14 = PocketPickerScreen.f95623a0;
                qji.b bVarQ23 = pocketPickerScreen.Q2();
                z9h.a aVar17 = bVarQ23 instanceof z9h.a ? (z9h.a) bVarQ23 : null;
                if (aVar17 == null) {
                    phm.a aVar18 = (phm.a) ue0.e.j(pocketPickerScreen.m2()).a().get(h9h.a.class);
                    aVar = aVar18 != null ? (b60.a) aVar18.get() : null;
                    if (aVar == null) {
                        throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                    }
                    Object objB = aVar.b();
                    Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.pocket_picker.di.PocketPickerScreenInjector");
                    aVar17 = (z9h.a) objB;
                }
                return new z9h.g(aVar17.f320385c, aVar17.d, pocketPickerScreenContract$Input);
            case 28:
                UploadDocumentsScreen uploadDocumentsScreen = (UploadDocumentsScreen) obj3;
                KProperty[] kPropertyArr15 = UploadDocumentsScreen.S;
                qji.b bVarU27 = uploadDocumentsScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.di.UploadDocumentsScreenInjector");
                b4 b4Var = (b4) bVarU27;
                return new z6(b4Var.f118345c, b4Var.d, uploadDocumentsScreen, (UploadDocumentsScreenContract$InputData) obj2);
            default:
                ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) obj3).C2(new pd4.j((it3.d) obj2));
                return Unit.f186387a;
        }
    }
}
