package sae;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentBalancePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaymentBalancePickerScreen paymentBalancePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentBalancePickerScreen;
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

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.R.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.subscriptions.impl.payment_balance_picker.b bVar = (com.revolut.feature.subscriptions.impl.payment_balance_picker.b) jVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        String str = null;
        if (!Intrinsics.f(listId, "ANY_CASH_ACCOUNT_ID")) {
            if (obj3 instanceof j1j.d) {
                str = ((j1j.d) obj3).f170617a;
            } else {
                hx7.e.n(new IllegalArgumentException("Cannot handle event: listId=" + listId + ", parcel=" + obj3));
            }
        }
        bVar.H2(bVar.f89232s, new s31.a(bVar, str, 18));
        return Unit.f186387a;
    }
}
