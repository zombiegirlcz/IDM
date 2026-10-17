package jsl;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f178233w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(u0 u0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178233w = u0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0(this.f178233w, continuation, 0);
                r0Var.v = obj2;
                return r0Var;
            default:
                r0 r0Var2 = new r0(this.f178233w, continuation, 1);
                r0Var2.v = obj2;
                return r0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r0) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u0 u0Var = this.f178233w;
        switch (i) {
            case 0:
                z zVar = (z) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u0Var.H2(u0Var.getState(), new jlh.g(zVar, 18));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u0Var.H2(u0Var.getState(), new i2l.e0(list, 23));
                break;
        }
        return Unit.f186387a;
    }
}
