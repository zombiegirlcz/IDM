package rg4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b f254037w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254037w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f254037w, continuation, 0);
            default:
                return new v(this.f254037w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar = this.f254037w;
                r25.a aVar2 = new r25.a(bVar, null);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "LOAD_PRE_APPLICATION_CHECKS", aVar2, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar2 = this.f254037w;
                com.revolut.feature.credit.application.plugins.impl.ui.preapplication.a aVar4 = new com.revolut.feature.credit.application.plugins.impl.ui.preapplication.a(bVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "CREATE_PRE_APPLICATION_CHECKS_WORKFLOW", aVar4, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
