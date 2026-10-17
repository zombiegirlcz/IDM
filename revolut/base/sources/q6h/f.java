package q6h;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthMarginMinimumRequirementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WealthMarginMinimumRequirementScreen wealthMarginMinimumRequirementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = wealthMarginMinimumRequirementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar2 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) bVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.n2(new i(model, aVar2, null), new whi.b(6));
        return Unit.f186387a;
    }
}
