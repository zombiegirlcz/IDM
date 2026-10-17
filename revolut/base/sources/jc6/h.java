package jc6;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringDonationAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RecurringDonationAmountScreen recurringDonationAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringDonationAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarH3 = this.v.T2();
        Intrinsics.h(model);
        s sVar = (s) lVarH3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        xi0.b bVar = (xi0.b) ((j) sVar.t2()).f172715c.getContent();
        if (bVar != null) {
            sVar.l2(new q(sVar, bVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
