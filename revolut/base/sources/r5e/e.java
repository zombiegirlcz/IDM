package r5e;

import aw0.e6;
import cli.y;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogScreen;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import com.revolut.feature.structured_note.details.impl.ui.common.PayoutScenarioMapper$CalculatorParcel;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreenContract$ModalStep;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreen;
import com.revolut.kompot.common.ModalDestination;
import com.youTransactor.uCube.rpc.Constants;
import i6f.o0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.k1;
import nii.l1;
import nii.n1;
import r3b.t;
import r4k.x;
import r6f.l;
import r8e.n;
import r9a.k;
import rcg.q;
import rga.r;
import rj7.m;
import rp0.l0;
import skm.e0;
import yhm.o;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f251588w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f251588w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((PayoutScenarioScreen) this.f251588w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a) this.f251588w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e((LoanSelectNewRepaymentDayScreen) this.f251588w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e((r6d.g) this.f251588w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e((l) this.f251588w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e((RenewedDialogScreen) this.f251588w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) this.f251588w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                return new e((com.revolut.feature.permissions.flow.b) this.v, (r7a.i) this.f251588w, continuation, 7);
            case 8:
                e eVar8 = new e((r7b.l) this.f251588w, continuation, 8);
                eVar8.v = obj2;
                return eVar8;
            case 9:
                return new e((NavBarWithToolbar) this.v, (AddDebtScreen) this.f251588w, continuation, 9);
            case 10:
                return new e((LargeActionButton) this.v, (AddDebtScreen) this.f251588w, continuation, 10);
            case 11:
                e eVar9 = new e((AddDebtScreen) this.f251588w, continuation, 11);
                eVar9.v = obj2;
                return eVar9;
            case 12:
                e eVar10 = new e((n) this.f251588w, continuation, 12);
                eVar10.v = obj2;
                return eVar10;
            case 13:
                e eVar11 = new e((r8f.f) this.f251588w, continuation, 13);
                eVar11.v = obj2;
                return eVar11;
            case 14:
                e eVar12 = new e((PixAuthorisationTransactionLimitScreen) this.f251588w, continuation, 14);
                eVar12.v = obj2;
                return eVar12;
            case 15:
                e eVar13 = new e((rb9.i) this.f251588w, continuation, 15);
                eVar13.v = obj2;
                return eVar13;
            case 16:
                e eVar14 = new e((ShippingTrackingScreen) this.f251588w, continuation, 16);
                eVar14.v = obj2;
                return eVar14;
            case 17:
                e eVar15 = new e((q) this.f251588w, continuation, 17);
                eVar15.v = obj2;
                return eVar15;
            case 18:
                e eVar16 = new e((re2.i) this.f251588w, continuation, 18);
                eVar16.v = obj2;
                return eVar16;
            case 19:
                e eVar17 = new e((rga.h) this.f251588w, continuation, 19);
                eVar17.v = obj2;
                return eVar17;
            case 20:
                e eVar18 = new e((r) this.f251588w, continuation, 20);
                eVar18.v = obj2;
                return eVar18;
            case 21:
                e eVar19 = new e((AllAccountsTransactionFiltersScreen) this.f251588w, continuation, 21);
                eVar19.v = obj2;
                return eVar19;
            case 22:
                e eVar20 = new e((prl.e) this.f251588w, continuation, 22);
                eVar20.v = obj2;
                return eVar20;
            case 23:
                e eVar21 = new e((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) this.f251588w, continuation, 23);
                eVar21.v = obj2;
                return eVar21;
            case 24:
                e eVar22 = new e((rhj.l) this.f251588w, continuation, 24);
                eVar22.v = obj2;
                return eVar22;
            case 25:
                e eVar23 = new e((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f251588w, continuation, 25);
                eVar23.v = obj2;
                return eVar23;
            case 26:
                e eVar24 = new e((ri4.n) this.f251588w, continuation, 26);
                eVar24.v = obj2;
                return eVar24;
            case 27:
                return new e((ri4.n) this.v, (it3.d) this.f251588w, continuation, 27);
            case 28:
                e eVar25 = new e((m) this.f251588w, continuation, 28);
                eVar25.v = obj2;
                return eVar25;
            default:
                e eVar26 = new e((rj9.j) this.f251588w, continuation, 29);
                eVar26.v = obj2;
                return eVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 25;
        int i3 = 14;
        int i5 = 6;
        int i6 = 28;
        int i21 = 1;
        int i22 = 26;
        int i32 = 0;
        Continuation continuation = null;
        Object obj3 = this.f251588w;
        switch (i) {
            case 0:
                PayoutScenarioMapper$CalculatorParcel parcel = (PayoutScenarioMapper$CalculatorParcel) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a aVar2 = (com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a) ((g) ((PayoutScenarioScreen) obj3).N.getValue());
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                oki.h.v2(aVar2.f88903r, new PayoutScenarioScreenContract$ModalStep.PayoutCalculator(parcel), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a aVar4 = (com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a) obj3;
                aVar4.H2(aVar4.f88902q, new t(data, 8));
                return Unit.f186387a;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r65.i iVar = (r65.i) ((LoanSelectNewRepaymentDayScreen) obj3).X.getValue();
                s6 model = (s6) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                iVar.x2(new l2c.l(iIntValue, i3));
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r6d.g gVar = (r6d.g) obj3;
                gVar.H2(gVar.f251671s, new t(data2, 9));
                return Unit.f186387a;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) obj3;
                lVar.X2(lVar.f251837p, new t(data3, 11));
                return Unit.f186387a;
            case 5:
                r73.b event = (r73.b) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r73.e eVar = (r73.e) ((RenewedDialogScreen) obj3).S.getValue();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (!Intrinsics.f(event, r73.b.f251976a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.C2(r73.a.f251975a);
                return Unit.f186387a;
            case 6:
                Data data4 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) obj3;
                bVar.H2(bVar.f67336q, new t(data4, 12));
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.permissions.flow.b) this.v).C2((r7a.i) obj3);
                return Unit.f186387a;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r7b.l lVar2 = (r7b.l) obj3;
                lVar2.H2(lVar2.f252076s, new t(data5, 13));
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0m.e.d((NavBarWithToolbar) this.v);
                ((AddDebtScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kli.c.c((LargeActionButton) this.v, false);
                r84.j jVar = (r84.j) ((r84.g) ((AddDebtScreen) obj3).X.getValue());
                jVar.getClass();
                jVar.l2(new qc8.b(jVar, continuation, i2), new yi5.b(i22));
                return Unit.f186387a;
            case 11:
                e6 e6Var = (e6) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(e6Var.f10293a, "id_value_amount") && e6Var.f10294b == 6) {
                    r84.j jVar2 = (r84.j) ((r84.g) ((AddDebtScreen) obj3).X.getValue());
                    jVar2.getClass();
                    jVar2.l2(new qc8.b(jVar2, continuation, i2), new yi5.b(i22));
                }
                return Unit.f186387a;
            case 12:
                Data data6 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) obj3).x2(new t(data6, 15));
                return Unit.f186387a;
            case 13:
                j6f.a aVar16 = (j6f.a) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r8f.f fVar = (r8f.f) obj3;
                fVar.H2(fVar.f252427p, new o0(aVar16, 3));
                return Unit.f186387a;
            case 14:
                String str = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(str, "REMOVE_MENU_ITEM_LIST_ID")) {
                    k kVarE3 = ((PixAuthorisationTransactionLimitScreen) obj3).e3();
                    kVarE3.getClass();
                    kVarE3.l2(new r9a.j(kVarE3, continuation, i21), new qi3.i(1, kVarE3, k.class, "handleApiError", "handleApiError(Ljava/lang/Throwable;)Z", 0, 19));
                }
                return Unit.f186387a;
            case 15:
                n1 n1Var = (n1) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                    rb9.i iVar2 = (rb9.i) obj3;
                    qi3.i iVar3 = new qi3.i(1, iVar2, rb9.i.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 23);
                    rb9.g gVar2 = new rb9.g(iVar2, null, 1);
                    rb9.f fVar2 = rb9.i.Companion;
                    ((rb9.i) obj3).l2(gVar2, iVar3);
                }
                return Unit.f186387a;
            case 16:
                String listId = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rbc.o oVarE3 = ((ShippingTrackingScreen) obj3).e3();
                Intrinsics.h(listId);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a aVar21 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) oVarE3;
                aVar21.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ID_TRACKING_THREE_DOTS")) {
                    l0 l0Var = aVar21.f84636q;
                    aVar21.f84635p.getClass();
                    aim.e eVarB = u.b();
                    eVarB.add(com.revolut.core.ui_kit.models.popup.a.a("EDIT_TRACKING_POP_UP_ACTION_ID", new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_actions_edit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                    eVarB.add(com.revolut.core.ui_kit.models.popup.a.a("DELETE_TRACKING_POP_UP_ACTION_ID", new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_actions_delete_tracking, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                    l0.f(l0Var, "ID_TRACKING_THREE_DOTS", zi0.c.d(u.a(eVarB)), null, null, 12);
                }
                return Unit.f186387a;
            case 17:
                Data data7 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                q qVar = (q) obj3;
                qVar.H2(qVar.f253265r, new t(data7, 20));
                return Unit.f186387a;
            case 18:
                dj0.d dVar = (dj0.d) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                re2.i iVar4 = (re2.i) obj3;
                iVar4.H2(iVar4.f253499s, new x(iVar4, dVar, i6));
                return Unit.f186387a;
            case 19:
                zn.f fVar3 = (zn.f) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rga.h hVar = (rga.h) obj3;
                hVar.d.b3(ifk.b.P(fVar3, hVar.f));
                return Unit.f186387a;
            case 20:
                zn.f fVar4 = (zn.f) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) obj3;
                rVar.d.b3(ifk.b.P(fVar4, rVar.f));
                return Unit.f186387a;
            case 21:
                String itemId = (String) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rgf.h hVarE3 = ((AllAccountsTransactionFiltersScreen) obj3).e3();
                Intrinsics.h(itemId);
                rgf.t tVar = (rgf.t) hVarE3;
                y yVar = tVar.f254174w;
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("SELECT_ALL_LIST_ID")) {
                    tVar.H2(yVar, new rg3.d(i5));
                } else if (itemId.equals("RESET_FILTER_LIST_ID")) {
                    tVar.H2(yVar, new rg3.d(7));
                }
                return Unit.f186387a;
            case 22:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                prl.e eVar2 = (prl.e) obj3;
                e0.C(coroutineScope, rd0.e.i(), null, new rh8.u(eVar2, continuation, i32), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new rh8.u(eVar2, continuation, i21), 2);
                return e0.C(coroutineScope, rd0.e.i(), null, new rh8.u(eVar2, continuation, 2), 2);
            case 23:
                Data data8 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar29 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) obj3;
                aVar29.H2(aVar29.f94344r, new t(data8, i22));
                return Unit.f186387a;
            case 24:
                Data data9 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rhj.l lVar3 = (rhj.l) obj3;
                lVar3.H2(lVar3.v, new t(data9, 27));
                return Unit.f186387a;
            case 25:
                List list = (List) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) obj3).f103139y = (CheckoutOrder) d0.d0(list);
                return Unit.f186387a;
            case 26:
                Data data10 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ri4.n) obj3).x2(new t(data10, i6));
                return Unit.f186387a;
            case 27:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ri4.n) this.v).v2(new ri4.g((it3.d) obj3));
                return Unit.f186387a;
            case 28:
                Data data11 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) obj3).x2(new t(data11, 29));
                return Unit.f186387a;
            default:
                Data data12 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rj9.j jVar3 = (rj9.j) obj3;
                jVar3.H2(jVar3.f254642t, new rj9.i(data12, i32));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251588w = obj2;
    }
}
