package nig;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$Step;
import com.revolut.feature.travel.miles.impl.ui.screen.transaction.TravelMilesTransactionsListScreen;
import com.revolut.kompot.common.ModalDestination;
import d73.n;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesTransactionsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelMilesTransactionsListScreen travelMilesTransactionsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesTransactionsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarE3 = this.v.R2();
        Intrinsics.h(model);
        g gVar = (g) bVarE3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof RevPointsTransaction) {
            dgg.c cVar = gVar.f216103p;
            RevPointsTransaction transaction = (RevPointsTransaction) obj3;
            List list = ((a) ((j2) gVar.f216104q.f22677a).getValue()).f216094a.f196174a;
            ArrayList transactionsList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                a0.x(((lk0.e) it8.next()).f196171a, transactionsList);
            }
            com.revolut.feature.travel.miles.impl.ui.flow.b bVar = (com.revolut.feature.travel.miles.impl.ui.flow.b) cVar;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
            bVar.v = new n(bVar, 23);
            oki.h.w2(bVar.f94212x, new TravelMilesFlowContract$Step.OpenRevPointsTransactionPager(transaction.f84054a, transactionsList), ModalDestination.Style.FullscreenPaged.f98310a);
        }
        return Unit.f186387a;
    }
}
