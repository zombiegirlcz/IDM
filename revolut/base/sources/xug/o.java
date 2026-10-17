package xug;

import aw0.n6;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReviewClosureConditionsBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(ReviewClosureConditionsBottomSheetController reviewClosureConditionsBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reviewClosureConditionsBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            default:
                return new o(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReviewClosureConditionsBottomSheetController reviewClosureConditionsBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                reviewClosureConditionsBottomSheetController.m3().C2(l.f309068a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                reviewClosureConditionsBottomSheetController.m3().C2(i.f309066a);
                break;
        }
        return Unit.f186387a;
    }
}
