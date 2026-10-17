package b1c;

import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsTrophyRoomHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsTrophyRoomHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                revPointsTrophyRoomHomeScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) revPointsTrophyRoomHomeScreen.e3()).f83932t, RevPointsTrophyRoomHomeScreenContract$ModalStep.TotalSaved.f83923a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
