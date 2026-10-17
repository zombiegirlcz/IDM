package ldh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f194119w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = mVar;
        this.f194119w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, this.f194119w, continuation, 0);
            case 1:
                return new j(this.v, this.f194119w, continuation, 1);
            case 2:
                return new j(this.v, this.f194119w, continuation, 2);
            default:
                return new j(this.v, this.f194119w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d dVar = this.f194119w;
        m mVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
        }
        return m.c3(mVar, dVar);
    }
}
