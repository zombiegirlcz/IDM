package bg4;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f15123w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar, PaymentMethod.Pocket pocket, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f15123w = pocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.v, this.f15123w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            t1j.b bVar = aVar2.o;
            h1 h1VarF = w0.F(aVar2.f68174r.f68169a);
            az3.b bVar2 = new az3.b(this.f15123w.f84376a);
            this.u = 1;
            xge.f fVar = new xge.f((smd.s) bVar.f267380b, bVar2, h1VarF, null, 24);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, fVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.C2(new t((it3.d) obj2));
        return Unit.f186387a;
    }
}
