package bn1;

import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.data.network.ProductFeatureOnboardingService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om1.b;
import yhm.o;
import zjh.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f16993w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16993w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f16993w, continuation, 0);
            case 1:
                return new a(this.f16993w, continuation, 1);
            default:
                return new a(this.f16993w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ProductFeatureOnboardingService productFeatureOnboardingService = (ProductFeatureOnboardingService) this.f16993w.f322830b;
                    this.v = 1;
                    obj2 = productFeatureOnboardingService.getFeatureProfile(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return oc.c.x((dn1.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ProductFeatureOnboardingService productFeatureOnboardingService2 = (ProductFeatureOnboardingService) this.f16993w.f322830b;
                    this.v = 1;
                    obj2 = productFeatureOnboardingService2.registerFeature(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return oc.c.x((dn1.a) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    ProductFeatureOnboardingService productFeatureOnboardingService3 = (ProductFeatureOnboardingService) this.f16993w.f322830b;
                    this.v = 1;
                    if (productFeatureOnboardingService3.unregisterFeature(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return new om1.a(null, b.INACTIVATING);
        }
    }
}
