package kqd;

import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new JointAccountsFeatureConfig.Invite.Destination());
    }
}
