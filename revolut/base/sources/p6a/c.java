package p6a;

import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockController;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import d6a.m;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SearchInBlockController f233235w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SearchInBlockController searchInBlockController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f233235w = searchInBlockController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f233235w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f233235w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f233235w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        SearchInBlockController searchInBlockController = this.f233235w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE3 = searchInBlockController.R2();
                Intrinsics.h(query);
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) fVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                m mVar = bVar.f80292r;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                mVar.f111478b.k(query);
                return Unit.f186387a;
            case 1:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE32 = searchInBlockController.R2();
                String listId = ((koi.j) obj3).getF52302a();
                Object f53564b = ((p) obj3).getF54982q();
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) fVarE32;
                bVar2.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar3 = bVar2.v;
                Intrinsics.checkNotNullParameter(listId, "listId");
                bVar2.f80291q.getClass();
                d6a.g gVarA = d6a.i.a(f53564b, listId);
                boolean z = gVarA instanceof d6a.e;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    oki.h.v2(aVar3, new SearchInBlockControllerContract$ModalStep.PaymentSelection(null), bottom_dialog);
                } else if (gVarA instanceof d6a.b) {
                    bVar2.n2(new oqk.i(bVar2, "openMigratePaymentByCard", new com.revolut.feature.payments_migration.impl.ui.screen.search.a(bVar2, ((d6a.b) gVarA).f111467a, null), (Continuation) null), new whi.b(6));
                } else if (gVarA instanceof d6a.c) {
                    bVar2.C2(new g(((d6a.c) gVarA).f111468a, x5a.b.DIRECT_DEBIT, bVar2.f80293s.d));
                } else if (gVarA instanceof d6a.d) {
                    oki.h.v2(aVar3, new SearchInBlockControllerContract$ModalStep.PaymentSelection(((d6a.d) gVarA).f111469a), bottom_dialog);
                } else {
                    if (!(gVarA instanceof d6a.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected parcel to be of type Provider");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE33 = searchInBlockController.R2();
                Object obj4 = aVar4.d;
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar3 = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) fVarE33;
                bVar3.getClass();
                String str = obj4 instanceof String ? (String) obj4 : null;
                if (str == null) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(v0.a.h(obj4, "Parcel ", " is not a deeplink"));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                } else {
                    bVar3.n2(new oqk.i(bVar3, "openDeeplink", new ol8.e(bVar3, str, continuation, 13), (Continuation) null), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
