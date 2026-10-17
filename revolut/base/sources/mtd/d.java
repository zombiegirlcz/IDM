package mtd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetController;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mpd.p;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelRemoveWidgetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelRemoveWidgetController travelRemoveWidgetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelRemoveWidgetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelRemoveWidgetController travelRemoveWidgetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) travelRemoveWidgetController.O.getValue();
                fVar.getClass();
                Intrinsics.checkNotNullParameter("CANCEL_ID", "itemId");
                fVar.n2(new p("CANCEL_ID", fVar, null, 6), new whi.b(6));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) travelRemoveWidgetController.O.getValue();
                fVar2.getClass();
                Intrinsics.checkNotNullParameter("REMOVE_ID", "itemId");
                fVar2.n2(new p("REMOVE_ID", fVar2, null, 6), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
