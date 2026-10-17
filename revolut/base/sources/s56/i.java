package s56;

import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.views.numpad.PosNumpadView;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.feature.apm.payid.impl.screen.createpayid.otp.OtpScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreen;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$ModalStep;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.api.model.UserDeviceAddress;
import com.revolut.feature.devicemanagement.impl.ui.details.DeviceDetailsController;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.CobrandedCardsAccountCreationScreen;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchController;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.wealth.commodity_additional_services.api.navigation.CommodityAdditionalServicesDestination;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import m9d.w0;
import nii.l1;
import nii.n1;
import sdl.d1;
import sdl.r1;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f259957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f259957w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i((DeFiSendAmountScreen) this.f259957w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i((s5h.b) this.f259957w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i((LoanSelectNewRepaymentDayV2Screen) this.f259957w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) this.f259957w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i((CobrandedCardsAccountCreationScreen) this.f259957w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i((s6b.m) this.f259957w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            case 6:
                i iVar7 = new i((s6e.b0) this.f259957w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i((s6e.l0) this.f259957w, continuation, 7);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i((MarginStatusScreen) this.f259957w, continuation, 8);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                i iVar10 = new i((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a) this.f259957w, continuation, 9);
                iVar10.v = obj2;
                return iVar10;
            case 10:
                i iVar11 = new i((LoanToggleBackupCardScreen) this.f259957w, continuation, 10);
                iVar11.v = obj2;
                return iVar11;
            case 11:
                i iVar12 = new i((s85.k) this.f259957w, continuation, 11);
                iVar12.v = obj2;
                return iVar12;
            case 12:
                i iVar13 = new i((DeviceDetailsController) this.f259957w, continuation, 12);
                iVar13.v = obj2;
                return iVar13;
            case 13:
                i iVar14 = new i((s86.l) this.f259957w, continuation, 13);
                iVar14.v = obj2;
                return iVar14;
            case 14:
                i iVar15 = new i((s8d.l) this.f259957w, continuation, 14);
                iVar15.v = obj2;
                return iVar15;
            case 15:
                i iVar16 = new i((s8f.g) this.f259957w, continuation, 15);
                iVar16.v = obj2;
                return iVar16;
            case 16:
                return new i((s8j.c) this.v, (StakingProduct) this.f259957w, continuation, 16);
            case 17:
                i iVar17 = new i((s94.b) this.f259957w, continuation, 17);
                iVar17.v = obj2;
                return iVar17;
            case 18:
                i iVar18 = new i((s9b.p) this.f259957w, continuation, 18);
                iVar18.v = obj2;
                return iVar18;
            case 19:
                i iVar19 = new i((OtpScreen) this.f259957w, continuation, 19);
                iVar19.v = obj2;
                return iVar19;
            case 20:
                i iVar20 = new i((com.revolut.feature.subscriptions.impl.payment_balance_picker.b) this.f259957w, continuation, 20);
                iVar20.v = obj2;
                return iVar20;
            case 21:
                i iVar21 = new i((PixQrCodeChangeAmountScreen) this.f259957w, continuation, 21);
                iVar21.v = obj2;
                return iVar21;
            case 22:
                i iVar22 = new i((RevolutPayMerchantsSearchController) this.f259957w, continuation, 22);
                iVar22.v = obj2;
                return iVar22;
            case 23:
                i iVar23 = new i((scc.j) this.f259957w, continuation, 23);
                iVar23.v = obj2;
                return iVar23;
            case 24:
                i iVar24 = new i((k18.c) this.f259957w, continuation, 24);
                iVar24.v = obj2;
                return iVar24;
            case 25:
                i iVar25 = new i((scl.j) this.f259957w, continuation, 25);
                iVar25.v = obj2;
                return iVar25;
            case 26:
                i iVar26 = new i((sd3.l) this.f259957w, continuation, 26);
                iVar26.v = obj2;
                return iVar26;
            case 27:
                i iVar27 = new i((SaleScreen) this.f259957w, continuation, 27);
                iVar27.v = obj2;
                return iVar27;
            case 28:
                return new i((PosNumpadView) this.v, (SaleScreen) this.f259957w, continuation, 28);
            default:
                i iVar28 = new i((se1.i) this.f259957w, continuation, 29);
                iVar28.v = obj2;
                return iVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((DeFiQuoteAmountLimitError) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((d5h.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((HyperTextClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i) create((scl.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        int i = this.u;
        int i2 = 0;
        int i3 = 20;
        int i5 = 27;
        int i6 = 2;
        int i21 = 6;
        int i22 = 1;
        int i32 = 26;
        Continuation continuation = null;
        Object obj3 = this.f259957w;
        switch (i) {
            case 0:
                DeFiQuoteAmountLimitError error = (DeFiQuoteAmountLimitError) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) ((DeFiSendAmountScreen) obj3).d();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                oki.h.v2(bVar.A, new DeFiSendAmountScreenContract$ModalStep.AmountLimitError(error), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 1:
                d5h.b bVar2 = (d5h.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(bVar2 instanceof d5h.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                gjh.e eVar = ((s5h.b) obj3).d;
                eVar.A2(new CommodityAdditionalServicesDestination(((CommodityPositionDetailsController) ((d5h.a) eVar.o)).K.f99790a));
                return Unit.f186387a;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s65.h hVarE3 = ((LoanSelectNewRepaymentDayV2Screen) obj3).R2();
                s6 model = (s6) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar4 = (com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) hVarE3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                aVar4.H2(aVar4.f70414r, new l2c.l(iIntValue, 18));
                aVar4.f70413q.a();
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar6 = (com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) obj3;
                aVar6.H2(aVar6.f70414r, new rtl.s(data, i5));
                return Unit.f186387a;
            case 4:
                HyperTextClickData clickData = (HyperTextClickData) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s6b.m mVar = (s6b.m) ((CobrandedCardsAccountCreationScreen) obj3).R2();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                HyperTextTarget hyperTextTarget = clickData.f74762a;
                if (hyperTextTarget instanceof HyperTextTarget.Link) {
                    mVar.l2(new s09.c(mVar, hyperTextTarget, continuation, 15), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s6b.m mVar2 = (s6b.m) obj3;
                cli.y yVar = mVar2.f260210r;
                mVar2.H2(yVar, new rtl.s(data2, 28));
                r5b.e eVar2 = (r5b.e) data2.getContent();
                if (eVar2 != null && ((s6b.g) ((j2) yVar.f22677a).getValue()).f260197a.isEmpty()) {
                    HashMap map = new HashMap(((s6b.g) ((j2) yVar.f22677a).getValue()).f260197a);
                    for (r5b.f fVar : eVar2.d) {
                        String str = fVar.f251570c;
                        if (str != null) {
                            map.put(fVar.f251568a, str);
                        }
                    }
                    mVar2.H2(yVar, new b4d.a(map, 1));
                }
                return Unit.f186387a;
            case 6:
                Pair pair2 = (Pair) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new h6e.i(a0.d.s("https://revolut.me/", ((do3.n) pair2.f186385a).f, "/pocket/", ((h6e.j) pair2.f186386b).f149646a));
            case 7:
                List subaccounts = (List) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s6e.j0 j0Var = ((s6e.l0) obj3).f260297a;
                Intrinsics.checkNotNullParameter(subaccounts, "subaccounts");
                List list = subaccounts;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((Subaccount) it8.next()).getF88959a());
                }
                pcd.s[] sVarArr = (pcd.s[]) arrayList.toArray(new pcd.s[0]);
                return j0Var.a((pcd.s[]) Arrays.copyOf(sVarArr, sVarArr.length));
            case 8:
                String listId = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s6h.f fVar2 = (s6h.f) ((MarginStatusScreen) obj3).S.getValue();
                Intrinsics.h(listId);
                com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a aVar12 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a) fVar2;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("INFO_MENU_ITEM_LIST_ID")) {
                    oki.h.v2(aVar12.f95477r, MarginStatusScreenContract$ModalStep.MarginStatusInfo.f95474a, ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 9:
                Data data3 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a aVar14 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a) obj3;
                aVar14.H2(aVar14.f95476q, new rtl.s(data3, 29));
                return Unit.f186387a;
            case 10:
                Object obj4 = this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s85.k kVar = (s85.k) ((LoanToggleBackupCardScreen) obj3).X.getValue();
                koi.j item = (koi.j) obj4;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                kVar.n2(new s09.c(kVar, item, continuation, i3), new whi.b(i21));
                return Unit.f186387a;
            case 11:
                Pair pair3 = (Pair) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s85.k) obj3).x2(new w0((Data) pair3.f186385a, (Data) pair3.f186386b, 16));
                return Unit.f186387a;
            case 12:
                w8 model2 = (w8) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s86.g gVar = (s86.g) ((DeviceDetailsController) obj3).Q.getValue();
                Intrinsics.h(model2);
                s86.l lVar = (s86.l) gVar;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                UserDevice userDevice = (UserDevice) zi0.c.I(((s86.f) ((j2) lVar.f260915s.f22677a).getValue()).f260905a);
                dj3.a aVar18 = lVar.f260913q;
                UserDeviceAddress userDeviceAddress = userDevice.f71924q;
                lVar.C1(zh9.u0.b(((ri3.a) aVar18).a(userDeviceAddress.e, userDeviceAddress.f)));
                return Unit.f186387a;
            case 13:
                Data data4 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s86.l lVar2 = (s86.l) obj3;
                lVar2.H2(lVar2.f260915s, new s86.k(data4, i2));
                return Unit.f186387a;
            case 14:
                List list2 = (List) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s8d.l) obj3).x2(new s78.n(list2, i22));
                return Unit.f186387a;
            case 15:
                Data data5 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s8f.g gVar2 = (s8f.g) obj3;
                gVar2.H2(gVar2.f260989r, new s86.k(data5, i22));
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s8j.c) this.v).f261053a.G(Boolean.TRUE, s8j.c.a((StakingProduct) obj3), wim.z.d(kotlin.jvm.internal.o0.b(Boolean.TYPE)));
                return Unit.f186387a;
            case 17:
                s94.b bVar3 = (s94.b) obj3;
                n1 n1Var = (n1) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    bVar3.l2(new s64.a(bVar3, continuation, 9), new yi5.b(i32));
                } else {
                    bVar3.K2(null);
                }
                return Unit.f186387a;
            case 18:
                Data data6 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s9b.p pVar = (s9b.p) obj3;
                pVar.H2(pVar.f261170x, new s86.k(data6, i6));
                return Unit.f186387a;
            case 19:
                String str2 = (String) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sa2.g gVar3 = (sa2.g) ((OtpScreen) obj3).N.getValue();
                Intrinsics.h(str2);
                ((sa2.r) gVar3).J2(new sa2.h(str2));
                return Unit.f186387a;
            case 20:
                Data data7 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.subscriptions.impl.payment_balance_picker.b bVar4 = (com.revolut.feature.subscriptions.impl.payment_balance_picker.b) obj3;
                bVar4.H2(bVar4.f89232s, new s31.a(data7, bVar4, i3));
                return Unit.f186387a;
            case 21:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sba.h hVar = (sba.h) ((PixQrCodeChangeAmountScreen) obj3).P.getValue();
                String newAmount = charSequence.toString();
                hVar.getClass();
                Intrinsics.checkNotNullParameter(newAmount, "newAmount");
                w80.b bVar5 = hVar.o;
                xi0.b.Companion.getClass();
                hVar.H2(hVar.f261525p, new nxc.a(bVar5.b(newAmount, xi0.b.D.f306286a), 11));
                return Unit.f186387a;
            case 22:
                String query = (String) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                scc.e eVar3 = (scc.e) ((RevolutPayMerchantsSearchController) obj3).O.getValue();
                Intrinsics.h(query);
                scc.j jVar = (scc.j) eVar3;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = jVar.f261713t;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, query));
                return Unit.f186387a;
            case 23:
                String str3 = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                scc.j jVar2 = (scc.j) obj3;
                jVar2.H2(jVar2.u, new rvc.k(str3, 21));
                return Unit.f186387a;
            case 24:
                scl.d dVar = (scl.d) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list3 = (List) p.a.j(ldl.a.class, KTypeProjection.INSTANCE, List.class, (ue0.c) ((k18.c) obj3).f180141c, yoj.b.z(dVar));
                if (list3 != null) {
                    return ta6.a.Q(list3);
                }
                return null;
            case 25:
                UUID uuid = (UUID) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d1 d1Var = (d1) j6.a.k(d1.class, ((scl.j) obj3).f261773b, scl.i.a(scl.j.Companion, uuid));
                if (d1Var != null) {
                    return r1.d(d1Var);
                }
                return null;
            case 26:
                Data data8 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sd3.l) obj3).x2(new s86.k(data8, 3));
                return Unit.f186387a;
            case 27:
                dj0.d amount = (dj0.d) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                se1.e eVarZ2 = ((SaleScreen) obj3).T2();
                Intrinsics.h(amount);
                se1.i iVar = (se1.i) eVarZ2;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                if (!Intrinsics.f(((se1.d) iVar.t2()).f262080a, amount)) {
                    iVar.x2(new ar3.a(i5, amount));
                    iVar.z2(amount, ((se1.d) iVar.t2()).f262081b, ((se1.d) iVar.t2()).e);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PosNumpadView) this.v).setAmount(0L);
                se1.i iVar2 = (se1.i) ((SaleScreen) obj3).T2();
                iVar2.getClass();
                iVar2.l2(new se1.h(iVar2, continuation, i6), new yi5.b(i32));
                return Unit.f186387a;
            default:
                xi0.b bVar6 = (xi0.b) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                se1.i iVar3 = (se1.i) obj3;
                if (!Intrinsics.f(((se1.d) iVar3.t2()).f262080a.f115083b, bVar6)) {
                    iVar3.l2(new sbb.w(iVar3, bVar6, continuation, i21), new yi5.b(i32));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259957w = obj2;
    }
}
