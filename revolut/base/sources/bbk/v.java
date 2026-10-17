package bbk;

import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Decline;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Timeout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f14342w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, d0 d0Var, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f14342w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(0, this.f14342w, continuation);
            default:
                return new v(1, this.f14342w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f14342w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    sak.c cVarK2 = d0Var.K2();
                    tak.d dVar = d0Var.f14320q;
                    this.v = 1;
                    obj2 = dVar.D0(cVarK2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                d0Var.C2(new q((PendingPaymentResult$Timeout) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    sak.c cVarK22 = d0Var.K2();
                    tak.d dVar2 = d0Var.f14320q;
                    this.v = 1;
                    obj2 = dVar2.d0(cVarK22, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                PendingPaymentResult$Decline pendingPaymentResult$Decline = (PendingPaymentResult$Decline) obj2;
                if (pendingPaymentResult$Decline == null) {
                    return null;
                }
                d0Var.C2(new p(pendingPaymentResult$Decline));
                return Unit.f186387a;
        }
    }
}
