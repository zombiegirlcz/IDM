package vgf;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.t2;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TransactionsScreen transactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) uVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.e;
        String str = model.f52539a;
        if (Intrinsics.f(str, "ALL_UPCOMING_PAYMENTS_LIST_ITEM_ID")) {
            e1 e1Var = aVar2.f91941y;
            RecurringPaymentAccount recurringPaymentAccount = aVar2.B.f91928g;
            e1Var.getClass();
            Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
            aVar2.C1(new ScheduledPaymentsDestination(new ScheduledPaymentsInputData(recurringPaymentAccount, (ScheduledPaymentsInputData.InitialAction) null, 6), 2));
        } else if (obj3 instanceof t2) {
            aVar2.n2(new q0(aVar2, obj3, null), new whi.b(6));
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "TransactionsScreenModel", j6.a.q("Unexpected disclosure list id ", str), null, null, 16);
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
