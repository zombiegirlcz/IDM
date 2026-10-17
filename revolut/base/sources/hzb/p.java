package hzb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import ft3.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsEarnScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(RevPointsEarnScreen revPointsEarnScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsEarnScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.d();
        Intrinsics.h(model);
        a aVar2 = ((com.revolut.feature.rev_points.impl.ui.earn.b) uVarE3).f83804w;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof RevPointsEarningRate) {
            ((i) aVar2).b3(((RevPointsEarningRate) obj3).f83975a);
        } else if (obj3 instanceof q0) {
            ((i) aVar2).Z2((q0) obj3);
        }
        return Unit.f186387a;
    }
}
