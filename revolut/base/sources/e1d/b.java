package e1d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreen;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SemiIndependentOnboardingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = semiIndependentOnboardingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.semi_independent_onboarding.impl.ui.details.b bVar = (com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) eVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model.c cVar = model.k;
        if ((cVar instanceof pf) && Intrinsics.f(((pf) cVar).f54594g, "TAG_VALUE_ACTION_EDIT")) {
            oki.h.v2(bVar.f85994t, SemiIndependentOnboardingDetailsScreenContract$ModalStep.UpdateParent.f85988a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
