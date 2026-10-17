package ywb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsGiftcardsSearchScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsGiftcardsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.u.R2();
        mVar.H2(mVar.f317410p, new yv8.j(7));
        jwb.e eVar = mVar.o;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(mVar, eVar.e(hVar), null, null, new l(mVar, null, 2), 3);
        yji.l.a1(mVar, eVar.c(null, hVar), null, null, new l(mVar, null, 1), 3);
        return Unit.f186387a;
    }
}
