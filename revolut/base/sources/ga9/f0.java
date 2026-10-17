package ga9;

import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wi0.b f142072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ OnboardingFlowContract$State f142073y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.onboarding.impl.onboarding.v vVar, wi0.b bVar, OnboardingFlowContract$State onboardingFlowContract$State, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f142071w = vVar;
        this.f142072x = bVar;
        this.f142073y = onboardingFlowContract$State;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f142071w, this.f142072x, this.f142073y, continuation, 0);
            default:
                return new f0(this.f142071w, this.f142072x, this.f142073y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f0) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    if (this.f142071w.W2(this.f142072x, this.f142073y, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142071w;
                    f0 f0Var = new f0(vVar, this.f142072x, this.f142073y, null, 0);
                    this.v = 1;
                    if (vVar.p2(this, f0Var) == aVar2) {
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
