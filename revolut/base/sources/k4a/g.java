package k4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import k3k.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NewTransferScreen newTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD = this.v.d();
        Intrinsics.h(item);
        u uVar = (u) lVarD;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        uVar.l2(new q0(uVar, item, null, 6), new yi5.b(26));
        return Unit.f186387a;
    }
}
