package aw7;

import akb.s;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PlanComparisonScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanComparisonScreen planComparisonScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planComparisonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.P.getValue();
        lVar.getClass();
        lVar.l2(new s(lVar, null, 26), new yi5.b(26));
        return Unit.f186387a;
    }
}
