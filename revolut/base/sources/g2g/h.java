package g2g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelExperiencesFilterScreen travelExperiencesFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarI3 = this.v.T2();
        Intrinsics.h(model);
        b bVar = (b) nVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_LIST_ID")) {
            bVar.y2();
        }
        return Unit.f186387a;
    }
}
