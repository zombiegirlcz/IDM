package bh8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorMigrationAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JuniorMigrationAssetDetailsScreen juniorMigrationAssetDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorMigrationAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarI3 = this.v.T2();
        Intrinsics.h(model);
        u uVar = (u) iVarI3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "DECLINE_TRANSFER_BUTTON_LIST_ITEM_ID")) {
            uVar.n2(new o(uVar, null, 1), new whi.b(6));
        } else if (Intrinsics.f(str, "CLOSE_BOTTOM_SHEET_BUTTON_LIST_ITEM_ID")) {
            j60.a.v(uVar.u, false, null, 3);
        }
        return Unit.f186387a;
    }
}
