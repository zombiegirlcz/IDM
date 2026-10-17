package chg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesAirlinesSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesAirlinesSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.R2();
        Intrinsics.h(model);
        j jVar = (j) gVarE3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f53228a, "AIRLINE_ITEM_ID_", false)) {
            jVar.f24228p.Z2(new i(jVar, model, null));
        }
        return Unit.f186387a;
    }
}
