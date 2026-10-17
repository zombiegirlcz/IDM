package iz1;

import com.revolut.feature.apm.core.impl.data.network.onboarding.ApmOnboardingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f169824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dx1.b f169825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i02.d f169826y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, dx1.b bVar, i02.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169824w = hVar;
        this.f169825x = bVar;
        this.f169826y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f169824w, this.f169825x, this.f169826y, continuation, 0);
            default:
                return new e(this.f169824w, this.f169825x, this.f169826y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB = h.b(this.f169824w, this.f169825x, this.f169826y, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ApmOnboardingService apmOnboardingService = this.f169824w.f169829a;
                    String id10 = this.f169825x.getId();
                    bz1.c cVar = new bz1.c(this.f169826y);
                    wj0.b bVar = new wj0.b("payments_apm_onboarding");
                    this.v = 1;
                    obj2 = apmOnboardingService.postOnboardingRegister(id10, cVar, bVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bz1.f fVar = (bz1.f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                String status = fVar.getStatus();
                if (Intrinsics.f(status, "ACTIVE")) {
                    return i02.f.f157280a;
                }
                if (Intrinsics.f(status, "PENDING")) {
                    return i02.g.f157281a;
                }
                throw new IllegalArgumentException(j6.a.q("Unknown APM user registration result: ", fVar.getStatus()));
        }
    }
}
