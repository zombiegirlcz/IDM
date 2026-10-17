package k3k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RemittanceAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(RemittanceAmountScreen remittanceAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = remittanceAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarT2 = this.v.T2();
        String note = textData.f52598b.toString();
        t0 t0Var = (t0) b0VarT2;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        t0Var.B2(new jb8.a(note, 25));
        return Unit.f186387a;
    }
}
