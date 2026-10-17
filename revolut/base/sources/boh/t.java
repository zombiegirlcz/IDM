package boh;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q0h.a;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.collection.most_traded.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f17482w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f17482w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f17482w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            sgh.a aVar3 = aVar2.f96129q;
            a.C1329a c1329a = q0h.a.Companion;
            xzg.v vVar = this.f17482w.f17470a;
            c1329a.getClass();
            q0h.a aVarA = a.C1329a.a(vVar);
            this.u = 1;
            aVar3.getClass();
            obj2 = sgh.a.a(aVarA);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return aVar2.C1(new BridgeDestination(new FeatureCommand((FeatureConfig) obj2)));
    }
}
