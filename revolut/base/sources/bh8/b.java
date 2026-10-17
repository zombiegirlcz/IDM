package bh8;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorMigrationAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorMigrationAssetDetailsScreen juniorMigrationAssetDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorMigrationAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarI3 = this.v.T2();
        Intrinsics.h(item);
        u uVar = (u) iVarI3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        if (Intrinsics.f(str, "APPROVE_ITEM_ID")) {
            uVar.n2(new o(uVar, null, 0), new whi.b(6));
        } else if (Intrinsics.f(str, "DECLINE_ITEM_ID")) {
            uVar.z2();
        }
        return Unit.f186387a;
    }
}
