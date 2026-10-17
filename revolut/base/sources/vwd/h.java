package vwd;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function1 {
    public com.revolut.feature.staking.impl.stakingdetails.v2.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.stakingdetails.v2.a f292709w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.staking.impl.stakingdetails.v2.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f292709w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f292709w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.staking.impl.stakingdetails.v2.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.staking.impl.stakingdetails.v2.a aVar3 = this.f292709w;
            mre.c cVar = aVar3.f88158p;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.o, ((f) ((j2) aVar3.f88159q.f22677a).getValue()).f292705b);
            this.u = aVar3;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return aVar.C1(new BridgeDestination((NaviCommand) obj2));
    }
}
