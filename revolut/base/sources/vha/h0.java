package vha;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import java.time.LocalDateTime;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.i implements Function1 {
    public final /* synthetic */ q0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q0 q0Var, Continuation continuation) {
        super(1, continuation);
        this.u = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        AcquiringPaymentsQuery.Companion companion = AcquiringPaymentsQuery.INSTANCE;
        q0 q0Var = this.u;
        LocalDateTime localDateTimeF = ((l80.f) q0Var.G).f();
        companion.getClass();
        return q0Var.A2(new FreelancerBizFeatureConfig.AcquiringPayments(new FreelancerBizFeatureConfig.AcquiringPayments.InitialStep.Payments(AcquiringPaymentsQuery.Companion.a(localDateTimeF))));
    }
}
