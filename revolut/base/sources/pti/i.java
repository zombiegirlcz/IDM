package pti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftConfigService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import oti.d0;
import oti.q1;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f239740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f239740w = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new i(this.f239740w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new i(this.f239740w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    AsftConfigService asftConfigService = this.f239740w.f239741a;
                    this.v = 1;
                    obj2 = asftConfigService.getConfig(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                d0 d0Var = (d0) obj2;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                return new AsftConfig(d0Var.f229626a, d0Var.f229627b, qti.a.c(d0Var.f229628c), d0Var.d, d0Var.e);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    AsftConfigService asftConfigService2 = this.f239740w.f239741a;
                    this.v = 1;
                    obj2 = asftConfigService2.getProductArticle(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((q1) obj2).f229680a;
        }
    }
}
