package uid;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import gim.i;
import j96.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BidCustomInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BidCustomInputScreen bidCustomInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bidCustomInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = suggestion.f53496h;
        Double d = obj3 instanceof Double ? (Double) obj3 : null;
        if (d == null) {
            return Unit.f186387a;
        }
        double dDoubleValue = d.doubleValue();
        d dVarM3 = this.v.d();
        dVarM3.H2(dVarM3.o, new j(dDoubleValue, 1));
        return Unit.f186387a;
    }
}
