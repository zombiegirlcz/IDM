package ku1;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f189632w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189632w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f189632w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            default:
                z zVar2 = new z(this.f189632w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = new y(data, 0);
                q qVar = e0.Companion;
                this.f189632w.x2(yVar);
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c02.j jVar = (c02.j) pair.f186385a;
                String str = (String) pair.f186386b;
                q qVar2 = e0.Companion;
                e0 e0Var = this.f189632w;
                e0Var.l2(new knd.h0(e0Var, jVar, str, null, 11), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
