package kx4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f190412w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f190412w = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q0 q0Var = new q0(this.f190412w, continuation, 0);
                q0Var.v = obj2;
                return q0Var;
            case 1:
                q0 q0Var2 = new q0(this.f190412w, continuation, 1);
                q0Var2.v = obj2;
                return q0Var2;
            case 2:
                q0 q0Var3 = new q0(this.f190412w, continuation, 2);
                q0Var3.v = obj2;
                return q0Var3;
            case 3:
                q0 q0Var4 = new q0(this.f190412w, continuation, 3);
                q0Var4.v = obj2;
                return q0Var4;
            case 4:
                q0 q0Var5 = new q0(this.f190412w, continuation, 4);
                q0Var5.v = obj2;
                return q0Var5;
            default:
                q0 q0Var6 = new q0(this.f190412w, continuation, 5);
                q0Var6.v = obj2;
                return q0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        dx4.l lVar = (dx4.l) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q0) create(lVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r0 r0Var = this.f190412w;
        switch (i) {
            case 0:
                dx4.l lVar = (dx4.l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(r0.R(r0Var), lVar);
                break;
            case 1:
                dx4.l lVar2 = (dx4.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(r0.R(r0Var), lVar2);
                break;
            case 2:
                dx4.l lVar3 = (dx4.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(r0.R(r0Var), lVar3);
                break;
            case 3:
                dx4.l lVar4 = (dx4.l) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(r0.R(r0Var), lVar4);
                break;
            case 4:
                dx4.l lVar5 = (dx4.l) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(r0.R(r0Var), lVar5);
                break;
            default:
                dx4.l lVar6 = (dx4.l) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(r0.R(r0Var), lVar6);
                break;
        }
        return Unit.f186387a;
    }
}
