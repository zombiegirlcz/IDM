package p0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p0l.f;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        v vVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            Object objP2 = vVar.p2(this, new l(vVar, null, 0));
            if (objP2 != aVar) {
                objP2 = Unit.f186387a;
            }
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        vVar.v2(f.b.f231555a);
        return Unit.f186387a;
    }
}
