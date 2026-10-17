package ezb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsChallengesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsChallengesHomeScreen revPointsChallengesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsChallengesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar = (com.revolut.feature.rev_points.impl.ui.challenges.home.b) hVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        l0 l0Var = obj3 instanceof l0 ? (l0) obj3 : null;
        if (l0Var != null) {
            bVar.J2(l0Var.f201384a);
        }
        return Unit.f186387a;
    }
}
