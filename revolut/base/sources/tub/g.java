package tub;

import com.revolut.feature.rev_points.buying.impl.data.network.RevPointsBuyingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f274567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f274567w = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new g(this.f274567w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new g(this.f274567w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RevPointsBuyingService revPointsBuyingService = this.f274567w.f274568a;
                this.v = 1;
                Object pointsBuyingActivePackage = revPointsBuyingService.getPointsBuyingActivePackage(this);
                return pointsBuyingActivePackage == aVar ? aVar : pointsBuyingActivePackage;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RevPointsBuyingService revPointsBuyingService2 = this.f274567w.f274568a;
                this.v = 1;
                Object pointsBuyingPackages = revPointsBuyingService2.getPointsBuyingPackages(this);
                return pointsBuyingPackages == aVar2 ? aVar2 : pointsBuyingPackages;
        }
    }
}
