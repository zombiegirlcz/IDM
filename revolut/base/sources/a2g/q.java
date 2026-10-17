package a2g;

import aqh.v;
import ccb.c0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerController;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$UiData;
import fb7.i0;
import gcg.e0;
import hu1.a0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Continuation continuation, oki.h hVar, boolean z) {
        super(2, continuation);
        this.u = i;
        this.v = z;
        this.f851w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((r) this.f851w, continuation, 0);
                qVar.v = ((Boolean) obj2).booleanValue();
                return qVar;
            case 1:
                return new q(1, continuation, (com.revolut.feature.apm.multibanco.impl.ui.home.area.b) this.f851w, this.v);
            case 2:
                q qVar2 = new q((com.revolut.feature.travel.miles.impl.ui.screen.home.e) this.f851w, continuation, 2);
                qVar2.v = ((Boolean) obj2).booleanValue();
                return qVar2;
            case 3:
                q qVar3 = new q((v) this.f851w, continuation, 3);
                qVar3.v = ((Boolean) obj2).booleanValue();
                return qVar3;
            case 4:
                q qVar4 = new q((ProfileScannerScreen) this.f851w, continuation, 4);
                qVar4.v = ((Boolean) obj2).booleanValue();
                return qVar4;
            case 5:
                q qVar5 = new q((c0) this.f851w, continuation, 5);
                qVar5.v = ((Boolean) obj2).booleanValue();
                return qVar5;
            case 6:
                return new q((com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f851w, this.v, continuation);
            case 7:
                q qVar6 = new q((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f851w, continuation, 7);
                qVar6.v = ((Boolean) obj2).booleanValue();
                return qVar6;
            case 8:
                q qVar7 = new q((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f851w, continuation, 8);
                qVar7.v = ((Boolean) obj2).booleanValue();
                return qVar7;
            case 9:
                q qVar8 = new q((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) this.f851w, continuation, 9);
                qVar8.v = ((Boolean) obj2).booleanValue();
                return qVar8;
            case 10:
                q qVar9 = new q((e4j.c) this.f851w, continuation, 10);
                qVar9.v = ((Boolean) obj2).booleanValue();
                return qVar9;
            case 11:
                q qVar10 = new q((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f851w, continuation, 11);
                qVar10.v = ((Boolean) obj2).booleanValue();
                return qVar10;
            case 12:
                q qVar11 = new q((com.revolut.feature.global_markets.impl.ui.flow.index_details.b) this.f851w, continuation, 12);
                qVar11.v = ((Boolean) obj2).booleanValue();
                return qVar11;
            case 13:
                q qVar12 = new q((e94.h) this.f851w, continuation, 13);
                qVar12.v = ((Boolean) obj2).booleanValue();
                return qVar12;
            case 14:
                q qVar13 = new q((com.revolut.feature.travel.miles.impl.ui.screen.main.e) this.f851w, continuation, 14);
                qVar13.v = ((Boolean) obj2).booleanValue();
                return qVar13;
            case 15:
                q qVar14 = new q((eke.g) this.f851w, continuation, 15);
                qVar14.v = ((Boolean) obj2).booleanValue();
                return qVar14;
            case 16:
                q qVar15 = new q((ekg.g) this.f851w, continuation, 16);
                qVar15.v = ((Boolean) obj2).booleanValue();
                return qVar15;
            case 17:
                q qVar16 = new q((eob.h) this.f851w, continuation, 17);
                qVar16.v = ((Boolean) obj2).booleanValue();
                return qVar16;
            case 18:
                q qVar17 = new q((com.revolut.feature.call_security_info.impl.ui.call_detection.b) this.f851w, continuation, 18);
                qVar17.v = ((Boolean) obj2).booleanValue();
                return qVar17;
            case 19:
                q qVar18 = new q((com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) this.f851w, continuation, 19);
                qVar18.v = ((Boolean) obj2).booleanValue();
                return qVar18;
            case 20:
                q qVar19 = new q((i0) this.f851w, continuation, 20);
                qVar19.v = ((Boolean) obj2).booleanValue();
                return qVar19;
            case 21:
                q qVar20 = new q((CryptoQrScannerController) this.f851w, continuation, 21);
                qVar20.v = ((Boolean) obj2).booleanValue();
                return qVar20;
            case 22:
                q qVar21 = new q((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) this.f851w, continuation, 22);
                qVar21.v = ((Boolean) obj2).booleanValue();
                return qVar21;
            case 23:
                return new q(23, continuation, (g62.l) this.f851w, this.v);
            case 24:
                q qVar22 = new q((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f851w, continuation, 24);
                qVar22.v = ((Boolean) obj2).booleanValue();
                return qVar22;
            case 25:
                q qVar23 = new q((e0) this.f851w, continuation, 25);
                qVar23.v = ((Boolean) obj2).booleanValue();
                return qVar23;
            case 26:
                q qVar24 = new q((h43.s) this.f851w, continuation, 26);
                qVar24.v = ((Boolean) obj2).booleanValue();
                return qVar24;
            case 27:
                q qVar25 = new q((hu1.e0) this.f851w, continuation, 27);
                qVar25.v = ((Boolean) obj2).booleanValue();
                return qVar25;
            case 28:
                q qVar26 = new q((com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f851w, continuation, 28);
                qVar26.v = ((Boolean) obj2).booleanValue();
                return qVar26;
            default:
                q qVar27 = new q((com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) this.f851w, continuation, 29);
                qVar27.v = ((Boolean) obj2).booleanValue();
                return qVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((q) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return ((q) create(bool2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                return ((q) create(bool3, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                return ((q) create(bool4, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                return ((q) create(bool5, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                Boolean bool6 = (Boolean) obj2;
                bool6.booleanValue();
                return ((q) create(bool6, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                Boolean bool7 = (Boolean) obj2;
                bool7.booleanValue();
                return ((q) create(bool7, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                Boolean bool8 = (Boolean) obj2;
                bool8.booleanValue();
                return ((q) create(bool8, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                Boolean bool9 = (Boolean) obj2;
                bool9.booleanValue();
                return ((q) create(bool9, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                Boolean bool10 = (Boolean) obj2;
                bool10.booleanValue();
                return ((q) create(bool10, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                Boolean bool11 = (Boolean) obj2;
                bool11.booleanValue();
                return ((q) create(bool11, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                Boolean bool12 = (Boolean) obj2;
                bool12.booleanValue();
                return ((q) create(bool12, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                Boolean bool13 = (Boolean) obj2;
                bool13.booleanValue();
                return ((q) create(bool13, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                Boolean bool14 = (Boolean) obj2;
                bool14.booleanValue();
                return ((q) create(bool14, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                Boolean bool15 = (Boolean) obj2;
                bool15.booleanValue();
                return ((q) create(bool15, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                Boolean bool16 = (Boolean) obj2;
                bool16.booleanValue();
                return ((q) create(bool16, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                Boolean bool17 = (Boolean) obj2;
                bool17.booleanValue();
                return ((q) create(bool17, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                Boolean bool18 = (Boolean) obj2;
                bool18.booleanValue();
                return ((q) create(bool18, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                Boolean bool19 = (Boolean) obj2;
                bool19.booleanValue();
                return ((q) create(bool19, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                Boolean bool20 = (Boolean) obj2;
                bool20.booleanValue();
                return ((q) create(bool20, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                Boolean bool21 = (Boolean) obj2;
                bool21.booleanValue();
                return ((q) create(bool21, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                Boolean bool22 = (Boolean) obj2;
                bool22.booleanValue();
                return ((q) create(bool22, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                Boolean bool23 = (Boolean) obj2;
                bool23.booleanValue();
                return ((q) create(bool23, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                Boolean bool24 = (Boolean) obj2;
                bool24.booleanValue();
                return ((q) create(bool24, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                Boolean bool25 = (Boolean) obj2;
                bool25.booleanValue();
                return ((q) create(bool25, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                Boolean bool26 = (Boolean) obj2;
                bool26.booleanValue();
                return ((q) create(bool26, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool27 = (Boolean) obj2;
                bool27.booleanValue();
                return ((q) create(bool27, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 22;
        int i3 = 28;
        int i5 = 1;
        int i6 = 2;
        int i21 = 26;
        int i22 = 0;
        Continuation continuation = null;
        Object obj3 = this.f851w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) obj3).x2(new p(z, i22));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (this.v) {
                    com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar = (com.revolut.feature.apm.multibanco.impl.ui.home.area.b) obj3;
                    bVar.H2(bVar.A, new a82.l(i22));
                }
                return Unit.f186387a;
            case 2:
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.home.e) obj3;
                eVar.H2(eVar.z, new p(z3, 10));
                return Unit.f186387a;
            case 3:
                boolean z4 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar = (v) obj3;
                vVar.H2(vVar.f8461s, new p(z4, 13));
                return Unit.f186387a;
            case 4:
                boolean z6 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z6) {
                    xu.f fVar = ((ProfileScannerScreen) obj3).S;
                    if (fVar == null) {
                        Intrinsics.r("cameraDelegate");
                        throw null;
                    }
                    xu.d.a(fVar);
                }
                return Unit.f186387a;
            case 5:
                boolean z11 = this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0Var = (c0) obj3;
                MoneyBoxAmountInputScreenContract$UiData moneyBoxAmountInputScreenContract$UiData = ((ccb.i) c0Var.t2()).f22997m;
                boolean z12 = c0Var.f22974p.f82768c.d && z11;
                Clause submitButtonText = moneyBoxAmountInputScreenContract$UiData.f82770a;
                Clause navBarTitle = moneyBoxAmountInputScreenContract$UiData.f82771b;
                boolean z29 = moneyBoxAmountInputScreenContract$UiData.f82772c;
                boolean z31 = moneyBoxAmountInputScreenContract$UiData.e;
                Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
                Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
                c0Var.x2(new c69.v(new MoneyBoxAmountInputScreenContract$UiData(submitButtonText, navBarTitle, z29, z12, z31), 25));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar8 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) obj3;
                aVar8.C2(cea.i.f23447a);
                aVar8.F.getClass();
                return aVar8.X1(new mii.k("ID_SUCCESS_REVOKE", new TextLocalisedClause(R$string.open_banking_consents_revoke_permission_success_toast_title, null, null, 14), this.v ? new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.open_banking_consents_revoke_permission_success_see_report, null, null, 14) : null, null, null, 24));
            case 7:
                boolean z41 = this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tab.accounts.impl.ui.tab.d) obj3).S2(new p(z41, i3));
                return Unit.f186387a;
            case 8:
                boolean z49 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return z49 ? com.revolut.trading.orders.ui.invest.placement.screens.edit.e.I2((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) obj3) : vkm.i.f290039a;
            case 9:
                boolean z54 = this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z54) {
                    ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) obj3).o.b();
                }
                return Unit.f186387a;
            case 10:
                boolean z74 = this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e4j.c cVar = (e4j.c) obj3;
                cVar.H2(cVar.f122568q, new cmc.a(z74, 11));
                return Unit.f186387a;
            case 11:
                boolean z83 = this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) obj3).x2(new cmc.a(z83, 12));
                return Unit.f186387a;
            case 12:
                boolean z89 = this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.global_markets.impl.ui.flow.index_details.b bVar2 = (com.revolut.feature.global_markets.impl.ui.flow.index_details.b) obj3;
                bVar2.H2(bVar2.f74594t, new cmc.a(z89, 15));
                return Unit.f186387a;
            case 13:
                boolean z96 = this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e94.h hVar = (e94.h) obj3;
                hVar.H2(hVar.f123907r, new cmc.a(z96, 16));
                return Unit.f186387a;
            case 14:
                boolean z100 = this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) obj3;
                eVar2.H2(eVar2.D, new cmc.a(z100, 18));
                return Unit.f186387a;
            case 15:
                boolean z101 = this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((eke.g) obj3).f127035l.c(new cmc.a(z101, 19));
                return Unit.f186387a;
            case 16:
                boolean z102 = this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ekg.g) obj3).e.d(ekg.g.p(z102));
                return Unit.f186387a;
            case 17:
                eob.h hVar2 = (eob.h) obj3;
                boolean z103 = this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z103) {
                    od0.i.Companion.getClass();
                    return zi0.c.i(od0.i.f224256b);
                }
                akg.n nVarA = ijb.a.a((ijb.a) hVar2.f127895c, ncd.h.PERSONAL, null, null, null, 14);
                elb.b bVar3 = (elb.b) hVar2.d;
                w4l.j jVar = w4l.j.f294644c;
                return nim.a.v(u0.i(nVarA, bVar3.a(jVar), vkm.q.q(nim.a.v(((ang.f) hVar2.e).j(jVar), new elb.a(21)))), new elb.a(hVar2, i2));
            case 18:
                boolean z104 = this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.call_security_info.impl.ui.call_detection.b bVar4 = (com.revolut.feature.call_security_info.impl.ui.call_detection.b) obj3;
                bVar4.H2(bVar4.f64376t, new cmc.a(z104, 20));
                return Unit.f186387a;
            case 19:
                boolean z105 = this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar22 = (com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) obj3;
                aVar22.H2(aVar22.getState(), new f0m.c(aVar22.f65106r.a(aVar22.o, z105), i6));
                return Unit.f186387a;
            case 20:
                boolean z106 = this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) obj3;
                i0Var.H2(i0Var.v, new cmc.a(z106, i2));
                return Unit.f186387a;
            case 21:
                boolean z107 = this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z107) {
                    xu.f fVar2 = ((CryptoQrScannerController) obj3).R;
                    if (fVar2 == null) {
                        Intrinsics.r("cameraDelegate");
                        throw null;
                    }
                    xu.d.a(fVar2);
                }
                return Unit.f186387a;
            case 22:
                boolean z108 = this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar26 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) obj3;
                aVar26.l2(new ald.m(aVar26, z108, continuation, 17), new yi5.b(i21));
                return Unit.f186387a;
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (this.v) {
                    g62.l lVar = (g62.l) obj3;
                    lVar.H2(lVar.f140833y, new g3e.h(i3));
                }
                return Unit.f186387a;
            case 24:
                boolean z109 = this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) obj3;
                eVar3.H2(eVar3.f82590w, new g7b.q(z109, i5));
                return Unit.f186387a;
            case 25:
                boolean z110 = this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0Var = (e0) obj3;
                e0Var.H2(e0Var.E, new g7b.q(z110, i6));
                return Unit.f186387a;
            case 26:
                boolean z111 = this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h43.s sVar = (h43.s) obj3;
                sVar.H2(sVar.B, new g7b.q(z111, 5));
                return Unit.f186387a;
            case 27:
                boolean z112 = this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z112) {
                    hu1.e0 e0Var2 = (hu1.e0) obj3;
                    a2 a2Var = e0Var2.G;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    e0Var2.n2(new a0(e0Var2, continuation, 4), new whi.b(6));
                }
                return Unit.f186387a;
            case 28:
                boolean z113 = this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) obj3;
                dVar.H2(dVar.M, new g7b.q(z113, i21));
                return Unit.f186387a;
            default:
                boolean z114 = this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar34 = (com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) obj3;
                aVar34.H2(aVar34.u, new g7b.q(z114, 29));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f851w = aVar;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f851w = obj2;
    }
}
