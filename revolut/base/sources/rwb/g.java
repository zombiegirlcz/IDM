package rwb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Continuation continuation, h hVar) {
        super(2, continuation);
        this.u = i;
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(0, continuation, this.v);
            case 1:
                return new g(1, continuation, this.v);
            case 2:
                return new g(2, continuation, this.v);
            case 3:
                return new g(3, continuation, this.v);
            case 4:
                return new g(4, continuation, this.v);
            default:
                return new g(5, continuation, this.v);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.I2(hVar);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.I2(hVar);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.I2(hVar);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.I2(hVar);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.I2(hVar);
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.I2(hVar);
                break;
        }
        return Unit.f186387a;
    }
}
