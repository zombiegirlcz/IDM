package xb9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a f304029w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304029w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f304029w, continuation, 0);
            default:
                return new n(this.f304029w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar2 = this.f304029w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a.I2(aVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                String str = (String) obj2;
                if (str == null) {
                    return null;
                }
                aVar2.f78504q.c(null, str, false, new wp0.b(aVar2, 25));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar4 = this.f304029w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a.I2(aVar4, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                String str2 = (String) obj2;
                if (str2 == null) {
                    return null;
                }
                nd.o oVar = aVar4.f78506s;
                String str3 = ((Object) aVar4.v.b(new TextLocalisedClause(R$string.waiting_list_share_content, null, null, 14))) + " " + str2;
                oVar.getClass();
                return aVar4.C1(new BridgeDestination(nd.o.i("", str3)));
        }
    }
}
