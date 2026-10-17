package hze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f157159x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f157158w = cVar;
        this.f157159x = ref$ObjectRef;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f157158w, this.f157159x, continuation, 0);
            case 1:
                return new j(this.f157158w, this.f157159x, continuation, 1);
            case 2:
                return new j(this.f157158w, this.f157159x, continuation, 2);
            default:
                return new j(this.f157158w, this.f157159x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Object obj3 = this.f157159x.f186409a;
                    if (obj3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.I2(this.f157158w, (zve.b) obj3, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.f157158w;
                    j jVar = new j(cVar, this.f157159x, null, 0);
                    this.v = 1;
                    if (cVar.p2(this, jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Object obj4 = this.f157159x.f186409a;
                    if (obj4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.I2(this.f157158w, (zve.b) obj4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Object obj5 = this.f157159x.f186409a;
                    if (obj5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.I2(this.f157158w, (zve.b) obj5, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
