package a2g;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelExperiencesDetailsScreen travelExperiencesDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) kVarI3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        rVar.x2(new n(model, 0));
        return Unit.f186387a;
    }
}
