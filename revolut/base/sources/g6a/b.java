package g6a;

import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import g23.q;
import g37.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MigrateSubscriptionsController f140896w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MigrateSubscriptionsController migrateSubscriptionsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140896w = migrateSubscriptionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f140896w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f140896w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f140896w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                b bVar4 = new b(this.f140896w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
            default:
                b bVar5 = new b(this.f140896w, continuation, 4);
                bVar5.v = obj2;
                return bVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        MigrateSubscriptionsController migrateSubscriptionsController = this.f140896w;
        switch (i) {
            case 0:
                String tabId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = migrateSubscriptionsController.R2();
                Intrinsics.h(tabId);
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) gVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                cVar.H2(cVar.v, new g58.h(tabId, 1));
                return Unit.f186387a;
            case 1:
                Boolean bool = (Boolean) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = migrateSubscriptionsController.R2();
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) gVarE32;
                cVar2.H2(cVar2.v, new cmc.a(zBooleanValue, 29));
                if (zBooleanValue) {
                    Intrinsics.checkNotNullParameter("", "query");
                    d6a.m mVar = cVar2.f80268s;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter("", "query");
                    mVar.f111478b.k("");
                }
                return Unit.f186387a;
            case 2:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE33 = migrateSubscriptionsController.R2();
                Intrinsics.h(query);
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar3 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) gVarE33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                d6a.m mVar2 = cVar3.f80268s;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                mVar2.f111478b.k(query);
                return Unit.f186387a;
            case 3:
                Object obj3 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE34 = migrateSubscriptionsController.R2();
                String listId = ((koi.j) obj3).getF55277b();
                Object f = ((p) obj3).getF55191g();
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar4 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) gVarE34;
                cVar4.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar5 = cVar4.f80270w;
                Intrinsics.checkNotNullParameter(listId, "listId");
                cVar4.f80267r.getClass();
                d6a.g gVarA = d6a.i.a(f, listId);
                boolean z = gVarA instanceof d6a.e;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    oki.h.v2(aVar5, new MigrateSubscriptionsControllerContract$ModalStep.PaymentSelection(null), bottom_dialog);
                } else if (gVarA instanceof d6a.b) {
                    cVar4.n2(new q(cVar4, "openMigratePaymentByCard", new com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.b(cVar4, ((d6a.b) gVarA).f111467a, null), (Continuation) null), new whi.b(6));
                } else if (gVarA instanceof d6a.c) {
                    cVar4.C2(new i(((d6a.c) gVarA).f111468a, x5a.b.DIRECT_DEBIT, ((f) ((j2) cVar4.v.f22677a).getValue()).f));
                } else if (gVarA instanceof d6a.d) {
                    oki.h.v2(aVar5, new MigrateSubscriptionsControllerContract$ModalStep.PaymentSelection(((d6a.d) gVarA).f111469a), bottom_dialog);
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
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE35 = migrateSubscriptionsController.R2();
                Object obj4 = aVar6.d;
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar5 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) gVarE35;
                cVar5.getClass();
                String str = obj4 instanceof String ? (String) obj4 : null;
                if (str == null) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(v0.a.h(obj4, "Parcel ", " is not a deeplink"));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                } else {
                    cVar5.n2(new q(cVar5, "openDeeplink", new z(cVar5, str, continuation, 2), (Continuation) null), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
