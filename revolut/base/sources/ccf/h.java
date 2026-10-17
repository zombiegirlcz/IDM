package ccf;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddOnsGoodbyeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddOnsGoodbyeScreen addOnsGoodbyeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addOnsGoodbyeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarJ3 = this.v.T2();
        Object obj3 = suggestion.f53496h;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.data.models.TradingAddOnDowngradeReasonsDto");
        qbf.i reasonToLeave = (qbf.i) obj3;
        t tVar = (t) pVarJ3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(reasonToLeave, "reasonToLeave");
        tVar.x2(new c7e.i(reasonToLeave, tVar, 9));
        return Unit.f186387a;
    }
}
