package b1c;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTrophyRoomHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTrophyRoomHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.trophy_room.home.b bVar = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        y19.i iVar = obj3 instanceof y19.i ? (y19.i) obj3 : null;
        if (iVar != null) {
            String str = model.f52613a;
            if (Intrinsics.f(str, "PAID_PLAN_SHOW_MORE_ITEM_ID") || Intrinsics.f(str, "REV_POINTS_SHOW_MORE_ITEM_ID")) {
                bVar.C2(new l(iVar));
            }
        }
        return Unit.f186387a;
    }
}
