package rf9;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import grl.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rnd.v0;
import sxi.q;
import t73.c3;
import t73.d3;
import ts1.u;
import uqh.l0;
import uv1.d0;
import v2e.x;
import vkm.j2;
import x15.y;
import xyh.t;
import yhm.o;
import yna.c1;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f253722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Continuation continuation, yji.l lVar, boolean z) {
        super(2, continuation);
        this.u = i;
        this.v = z;
        this.f253722w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h((l) this.f253722w, continuation, 0);
                hVar.v = ((Boolean) obj2).booleanValue();
                return hVar;
            case 1:
                h hVar2 = new h((v0) this.f253722w, continuation, 1);
                hVar2.v = ((Boolean) obj2).booleanValue();
                return hVar2;
            case 2:
                h hVar3 = new h((gjh.e) this.f253722w, continuation, 2);
                hVar3.v = ((Boolean) obj2).booleanValue();
                return hVar3;
            case 3:
                return new h((q) this.f253722w, this.v, continuation);
            case 4:
                h hVar4 = new h((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f253722w, continuation, 4);
                hVar4.v = ((Boolean) obj2).booleanValue();
                return hVar4;
            case 5:
                h hVar5 = new h(continuation, (d3) this.f253722w, 5);
                hVar5.v = ((Boolean) obj2).booleanValue();
                return hVar5;
            case 6:
                h hVar6 = new h((com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) this.f253722w, continuation, 6);
                hVar6.v = ((Boolean) obj2).booleanValue();
                return hVar6;
            case 7:
                h hVar7 = new h((tqh.i) this.f253722w, continuation, 7);
                hVar7.v = ((Boolean) obj2).booleanValue();
                return hVar7;
            case 8:
                return new h(8, continuation, (u) this.f253722w, this.v);
            case 9:
                h hVar8 = new h((com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) this.f253722w, continuation, 9);
                hVar8.v = ((Boolean) obj2).booleanValue();
                return hVar8;
            case 10:
                h hVar9 = new h((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f253722w, continuation, 10);
                hVar9.v = ((Boolean) obj2).booleanValue();
                return hVar9;
            case 11:
                h hVar10 = new h((l0) this.f253722w, continuation, 11);
                hVar10.v = ((Boolean) obj2).booleanValue();
                return hVar10;
            case 12:
                return new h(12, continuation, (d0) this.f253722w, this.v);
            case 13:
                h hVar11 = new h((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f253722w, continuation, 13);
                hVar11.v = ((Boolean) obj2).booleanValue();
                return hVar11;
            case 14:
                h hVar12 = new h((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f253722w, continuation, 14);
                hVar12.v = ((Boolean) obj2).booleanValue();
                return hVar12;
            case 15:
                return new h(15, continuation, (vh2.n) this.f253722w, this.v);
            case 16:
                h hVar13 = new h((vmh.k) this.f253722w, continuation, 16);
                hVar13.v = ((Boolean) obj2).booleanValue();
                return hVar13;
            case 17:
                h hVar14 = new h((com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) this.f253722w, continuation, 17);
                hVar14.v = ((Boolean) obj2).booleanValue();
                return hVar14;
            case 18:
                h hVar15 = new h((com.revolut.feature.tab.crypto.impl.ui.settings.a) this.f253722w, continuation, 18);
                hVar15.v = ((Boolean) obj2).booleanValue();
                return hVar15;
            case 19:
                h hVar16 = new h(continuation, (x25.c) this.f253722w, 19);
                hVar16.v = ((Boolean) obj2).booleanValue();
                return hVar16;
            case 20:
                h hVar17 = new h(continuation, (x97.e) this.f253722w, 20);
                hVar17.v = ((Boolean) obj2).booleanValue();
                return hVar17;
            case 21:
                h hVar18 = new h((com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) this.f253722w, continuation, 21);
                hVar18.v = ((Boolean) obj2).booleanValue();
                return hVar18;
            case 22:
                h hVar19 = new h((com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a) this.f253722w, continuation, 22);
                hVar19.v = ((Boolean) obj2).booleanValue();
                return hVar19;
            case 23:
                h hVar20 = new h((xpk.m) this.f253722w, continuation, 23);
                hVar20.v = ((Boolean) obj2).booleanValue();
                return hVar20;
            case 24:
                h hVar21 = new h(continuation, (xsd.i) this.f253722w, 24);
                hVar21.v = ((Boolean) obj2).booleanValue();
                return hVar21;
            case 25:
                h hVar22 = new h((t) this.f253722w, continuation, 25);
                hVar22.v = ((Boolean) obj2).booleanValue();
                return hVar22;
            case 26:
                h hVar23 = new h((PlanPageScreen) this.f253722w, continuation, 26);
                hVar23.v = ((Boolean) obj2).booleanValue();
                return hVar23;
            case 27:
                h hVar24 = new h((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) this.f253722w, continuation, 27);
                hVar24.v = ((Boolean) obj2).booleanValue();
                return hVar24;
            case 28:
                h hVar25 = new h((c1) this.f253722w, continuation, 28);
                hVar25.v = ((Boolean) obj2).booleanValue();
                return hVar25;
            default:
                h hVar26 = new h(continuation, (gsd.c) this.f253722w, 29);
                hVar26.v = ((Boolean) obj2).booleanValue();
                return hVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((h) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return ((h) create(bool2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                return ((h) create(bool3, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                return ((h) create(bool4, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                return ((h) create(bool5, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                Boolean bool6 = (Boolean) obj2;
                bool6.booleanValue();
                return ((h) create(bool6, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                Boolean bool7 = (Boolean) obj2;
                bool7.booleanValue();
                return ((h) create(bool7, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                Boolean bool8 = (Boolean) obj2;
                bool8.booleanValue();
                return ((h) create(bool8, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                Boolean bool9 = (Boolean) obj2;
                bool9.booleanValue();
                return ((h) create(bool9, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                Boolean bool10 = (Boolean) obj2;
                bool10.booleanValue();
                return ((h) create(bool10, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                Boolean bool11 = (Boolean) obj2;
                bool11.booleanValue();
                return ((h) create(bool11, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                Boolean bool12 = (Boolean) obj2;
                bool12.booleanValue();
                return ((h) create(bool12, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                Boolean bool13 = (Boolean) obj2;
                bool13.booleanValue();
                return ((h) create(bool13, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                Boolean bool14 = (Boolean) obj2;
                bool14.booleanValue();
                return ((h) create(bool14, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                Boolean bool15 = (Boolean) obj2;
                bool15.booleanValue();
                return ((h) create(bool15, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                Boolean bool16 = (Boolean) obj2;
                bool16.booleanValue();
                return ((h) create(bool16, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                Boolean bool17 = (Boolean) obj2;
                bool17.booleanValue();
                return ((h) create(bool17, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                Boolean bool18 = (Boolean) obj2;
                bool18.booleanValue();
                return ((h) create(bool18, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                Boolean bool19 = (Boolean) obj2;
                bool19.booleanValue();
                return ((h) create(bool19, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                Boolean bool20 = (Boolean) obj2;
                bool20.booleanValue();
                return ((h) create(bool20, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                Boolean bool21 = (Boolean) obj2;
                bool21.booleanValue();
                return ((h) create(bool21, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                Boolean bool22 = (Boolean) obj2;
                bool22.booleanValue();
                return ((h) create(bool22, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                Boolean bool23 = (Boolean) obj2;
                bool23.booleanValue();
                return ((h) create(bool23, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                Boolean bool24 = (Boolean) obj2;
                bool24.booleanValue();
                return ((h) create(bool24, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                Boolean bool25 = (Boolean) obj2;
                bool25.booleanValue();
                return ((h) create(bool25, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool26 = (Boolean) obj2;
                bool26.booleanValue();
                return ((h) create(bool26, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        int i = this.u;
        int i2 = 26;
        int i3 = 6;
        int i5 = 9;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        int i6 = 17;
        int i21 = 10;
        int i22 = 1;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        int i32 = 2;
        Object obj3 = this.f253722w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j2 j2Var = ((l) obj3).f253732q;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, m.a((m) value, null, null, null, z, 7)));
                return Unit.f186387a;
            case 1:
                v0 v0Var = (v0) obj3;
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (z3) {
                    return xam.a.h(new rnd.l0(v0Var, continuation, i22), ((nj8.n) v0Var.d).k(null, hVar));
                }
                return zi0.c.i(f0.f322471a);
            case 2:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                gjh.e eVar = (gjh.e) obj3;
                eVar.X2((vki.a) eVar.f144298p, new rk.b(z4, 4));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                q qVar = (q) obj3;
                String str = qVar.f266517r.f99106a;
                qVar.l2(new l10.m(qVar, this.v, str, (Continuation) null, 22), new sx2.g(i6));
                return Unit.f186387a;
            case 4:
                boolean z6 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) obj3;
                gVar.H2(gVar.f65434h0, new rk.b(z6, i21));
                return Unit.f186387a;
            case 5:
                boolean z11 = this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return z11 ? nim.a.v(xh9.a.c(((d3) obj3).i), c3.f268436a) : new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
            case 6:
                boolean z12 = this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) obj3;
                cVar.H2(cVar.J, new rk.b(z12, 13));
                if (z12) {
                    return rd0.e.b(((yua.q) cVar.f72071r).r(cVar.o.f72063a));
                }
                return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
            case 7:
                boolean z29 = this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((tqh.i) obj3).f3(new rk.b(z29, i6));
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (this.v) {
                    ((u) obj3).x2(new tpi.g(i6));
                }
                return Unit.f186387a;
            case 9:
                boolean z31 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar11 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) obj3;
                aVar11.H2(aVar11.M, new rk.b(z31, 23));
                return Unit.f186387a;
            case 10:
                boolean z41 = this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) obj3;
                bVar.H2(bVar.B, new t9f.n(bVar, z41, 7));
                return Unit.f186387a;
            case 11:
                boolean z49 = this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l0 l0Var = (l0) obj3;
                l0Var.X2(l0Var.f282162r, new rk.b(z49, i2));
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (this.v) {
                    d0 d0Var = (d0) obj3;
                    d0Var.H2(d0Var.B, new uv1.c(i32));
                }
                return Unit.f186387a;
            case 13:
                boolean z54 = this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3;
                dVar.H2(dVar.K, new rk.b(z54, 29));
                return Unit.f186387a;
            case 14:
                boolean z74 = this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar17 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) obj3;
                aVar17.H2(aVar17.J, new x(z74, i3));
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (this.v) {
                    vh2.n nVar = (vh2.n) obj3;
                    nVar.H2(nVar.f289291y, new vgk.g(i32));
                }
                return Unit.f186387a;
            case 16:
                boolean z83 = this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                vmh.k kVar = (vmh.k) obj3;
                kVar.X2(kVar.f290594p, new x(z83, i5));
                return Unit.f186387a;
            case 17:
                boolean z89 = this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar2 = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) obj3;
                bVar2.H2(bVar2.C, new x(z89, i21));
                return Unit.f186387a;
            case 18:
                boolean z96 = this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.tab.crypto.impl.ui.settings.a aVar22 = (com.revolut.feature.tab.crypto.impl.ui.settings.a) obj3;
                aVar22.H2(aVar22.F, new x(z96, 15));
                return Unit.f186387a;
            case 19:
                boolean z100 = this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return z100 ? nim.a.v(((x25.c) obj3).o(), x25.b.f302507a) : new go.g(new Data(y.f302306a, null, false, 6, null), 2);
            case 20:
                boolean z101 = this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return z101 ? rd0.e.b(nim.a.w(((ti9.g) ((x97.e) obj3).d).o(hVar), x97.d.f303588a)) : new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
            case 21:
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) obj3;
                boolean z102 = this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (z102) {
                    gVar2.o.b();
                    gVar2.f60745y.k(Unit.f186387a);
                    gVar2.f60744x.k(Boolean.TRUE);
                }
                return Unit.f186387a;
            case 22:
                boolean z103 = this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar27 = (com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a) obj3;
                aVar27.H2(aVar27.f96172t, new x(z103, 24));
                return Unit.f186387a;
            case 23:
                boolean z104 = this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((xpk.m) obj3).x2(new x(z104, i2));
                return Unit.f186387a;
            case 24:
                xsd.i iVar = (xsd.i) obj3;
                boolean z105 = this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (z105) {
                    return boh.f.e(nim.a.u(new xsd.a(i32, i22, continuation), u0.m(u0.i(rd0.e.b(iVar.f308458a.J(personal, hVar)), rd0.e.b(iVar.f308460c.d(hVar)), iVar.d.e(r2.TOTAL_WEALTH)), u0.m(iVar.f.i(w4l.h.f294642c), iVar.f308461g.j(hVar)))), new ro7.n(iVar, 27));
                }
                return new go.g(new Data(null, null, false, 6, null), 2);
            case 25:
                boolean z106 = this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar2 = (com.revolut.feature_crypto_order_flow.impl.exchange.d) ((t) obj3).f309741m;
                dVar2.getClass();
                dVar2.n2(new mt8.b(dVar2, z106, continuation, i21), new whi.b(i3));
                return Unit.f186387a;
            case 26:
                PlanPageScreen planPageScreen = (PlanPageScreen) obj3;
                boolean z107 = this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (z107) {
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar32 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) planPageScreen.d();
                    enk.o oVar = aVar32.f103612t;
                    String planId = aVar32.o.f103603a;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    oVar.f127846b.k(new enk.c(planId));
                } else {
                    if (z107) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar33 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) planPageScreen.d();
                    enk.o oVar2 = aVar33.f103612t;
                    String planId2 = aVar33.o.f103603a;
                    oVar2.getClass();
                    Intrinsics.checkNotNullParameter(planId2, "planId");
                    oVar2.f127846b.k(new enk.b(planId2));
                }
                return Unit.f186387a;
            case 27:
                boolean z108 = this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar35 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) obj3;
                aVar35.H2(aVar35.f103614x, new xyh.n(z108, i21));
                return Unit.f186387a;
            case 28:
                boolean z109 = this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((c1) obj3).x2(new xyh.n(z109, 12));
                return Unit.f186387a;
            default:
                gsd.c cVar2 = (gsd.c) obj3;
                xh9.a aVar37 = (xh9.a) cVar2.f146392b;
                boolean z110 = this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!z110) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                return boh.f.e(nim.a.u(new xsd.a(i32, i5, continuation), u0.m(u0.i(rd0.e.b(((wsg.n) cVar2.e).J(personal, hVar)), ((ti9.g) aVar37).k(hVar), rd0.e.b(zi0.c.G(((ti9.g) aVar37).n(), f0.f322471a))), ((ti9.h) cVar2.f146393c).e(r2.TOTAL_WEALTH))), new yrb.n(cVar2, i22));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253722w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.u = i;
        this.f253722w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f253722w = qVar;
        this.v = z;
    }
}
