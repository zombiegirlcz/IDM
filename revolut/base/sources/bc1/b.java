package bc1;

import android.app.Application;
import androidx.core.text.BidiFormatter;
import blh.n;
import blh.q;
import bmm.u;
import bo8.b0;
import bp0.y;
import br4.g0;
import bt0.h;
import bt9.m;
import com.google.android.gms.common.internal.Preconditions;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlow;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedController;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.transfer_info.CryptoGiftAssetTransferInfoScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlow;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlow;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.feature.wealth.ui.impl.cash_balance.info.CashBalanceInfoDialogController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.o;
import l9.l;
import mii.k;
import ql7.j;
import ql7.m1;
import qua.p;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14360b;

    public /* synthetic */ b(bi0.g gVar, MsBarcodeDetectorSettings msBarcodeDetectorSettings) {
        this.f14359a = 6;
        this.f14360b = msBarcodeDetectorSettings;
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v161, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v169, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v195, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String value;
        List list;
        int i = 1;
        int i2 = 0;
        Continuation continuation = null;
        switch (this.f14359a) {
            case 0:
                return (c) ((xb1.h) ((CardReaderConnectionFlow) this.f14360b).R.getValue()).d.get();
            case 1:
                return (bcf.a) ((ubf.e) ((TradingAddOnsFlow) this.f14360b).P.getValue()).f278877h.get();
            case 2:
                return (oo0.d) ((be7.c) this.f14360b).f14694a.get();
            case 3:
                SharedFavouritesAssetTypeChooserScreen sharedFavouritesAssetTypeChooserScreen = (SharedFavouritesAssetTypeChooserScreen) this.f14360b;
                KProperty[] kPropertyArr = SharedFavouritesAssetTypeChooserScreen.R;
                fgd.b bVar = (fgd.b) sharedFavouritesAssetTypeChooserScreen.P.getValue();
                switch (bVar.f135034a) {
                    case 0:
                        return (bgd.f) bVar.i.get();
                    default:
                        return (bgd.f) bVar.i.get();
                }
            case 4:
                CryptoGiftAssetTransferInfoScreen cryptoGiftAssetTransferInfoScreen = (CryptoGiftAssetTransferInfoScreen) this.f14360b;
                int i3 = CryptoGiftAssetTransferInfoScreen.U;
                return (bh5.e) ((tg5.f) cryptoGiftAssetTransferInfoScreen.S.getValue()).f271082b.get();
            case 5:
                JuniorMigrationAssetDetailsScreen juniorMigrationAssetDetailsScreen = (JuniorMigrationAssetDetailsScreen) this.f14360b;
                KProperty[] kPropertyArr2 = JuniorMigrationAssetDetailsScreen.f0;
                return (bh8.i) ((sg8.f) juniorMigrationAssetDetailsScreen.U.getValue()).f262629g.get();
            case 6:
                MsBarcodeDetectorSettings msBarcodeDetectorSettings = (MsBarcodeDetectorSettings) this.f14360b;
                bh0.a mainFormat = msBarcodeDetectorSettings.f51393a;
                List additionalFormats = msBarcodeDetectorSettings.f51394b;
                Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
                Intrinsics.checkNotNullParameter(additionalFormats, "additionalFormats");
                try {
                    int iM = l.m(mainFormat);
                    ArrayList arrayList = new ArrayList(w.t(additionalFormats, 10));
                    Iterator it8 = additionalFormats.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(Integer.valueOf(l.m((bh0.a) it8.next())));
                    }
                    int[] iArrC1 = d0.c1(arrayList);
                    int[] iArrCopyOf = Arrays.copyOf(iArrC1, iArrC1.length);
                    if (iArrCopyOf != null) {
                        while (i2 < iArrCopyOf.length) {
                            iM |= iArrCopyOf[i2];
                            i2++;
                        }
                    }
                    eh.a aVar = new eh.a(iM);
                    Preconditions.checkNotNull(aVar, "You must provide a valid BarcodeScannerOptions.");
                    return ((hh.e) ch.h.c().a(hh.e.class)).a(aVar);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 7:
                return (bj8.f) ((wi8.c) ((cj8.a) ((JuniorCardProfileScreen) this.f14360b).S.getValue())).f297844c.get();
            case 8:
                ((com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) this.f14360b).X1(new k("DIALOG_ID_COPIED_TO_CLIPBOARD", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
            case 9:
                o oVarB = bk0.e.i.b((CharSequence) ((bk0.e) this.f14360b).f16210b.getVersionName().invoke());
                if (oVarB == null || (value = oVarB.getValue()) == null) {
                    throw new IllegalStateException("Wrong version name format");
                }
                return value;
            case 10:
                CashBalanceInfoDialogController cashBalanceInfoDialogController = (CashBalanceInfoDialogController) this.f14360b;
                int i5 = CashBalanceInfoDialogController.U;
                return (bkh.c) ((mkh.b) cashBalanceInfoDialogController.S.getValue()).f206314c.get();
            case 11:
                bl0.a aVar2 = ((bl0.f) this.f14360b).f16451h;
                aVar2.getClass();
                return Boolean.valueOf(Intrinsics.f(aVar2.f16446a.getPackageName(), Application.getProcessName()));
            case 12:
                n nVar = (n) this.f14360b;
                List listK = v.k(Integer.valueOf(com.revolut.retail.wealth.resources.R$string.search_block_all_etfs_name), Integer.valueOf(com.revolut.retail.wealth.resources.R$string.search_block_all_etps_name));
                ArrayList arrayList2 = new ArrayList(w.t(listK, 10));
                Iterator it9 = listK.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(a10.b.o(((Number) it9.next()).intValue(), null, null, 14, nVar.f16675a));
                }
                return arrayList2;
            case 13:
                return ((q) this.f14360b).f16684a.b(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.search_block_all_stocks_name, null, null, 14)).toString();
            case 14:
                EsimMobilePlanPhoneNumberCancellationPreviewScreen esimMobilePlanPhoneNumberCancellationPreviewScreen = (EsimMobilePlanPhoneNumberCancellationPreviewScreen) this.f14360b;
                KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberCancellationPreviewScreen.V;
                return (bmj.f) ((afj.h0) esimMobilePlanPhoneNumberCancellationPreviewScreen.T.getValue()).f4268c.get();
            case 15:
                u uVar = (u) this.f14360b;
                uVar.getClass();
                try {
                    uVar.f16976x.O8(2, 0, false);
                    break;
                } catch (IOException e2) {
                    bmm.b bVar2 = bmm.b.PROTOCOL_ERROR;
                    uVar.d(bVar2, bVar2, e2);
                }
                return Unit.f186387a;
            case 16:
                return (bna.a) ((fma.c) ((ChangeUserDetailsFlow) this.f14360b).P.getValue()).f136049b.get();
            case 17:
                com.revolut.feature.apm.bills.bpay.impl.flow.a aVar3 = (com.revolut.feature.apm.bills.bpay.impl.flow.a) this.f14360b;
                co1.b bVar3 = aVar3.f61201q;
                BPayFlowContract$InputData bPayFlowContract$InputData = aVar3.o;
                pn1.a entryPoint = bPayFlowContract$InputData.f61192a;
                p pVar = bPayFlowContract$InputData.f61194c;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                int i6 = co1.a.f25485a[entryPoint.ordinal()];
                if (i6 != 1 && i6 != 2) {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (pVar == null || (list = pVar.Z) == null) {
                        return new ScreenConfiguration(0);
                    }
                    boolean zContains = list.contains(fva.a.CHANGE_DATE);
                    boolean zContains2 = list.contains(fva.a.CHANGE_RECURRENCY);
                    boolean zContains3 = list.contains(fva.a.CHANGE_FREQUENCY);
                    return new ScreenConfiguration(true, zContains || zContains2 || zContains3, list.contains(fva.a.CHANGE_AMOUNT), list.contains(fva.a.CHANGE_POCKET_ID), zContains3, zContains, zContains2);
                }
                return new ScreenConfiguration(0);
            case 18:
                b0 b0Var = (b0) this.f14360b;
                yji.l.a1(b0Var, b0Var.X1(new k("DIALOG_ID_COPIED_TO_CLIPBOARD", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 19:
                return BidiFormatter.getInstance(((s80.b) ((y) this.f14360b).f17532c).b());
            case 20:
                CancellationRefundScreen cancellationRefundScreen = (CancellationRefundScreen) this.f14360b;
                KProperty[] kPropertyArr4 = CancellationRefundScreen.f75643b0;
                return (bq7.h) ((j) cancellationRefundScreen.Y.getValue()).f247340c.get();
            case 21:
                com.revolut.sso.impl.ui.signin_sessions_flow.a aVar4 = (com.revolut.sso.impl.ui.signin_sessions_flow.a) this.f14360b;
                if (!aVar4.v) {
                    oki.h.D2(aVar4.f106748w);
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.credit.card.impl.ui.details.a aVar5 = (com.revolut.feature.credit.card.impl.ui.details.a) this.f14360b;
                aVar5.n2(new g0(aVar5, continuation, i), new whi.b(6));
                return Unit.f186387a;
            case 23:
                UploadFilesListScreen uploadFilesListScreen = (UploadFilesListScreen) this.f14360b;
                KProperty[] kPropertyArr5 = UploadFilesListScreen.c0;
                return (br7.i) ((m1) uploadFilesListScreen.X.getValue()).f247397t.get();
            case 24:
                TransferTroubleshooterScreen transferTroubleshooterScreen = (TransferTroubleshooterScreen) this.f14360b;
                KProperty[] kPropertyArr6 = TransferTroubleshooterScreen.f0;
                return (brf.f) ((lpf.l) transferTroubleshooterScreen.Y.getValue()).f.get();
            case 25:
                MerchantBlockDisallowedController merchantBlockDisallowedController = (MerchantBlockDisallowedController) this.f14360b;
                int i21 = MerchantBlockDisallowedController.T;
                return (bs2.a) ((tr2.p) merchantBlockDisallowedController.R.getValue()).f273682c.get();
            case 26:
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar6 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) this.f14360b;
                yji.l.i2(aVar6, new PaymentsGroupsBillsSelectionFlow(new PaymentsGroupsBillsSelectionFlowContract$InputData(aVar6.J2().f18116a, f0.f322471a)), null, new bs9.y(aVar6, i2), 1);
                return Unit.f186387a;
            case 27:
                bt0.q qVar = (bt0.q) this.f14360b;
                qVar.j(qVar.k, qVar.f18245g);
                qVar.k = -1;
                dgm.e eVar = qVar.f56724a;
                if (eVar != null) {
                    eVar.onNext(h.a.f18234a);
                }
                return Unit.f186387a;
            case 28:
                GroupDetailsBillScreen groupDetailsBillScreen = (GroupDetailsBillScreen) this.f14360b;
                KProperty[] kPropertyArr7 = GroupDetailsBillScreen.f79404k0;
                kr9.p pVar2 = (kr9.p) groupDetailsBillScreen.f79406b0.getValue();
                switch (pVar2.f188782a) {
                    case 0:
                        return (m) pVar2.f188787j.get();
                    default:
                        return (m) pVar2.f188787j.get();
                }
            default:
                ManualTransferScreen manualTransferScreen = (ManualTransferScreen) this.f14360b;
                KProperty[] kPropertyArr8 = ManualTransferScreen.f92464k0;
                return (buf.k) ((ytf.d) manualTransferScreen.Y.getValue()).L.get();
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f14359a = i;
        this.f14360b = obj2;
    }
}
