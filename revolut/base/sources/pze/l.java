package pze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b f241000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f241001x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f241000w = bVar;
        this.f241001x = ref$ObjectRef;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f241000w, this.f241001x, continuation, 0);
            default:
                return new l(this.f241000w, this.f241001x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    Object obj3 = this.f241001x.f186409a;
                    if (obj3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.J2(this.f241000w, (zve.b) obj3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar = this.f241000w;
                    l lVar = new l(bVar, this.f241001x, null, 0);
                    this.v = 1;
                    if (bVar.p2(this, lVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
