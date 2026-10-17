package ja2;

import com.revolut.feature.apm.payid.impl.flow.PayIdFlowContract$InputData;
import com.revolut.feature.apm.payid.impl.flow.PayIdFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cu8.r0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ks8.j;
import ks8.m;
import oki.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.flow.a f172411w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.apm.payid.impl.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f172411w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f172411w, continuation, 0);
            default:
                return new d(this.f172411w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep otp;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.apm.payid.impl.flow.a aVar2 = this.f172411w;
                if (i == 0) {
                    o.b(obj2);
                    r0 r0Var = aVar2.f62706p;
                    this.v = 1;
                    obj2 = m.b(r0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                j jVar = (j) obj2;
                if (jVar instanceof ks8.i) {
                    aVar2.C1(u0.b(((ks8.i) jVar).f189312a));
                    h.D2(aVar2.f62708r);
                } else {
                    if (!(jVar instanceof j.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yki.i iVar = aVar2.f62708r;
                    PayIdFlowContract$InputData payIdFlowContract$InputData = aVar2.o;
                    if (payIdFlowContract$InputData instanceof PayIdFlowContract$InputData.VerifyOwnership) {
                        PayIdFlowContract$InputData.VerifyOwnership verifyOwnership = (PayIdFlowContract$InputData.VerifyOwnership) payIdFlowContract$InputData;
                        otp = new PayIdFlowContract$Step.Otp(verifyOwnership.f62698b, verifyOwnership.f62697a);
                    } else {
                        otp = PayIdFlowContract$Step.Area.f62700a;
                    }
                    h.t2(aVar2, iVar, otp, false, null, false, 14);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.apm.payid.impl.flow.a aVar4 = this.f172411w;
                    d dVar = new d(aVar4, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, dVar) == aVar3) {
                        return aVar3;
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
