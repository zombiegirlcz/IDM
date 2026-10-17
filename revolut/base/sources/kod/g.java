package kod;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TripsEditOptionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TripsEditOptionsController tripsEditOptionsController, Continuation continuation) {
        super(2, continuation);
        this.v = tripsEditOptionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        b option = obj3 instanceof b ? (b) obj3 : null;
        if (option != null) {
            h hVar = (h) this.v.N.getValue();
            hVar.getClass();
            Intrinsics.checkNotNullParameter(option, "option");
            hVar.C2(new c(option));
        }
        return Unit.f186387a;
    }
}
