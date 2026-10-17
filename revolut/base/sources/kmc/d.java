package kmc;

import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f185755b;

    public /* synthetic */ d(s sVar, int i) {
        this.f185754a = i;
        this.f185755b = sVar;
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f185754a) {
            case 0:
                OnboardingFlowContract$State it8 = (OnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                s sVar = this.f185755b;
                yki.i iVar = sVar.z;
                oki.h.r2(iVar);
                oki.h.t2(sVar, iVar, OnboardingFlowContract$Step.STRATEGY_REVEAL, false, null, false, 12);
                return Unit.f186387a;
            default:
                xmc.k it9 = (xmc.k) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                s sVar2 = this.f185755b;
                OnboardingFlowContract$State onboardingFlowContract$State = (OnboardingFlowContract$State) ((j2) sVar2.f185782y.f22677a).getValue();
                ilc.a aVar = onboardingFlowContract$State.f85122b;
                if (aVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (aVar == ilc.a.GB && ((Boolean) sVar2.f185781x.getValue()).booleanValue()) {
                    sVar2.l2(new ack.o((Object) sVar2, (Object) new d(sVar2, 0), (Object) onboardingFlowContract$State, false, (Continuation) null, 12), new yi5.b(26));
                } else {
                    sVar2.l2(new ack.o((Object) sVar2, (Object) new k65.d(1, sVar2, s.class, "completeOnboarding", "completeOnboarding(Lcom/revolut/feature/robo/impl/ui/flow/onboarding/OnboardingFlowContract$State;)V", 0, 22), (Object) onboardingFlowContract$State, true, (Continuation) null, 12), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
