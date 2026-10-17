package br4;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.h3;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.details.a f17892w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.credit.card.impl.ui.details.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f17892w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f17892w, continuation, 0);
            case 1:
                return new f0(this.f17892w, continuation, 1);
            default:
                return new f0(this.f17892w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.card.impl.ui.details.a aVar2 = this.f17892w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarA = aVar2.u.a();
                    this.v = 1;
                    if (nim.a.b(nVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.v.getClass();
                return aVar2.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.ACCOUNT_DETAILS, new ft3.n(null, 3), null, null, null, null, 16378))));
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.details.a aVar4 = this.f17892w;
                f0 f0Var = new f0(aVar4, null, 0);
                this.v = 1;
                Object objP2 = aVar4.p2(this, f0Var);
                return objP2 == aVar3 ? aVar3 : objP2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.details.a aVar6 = this.f17892w;
                h3 h3Var = aVar6.A;
                String str = aVar6.o.f69221a;
                this.v = 1;
                Object objB = h3Var.f226596b.b(str, yw4.f.MSI_SHOPS_VIEW, this);
                return objB == aVar5 ? aVar5 : objB;
        }
    }
}
