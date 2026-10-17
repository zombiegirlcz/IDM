package buf;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ManualTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ManualTransferScreen manualTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = manualTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model inputModel = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarT2 = this.v.T2();
        Intrinsics.h(inputModel);
        a1 a1Var = (a1) kVarT2;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(inputModel, "inputModel");
        a1Var.l2(new p0(a1Var, inputModel, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
