package y5g;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.travel.flights.impl.ui.screen.documents.TravelFlightsDocumentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsDocumentsScreen travelFlightsDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        Intrinsics.h(model);
        k kVar = (k) hVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Continuation continuation = null;
        n7g.c cVar = obj3 instanceof n7g.c ? (n7g.c) obj3 : null;
        if (cVar != null) {
            RowDelegate.Model.c cVar2 = model.k;
            pf pfVar = cVar2 instanceof pf ? (pf) cVar2 : null;
            if (pfVar != null && (str = pfVar.f54594g) != null) {
                kVar.l2(new xge.f(kVar, cVar, str, continuation, 29), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
