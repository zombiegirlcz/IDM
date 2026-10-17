package b1c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTrophyRoomHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTrophyRoomHomeScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.trophy_room.home.b bVar = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model.c cVar = model.k;
        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
        Object obj3 = pfVar != null ? pfVar.f : null;
        if (obj3 instanceof d1c.e) {
            bVar.C2(a.c.f83926a);
        } else if (obj3 instanceof d1c.f) {
            bVar.C2(a.d.f83927a);
        } else if (obj3 instanceof d1c.d) {
            bVar.C2(a.b.f83925a);
        } else if (obj3 instanceof d1c.c) {
            bVar.C2(a.C0534a.f83924a);
        }
        return Unit.f186387a;
    }
}
