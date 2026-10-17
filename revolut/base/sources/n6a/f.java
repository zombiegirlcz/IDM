package n6a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaymentSelectionController paymentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = paymentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.T.getValue();
        String listId = model.f53228a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ITEM_PAY_BY_CARD")) {
            gVar.C2(b.f212749a);
        } else if (Intrinsics.f(listId, "LIST_ITEM_PAY_BY_DIRECT_DEBIT")) {
            gVar.C2(c.f212750a);
        } else {
            hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown ", listId)));
        }
        return Unit.f186387a;
    }
}
