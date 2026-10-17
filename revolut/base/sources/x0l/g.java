package x0l;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ RiskWarningController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RiskWarningController riskWarningController, Continuation continuation) {
        super(2, continuation);
        this.u = riskWarningController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        vii.c cVar = ((i) this.u.S.getValue()).f301660p;
        Unit unit = Unit.f186387a;
        cVar.b(unit);
        return unit;
    }
}
