package k4a;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import k3k.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NewTransferScreen newTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((IconDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconDelegate.Model item = (IconDelegate.Model) this.u;
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
