package nj4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a f216360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f216360w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f216360w, continuation, 0);
            default:
                return new f(this.f216360w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar2 = this.f216360w;
                e eVar = new e(aVar2, null, 0);
                this.v = 1;
                Object objP2 = aVar2.p2(this, eVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar4 = this.f216360w;
                e eVar2 = new e(aVar4, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "initWaitlistFlow", eVar2, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
