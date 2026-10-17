package e1d;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ SemiIndependentOnboardingDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = semiIndependentOnboardingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) this.u.d()).u.a();
        return Unit.f186387a;
    }
}
