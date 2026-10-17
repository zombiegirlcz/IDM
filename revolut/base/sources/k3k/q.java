package k3k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ RemittanceAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(RemittanceAmountScreen remittanceAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = remittanceAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t0 t0Var = (t0) this.u.T2();
        f2k.k kVar = t0Var.f180797w;
        List listA = t0Var.z2().a();
        if (listA == null) {
            listA = zhm.f0.f322471a;
        }
        od0.h hVar = od0.i.Companion;
        kq2.c cVar = t0Var.A2().k;
        hVar.getClass();
        rp0.y yVarB = kVar.b(listA, od0.h.a(cVar));
        t0Var.F.Q();
        t0Var.E.x(yVarB);
        return Unit.f186387a;
    }
}
