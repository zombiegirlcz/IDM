package zxi;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesPassActivityFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AirportLoungesPassActivityFiltersScreen airportLoungesPassActivityFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesPassActivityFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        Intrinsics.h(model);
        i iVar = (i) gVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        Pair pair = obj3 instanceof Pair ? (Pair) obj3 : null;
        if (pair != null) {
            Object obj4 = pair.f186385a;
            Object obj5 = pair.f186386b;
            if ((obj4 instanceof String) && (obj5 instanceof String)) {
                iVar.H2(iVar.o, new ep7.j(iVar, obj4, obj5));
            }
        }
        return Unit.f186387a;
    }
}
