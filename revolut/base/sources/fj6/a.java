package fj6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.breakdown.PaymentBreakdownBottomSheet;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentBreakdownBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PaymentBreakdownBottomSheet paymentBreakdownBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = paymentBreakdownBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ay4.a aVar2 = this.v.R;
        String listId = model.f51832a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "breakdown.exchangeRate")) {
            aVar2.C2(c.f135543a);
        } else if (Intrinsics.f(listId, "breakdown.fees")) {
            aVar2.C2(d.f135544a);
        }
        return Unit.f186387a;
    }
}
