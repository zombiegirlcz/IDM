package nze;

import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.api.navigation.MandateUpdateLimitsDestination;
import com.revolut.feature.external_accounts.api.navigation.MandateUpdateLimitsFeatureConfig;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xg6.x;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f221041w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f221041w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f221041w, continuation, 0);
            default:
                return new r(this.f221041w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (t.I2(this.f221041w, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                t tVar = this.f221041w;
                MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = tVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(x.b(tVar.f221047t, mandateTopupFlowContract$InputData.f91004b), null, new nz7.g(4), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Mandate mandate = (Mandate) obj2;
                dj0.d topupAmount = mandateTopupFlowContract$InputData.f91003a;
                Intrinsics.checkNotNullParameter(mandate, "mandate");
                Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
                tVar.C2(new o(new FeatureCommand(new MandateUpdateLimitsFeatureConfig(null, new MandateUpdateLimitsDestination(mandate, topupAmount), false, null, 0, 61))));
                return Unit.f186387a;
        }
    }
}
