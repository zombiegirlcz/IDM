package t73;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class y1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268574w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268574w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y1(this.f268574w, continuation, 0);
            case 1:
                return new y1(this.f268574w, continuation, 1);
            case 2:
                return new y1(this.f268574w, continuation, 2);
            case 3:
                return new y1(this.f268574w, continuation, 3);
            case 4:
                return new y1(this.f268574w, continuation, 4);
            case 5:
                return new y1(this.f268574w, continuation, 5);
            case 6:
                return new y1(this.f268574w, continuation, 6);
            case 7:
                return new y1(this.f268574w, continuation, 7);
            default:
                return new y1(this.f268574w, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268574w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    x1 x1Var = new x1(gVar, null);
                    this.v = 1;
                    if (gVar.p2(this, x1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar = gVar.X;
                    this.v = 1;
                    Object objE = uVar.f111804b.e(new tk0.b("HIDE_GLOBAL_DEBIT_CARDS_INFO"), Boolean.TRUE, this);
                    if (objE != aVar2) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar2 = gVar.X;
                    this.v = 1;
                    Object objE2 = uVar2.f111804b.e(new tk0.b("HIDE_GLOBAL_DEBIT_CARDS_INFO"), Boolean.TRUE, this);
                    if (objE2 != aVar3) {
                        objE2 = Unit.f186387a;
                    }
                    if (objE2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar3 = gVar.X;
                    this.v = 1;
                    uVar3.getClass();
                    skm.p0 p0Var = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, new d73.q(uVar3, null, 0), this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar.H2(gVar.f65434h0, new s7a.m0(4, (Set) obj2));
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar4 = gVar.X;
                    this.v = 1;
                    uVar4.getClass();
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, new d73.q(uVar4, null, 1), this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar.H2(gVar.f65434h0, new s7a.m0(5, (Set) obj2));
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar5 = gVar.X;
                    this.v = 1;
                    uVar5.getClass();
                    skm.p0 p0Var3 = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, new d73.q(uVar5, null, 2), this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar.H2(gVar.f65434h0, new s7a.m0(6, (Set) obj2));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarE = ((ha3.x) gVar.B).E();
                    this.v = 1;
                    if (nim.a.a(hVarE, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (skm.k0.b(300L, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar.H2(gVar.f65434h0, new d(16));
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                su4.n nVar = new su4.n(gVar, null, 6);
                this.v = 1;
                Object objB = pu7.a.B(gVar.k, "showHowToUsePayLaterCardDialog", nVar, this);
                return objB == aVar9 ? aVar9 : objB;
        }
    }
}
