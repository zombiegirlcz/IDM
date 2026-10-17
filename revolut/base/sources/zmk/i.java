package zmk;

import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanTextDescriptor.Action.UrlNavigation f323609w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, PricingPlanTextDescriptor.Action.UrlNavigation urlNavigation, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f323609w = urlNavigation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f323609w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            k kVar = this.v;
            ajk.b bVar = kVar.f323611p;
            PricingPlanTextDescriptor.Action.UrlNavigation urlNavigation = this.f323609w;
            Object objB = igk.k.b(kVar, bVar, urlNavigation.f81150a, new zk7.a(kVar, urlNavigation, 5), this);
            if (objB != obj3) {
                objB = Unit.f186387a;
            }
            if (objB == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
