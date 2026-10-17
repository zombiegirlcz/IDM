package l8k;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.request.PaymentLinksRequestSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.f1;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ PaymentLinksRequestSelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaymentLinksRequestSelectionScreen paymentLinksRequestSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentLinksRequestSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.f102233a0.getValue();
        c70.a aVar2 = iVar.f193009r;
        e eVar = (e) ((d) iVar.t2()).f193002a.getContent();
        String str = eVar != null ? eVar.f193004b : null;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c70.a.b(aVar2, null, str, false, 5);
        iVar.X1(w.a("COPY_TOAST_DIALOG_ID", new TextLocalisedClause(R$string.payment_link_copied_to_clipboard, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, null, 92));
        return Unit.f186387a;
    }
}
