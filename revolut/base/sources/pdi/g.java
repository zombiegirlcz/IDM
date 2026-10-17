package pdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KTypeProjection;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f235249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f235249w = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(this.f235249w, continuation, 0);
                gVar.v = list;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(this.f235249w, continuation, 1);
                gVar2.v = list;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f235249w;
        switch (i) {
            case 0:
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.f235259c.G(list, "POINTS_POCKET_BENEFITS_KEY", kii.e.o(RevPointsPocketBenefit.class, KTypeProjection.INSTANCE, List.class));
                break;
            default:
                List list2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.f235259c.G(list2, "POINTS_POCKET_THRESHOLDS_KEY", kii.e.o(RevPointsPocketThreshold.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
