package wv2;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wv2.e;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShowCardPinScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShowCardPinScreen showCardPinScreen, Continuation continuation) {
        super(2, continuation);
        this.v = showCardPinScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.P.getValue();
        String listId = model.f53531a;
        n nVar = (n) fVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "PIN_TRIES_ACTION_ID")) {
            nVar.C2(e.b.f300274a);
        }
        return Unit.f186387a;
    }
}
