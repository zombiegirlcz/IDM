package g8i;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MoveMoneyReviewScreen moveMoneyReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        SuggestionsBarDelegate.Suggestion item = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarT2 = this.v.T2();
        Intrinsics.h(item);
        e0 e0Var = (e0) vVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        vrf.h hVar = e0Var.z;
        xrf.b bVar = (xrf.b) hVar;
        bVar.b(item.f53496h, item.f53492a);
        return Unit.f186387a;
    }
}
