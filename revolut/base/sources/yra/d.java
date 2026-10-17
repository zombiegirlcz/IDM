package yra;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PushToCardTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PushToCardTransferAmountScreen pushToCardTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pushToCardTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarJ3 = this.v.T2();
        Object obj3 = suggestion.f53496h;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String suggestion2 = (String) obj3;
        x xVar = (x) pVarJ3;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(suggestion2, "suggestion");
        xVar.x2(new t(xVar, suggestion2, 1));
        return Unit.f186387a;
    }
}
