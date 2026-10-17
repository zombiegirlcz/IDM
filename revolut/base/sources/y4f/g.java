package y4f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HoldingsInformationEntryController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HoldingsInformationEntryController holdingsInformationEntryController, Continuation continuation) {
        super(2, continuation);
        this.v = holdingsInformationEntryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.trading.impl.ui.holdings.information.entry.a aVar2 = (com.revolut.feature.trading.impl.ui.holdings.information.entry.a) hVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_ID")) {
            aVar2.f91222s.b(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
