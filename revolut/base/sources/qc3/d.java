package qc3;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.cash_topup.impl.ui.select_store.CashTopUpSelectStoreScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qc3.g;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CashTopUpSelectStoreScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CashTopUpSelectStoreScreen cashTopUpSelectStoreScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cashTopUpSelectStoreScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) ((i) this.u.Q.getValue())).C2(g.b.f244544a);
        return Unit.f186387a;
    }
}
