package hkk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f152950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f152951x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(p pVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152950w = pVar;
        this.f152951x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f152950w, this.f152951x, continuation, 0);
            default:
                return new l(this.f152950w, this.f152951x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p pVar = this.f152950w;
                k kVar = new k(pVar, this.f152951x, null, 0);
                this.v = 1;
                Object objP2 = pVar.p2(this, kVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    p pVar2 = this.f152950w;
                    k kVar2 = new k(pVar2, this.f152951x, null, 1);
                    this.v = 1;
                    if (pVar2.p2(this, kVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
