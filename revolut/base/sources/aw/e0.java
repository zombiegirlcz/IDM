package aw;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes16.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f10154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f10155x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(float f, long j2, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.v = f;
        this.f10154w = j2;
        this.f10155x = producerScope;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.v, this.f10154w, this.f10155x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            x xVar = new x(this.v, this.f10154w);
            this.u = 1;
            if (h0.b(this.f10155x, xVar, this) == aVar) {
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
