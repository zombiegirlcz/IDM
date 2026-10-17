package zmk;

import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o9a.v;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanTextDescriptor.Action.UrlNavigation f323608w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, PricingPlanTextDescriptor.Action.UrlNavigation urlNavigation, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f323608w = urlNavigation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f323608w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        up4.h hVar = new up4.h(14);
        k kVar = this.v;
        v vVar = new v(kVar, 20);
        g gVar = new g(kVar, this.f323608w, null);
        this.u = 1;
        Object objQ = n14.k.Q(kVar, null, vVar, hVar, gVar, this, 1);
        return objQ == aVar ? aVar : objQ;
    }
}
