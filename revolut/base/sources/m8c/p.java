package m8c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayDeferredPaymentsService;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import efm.d0;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f203482w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f203482w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f203482w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            k7c.h hVar = (k7c.h) qVar.f203483p;
            hVar.getClass();
            String paymentId = this.f203482w;
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            RevolutPayDeferredPaymentsService revolutPayDeferredPaymentsService = hVar.f181961a;
            efm.b bVarBlockDeferredPayment = revolutPayDeferredPaymentsService.blockDeferredPayment(paymentId);
            d0<e7c.h> deferredPayments = revolutPayDeferredPaymentsService.getDeferredPayments();
            k64.a aVar2 = new k64.a(8, new k7c.d(3));
            deferredPayments.getClass();
            f0 f0VarF = bVarBlockDeferredPayment.f(new ufm.i(deferredPayments, aVar2, 1));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            pfm.h hVarX = v7.x(new ufm.f(w.i0(f0VarF), new k64.a(3, new k7c.e(hVar, 0)), 3), "ignoreElement(...)");
            this.u = 1;
            if (nim.a.a(hVarX, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return qVar.C1(new BridgeDestination(new FinishCommand(null, null, null, 7)));
    }
}
