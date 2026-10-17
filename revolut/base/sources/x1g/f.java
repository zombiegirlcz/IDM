package x1g;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f51674g;
        if (obj3 instanceof TravelExperiencesPointsOption) {
            TravelExperiencesPointsOption option = (TravelExperiencesPointsOption) obj3;
            c0 c0Var = (c0) this.v.R2();
            c0Var.getClass();
            Intrinsics.checkNotNullParameter(option, "option");
            c0Var.H2(c0Var.I, new x0b.c(option, 9));
        }
        return Unit.f186387a;
    }
}
