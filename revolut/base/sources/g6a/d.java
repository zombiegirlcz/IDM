package g6a;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MigrateSubscriptionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MigrateSubscriptionsController migrateSubscriptionsController, Continuation continuation) {
        super(2, continuation);
        this.v = migrateSubscriptionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Object obj3 = model.i;
        com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) gVarE3;
        cVar.getClass();
        ProviderBlock.ExpandableVerticalList expandableVerticalList = obj3 instanceof ProviderBlock.ExpandableVerticalList ? (ProviderBlock.ExpandableVerticalList) obj3 : null;
        if (expandableVerticalList == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "Parcel ", " is not an ExpandableVerticalList block"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else {
            cVar.C2(new h(expandableVerticalList.d, ((f) ((j2) cVar.v.f22677a).getValue()).f, expandableVerticalList.f80235a, expandableVerticalList.f80236b));
        }
        return Unit.f186387a;
    }
}
