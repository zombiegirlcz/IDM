package vha;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f289454w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(q0 q0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289454w = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f289454w, continuation, 0);
            case 1:
                return new y(this.f289454w, continuation, 1);
            case 2:
                return new y(this.f289454w, continuation, 2);
            case 3:
                return new y(this.f289454w, continuation, 3);
            case 4:
                return new y(this.f289454w, continuation, 4);
            default:
                return new y(this.f289454w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jf1.a aVar2 = this.f289454w.f289419q;
                this.v = 1;
                zfc.d dVar = (zfc.d) aVar2;
                Object objX = dVar.f321922a.x(Boolean.FALSE, new zfc.c(dVar, null, 0), this);
                return objX == aVar ? aVar : objX;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q0 q0Var = this.f289454w;
                    hr6.l lVar = q0Var.f289418p;
                    Continuation continuation = null;
                    uvf.b bVar = new uvf.b(q0Var, continuation, 27);
                    vge.r rVar = new vge.r(q0Var, continuation, 11);
                    this.v = 1;
                    if (((ct6.m) lVar).c(bVar, rVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q0 q0Var2 = this.f289454w;
                h0 h0Var = new h0(q0Var2, null);
                this.v = 1;
                Object objY2 = q0Var2.Y2(this, h0Var);
                return objY2 == aVar4 ? aVar4 : objY2;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q0 q0Var3 = this.f289454w;
                vc2.s sVar = new vc2.s(q0Var3, null, 17);
                this.v = 1;
                Object objY22 = q0Var3.Y2(this, sVar);
                return objY22 == aVar5 ? aVar5 : objY22;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    q0 q0Var4 = this.f289454w;
                    o0 o0Var = new o0(q0Var4, null);
                    this.v = 1;
                    if (q0Var4.Y2(this, o0Var) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    q0 q0Var5 = this.f289454w;
                    vc2.s sVar2 = new vc2.s(q0Var5, null, 18);
                    this.v = 1;
                    if (q0Var5.Y2(this, sVar2) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
