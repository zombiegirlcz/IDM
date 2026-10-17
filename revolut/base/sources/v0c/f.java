package v0c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTrophyRoomDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevPointsTrophyRoomDetailsScreen revPointsTrophyRoomDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTrophyRoomDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.trophy_room.details.c cVar = (com.revolut.feature.rev_points.impl.ui.trophy_room.details.c) hVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof y19.a) {
            oki.h.v2(cVar.f83910t, new RevPointsTrophyRoomDetailsScreenContract$ModalStep.BottomSheet(((y19.a) obj3).e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
