package fxc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreen;
import com.revolut.feature.topup_screen.api.destination.ExternalCardDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SelectPaymentScreen selectPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectPaymentScreen;
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
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        String listId = model.f53228a;
        u uVar = (u) lVarD3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "EXTERNAL_CARD_ID_PREFIX", false)) {
            uVar.C1(new ExternalCardDetailsDestination(d0.e0(listId, "EXTERNAL_CARD_ID_PREFIX"), io3.l.CURRENT));
        }
        return Unit.f186387a;
    }
}
