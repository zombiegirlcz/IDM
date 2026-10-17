package rvc;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rsl.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NameLocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NameLocationScreen nameLocationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = nameLocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Clause clause = suggestion.f53493b;
        nVarE3.getClass();
        Intrinsics.checkNotNullParameter(clause, "clause");
        nVarE3.H2(nVarE3.f257755r, new p(nVarE3, clause, 7));
        return Unit.f186387a;
    }
}
