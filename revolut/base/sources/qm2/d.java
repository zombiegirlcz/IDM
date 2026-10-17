package qm2;

import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.k0;
import skm.w1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.backgroundpicker.impl.flow.a f247767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.backgroundpicker.impl.flow.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247767w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f247767w, continuation, 0);
            default:
                return new d(this.f247767w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.backgroundpicker.impl.flow.a aVar2 = this.f247767w;
                aVar2.f63747q.getClass();
                return aVar2.C1(KompotProfileFeatureConfig.AppearanceDestination.f81330a);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                w1 w1Var = w1.f264016b;
                d dVar = new d(this.f247767w, null, 0);
                this.v = 1;
                Object objJ = e0.J(w1Var, dVar, this);
                return objJ == aVar3 ? aVar3 : objJ;
        }
    }
}
