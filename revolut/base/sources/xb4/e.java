package xb4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPromoCodeService;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreen;
import com.revolut.sso.api.models.UserInfoFromApp;
import com.revolut.sso.impl.network.services.UserActivityService;
import et6.u1;
import gim.i;
import ivf.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jkl.m4;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.c0;
import skm.a2;
import skm.k0;
import skm.p0;
import vkm.j2;
import vkm.q;
import wm3.j;
import xjl.u;
import xkf.y1;
import xkf.z1;
import xl1.m;
import xmc.d0;
import xmc.f0;
import xo8.h0;
import xr3.k;
import xv4.p;
import y07.l;
import y2e.s;
import y5b.e0;
import y66.o;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f303981w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303981w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) this.f303981w, continuation, 0);
            case 1:
                return new e((com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b) this.f303981w, continuation, 1);
            case 2:
                return new e((com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f303981w, continuation, 2);
            case 3:
                return new e((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c) this.f303981w, continuation, 3);
            case 4:
                return new e((u) this.f303981w, continuation, 4);
            case 5:
                return new e((z1) this.f303981w, continuation, 5);
            case 6:
                return new e((m) this.f303981w, continuation, 6);
            case 7:
                return new e((f0) this.f303981w, continuation, 7);
            case 8:
                return new e((xni.g) this.f303981w, continuation, 8);
            case 9:
                return new e((h0) this.f303981w, continuation, 9);
            case 10:
                return new e((xqc.h) this.f303981w, continuation, 10);
            case 11:
                return new e((k) this.f303981w, continuation, 11);
            case 12:
                return new e((p) this.f303981w, continuation, 12);
            case 13:
                return new e((xvf.m) this.f303981w, continuation, 13);
            case 14:
                return new e((com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.b) this.f303981w, continuation, 14);
            case 15:
                return new e((com.revolut.feature.staking.impl.unstake.v2.a) this.f303981w, continuation, 15);
            case 16:
                return new e((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) this.f303981w, continuation, 16);
            case 17:
                return new e((com.revolut.feature.selfserve.sot.impl.ui.flow.e) this.f303981w, continuation, 17);
            case 18:
                return new e((com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c) this.f303981w, continuation, 18);
            case 19:
                return new e((l) this.f303981w, continuation, 19);
            case 20:
                return new e((com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d) this.f303981w, continuation, 20);
            case 21:
                return new e((s) this.f303981w, continuation, 21);
            case 22:
                return new e((y44.m) this.f303981w, continuation, 22);
            case 23:
                return new e((y48.f) this.f303981w, continuation, 23);
            case 24:
                return new e((com.revolut.feature.revolut_x_balances.impl.fiat.a) this.f303981w, continuation, 24);
            case 25:
                return new e((RatingsDetailsScreen) this.f303981w, continuation, 25);
            case 26:
                return new e((e0) this.f303981w, continuation, 26);
            case 27:
                return new e((y5g.k) this.f303981w, continuation, 27);
            case 28:
                return new e((com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f303981w, continuation, 28);
            default:
                return new e((o) this.f303981w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v124, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Data data;
        int i = this.u;
        int i2 = 2;
        int i3 = 6;
        int i5 = 19;
        int i6 = 15;
        int i21 = 13;
        int i22 = 3;
        int i32 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object obj3 = this.f303981w;
        int i33 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) obj3;
                com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.b bVar = new com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.b(cVar, null);
                this.v = 1;
                Object objB = pu7.a.B(cVar.k, "load configuration", bVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b bVar2 = (com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b) obj3;
                    com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.a aVar3 = new com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar3 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) obj3;
                    xec.e0 e0Var = new xec.e0(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, e0Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c cVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c) obj3;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.b bVar4 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.b(cVar2, null);
                this.v = 1;
                Object objP2 = cVar2.p2(this, bVar4);
                return objP2 == aVar5 ? aVar5 : objP2;
            case 4:
                u uVar = (u) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    rqk.m mVar = uVar.d;
                    this.v = 1;
                    obj2 = mVar.a(false, this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i92 != 1) {
                        if (i92 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String str = ((UserInfoFromApp) obj2).f105997b;
                String str2 = str != null ? str : null;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                UserActivityService userActivityService = uVar.e;
                String str3 = ((rqk.k) uVar.f306584c).f256593p;
                m4 m4Var = new m4(str2);
                this.v = 2;
                if (userActivityService.record(str3, m4Var, this) == aVar6) {
                    return aVar6;
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z1 z1Var = (z1) obj3;
                y1 y1Var = new y1(z1Var, objArr == true ? 1 : 0, i33);
                this.v = 1;
                Object objB2 = pu7.a.B(z1Var.e, "CLICK_TASK_ID", y1Var, this);
                return objB2 == aVar7 ? aVar7 : objB2;
            case 6:
                m mVar2 = (m) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    xl1.l lVar = new xl1.l(mVar2, objArr2 == true ? 1 : 0, i33);
                    this.v = 1;
                    if (u0.c0(mVar2, "AANI_REG_CONFIRMATION_CTA_BUTTON_TAG", lVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mVar2.C2(xl1.b.f306902a);
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                f0 f0Var = (f0) obj3;
                d0 d0Var = new d0(i33, objArr3 == true ? 1 : 0, f0Var);
                this.v = 1;
                Object objB3 = pu7.a.B(f0Var.k, "get suitability statement", d0Var, this);
                return objB3 == aVar9 ? aVar9 : objB3;
            case 8:
                xni.g gVar = (xni.g) obj3;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(1000L, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar.X2(gVar.f307512m, new xlj.h(26));
                a2 a2Var = gVar.f307511l;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                gVar.f307511l = n.j2(gVar, ta6.a.J(2L, TimeUnit.MINUTES), null, new xni.h(gVar, objArr4 == true ? 1 : 0, i32), 3);
                return Unit.f186387a;
            case 9:
                h0 h0Var = (h0) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    oc8.d dVar = h0Var.f307700r;
                    String str4 = h0Var.o.f77340a;
                    this.v = 1;
                    obj2 = dVar.Z2(str4, this);
                    if (obj2 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                h0Var.H2(h0Var.E, new xng.l((oc8.c) obj2, i3));
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xqc.h hVar = (xqc.h) obj3;
                xqc.g gVar2 = new xqc.g(hVar, objArr5 == true ? 1 : 0, i2);
                this.v = 1;
                Object objB4 = pu7.a.B(hVar.k, "submitRequestTask", gVar2, this);
                return objB4 == aVar12 ? aVar12 : objB4;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    k kVar = (k) obj3;
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    this.v = 1;
                    kVar.getClass();
                    xge.f fVar = new xge.f(h0Var2, kVar, w4l.i.f294643c, null, 14);
                    p0 p0Var = p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, fVar, this);
                    if (obj2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return zhm.d0.d0((List) obj2);
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p pVar = (p) obj3;
                jmc.e eVar = new jmc.e(pVar, objArr6 == true ? 1 : 0, 27);
                this.v = 1;
                Object objB5 = pu7.a.B(pVar.k, "Update the statement details content", eVar, this);
                return objB5 == aVar14 ? aVar14 : objB5;
            case 13:
                xvf.m mVar3 = (xvf.m) obj3;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                try {
                    if (i106 == 0) {
                        yhm.o.b(obj2);
                        ouf.a aVar16 = mVar3.o;
                        this.v = 1;
                        suf.h hVar2 = ((r) aVar16).f168858a;
                        hVar2.getClass();
                        suf.c cVar3 = new suf.c(hVar2, objArr7 == true ? 1 : 0, i33);
                        p0 p0Var2 = p0.f264001a;
                        obj2 = skm.e0.J(elm.f.f127540b, cVar3, this);
                        if (obj2 == aVar15) {
                            return aVar15;
                        }
                    } else {
                        if (i106 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    data = zi0.c.P(obj2, false, null, 3);
                    break;
                } catch (Exception e) {
                    data = new Data(null, e, false, 5, null);
                }
                mVar3.H2(mVar3.f309257r, new xpe.c(data, mVar3, i5));
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.b bVar5 = (com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.b) obj3;
                    com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.a aVar18 = new com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.a(bVar5, null);
                    this.v = 1;
                    if (bVar5.p2(this, aVar18) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.staking.impl.unstake.v2.a aVar19 = (com.revolut.feature.staking.impl.unstake.v2.a) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    c0 c0VarA = nii.i.a();
                    lic.a aVar21 = new lic.a(aVar19, 29);
                    vkj.l lVar2 = new vkj.l(aVar19, i3);
                    g gVar3 = new g(aVar19, objArr8 == true ? 1 : 0, 14);
                    this.v = 1;
                    obj2 = n14.k.S(aVar19.X(), c0VarA, aVar21, lVar2, gVar3, this);
                    if (obj2 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar3 = (nii.h) obj2;
                if (hVar3 instanceof nii.g) {
                    aVar19.C2(new ytd.e((StakingPocket) ((Pair) ((nii.g) hVar3).f216152a).f186386b));
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    bbd.c cVar4 = ((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) obj3).f99116p;
                    this.v = 1;
                    if (cVar4.m(null, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar2 = (com.revolut.feature.selfserve.sot.impl.ui.flow.e) obj3;
                j jVar = new j(eVar2, objArr9 == true ? 1 : 0, 12);
                this.v = 1;
                Object objB6 = pu7.a.B(eVar2.k, "submitEvidence", jVar, this);
                return objB6 == aVar23 ? aVar23 : objB6;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c cVar5 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c) obj3;
                    com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.b bVar6 = new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.b(cVar5, null);
                    this.v = 1;
                    if (cVar5.p2(this, bVar6) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar3 = (l) obj3;
                j jVar2 = new j(lVar3, objArr10 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB7 = pu7.a.B(lVar3.k, "save_vat", jVar2, this);
                return objB7 == aVar25 ? aVar25 : objB7;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d dVar2 = (com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d) obj3;
                    com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.c cVar6 = new com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.c(dVar2, null);
                    this.v = 1;
                    if (dVar2.p2(this, cVar6) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    s sVar = (s) obj3;
                    y2e.k kVar2 = sVar.o;
                    ihm.f events = sVar.f310659t;
                    y2e.m mVar4 = (y2e.m) kVar2;
                    mVar4.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    efm.r rVarMerge = efm.r.merge(rd0.e.c(q.q(q.h(((g2e.c) mVar4.f310650b).f139974a)), kotlin.coroutines.g.f186406a), mVar4.e.map(new y25.c(new y2e.l(mVar4, i32), i22)));
                    Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                    efm.b bVarSwitchMapCompletable = rVarMerge.switchMapCompletable(new y25.c(new xyc.j(mVar4, events, i6), 4));
                    Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(bVarSwitchMapCompletable, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    y44.m mVar5 = (y44.m) obj3;
                    y44.a aVar29 = mVar5.f310784p;
                    String str5 = mVar5.o.f67007a;
                    this.v = 1;
                    if (aVar29.a(str5, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    u1 u1VarR = ((y48.f) obj3).f310829n.r();
                    this.v = 1;
                    obj2 = q.x(u1VarR, this);
                    if (obj2 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((od0.i) obj2).f224257a;
            case 24:
                j61.b bVar7 = ((com.revolut.feature.revolut_x_balances.impl.fiat.a) obj3).f84260s;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarE = j61.b.c(bVar7).e(j61.b.b(bVar7));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    y4h.e eVar3 = (y4h.e) ((RatingsDetailsScreen) obj3).f95435d0.getValue();
                    this.v = 1;
                    ((y4h.g) eVar3).u2();
                    if (Unit.f186387a == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                e0 e0Var2 = (e0) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    String str6 = (String) j6.a.k(String.class, e0Var2.f311037b, "KEY_PROMO_CODE");
                    if (str6 == null) {
                        return Unit.f186387a;
                    }
                    CobrandedCardsPromoCodeService cobrandedCardsPromoCodeService = e0Var2.f311036a;
                    this.v = 1;
                    if (cobrandedCardsPromoCodeService.redeemCode(str6, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                e0Var2.f311037b.clear();
                return Unit.f186387a;
            case 27:
                y5g.k kVar3 = (y5g.k) obj3;
                y yVar = kVar3.f311086r;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    h4g.e eVar4 = kVar3.o;
                    String str7 = ((y5g.g) ((j2) yVar.f22677a).getValue()).f311079a;
                    this.v = 1;
                    obj2 = eVar4.a(str7, this);
                    if (obj2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                kVar3.H2(yVar, new y1.a((n7g.b) obj2, i5));
                return Unit.f186387a;
            case 28:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a aVar36 = (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) obj3;
                    j jVar3 = new j(aVar36, objArr11 == true ? 1 : 0, i6);
                    this.v = 1;
                    if (aVar36.p2(this, jVar3) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                o oVar = (o) obj3;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarB = xv5.c.b(oVar.f311198q);
                    this.v = 1;
                    obj2 = nim.a.c(rVarB, this);
                    if (obj2 == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oVar.H2(oVar.v, new vgc.b(i21, (xi0.b) obj2));
                return Unit.f186387a;
        }
    }
}
