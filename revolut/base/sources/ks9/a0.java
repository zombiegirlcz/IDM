package ks9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f189316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gim.i f189317x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(b0 b0Var, Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        switch (i) {
            case 1:
                this.f189316w = b0Var;
                this.f189317x = (gim.i) function1;
                super(1, continuation);
                break;
            default:
                this.f189316w = b0Var;
                this.f189317x = (gim.i) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f189316w, this.f189317x, continuation, 0);
            default:
                return new a0(this.f189316w, this.f189317x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gim.i, kotlin.jvm.functions.Function1] */
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
                boe.k kVar = new boe.k(10, null, this.f189317x);
                this.v = 1;
                Object objU = do3.q.u(this.f189316w, kVar, this);
                return objU == aVar ? aVar : objU;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b0 b0Var = this.f189316w;
                a0 a0Var = new a0(b0Var, this.f189317x, null, 0);
                this.v = 1;
                Object objY2 = b0Var.Y2(this, a0Var);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
