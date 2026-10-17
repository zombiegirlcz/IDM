package rb6;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AmountSuggestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AmountSuggestionScreen amountSuggestionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = amountSuggestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarI3 = this.v.T2();
        Intrinsics.h(model);
        m mVar = (m) iVarI3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        mVar.x2(new raf.o(model, 2));
        return Unit.f186387a;
    }
}
