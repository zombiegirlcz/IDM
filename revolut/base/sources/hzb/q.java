package hzb;

import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsEarnScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(RevPointsEarnScreen revPointsEarnScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsEarnScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((DetailGridItemDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DetailGridItemDelegate.Model model = (DetailGridItemDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.earn.b bVar = (com.revolut.feature.rev_points.impl.ui.earn.b) uVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52184j;
        if (obj3 instanceof jzb.w) {
            bVar.l2(new hul.f0(bVar, ((jzb.w) obj3).f179724a, null, 25), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
