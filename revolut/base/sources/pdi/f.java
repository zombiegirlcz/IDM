package pdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return p.a.j(RevPointsPocketBenefit.class, KTypeProjection.INSTANCE, List.class, kVar.f235259c, "POINTS_POCKET_BENEFITS_KEY");
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(RevPointsPocketState.class, kVar.f235259c, "POINTS_POCKET_KEY");
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return p.a.j(RevPointsPocketThreshold.class, KTypeProjection.INSTANCE, List.class, kVar.f235259c, "POINTS_POCKET_THRESHOLDS_KEY");
        }
    }
}
