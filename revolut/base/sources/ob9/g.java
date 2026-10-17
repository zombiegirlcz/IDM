package ob9;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i implements Function1 {
    public com.revolut.feature.onboarding.impl.onboarding.plan_selection.a u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f223900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.plan_selection.a f223901x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f223901x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f223901x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar;
        yki.i iVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f223900w;
        if (i == 0) {
            o.b(obj2);
            aVar = this.f223901x;
            yki.i iVar2 = aVar.v;
            this.u = aVar;
            this.v = iVar2;
            this.f223900w = 1;
            Object objJ2 = com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.J2(aVar, this);
            if (objJ2 == aVar2) {
                return aVar2;
            }
            iVar = iVar2;
            obj2 = objJ2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.v;
            aVar = this.u;
            o.b(obj2);
        }
        oki.h.u2(aVar, iVar, (FlowStep) obj2, TransitionAnimation.NONE.f98393a, 4);
        return Unit.f186387a;
    }
}
