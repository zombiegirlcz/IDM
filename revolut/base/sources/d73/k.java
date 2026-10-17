package d73;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f111788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f111789x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ProducerScope producerScope, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111789x = producerScope;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f111789x, continuation, 0);
                kVar.f111788w = ((Boolean) obj2).booleanValue();
                return kVar;
            case 1:
                k kVar2 = new k(this.f111789x, continuation, 1);
                kVar2.f111788w = ((Boolean) obj2).booleanValue();
                return kVar2;
            default:
                k kVar3 = new k(this.f111789x, continuation, 2);
                kVar3.f111788w = ((Boolean) obj2).booleanValue();
                return kVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((k) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                boolean z = this.f111788w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(Boolean.valueOf(z), false, null, 3);
                    this.f111788w = z;
                    this.v = 1;
                    if (this.f111789x.send(dataP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                boolean z3 = this.f111788w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Data dataP2 = zi0.c.P(Boolean.valueOf(z3), false, null, 3);
                    this.f111788w = z3;
                    this.v = 1;
                    if (this.f111789x.send(dataP2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                boolean z4 = this.f111788w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    this.f111788w = z4;
                    this.v = 1;
                    if (this.f111789x.send(boolValueOf, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
