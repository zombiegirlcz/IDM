package dce;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kr2.f f112899w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, kr2.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f112899w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t0(this.v, this.f112899w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = this.v;
            j60.a.v(cVar.f89271y, false, null, 3);
            ur2.c cVar2 = cVar.H;
            kr2.f fVar = this.f112899w;
            pfm.a aVarD = cVar2.d(fVar.f188649b, fVar.f188648a);
            this.u = 1;
            if (nim.a.a(aVarD, this) == aVar) {
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
