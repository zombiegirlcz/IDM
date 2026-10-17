package jwc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a f178968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f178969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Boolean f178970y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar, String str, Boolean bool, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f178968w = aVar;
        this.f178969x = str;
        this.f178970y = bool;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f178968w, this.f178969x, this.f178970y, continuation, 0);
            default:
                return new q(this.f178968w, this.f178969x, this.f178970y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar2 = this.f178968w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    wtc.k kVar = aVar2.o;
                    Boolean bool = this.f178970y;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    this.v = 1;
                    if (((wtc.n) kVar).b(this, this.f178969x, zBooleanValue) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.C2(i.f178960a);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar4 = this.f178968w;
                    q qVar = new q(aVar4, this.f178969x, this.f178970y, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar4, qVar, this) == aVar3) {
                        return aVar3;
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
