package rhk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zfk.c;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b f254515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.d f254516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hha.d f254517y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar, hha.d dVar, hha.d dVar2, Continuation continuation) {
        super(2, continuation);
        this.f254515w = bVar;
        this.f254516x = dVar;
        this.f254517y = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f254515w, this.f254516x, this.f254517y, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c.b bVar = (c.b) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            boolean z = bVar instanceof zfk.i;
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar2 = this.f254515w;
            if (z) {
                hha.d dVar = this.f254516x;
                Intrinsics.h(dVar);
                this.v = null;
                this.u = 1;
                if (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b.J2(bVar2, dVar, this.f254517y, this) == aVar) {
                    return aVar;
                }
            } else {
                if (!(bVar instanceof zfk.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.C1(u0.b(bVar2.v.d()));
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
