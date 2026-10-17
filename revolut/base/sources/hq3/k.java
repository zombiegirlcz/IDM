package hq3;

import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mri.w;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f154597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f154597w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f154597w, continuation, 0);
            default:
                return new k(this.f154597w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                o oVar = this.f154597w;
                w wVar = oVar.f154605w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pw5.a.x(wVar);
                    w.r0(wVar, ((CreditOnboardingClosePayload) oVar.f154600p.f66220a).f66907a.f66892b);
                    this.v = 1;
                    if (o.z2(oVar, this) == aVar) {
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
                o oVar2 = this.f154597w;
                w wVar2 = oVar2.f154605w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pw5.a.w(wVar2);
                    w.r0(wVar2, ((CreditOnboardingClosePayload) oVar2.f154600p.f66220a).f66907a.f66892b);
                    this.v = 1;
                    if (o.y2(oVar2, this) == aVar2) {
                        return aVar2;
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
