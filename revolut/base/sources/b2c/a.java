package b2c;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.breakdown.RevPointsSpareChangeBreakdownController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ RevPointsSpareChangeBreakdownController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevPointsSpareChangeBreakdownController revPointsSpareChangeBreakdownController, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsSpareChangeBreakdownController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((b) this.u.T.getValue()).B2();
        return Unit.f186387a;
    }
}
