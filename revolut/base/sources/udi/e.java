package udi;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsPocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevPointsPocketDetailsScreen revPointsPocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar = (com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) kVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "REWARD_ITEM_ID")) {
            bVar.l2(new o(1, bVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
