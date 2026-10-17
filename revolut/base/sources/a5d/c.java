package a5d;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.settings.preview.transactionsCount.TransactionsCountPreviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsCountPreviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransactionsCountPreviewController transactionsCountPreviewController, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsCountPreviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.N.getValue();
        Intrinsics.h(suggestion);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Object obj3 = suggestion.f53496h;
        if (d0.J(suggestion.f53492a, "TRANSACTION_AMOUNT_", false) && (obj3 instanceof Integer)) {
            iVar.l2(new h(iVar, obj3, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
