package jb1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker.AccountPickerScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker.AccountPickerScreenContract$InputData;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CheckoutScreen checkoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        String listId = model.f53228a;
        x xVar = (x) kVarI3;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "PAYMENT_METHOD_LIST_ID") && (list = (List) ((g) xVar.t2()).f172551b.getContent()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof PaymentMethod.Wallet) {
                    arrayList.add(obj3);
                }
            }
            PaymentMethod paymentMethod = ((g) xVar.t2()).d;
            yji.l.g2(xVar, new AccountPickerScreen(new AccountPickerScreenContract$InputData(arrayList, paymentMethod instanceof PaymentMethod.Wallet ? (PaymentMethod.Wallet) paymentMethod : null)), null, new p(xVar, 1), 1);
        }
        return Unit.f186387a;
    }
}
