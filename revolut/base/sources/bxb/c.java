package bxb;

import bt9.t;
import bxb.f;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.uservouchers.RevPointsGiftcardsUserVouchersScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardsUserVouchersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardsUserVouchersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "ERROR_STATE_ID");
        RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen = this.v;
        if (zF) {
            l lVar = (l) revPointsGiftcardsUserVouchersScreen.d();
            lVar.H2(lVar.f19657s, new t(27));
            lVar.I2();
        } else {
            l lVar2 = (l) revPointsGiftcardsUserVouchersScreen.d();
            lVar2.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            String str = model.f52373a;
            if (Intrinsics.f(str, "SECTION_EMPTY_LIST_WITH_UDED_ID")) {
                lVar2.C1(new RevPointsGiftcardsDestination(RevPointsGiftcardsDestination.StartType.UsedAndExpiredCards.f83667a, TransitionAnimation.SLIDE_END_TO_START.f98395a));
            } else if (Intrinsics.f(str, "SECTION_EMPTY_LIST_ID")) {
                lVar2.C2(f.a.f19650a);
            }
        }
        return Unit.f186387a;
    }
}
