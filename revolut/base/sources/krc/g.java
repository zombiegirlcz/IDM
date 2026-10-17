package krc;

import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReviewAccountDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ReviewAccountDetailsController reviewAccountDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reviewAccountDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReviewAccountDetailsController reviewAccountDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b) ((b) reviewAccountDetailsController.N.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar = (com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b) ((b) reviewAccountDetailsController.N.getValue());
                bVar.getClass();
                bVar.l2(new k(bVar, null, 1), new i(bVar, 0));
                break;
        }
        return Unit.f186387a;
    }
}
