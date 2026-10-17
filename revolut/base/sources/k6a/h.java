package k6a;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentController;
import h93.g0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CardsPaymentController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CardsPaymentController cardsPaymentController, Continuation continuation) {
        super(2, continuation);
        this.u = cardsPaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((NewRevolutCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = (s) this.u.d();
        g0 g0Var = ((j) ((j2) sVar.v.f22677a).getValue()).e;
        String str = g0Var != null ? g0Var.f150130c : null;
        if (str == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("CVV value could not be copied");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else {
            int i = R$string.card_security_details_card_cvv_copied;
            r70.c.b(sVar.f181674t, 3);
            sVar.f181673s.c(null, str, true, new cli.b(sVar, "COPY_CVV_DIALOG_ID", i, 1));
        }
        return Unit.f186387a;
    }
}
