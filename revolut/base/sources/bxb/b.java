package bxb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.uservouchers.RevPointsGiftcardsUserVouchersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardsUserVouchersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardsUserVouchersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        l lVar = (l) hVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof String) {
            String str = (String) obj3;
            lVar.l2(new k(lVar, str, null), new yi5.b(26));
            lVar.C2(new g(str));
        }
        return Unit.f186387a;
    }
}
