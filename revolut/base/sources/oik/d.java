package oik;

import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import yhm.o;
import yki.l;
import zfk.c;
import zfk.g;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f225706w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a aVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f225706w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f225706w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c.b bVar = (c.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = bVar instanceof zfk.i;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a aVar2 = this.v;
        if (z) {
            String str = ((zfk.i) bVar).d;
            if (str == null || aVar2.o.f225705c) {
                h.D2(this.f225706w);
            } else {
                Continuation continuation = null;
                if (aVar2.f103246r.y1(str)) {
                    aVar2.l2(new oh4.i(2, aVar2, str, continuation), new yi5.b(26));
                } else {
                    aVar2.C1(new ExternalDestination.Browser(str, null));
                }
            }
        } else {
            if (!(bVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.C1(u0.b(aVar2.f103245q.d()));
        }
        return Unit.f186387a;
    }
}
