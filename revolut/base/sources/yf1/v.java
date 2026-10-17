package yf1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qf1.i f313138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, qf1.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = yVar;
        this.f313138w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f313138w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            y yVar = this.v;
            xb4.g gVar = new xb4.g(yVar, this.f313138w, null, 29);
            this.u = 1;
            if (yVar.p2(this, gVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
