package b73;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.card_selection.screen.CardSelectionScreen;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CardSelectionScreen cardSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.P.getValue();
        Intrinsics.h(model);
        i iVar = (i) dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
        f0 f0Var = (f0) obj3;
        iVar.C2(new n63.d(f0Var.f150110a, Boolean.valueOf(f0Var.X())));
        return Unit.f186387a;
    }
}
