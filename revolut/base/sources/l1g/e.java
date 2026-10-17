package l1g;

import com.revolut.core.backend_flow.photo.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsContract$ModalStep;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsScreen;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.CardLimitsInfoScreen;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown.PaymentBreakdownScreen;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlow;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$ModalStep;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.MilestoneRewardsScreen;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import gim.i;
import java.time.Instant;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l0c.s;
import l43.m;
import l4g.l;
import l5i.q;
import l7j.j;
import l7j.t;
import l7j.z;
import l85.n;
import l97.p;
import lc0.b0;
import lc0.u;
import lc0.v;
import ldc.k;
import ldk.y;
import le3.w;
import nii.c0;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import org.joda.time.DateTime;
import skm.a2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f191537w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191537w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((f) this.f191537w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((TopupRequestDetailsScreen) this.f191537w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e((CardLimitsInfoScreen) this.f191537w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e((m) this.f191537w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e((com.revolut.feature.credit.application.plugins.impl.ui.address.flow.c) this.f191537w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e((l) this.f191537w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e((com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) this.f191537w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                e eVar8 = new e((InvestorUpdateHistoryFlow) this.f191537w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
            case 8:
                e eVar9 = new e((CommodityOrderReviewScreen) this.f191537w, continuation, 8);
                eVar9.v = obj2;
                return eVar9;
            case 9:
                e eVar10 = new e((n) this.f191537w, continuation, 9);
                eVar10.v = obj2;
                return eVar10;
            case 10:
                e eVar11 = new e((VaultInvitationConfirmationScreen) this.f191537w, continuation, 10);
                eVar11.v = obj2;
                return eVar11;
            case 11:
                e eVar12 = new e((l8e.l) this.f191537w, continuation, 11);
                eVar12.v = obj2;
                return eVar12;
            case 12:
                e eVar13 = new e((l8f.g) this.f191537w, continuation, 12);
                eVar13.v = obj2;
                return eVar13;
            case 13:
                e eVar14 = new e((l8k.i) this.f191537w, continuation, 13);
                eVar14.v = obj2;
                return eVar14;
            case 14:
                e eVar15 = new e((com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.c) this.f191537w, continuation, 14);
                eVar15.v = obj2;
                return eVar15;
            case 15:
                e eVar16 = new e((l97.n) this.f191537w, continuation, 15);
                eVar16.v = obj2;
                return eVar16;
            case 16:
                e eVar17 = new e((RequestCvvScreen) this.f191537w, continuation, 16);
                eVar17.v = obj2;
                return eVar17;
            case 17:
                e eVar18 = new e((CryptoEarningScreen) this.f191537w, continuation, 17);
                eVar18.v = obj2;
                return eVar18;
            case 18:
                e eVar19 = new e((com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) this.f191537w, continuation, 18);
                eVar19.v = obj2;
                return eVar19;
            case 19:
                e eVar20 = new e((lae.n) this.f191537w, continuation, 19);
                eVar20.v = obj2;
                return eVar20;
            case 20:
                e eVar21 = new e((b0) this.f191537w, continuation, 20);
                eVar21.v = obj2;
                return eVar21;
            case 21:
                e eVar22 = new e((ld4.n) this.f191537w, continuation, 21);
                eVar22.v = obj2;
                return eVar22;
            case 22:
                e eVar23 = new e((PaymentBreakdownScreen) this.f191537w, continuation, 22);
                eVar23.v = obj2;
                return eVar23;
            case 23:
                e eVar24 = new e((k) this.f191537w, continuation, 23);
                eVar24.v = obj2;
                return eVar24;
            case 24:
                e eVar25 = new e((ldg.f) this.f191537w, continuation, 24);
                eVar25.v = obj2;
                return eVar25;
            case 25:
                e eVar26 = new e((MilestoneRewardsScreen) this.f191537w, continuation, 25);
                eVar26.v = obj2;
                return eVar26;
            case 26:
                e eVar27 = new e((y) this.f191537w, continuation, 26);
                eVar27.v = obj2;
                return eVar27;
            case 27:
                e eVar28 = new e((le1.i) this.f191537w, continuation, 27);
                eVar28.v = obj2;
                return eVar28;
            case 28:
                e eVar29 = new e((w) this.f191537w, continuation, 28);
                eVar29.v = obj2;
                return eVar29;
            default:
                return new e((w) this.v, (AnalyticsAccount) this.f191537w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((n7j.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((le1.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((CategorisationFilter) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StakingModes.Manual manual;
        Instant instant;
        int i = this.u;
        int i2 = 4;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i3 = 5;
        int i5 = 12;
        int i6 = 14;
        int i21 = 23;
        int i22 = 0;
        int i32 = 6;
        int i33 = 26;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f191537w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) obj3).x2(new ku1.y(data, i5));
                return Unit.f186387a;
            case 1:
                ip0.y data2 = (ip0.y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l42.e eVar = (l42.e) ((TopupRequestDetailsScreen) obj3).R.getValue();
                Intrinsics.h(data2);
                com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar = (com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) eVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                ActionsView.Item item = data2.f167226b;
                Object obj4 = item.f58324n;
                TopupRequestDetailsContract$ModalStep topupRequestDetailsContract$ModalStep = obj4 instanceof TopupRequestDetailsContract$ModalStep ? (TopupRequestDetailsContract$ModalStep) obj4 : null;
                if (topupRequestDetailsContract$ModalStep == null) {
                    String str = data2.f167225a;
                    String str2 = item.f58316a;
                    String str3 = item.f58322l;
                    Object obj5 = data2.f167227c;
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.u(v0.a.m("Unsupported action: listId=", str, ", itemListId=", str2, ", itemTag="), str3, ", parcelType=", obj5 != null ? obj5.getClass().getSimpleName() : null));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    oki.h.v2(bVar.f62417t, topupRequestDetailsContract$ModalStep, bottom_dialog);
                }
                return Unit.f186387a;
            case 2:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) ((l43.f) ((CardLimitsInfoScreen) obj3).P.getValue())).I2(new l43.h(aVar3.f275445a));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) obj3;
                mVar.H2(mVar.f192059r, new ku1.y(data3, 25));
                return Unit.f186387a;
            case 4:
                String str4 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.address.flow.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.address.flow.c) obj3;
                cVar.H2(cVar.f66953r, new l3d.a(str4, 1));
                return Unit.f186387a;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) obj3;
                lVar.H2(lVar.f192123r, new ku1.y(data4, i33));
                return Unit.f186387a;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.checkin.a aVar9 = (com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) obj3;
                aVar9.H2(aVar9.f93291q, new ku1.y(data5, 29));
                return Unit.f186387a;
            case 7:
                String tabId = (String) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l7f.d dVar = (l7f.d) ((InvestorUpdateHistoryFlow) obj3).P.getValue();
                Intrinsics.h(tabId);
                com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b bVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b) dVar;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                bVar2.H2(bVar2.f91362r, new l3d.a(tabId, i2));
                return Unit.f186387a;
            case 8:
                n7j.f fVar = (n7j.f) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = ((CommodityOrderReviewScreen) obj3).e3();
                ChargeBreakdown fee2 = fVar.f213165a;
                z zVar = (z) jVarE3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(fee2, "fee");
                zVar.n2(new l34.a(zVar, fee2, objArr == true ? 1 : 0, 10), new whi.b(i32));
                return Unit.f186387a;
            case 9:
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) obj3;
                nVar.H2(nVar.u, new t(data6, 2));
                return Unit.f186387a;
            case 10:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l8e.l lVar2 = (l8e.l) ((VaultInvitationConfirmationScreen) obj3).Z.getValue();
                Intrinsics.h(clickData);
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj6 = clickData.d;
                NaviCommand naviCommand = obj6 instanceof NaviCommand ? (NaviCommand) obj6 : null;
                if (naviCommand != null) {
                    lVar2.C1(new BridgeDestination(naviCommand));
                }
                return Unit.f186387a;
            case 11:
                Data data7 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l8e.l) obj3).x2(new t(data7, 3));
                return Unit.f186387a;
            case 12:
                Data data8 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l8f.g gVar = (l8f.g) obj3;
                gVar.X2(gVar.o, new t(data8, i2));
                return Unit.f186387a;
            case 13:
                Data data9 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l8k.i) obj3).x2(new t(data9, i3));
                return Unit.f186387a;
            case 14:
                Data data10 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.c cVar2 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.c) obj3;
                cVar2.H2(cVar2.f62664r, new t(data10, i32));
                return Unit.f186387a;
            case 15:
                l97.n nVar2 = (l97.n) obj3;
                Data data11 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                o97.i iVar = (o97.i) data11.getContent();
                if (iVar != null) {
                    nVar2.H2(nVar2.G, new s(iVar, i21));
                    p pVar = new p(iVar, l97.n.I2(nVar2, iVar.f223108a), l97.n.I2(nVar2, iVar.f223109b));
                    j2 j2Var = nVar2.B;
                    j2Var.getClass();
                    j2Var.g(null, pVar);
                }
                return Unit.f186387a;
            case 16:
                String extractedValue = (String) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l9c.f fVar2 = (l9c.f) ((RequestCvvScreen) obj3).f84515a0.getValue();
                Intrinsics.h(extractedValue);
                l9c.k kVar = (l9c.k) fVar2;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                kVar.x2(new kzc.a(kVar, extractedValue, 28));
                return Unit.f186387a;
            case 17:
                String listId = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l9j.h hVarE3 = ((CryptoEarningScreen) obj3).d();
                Intrinsics.h(listId);
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar21 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) hVarE3;
                aVar21.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("INFO_MENU_ITEM_LIST_ID") && (manual = ((l9j.f) ((j2) aVar21.f99996x.f22677a).getValue()).f193254a.f88082b.f88088c.f88071a) != null) {
                    oki.h.v2(aVar21.f99995w, new CryptoEarningScreenContract$ModalStep.StakeRisksDisclaimerDialog(manual), bottom_dialog);
                }
                return Unit.f186387a;
            case 18:
                n1 n1Var = (n1) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar23 = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) obj3;
                    aVar23.l2(new kze.h(aVar23, objArr2 == true ? 1 : 0, i32), new yi5.b(i33));
                } else if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof m1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 19:
                Data data12 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lae.n nVar3 = (lae.n) obj3;
                nVar3.H2(nVar3.f193380t, new t(data12, 8));
                return Unit.f186387a;
            case 20:
                v vVar = (v) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b0 b0Var = (b0) obj3;
                if (vVar instanceof u) {
                    b0Var.X1(new y0(null, new c0(new TextLocalisedClause(R$string.cnp_selfie_upload_dialog_uploading, null, null, 14), null, null, true, null, false, false, null, 1902), false, 5));
                } else if (vVar instanceof lc0.s) {
                    b0Var.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.selfie_uploader_failed, null, null, 14), new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 5));
                } else {
                    if (!(vVar instanceof lc0.t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b0Var.s1();
                    Unit unit = Unit.f186387a;
                }
                if (vVar instanceof lc0.t) {
                    b0Var.C2(new lc0.m(((lc0.t) vVar).f193772a));
                }
                return Unit.f186387a;
            case 21:
                Data data13 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ld4.n nVar4 = (ld4.n) obj3;
                nVar4.H2(nVar4.f194032q, new t(data13, i5));
                return Unit.f186387a;
            case 22:
                ty0.a aVar27 = (ty0.a) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ldc.f fVar3 = (ldc.f) ((PaymentBreakdownScreen) obj3).N.getValue();
                Object obj7 = aVar27.d;
                k kVar2 = (k) fVar3;
                kVar2.getClass();
                if (obj7 instanceof x6c.a) {
                    kVar2.C1(new ExternalDestination.Browser(((x6c.a) obj7).f303062a, null));
                }
                return Unit.f186387a;
            case 23:
                Data data14 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar3 = (k) obj3;
                kVar3.H2(kVar3.f194069q, new t(data14, 13));
                return Unit.f186387a;
            case 24:
                Data data15 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ldg.f fVar4 = (ldg.f) obj3;
                fVar4.H2(fVar4.f194103q, new t(data15, i6));
                return Unit.f186387a;
            case 25:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y yVarE3 = ((MilestoneRewardsScreen) obj3).R2();
                Intrinsics.h(clickData2);
                yVarE3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj8 = clickData2.d;
                if (obj8 instanceof ldk.w) {
                    yVarE3.C2(new ldk.m(((ldk.w) obj8).f194180a));
                }
                return Unit.f186387a;
            case 26:
                Data data16 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y yVar = (y) obj3;
                cli.y yVar2 = yVar.f194187s;
                yVar.H2(yVar2, new t(data16, 17));
                a2 a2Var = yVar.f194186r;
                Continuation continuation = null;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                yVar.f194186r = null;
                xck.b bVar3 = (xck.b) data16.getContent();
                if (bVar3 != null && (instant = bVar3.f304144c) != null) {
                    long epochMilli = instant.toEpochMilli();
                    ((l80.f) yVar.f194184p).getClass();
                    long jCurrentTimeMillis = epochMilli - System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 0) {
                        yVar.H2(yVar2, new lbh.a(22));
                    } else {
                        yVar.H2(yVar2, new lbh.a(i21));
                        yVar.f194186r = yVar.l2(new eh1.g(6, jCurrentTimeMillis, yVar, continuation), new yi5.b(i33));
                    }
                }
                return Unit.f186387a;
            case 27:
                le1.c cVar3 = (le1.c) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                le1.i iVar2 = (le1.i) obj3;
                iVar2.H2(iVar2.f194445t, new laj.b(cVar3, 15));
                return Unit.f186387a;
            case 28:
                CategorisationFilter filter = (CategorisationFilter) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                q qVar = ((w) obj3).f194501a;
                Intrinsics.checkNotNullParameter(filter, "filter");
                return rd0.e.b(pd.b.r(((le3.p) qVar.f192300h).a(filter), new le3.j(qVar, i22)));
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                w wVar = (w) this.v;
                String str5 = (String) j6.a.k(String.class, wVar.f194503c, "categorization_earliest_start_date_" + ((AnalyticsAccount) obj3));
                if (str5 != null) {
                    return wVar.a(new DateTime(DateTime.parse(str5).getMillis()));
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, AnalyticsAccount analyticsAccount, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.v = wVar;
        this.f191537w = analyticsAccount;
    }
}
