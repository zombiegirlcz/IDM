package hea;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PocketDetailsScreen pocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item.f53228a, "HIDE_ACCOUNT_DETAILS_ITEM_ID")) {
            aVar2.l2(new y(6, aVar2, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
