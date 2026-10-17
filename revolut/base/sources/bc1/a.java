package bc1;

import afj.h0;
import afj.k0;
import android.view.View;
import bmk.n;
import bmk.q;
import boc.j;
import br7.m;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlow;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedController;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedControllerContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.transfer_info.CryptoGiftAssetTransferInfoScreen;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreen;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreenContract$InputData;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreenContract$InputData;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlow;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlowContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlow;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlowContract$InputData;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlow;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlowContract$InputData;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterInputData;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreenContract$InputData;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.CashBalanceInfoDialogInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.info.CashBalanceInfoDialogController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData;
import g9g.g0;
import g9g.p0;
import ine.l;
import ine.o;
import java.io.File;
import jm4.a3;
import jm4.m0;
import jm4.u0;
import jm4.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import lki.s;
import lpf.y;
import mkh.u;
import mul.k;
import mx0.mb;
import mx0.s2;
import mx0.y9;
import ql7.k1;
import ql7.m1;
import xb1.p;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14358c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f14356a = i;
        this.f14357b = obj2;
        this.f14358c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r3v48 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        p pVarG;
        int i = this.f14356a;
        Object obj2 = this.f14358c;
        Object obj3 = this.f14357b;
        switch (i) {
            case 0:
                CardReaderConnectionFlowContract$InputData cardReaderConnectionFlowContract$InputData = (CardReaderConnectionFlowContract$InputData) obj2;
                try {
                    phm.a aVar = (phm.a) ue0.e.j(((CardReaderConnectionFlow) obj3).m2()).a().get(qb1.a.class);
                     = aVar != null ? (b60.a) aVar.get() : 0;
                } catch (Exception unused) {
                    pVarG = xb1.b.Companion.g();
                }
                if ( != 0) {
                    pVarG = (p) b();
                    return new xb1.h(pVarG.f303958g, cardReaderConnectionFlowContract$InputData);
                }
                throw new IllegalStateException("Api " + qb1.a.class + " is not found");
            case 1:
                TradingAddOnsFlow tradingAddOnsFlow = (TradingAddOnsFlow) obj3;
                TradingAddOnsFlowContract$InputData tradingAddOnsFlowContract$InputData = (TradingAddOnsFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(tradingAddOnsFlow.m2()).a().get(ubf.d.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 != null) {
                    return new ubf.e(((ubf.d) aVar3.b()).f278867r, tradingAddOnsFlow, tradingAddOnsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ubf.d.class, " is not found"));
            case 2:
                KProperty[] kPropertyArr = CashbackWithdrawMetalScreen.f65736d0;
                qji.b bVarQ2 = ((CashbackWithdrawMetalScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.di.CashbackWithdrawMetalScreenInjector");
                yc3.h hVar = (yc3.h) bVarQ2;
                return new yc3.e(hVar.f312486b, hVar.f312487c, (CashbackWithdrawMetalScreenContract$InputData) obj2);
            case 3:
                TravelHotelsRoomsSelectionAmendmentScreenContract$InputData travelHotelsRoomsSelectionAmendmentScreenContract$InputData = (TravelHotelsRoomsSelectionAmendmentScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionAmendmentScreen.Q;
                qji.b bVarU2 = ((TravelHotelsRoomsSelectionAmendmentScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.di.TravelHotelsRoomsSelectionAmendmentScreenInjector");
                p0 p0Var = (p0) bVarU2;
                g9g.d dVar = p0Var.f141776b;
                p0 p0Var2 = p0Var.f141777c;
                travelHotelsRoomsSelectionAmendmentScreenContract$InputData.getClass();
                return new g0(dVar, p0Var2, travelHotelsRoomsSelectionAmendmentScreenContract$InputData);
            case 4:
                SelectAlertTypeControllerContract$InputData selectAlertTypeControllerContract$InputData = (SelectAlertTypeControllerContract$InputData) obj2;
                KProperty[] kPropertyArr3 = SelectAlertTypeController.Q;
                phm.a aVar4 = (phm.a) ue0.e.j(((SelectAlertTypeController) obj3).m2()).a().get(ned.e.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ned.e.class, " is not found"));
                }
                Object objB = aVar5.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.di.SelectAlertTypeInjector");
                return new ned.b(((ned.e) objB).i, selectAlertTypeControllerContract$InputData);
            case 5:
                SharedFavouritesAssetTypeChooserScreen sharedFavouritesAssetTypeChooserScreen = (SharedFavouritesAssetTypeChooserScreen) obj3;
                SharedFavouritesAssetTypeChooserScreenContract$InputData sharedFavouritesAssetTypeChooserScreenContract$InputData = (SharedFavouritesAssetTypeChooserScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = SharedFavouritesAssetTypeChooserScreen.R;
                qji.b bVarQ22 = sharedFavouritesAssetTypeChooserScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.AssetTypeChooserScreenInjector");
                fgd.a aVar6 = (fgd.a) ((bgd.a) bVarQ22).c().S(sharedFavouritesAssetTypeChooserScreen);
                switch (aVar6.f135031a) {
                    case 0:
                        aVar6.f135033c = sharedFavouritesAssetTypeChooserScreenContract$InputData;
                        break;
                    default:
                        aVar6.f135033c = sharedFavouritesAssetTypeChooserScreenContract$InputData;
                        break;
                }
                return (fgd.b) aVar6.mo3800build();
            case 6:
                ((bgd.h) obj3).v2(new bgd.d((FavouritesAssetTypeKey) obj2));
                return Unit.f186387a;
            case 7:
                CryptoGiftAssetTransferInfoInputData cryptoGiftAssetTransferInfoInputData = (CryptoGiftAssetTransferInfoInputData) obj2;
                int i2 = CryptoGiftAssetTransferInfoScreen.U;
                phm.a aVar7 = (phm.a) ue0.e.j(((CryptoGiftAssetTransferInfoScreen) obj3).m2()).a().get(tg5.d.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 != null) {
                    return new tg5.f(((tg5.d) aVar8.b()).f271073l, cryptoGiftAssetTransferInfoInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", tg5.d.class, " is not found"));
            case 8:
                JuniorMigrationAssetDetailsScreen juniorMigrationAssetDetailsScreen = (JuniorMigrationAssetDetailsScreen) obj3;
                JuniorMigrationAssetDetailsScreenContract$InputData juniorMigrationAssetDetailsScreenContract$InputData = (JuniorMigrationAssetDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = JuniorMigrationAssetDetailsScreen.f0;
                phm.a aVar9 = (phm.a) ue0.e.j(juniorMigrationAssetDetailsScreen.m2()).a().get(sg8.c.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return new sg8.f(((sg8.c) aVar10.b()).o, juniorMigrationAssetDetailsScreen, juniorMigrationAssetDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
            case 9:
                bii.b bVar = (bii.b) obj3;
                s sVar = (s) obj2;
                y9 orCreateEmbeddedContentContainerView = bVar.f15504a.getOrCreateEmbeddedContentContainerView();
                View embeddedView = bVar.f15506c;
                if (embeddedView == null) {
                    throw new IllegalStateException("addContent must be called before hide");
                }
                orCreateEmbeddedContentContainerView.getClass();
                Intrinsics.checkNotNullParameter(embeddedView, "embeddedView");
                c6d.b.A(embeddedView).f209886a = mb.f209844a;
                efm.b bVarIgnoreElements = orCreateEmbeddedContentContainerView.f210125a.getHideInProgressObservable$ui_kit_components_release().filter(new s2(new k(26), 23)).take(1L).ignoreElements();
                ly2.d dVar2 = new ly2.d(embeddedView, 9, orCreateEmbeddedContentContainerView, sVar);
                bVarIgnoreElements.getClass();
                bVarIgnoreElements.d(new ofm.h(dVar2));
                return Unit.f186387a;
            case 10:
                qji.b bVarU22 = ((JuniorCardProfileScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.di.JuniorCardProfileScreenInjector");
                wi8.a aVar11 = (wi8.a) bVarU22;
                return new wi8.c(aVar11.f297837b, aVar11.f297838c, (JuniorCardProfileScreenContract.Input) obj2);
            case 11:
                CashBalanceInfoDialogInputData cashBalanceInfoDialogInputData = (CashBalanceInfoDialogInputData) obj2;
                int i3 = CashBalanceInfoDialogController.U;
                phm.a aVar12 = (phm.a) ue0.e.j(((CashBalanceInfoDialogController) obj3).m2()).a().get(vhh.a.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                }
                mkh.s sVar2 = ((mkh.s) ((u) aVar13.b())).l0;
                cashBalanceInfoDialogInputData.getClass();
                return new mkh.b(sVar2, cashBalanceInfoDialogInputData);
            case 12:
                com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c cVar = (com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c) obj2;
                ((Ref$ObjectRef) obj3).f186409a = cVar.l2(new com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.a(cVar, null), new ax9.d(1, cVar, com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c.class, "showGenericErrorAndQuit", "showGenericErrorAndQuit(Ljava/lang/Throwable;)Z", 0, 23));
                return Unit.f186387a;
            case 13:
                KProperty[] kPropertyArr6 = EsimMobilePlanPhoneNumberCancellationPreviewScreen.V;
                qji.b bVarU23 = ((EsimMobilePlanPhoneNumberCancellationPreviewScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.di.EsimMobilePlanPhoneNumberCancellationPreviewScreenInjector");
                k0 k0Var = (k0) bVarU23;
                return new h0(k0Var.f4310b, k0Var.f4311c, (EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData) obj2);
            case 14:
                q qVar = (q) obj3;
                qVar.T2(new n(qVar, (String) obj2, , 0), new yi5.b(27));
                return Unit.f186387a;
            case 15:
                PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = (PlaceOfBirthScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = PlaceOfBirthScreen.Q;
                phm.a aVar14 = (phm.a) ue0.e.j(((PlaceOfBirthScreen) obj3).m2()).a().get(um5.c.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 != null) {
                    return new um5.f(((um5.c) aVar15.b()).f281237h, placeOfBirthScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
            case 16:
                ChangeUserDetailsFlowContract$InputData changeUserDetailsFlowContract$InputData = (ChangeUserDetailsFlowContract$InputData) obj2;
                phm.a aVar16 = (phm.a) ue0.e.j(((ChangeUserDetailsFlow) obj3).m2()).a().get(fma.h.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new fma.c(((fma.h) aVar17.b()).v, changeUserDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fma.h.class, " is not found"));
            case 17:
                ((boc.h) obj3).b3((j) obj2);
                return Unit.f186387a;
            case 18:
                TaxMissingRationaleFlow taxMissingRationaleFlow = (TaxMissingRationaleFlow) obj3;
                TaxMissingRationaleFlowContract$InputData taxMissingRationaleFlowContract$InputData = (TaxMissingRationaleFlowContract$InputData) obj2;
                phm.a aVar18 = (phm.a) ue0.e.j(taxMissingRationaleFlow.m2()).a().get(o.class);
                b60.a aVar19 = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar19 != null) {
                    return new l(((o) aVar19.b()).f162885l, taxMissingRationaleFlow, taxMissingRationaleFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 19:
                KProperty[] kPropertyArr8 = CancellationRefundScreen.f75643b0;
                qji.b bVarQ23 = ((CancellationRefundScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.di.CancellationRefundScreenInjector");
                ql7.i iVar = (ql7.i) bVarQ23;
                return new ql7.j(iVar.f247327b, iVar.f247328c, (CancellationRefundScreenContract$InputData) obj2);
            case 20:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                if (((Image) obj3) instanceof LottieImage) {
                    lottieAnimationView.playAnimation();
                }
                return Unit.f186387a;
            case 21:
                CreditCardDetailsScreenContract$InputData creditCardDetailsScreenContract$InputData = (CreditCardDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = CreditCardDetailsScreen.Z;
                phm.a aVar20 = (phm.a) ue0.e.j(((CreditCardDetailsScreen) obj3).m2()).a().get(a3.class);
                b60.a aVar21 = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar21 != null) {
                    return new u0(((a3) aVar21.b()).Y, creditCardDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 22:
                UploadFilesListScreen uploadFilesListScreen = (UploadFilesListScreen) obj3;
                KProperty[] kPropertyArr10 = UploadFilesListScreen.c0;
                qji.b bVarQ24 = uploadFilesListScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.di.UploadFilesListScreenInjector");
                k1 k1Var = (k1) bVarQ24;
                return new m1(k1Var.f247369b, k1Var.f247370c, uploadFilesListScreen, (UploadFilesListScreenContract$InputData) obj2);
            case 23:
                m mVar = (m) obj3;
                File file = (File) obj2;
                mVar.x2(new b22.j(file, 1));
                mVar.f17945p.a(zhm.u.c(file));
                return Unit.f186387a;
            case 24:
                KProperty[] kPropertyArr11 = SalaryStatusScreen.S;
                qji.b bVarU24 = ((SalaryStatusScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.di.SalaryStatusScreenInjector");
                zpc.l lVar = (zpc.l) bVarU24;
                return new zpc.i(lVar.f324270b, lVar.f324271c, (SalaryStatusScreenContract$InputData) obj2);
            case 25:
                TransferTroubleshooterInputData transferTroubleshooterInputData = (TransferTroubleshooterInputData) obj2;
                KProperty[] kPropertyArr12 = TransferTroubleshooterScreen.f0;
                phm.a aVar22 = (phm.a) ue0.e.j(((TransferTroubleshooterScreen) obj3).m2()).a().get(wof.a.class);
                b60.a aVar23 = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar23 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
                }
                lpf.i iVar2 = ((lpf.i) ((y) aVar23.b())).o;
                transferTroubleshooterInputData.getClass();
                return new lpf.l(iVar2, transferTroubleshooterInputData);
            case 26:
                int i5 = MerchantBlockDisallowedController.T;
                qji.b bVarU25 = ((MerchantBlockDisallowedController) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.di.MerchantBlockDisallowedControllerInjector");
                tr2.i iVar3 = (tr2.i) bVarU25;
                return new tr2.p(iVar3.f273638b, iVar3.f273639c, (MerchantBlockDisallowedControllerContract$InputData) obj2);
            case 27:
                ReferralAccountScreen.Companion aVar24 = ReferralAccountScreen.INSTANCE;
                qji.b bVarU26 = ((ReferralAccountScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.referral_account.di.ReferralAccountScreenInjector");
                us2.h hVar2 = (us2.h) bVarU26;
                return new us2.e(hVar2.f282403b, hVar2.f282404c, (ReferralAccountScreenContract$InputData) obj2);
            case 28:
                GroupDetailsBillScreen groupDetailsBillScreen = (GroupDetailsBillScreen) obj3;
                GroupDetailsBillScreenContract$InputData groupDetailsBillScreenContract$InputData = (GroupDetailsBillScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = GroupDetailsBillScreen.f79404k0;
                qji.b bVarQ25 = groupDetailsBillScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_new.details_bill.di.GroupDetailsBillScreenInjector");
                kr9.o oVar = (kr9.o) ((ct9.a) bVarQ25).b().S(groupDetailsBillScreen);
                switch (oVar.f188779a) {
                    case 0:
                        oVar.d = groupDetailsBillScreenContract$InputData;
                        break;
                    default:
                        oVar.d = groupDetailsBillScreenContract$InputData;
                        break;
                }
                return (kr9.p) oVar.mo3800build();
            default:
                KProperty[] kPropertyArr14 = CreditCardBoletoPaymentAmountScreen.W;
                qji.b bVarU27 = ((CreditCardBoletoPaymentAmountScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.di.CreditCardBoletoPaymentAmountScreenInjector");
                x1 x1Var = (x1) bVarU27;
                return new m0(x1Var.f176433b, x1Var.f176434c, (CreditCardBoletoPaymentAmountContract$InputData) obj2);
        }
    }
}
