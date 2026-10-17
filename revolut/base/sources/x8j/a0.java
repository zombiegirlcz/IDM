package x8j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f303418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f303419x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(g0 g0Var, xi0.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303418w = g0Var;
        this.f303419x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f303418w, this.f303419x, continuation, 0);
            default:
                return new a0(this.f303418w, this.f303419x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    g0 g0Var = this.f303418w;
                    w64.d dVar = new w64.d(g0Var, this.f303419x, null, 28);
                    this.v = 1;
                    if (g0Var.Y2(this, dVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                g0 g0Var2 = this.f303418w;
                wc2.b bVar = new wc2.b(g0Var2, this.f303419x, null, 6);
                this.v = 1;
                Object objY2 = g0Var2.Y2(this, bVar);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
