package vgf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.support.api.navigation.InboundTransferTrackerDestination;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t2;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TransactionsScreen transactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) uVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "LOCATE_INBOUND_TRANSFER_LIST_ITEM_ID")) {
            f7d.d dVar = aVar2.f91941y.f289091g;
            aVar2.C1(InboundTransferTrackerDestination.f89356a);
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof a3) {
                aVar2.n2(new t0(aVar2, obj3, null), new whi.b(6));
            } else if (obj3 instanceof UnifiedTransaction.Invest) {
                aVar2.n2(new v0(aVar2, obj3, null), new whi.b(6));
            } else if (obj3 instanceof qua.p) {
                aVar2.n2(new w0(aVar2, obj3, null), new whi.b(6));
            } else if (obj3 instanceof t2) {
                aVar2.n2(new x0(aVar2, obj3, null), new whi.b(6));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "TransactionsScreenModel", a0.d.l(obj3 != null ? obj3.getClass() : null, "Unexpected row parcel type "), null, null, 16);
                Unit unit = Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
