package buf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ManualTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ManualTransferScreen manualTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = manualTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model parcel = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarT2 = this.v.T2();
        Intrinsics.h(parcel);
        a1 a1Var = (a1) kVarT2;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        a1Var.l2(new s0(a1Var, parcel, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
