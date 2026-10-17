package zmk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanPageBottomSheetScreen f323606w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PlanPageBottomSheetScreen planPageBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323606w = planPageBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f323606w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f323606w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanPageBottomSheetScreen planPageBottomSheetScreen = this.f323606w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((b) planPageBottomSheetScreen.S.getValue())).I2(aVar.d);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((b) planPageBottomSheetScreen.S.getValue())).I2(aVar3.d);
                break;
        }
        return Unit.f186387a;
    }
}
