package uhj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.EsimGiftRecipientSelectionScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import twb.b0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimGiftRecipientSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimGiftRecipientSelectionScreen;
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

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Q.getValue();
        Object obj3 = model.u;
        com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) fVar;
        aVar2.getClass();
        Continuation continuation = null;
        EsimGiftRecipient esimGiftRecipient = obj3 instanceof EsimGiftRecipient ? (EsimGiftRecipient) obj3 : null;
        if (esimGiftRecipient != null) {
            aVar2.f100971q.getClass();
            aVar2.l2(new b0(aVar2, esimGiftRecipient, ugc.a.n(esimGiftRecipient), continuation, 17), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
