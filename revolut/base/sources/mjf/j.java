package mjf;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f206004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206004w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f206004w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f206004w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List list = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(list, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f206004w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.f206033g.set(list);
                break;
            default:
                List list2 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.f.set(list2);
                break;
        }
        return Unit.f186387a;
    }
}
