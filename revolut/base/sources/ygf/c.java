package ygf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringTransfersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecurringTransfersScreen recurringTransfersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringTransfersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.X.getValue();
        Intrinsics.h(model);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof p) {
            iVar.n2(new g(iVar, obj3, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
