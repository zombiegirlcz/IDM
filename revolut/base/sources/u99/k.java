package u99;

import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((yja.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        yja.b bVar = (yja.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = j.f278426a[bVar.ordinal()];
        com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar = this.v;
        int i2 = 1;
        if (i == 1) {
            e eVar = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.Companion;
            cVar.K2(ExchangeGlobalAccessOutput.FeatureNotAvailable.f78172a);
        } else if (i == 2) {
            e eVar2 = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.Companion;
            cVar.l2(new i(cVar, null, i2), new u69.g(cVar, new d(cVar, i2), 15));
        } else {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException(("Unexpected result of product article: " + o0.f186429a.b(yja.b.class).m()).toString());
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                oki.h.D2(cVar.z);
            }
        }
        return Unit.f186387a;
    }
}
