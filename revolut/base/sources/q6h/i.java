package q6h;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FullScreenStateDelegate.Model f242601w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FullScreenStateDelegate.Model model, com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f242601w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.f242601w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        FullScreenStateDelegate.Model model = this.f242601w;
        com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar2 = this.v;
        h hVar = new h(model, aVar2, null);
        this.u = 1;
        Object objB = pu7.a.B(aVar2.k, "WealthMarginMinimumRequirementScreenModel_onFullScreenStateMainActionClicked", hVar, this);
        return objB == aVar ? aVar : objB;
    }
}
