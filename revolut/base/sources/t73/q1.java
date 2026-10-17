package t73;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.fc;
import tof.ib;
import tof.l9;

/* JADX INFO: loaded from: classes21.dex */
public final class q1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f268524x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f268523w = gVar;
        this.f268524x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q1(this.f268523w, this.f268524x, continuation, 0);
            case 1:
                return new q1(this.f268523w, this.f268524x, continuation, 1);
            case 2:
                return new q1(this.f268523w, this.f268524x, continuation, 2);
            case 3:
                return new q1(this.f268523w, this.f268524x, continuation, 3);
            case 4:
                return new q1(this.f268523w, this.f268524x, continuation, 4);
            case 5:
                return new q1(this.f268523w, this.f268524x, continuation, 5);
            case 6:
                return new q1(this.f268523w, this.f268524x, continuation, 6);
            case 7:
                return new q1(this.f268523w, this.f268524x, continuation, 7);
            case 8:
                return new q1(this.f268523w, this.f268524x, continuation, 8);
            default:
                return new q1(this.f268523w, this.f268524x, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objB2;
        Object objB3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarL = ((ha3.x) this.f268523w.B).l(this.f268524x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarL, this) == aVar) {
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
                    pfm.h hVarL2 = ((ha3.x) this.f268523w.B).l(this.f268524x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarL2, this) == aVar2) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ufm.b bVarP = ((ha3.x) this.f268523w.B).p(this.f268524x.f150110a);
                this.v = 1;
                Object objB4 = nim.a.b(bVarP, this);
                return objB4 == aVar3 ? aVar3 : objB4;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                h93.f0 card = this.f268524x;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268523w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    hy2.f fVar = gVar.D;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(card, "card");
                    efm.d0 d0VarFirstOrError = m70.a.g(zi0.c.J(hy2.f.k(fVar, card.u, card.C(), false, null, null, card.H, card.G, null, null, null, null, false, false, null, null, 32280)), null, new hy2.b(1), 1).firstOrError();
                    hy1.m mVar = new hy1.m(21, new hy1.i(23));
                    d0VarFirstOrError.getClass();
                    ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(d0VarFirstOrError, mVar, 1), new hy1.m(22, new avc.o(card, 3)), 1), new hy1.m(23, new hy1.i(24)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    pfm.z zVarI = ue0.e.I(ue0.e.D(iVar, new hul.v(fVar, card, 9)), zhm.h0.f322473a, new hy1.i(25));
                    this.v = 1;
                    objB = nim.a.b(zVarI, this);
                    if (objB == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Object obj3 = ((od0.i) objB).f224257a;
                if (obj3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                gVar.C2(new y0(card, (e93.d) obj3, gVar.Q2(card)));
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarB = ((ha3.x) this.f268523w.B).B(this.f268524x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268523w;
                z1 z1Var = new z1(gVar2, this.f268524x, null, 2);
                this.v = 1;
                Object objP2 = gVar2.p2(this, z1Var);
                return objP2 == aVar6 ? aVar6 : objP2;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                h93.f0 f0Var = this.f268524x;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = this.f268523w;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarB = com.revolut.domain.interactors.transactions.a.b(gVar3.E, fc.a(new l9(tof.t0.SUSPICIOUS), new ib(f0Var.f150110a)), null, new Integer(1), null, null, 26);
                    this.v = 1;
                    objB2 = nim.a.b(iVarB, this);
                    if (objB2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return obj2;
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB2, "await(...)");
                tof.a3 a3Var = (tof.a3) zhm.d0.d0((List) objB2);
                if (a3Var != null) {
                    gVar3.C2(new d1(a3Var));
                    return Unit.f186387a;
                }
                ufm.b bVarD = ((ha3.x) gVar3.B).D(f0Var.f150110a);
                this.v = 2;
                Object objB5 = nim.a.b(bVarD, this);
                return objB5 == aVar7 ? aVar7 : objB5;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarI = ((ha3.x) this.f268523w.B).I(this.f268524x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarI, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarI2 = ((ha3.x) this.f268523w.B).I(this.f268524x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarI2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                h93.f0 f0Var2 = this.f268524x;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar4 = this.f268523w;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarK2 = com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.K2(gVar4, f0Var2);
                    this.v = 1;
                    objB3 = nim.a.b(d0VarK2, this);
                    if (objB3 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                Boolean bool = (Boolean) objB3;
                String str = f0Var2.f150110a;
                Intrinsics.h(bool);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.P2(gVar4, str, bool.booleanValue(), o1.UNBLOCK);
                return Unit.f186387a;
        }
    }
}
