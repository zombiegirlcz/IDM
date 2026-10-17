package axb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.usedexpiredcards.RevPointsGiftcardsUsedExpiredCardsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsGiftcardsUsedExpiredCardsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsGiftcardsUsedExpiredCardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) ((g) this.u.R.getValue());
        a2 a2Var = jVar.f10921q;
        if (a2Var != null) {
            a2Var.f(null);
        }
        jVar.H2(jVar.f10922r, new ax9.a(5));
        jVar.I2();
        return Unit.f186387a;
    }
}
