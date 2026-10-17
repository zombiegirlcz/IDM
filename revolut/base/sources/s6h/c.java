package s6h;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.wealth.gia.margin_trading.impl.navigation.internal_destinations.WealthMarginMinimumRequirementDestination;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MarginStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MarginStatusScreen marginStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = marginStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.S.getValue();
        Intrinsics.h(model);
        com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a aVar2 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "LIST_ID_REQUIRED_MINIMUM_ITEM")) {
            aVar2.C1(new WealthMarginMinimumRequirementDestination(aVar2.o.f95473a));
        }
        return Unit.f186387a;
    }
}
