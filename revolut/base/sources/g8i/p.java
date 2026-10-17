package g8i;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MoveMoneyReviewScreen moveMoneyReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarT2 = this.v.T2();
        Intrinsics.h(model);
        e0 e0Var = (e0) vVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        vrf.h hVar = e0Var.z;
        xrf.b bVar = (xrf.b) hVar;
        bVar.b(model.o, model.f51832a);
        return Unit.f186387a;
    }
}
