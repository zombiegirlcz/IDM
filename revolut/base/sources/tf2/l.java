package tf2;

import iuf.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f270220w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f270220w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f270220w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        e eVar = this.f270220w;
        y yVar = new y(eVar, 22);
        m mVar = this.v;
        k kVar = new k(mVar, eVar, null, 1);
        this.u = 1;
        Object objQ = n14.k.Q(mVar, null, null, yVar, kVar, this, 3);
        return objQ == aVar ? aVar : objQ;
    }
}
