package uod;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TripsShareController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TripsShareController tripsShareController, Continuation continuation) {
        super(2, continuation);
        this.v = tripsShareController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = item.f58324n;
        kad.a action = obj3 instanceof kad.a ? (kad.a) obj3 : null;
        if (action == null) {
            return Unit.f186387a;
        }
        TripsShareController tripsShareController = this.v;
        g gVar = (g) tripsShareController.N.getValue();
        c cardBitmapFactory = new c(tripsShareController, 2);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(cardBitmapFactory, "cardBitmapFactory");
        gVar.l2(new sxe.g(gVar, action, cardBitmapFactory, (Continuation) null, 8), new yi5.b(26));
        return Unit.f186387a;
    }
}
