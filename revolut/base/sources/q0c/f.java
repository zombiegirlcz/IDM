package q0c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import vkm.j2;
import zhm.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTransactionsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevPointsTransactionsListScreen revPointsTransactionsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTransactionsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarF3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.d) pVarF3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof RevPointsTransaction) {
            RevPointsTransaction revPointsTransaction = (RevPointsTransaction) obj3;
            Object value = ((j2) dVar.f83893w.f22677a).getValue();
            l lVar = value instanceof l ? (l) value : null;
            if (lVar != null) {
                k kVar = lVar.f241233a;
                if (kVar instanceof i) {
                    List list = ((i) kVar).f241231a.f196174a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        a0.x(((lk0.e) it8.next()).f196171a, arrayList);
                    }
                    dVar.n2(new mp6.j(18, arrayList, dVar, revPointsTransaction, lVar.f241234b, lVar.f241235c, (Continuation) null), new whi.b(6));
                } else {
                    dVar.C2(new n(revPointsTransaction));
                }
            }
        } else if (obj3 instanceof a3) {
            dVar.C2(new m((a3) obj3));
        }
        return Unit.f186387a;
    }
}
