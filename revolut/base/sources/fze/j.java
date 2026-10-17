package fze;

import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f139188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardTopUpType.RegularTopUp f139189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f139190y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CardTopUpType.RegularTopUp regularTopUp, com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, String str, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.v = bVar;
        this.f139188w = ref$ObjectRef;
        this.f139189x = regularTopUp;
        this.f139190y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f139189x, this.v, this.f139190y, continuation, this.f139188w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        String str = this.f139190y;
        CardTopUpType.RegularTopUp regularTopUp = this.f139189x;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar = this.v;
        i iVar = new i(regularTopUp, bVar, str, null, this.f139188w);
        this.u = 1;
        Object objP2 = bVar.p2(this, iVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
