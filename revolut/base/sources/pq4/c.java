package pq4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.credit_card_limit.CreditCardLimitDialogScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditCardLimitDialogScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditCardLimitDialogScreen creditCardLimitDialogScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditCardLimitDialogScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.U.getValue();
        String id10 = model.f53228a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "id_credit_card_limit_dialog_increase")) {
            hVar.C2(f.f238687a);
        } else if (Intrinsics.f(id10, "id_credit_card_limit_dialog_decrease")) {
            hVar.C2(e.f238686a);
        }
        return Unit.f186387a;
    }
}
