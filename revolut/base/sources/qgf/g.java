package qgf;

import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlow;
import java.time.YearMonth;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactionListFlow f245798w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TransactionListFlow transactionListFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245798w = transactionListFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f245798w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f245798w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransactionListFlow transactionListFlow = this.f245798w;
        YearMonth yearMonth = null;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = transactionListFlow.e3();
                Intrinsics.h(query);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = aVar2.f91919t;
                j2Var.getClass();
                j2Var.g(null, query);
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (((com.revolut.feature.transaction_list.impl.ui.list.flow.a) transactionListFlow.e3()).f91920w <= 0) {
                    ((com.revolut.feature.transaction_list.impl.ui.list.flow.a) transactionListFlow.e3()).f91920w = transactionListFlow.d3().f174034b.getHeight();
                }
                i iVarE32 = transactionListFlow.e3();
                Intrinsics.h(id10);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar4 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) iVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                try {
                    yearMonth = YearMonth.parse(id10);
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                if (yearMonth != null) {
                    aVar4.H2(aVar4.u, new kp7.q(yearMonth, 5));
                    aVar4.f91917r.k(yearMonth);
                }
                break;
        }
        return Unit.f186387a;
    }
}
