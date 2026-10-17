package j53;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomisationImageGenerationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CustomisationImageGenerationController customisationImageGenerationController, Continuation continuation) {
        super(2, continuation);
        this.v = customisationImageGenerationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Object obj3 = suggestion.f53496h;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String suggestion2 = (String) obj3;
        com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar2 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(suggestion2, "suggestion");
        aVar2.f65315r.R();
        aVar2.H2(aVar2.f65320y, new j3f.d(10));
        aVar2.l2(new r(aVar2, suggestion2, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
