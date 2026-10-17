package zmk;

import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanTextDescriptor.Action.UrlNavigation f323607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, PricingPlanTextDescriptor.Action.UrlNavigation urlNavigation, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f323607w = urlNavigation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f323607w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        d0 d0VarC = ((s06.j) this.v.o).c(this.f323607w.f81150a, false, lg0.a.OPEN_BROWSER);
        this.u = 1;
        Object objB = nim.a.b(d0VarC, this);
        return objB == aVar ? aVar : objB;
    }
}
