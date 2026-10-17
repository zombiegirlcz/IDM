package ahf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f5092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5092w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f5092w, continuation, 0);
            default:
                return new r(this.f5092w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        z zVar = this.f5092w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarF = zVar.f5108w.f(false);
                    q qVar = q.f;
                    ufm.i iVar = new ufm.i(d0VarF, new a0.b(10), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    this.v = 1;
                    obj2 = nim.a.b(iVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zVar.H2(zVar.N, new a2g.p(com.bumptech.glide.d.x((wi0.b) obj2), 8));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a3i.q qVar2 = new a3i.q(zVar, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(zVar.k, "PAYMENT_DIALOG_TASK_ID", qVar2, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
