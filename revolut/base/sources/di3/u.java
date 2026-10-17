package di3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f114906w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f114906w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f114906w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f114906w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        w wVar = this.f114906w;
        Continuation continuation = null;
        int i2 = 3;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0.C(coroutineScope, null, null, new t(wVar, continuation, 0), 3);
                return e0.C(coroutineScope, null, null, new t(wVar, continuation, 1), 3);
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0.C(coroutineScope2, null, null, new t(wVar, continuation, 2), 3);
                e0.C(coroutineScope2, null, null, new t(wVar, continuation, i2), 3);
                e0.C(coroutineScope2, null, null, new t(wVar, continuation, 4), 3);
                return e0.C(coroutineScope2, null, null, new t(wVar, continuation, 5), 3);
        }
    }
}
