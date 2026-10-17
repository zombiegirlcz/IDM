package n84;

import com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a f213201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ DelayedCreditCheckResponse f213202x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a aVar, DelayedCreditCheckResponse delayedCreditCheckResponse, Continuation continuation) {
        super(2, continuation);
        this.f213201w = aVar;
        this.f213202x = delayedCreditCheckResponse;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f213201w, this.f213202x, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            boolean z = n1Var instanceof l1;
            com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a aVar2 = this.f213201w;
            if (z) {
                aVar2.I2();
            } else {
                aVar2.H2(aVar2.f67411q, new c(aVar2, 3));
                this.v = null;
                this.u = 1;
                if (aVar2.J2(this.f213202x, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
