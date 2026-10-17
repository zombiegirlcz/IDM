package rlh;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.wealth.ui.impl.recurring_buy_hub_collection.RecurringBuyHubCollectionController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecurringBuyHubCollectionController f255049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RecurringBuyHubCollectionController recurringBuyHubCollectionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255049w = recurringBuyHubCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f255049w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f255049w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RecurringBuyHubCollectionController recurringBuyHubCollectionController = this.f255049w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) recurringBuyHubCollectionController.S.getValue();
                String listId = ((koi.j) obj3).getF52324a();
                Object f52328h = ((qv0.p) obj3).getF52328h();
                j jVar = (j) mVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
                    jVar.n2(new c(jVar, null, 1), new whi.b(6));
                } else if (f52328h instanceof s) {
                    jVar.n2(new r83.g(jVar, (s) f52328h, null, 27), new whi.b(6));
                } else if (f52328h instanceof c0) {
                    c0 c0Var = (c0) f52328h;
                    if (c0Var.equals(a0.f255045a)) {
                        jVar.n2(new h(jVar, null, 0), new whi.b(6));
                    } else {
                        if (!c0Var.equals(b0.f255048a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVar.n2(new h(jVar, null, 1), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            default:
                g6 selectedData = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar2 = (m) recurringBuyHubCollectionController.S.getValue();
                Intrinsics.h(selectedData);
                j jVar2 = (j) mVar2;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                if (Intrinsics.f(selectedData.f54200b.f52345g, u.f255072a)) {
                    jVar2.H2(jVar2.v, new amh.k(selectedData, 4));
                }
                return Unit.f186387a;
        }
    }
}
