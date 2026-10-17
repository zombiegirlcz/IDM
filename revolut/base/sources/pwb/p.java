package pwb;

import aii.u;
import cli.y;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.InvestmentGoalsScreen;
import efm.d0;
import g48.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nyb.m0;
import p40.v;
import pwc.x;
import q43.o0;
import q5g.l0;
import q7c.q;
import q97.d2;
import q97.g0;
import q97.j3;
import q97.m1;
import q97.n0;
import skm.p0;
import v6e.r;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f240393w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240393w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p((com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c) this.f240393w, continuation, 0);
            case 1:
                return new p((com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) this.f240393w, continuation, 1);
            case 2:
                return new p((pz2.n) this.f240393w, continuation, 2);
            case 3:
                return new p((InvestmentGoalsScreen) this.f240393w, continuation, 3);
            case 4:
                return new p((com.revolut.feature.rev_points.impl.ui.transactions.list.d) this.f240393w, continuation, 4);
            case 5:
                return new p((q1a.b) this.f240393w, continuation, 5);
            case 6:
                return new p((com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f240393w, continuation, 6);
            case 7:
                return new p((com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) this.f240393w, continuation, 7);
            case 8:
                return new p((o0) this.f240393w, continuation, 8);
            case 9:
                return new p((com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b) this.f240393w, continuation, 9);
            case 10:
                return new p((q49.h) this.f240393w, continuation, 10);
            case 11:
                return new p((com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f240393w, continuation, 11);
            case 12:
                return new p((q50.j) this.f240393w, continuation, 12);
            case 13:
                return new p((com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) this.f240393w, continuation, 13);
            case 14:
                return new p((q62.h) this.f240393w, continuation, 14);
            case 15:
                return new p((q65.m) this.f240393w, continuation, 15);
            case 16:
                return new p((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) this.f240393w, continuation, 16);
            case 17:
                return new p((q) this.f240393w, continuation, 17);
            case 18:
                return new p((q85.h) this.f240393w, continuation, 18);
            case 19:
                return new p((n0) this.f240393w, continuation, 19);
            case 20:
                return new p((g0) this.f240393w, continuation, 20);
            case 21:
                return new p((d2) this.f240393w, continuation, 21);
            case 22:
                return new p((m1) this.f240393w, continuation, 22);
            case 23:
                return new p((j3) this.f240393w, continuation, 23);
            case 24:
                return new p((qa4.k) this.f240393w, continuation, 24);
            case 25:
                return new p((qb7.g) this.f240393w, continuation, 25);
            case 26:
                return new p((qba.n) this.f240393w, continuation, 26);
            case 27:
                return new p((qc2.n) this.f240393w, continuation, 27);
            case 28:
                return new p((qc4.j) this.f240393w, continuation, 28);
            default:
                return new p((qc6.j) this.f240393w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c) this.f240393w;
                    com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.b bVar = new com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.b(cVar, null);
                    this.v = 1;
                    if (cVar.p2(this, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar3 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) this.f240393w;
                    x xVar = new x(aVar3, null);
                    this.v = 1;
                    if (aVar3.p2(this, xVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                pz2.n nVar = (pz2.n) this.f240393w;
                y yVar = nVar.f240881q;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l93.f fVar = nVar.f240880p;
                    String cardId = ((pz2.h) ((j2) yVar.f22677a).getValue()).f240873a.f64822a;
                    long j2 = ((pz2.h) ((j2) yVar.f22677a).getValue()).f240873a.f64823b.f115082a;
                    ha3.x xVar2 = (ha3.x) fVar;
                    xVar2.getClass();
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    pfm.h hVarN = pd.b.n(p0.f264003c, new chj.p(xVar2, cardId, j2, (Continuation) null, 2));
                    this.v = 1;
                    if (nim.a.a(hVarN, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nVar.B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    pzk.e eVar = (pzk.e) ((InvestmentGoalsScreen) this.f240393w).Y.getValue();
                    this.v = 1;
                    eVar.getClass();
                    if (pu7.a.B(eVar.k, "posting continue investment goal", new pzk.d(eVar, null), this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m0 m0Var = ((com.revolut.feature.rev_points.impl.ui.transactions.list.d) this.f240393w).f83891s;
                this.v = 1;
                Object objE = m0Var.e(this);
                return objE == aVar6 ? aVar6 : objE;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    e1a.f fVar2 = ((q1a.b) this.f240393w).f241410c;
                    this.v = 1;
                    if (fVar2.b(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar9 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f240393w;
                    q22.m mVar = new q22.m(aVar9, null);
                    this.v = 1;
                    if (u0.b0(aVar9.X(), "APM_NEW_CONTACT_CTA_BUTTON_TAG", mVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) this.f240393w;
                v vVar = new v(bVar2, null, 14);
                this.v = 1;
                Object objB = pu7.a.B(bVar2.k, "address_verification", vVar, this);
                return objB == aVar10 ? aVar10 : objB;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o0 o0Var = (o0) this.f240393w;
                v vVar2 = new v(o0Var, null, 15);
                this.v = 1;
                Object objB2 = pu7.a.B(o0Var.k, "TASK_ID_SAVE_SELECTED_PAYMENT_METHOD", vVar2, this);
                return objB2 == aVar11 ? aVar11 : objB2;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b) this.f240393w;
                    com.revolut.feature.credit.application.plugins.impl.ui.address_v2.a aVar13 = new com.revolut.feature.credit.application.plugins.impl.ui.address_v2.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar13) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    q49.h hVar = (q49.h) this.f240393w;
                    q49.f fVar3 = new q49.f(hVar, null);
                    this.v = 1;
                    if (hVar.p2(this, fVar3) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar16 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f240393w;
                v vVar3 = new v(aVar16, null, 16);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar16.k, "onBannerDismissed", vVar3, this);
                return objB3 == aVar15 ? aVar15 : objB3;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q50.j jVar = (q50.j) this.f240393w;
                v vVar4 = new v(jVar, null, 17);
                this.v = 1;
                Object objY2 = jVar.Y2(this, vVar4);
                return objY2 == aVar17 ? aVar17 : objY2;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar4 = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) this.f240393w;
                l0 l0Var = new l0(bVar4, null);
                this.v = 1;
                Object objP2 = bVar4.p2(this, l0Var);
                return objP2 == aVar18 ? aVar18 : objP2;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q62.h hVar2 = (q62.h) this.f240393w;
                q62.g gVar = new q62.g(hVar2, null, 1);
                this.v = 1;
                Object objB0 = u0.b0(hVar2.X(), "DEREGISTER_DIALOG_BUTTON_PRIMARY_TAG", gVar, this);
                return objB0 == aVar19 ? aVar19 : objB0;
            case 15:
                q65.m mVar2 = (q65.m) this.f240393w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                Continuation continuation = null;
                int i100 = 2;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (mVar2.p2(this, new q65.j(mVar2, continuation, 1)) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        mVar2.v2(aii.q.f5292a);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                n65.a aVar21 = mVar2.f242505r;
                int i101 = mVar2.f242503p.f70402b;
                aVar21.getClass();
                Object objN = vkm.q.n(new knd.g0(mVar2.X1(n65.a.a(i101)), new m84.c(i100, 29, continuation), 1), this);
                if (objN != aVar20) {
                    objN = Unit.f186387a;
                }
                if (objN == aVar20) {
                    return aVar20;
                }
                mVar2.v2(aii.q.f5292a);
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar23 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) this.f240393w;
                v vVar5 = new v(aVar23, null, 18);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar23.k, "onPaginationEvent", vVar5, this);
                return objB4 == aVar22 ? aVar22 : objB4;
            case 17:
                q qVar = (q) this.f240393w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    if (!qVar.d.f181945b.contains("EMAIL_MEMORY_CACHE_ID")) {
                        d0 d0VarF = qVar.f242831b.f(false);
                        this.v = 1;
                        obj2 = nim.a.b(d0VarF, this);
                        if (obj2 == aVar24) {
                            return aVar24;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i103 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                String str = ((do3.n) obj2).f116411g;
                if (str == null) {
                    str = "";
                }
                boolean z = kotlin.text.d0.W(str) ? false : true;
                return Boolean.valueOf(z);
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q85.h hVar3 = (q85.h) this.f240393w;
                q85.g gVar2 = new q85.g(hVar3, null, 1);
                this.v = 1;
                Object objB5 = pu7.a.B(hVar3.k, "toggleAutoPay", gVar2, this);
                return objB5 == aVar25 ? aVar25 : objB5;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lo5.p pVar = ((n0) this.f240393w).f243745a;
                this.v = 1;
                Object objC = ((fp5.f) pVar).c(this);
                return objC == aVar26 ? aVar26 : objC;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r0 r0Var = (r0) ((g0) this.f240393w).f243694b;
                this.v = 1;
                Boolean boolN = r0Var.n();
                return boolN == aVar27 ? aVar27 : boolN;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                sha.c cVar2 = ((d2) this.f240393w).f243672c;
                this.v = 1;
                Object objA = ((zha.d) cVar2).a(this);
                return objA == aVar28 ? aVar28 : objA;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    mjb.a aVar30 = (mjb.a) ((m1) this.f240393w).e;
                    this.v = 1;
                    obj2 = ((hob.d) aVar30).a(this);
                    if (obj2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new o97.d((u) obj2);
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    g6e.g gVar3 = ((j3) this.f240393w).f243718b;
                    this.v = 1;
                    obj2 = ((r) gVar3).f(this);
                    if (obj2 == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new o97.d((u) obj2);
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                qa4.k kVar = (qa4.k) this.f240393w;
                qa4.j jVar2 = new qa4.j(kVar, null, 2);
                this.v = 1;
                Object objP22 = kVar.p2(this, jVar2);
                return objP22 == aVar32 ? aVar32 : objP22;
            case 25:
                qb7.g gVar4 = (qb7.g) this.f240393w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    wa7.m mVar3 = gVar4.o;
                    String str2 = ((qb7.d) ((j2) gVar4.f244131p.f22677a).getValue()).f244125a;
                    this.v = 1;
                    Object objE2 = mVar3.f295849c.e(new tk0.d("SECRET_ACCOUNTS_PHRASE"), str2, this);
                    if (objE2 != aVar33) {
                        objE2 = Unit.f186387a;
                    }
                    if (objE2 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar4.C2(qb7.e.f244128a);
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    qba.n nVar2 = (qba.n) this.f240393w;
                    v vVar6 = new v(nVar2, null, 19);
                    this.v = 1;
                    if (nVar2.p2(this, vVar6) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = ((qc2.n) this.f240393w).u.b(n02.b.QVIK);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    qc4.j jVar3 = (qc4.j) this.f240393w;
                    qc4.i iVar = new qc4.i(jVar3, null);
                    this.v = 1;
                    if (jVar3.p2(this, iVar) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    qc6.j jVar4 = (qc6.j) this.f240393w;
                    sa6.i iVar2 = jVar4.f244575p;
                    efm.r rVarC = rd0.e.c(jVar4.f244576q, kotlin.coroutines.g.f186406a);
                    this.v = 1;
                    Object objA2 = nim.a.a(((lk0.d) iVar2.f261325c.getValue()).b(rVarC), this);
                    if (objA2 != obj3) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
