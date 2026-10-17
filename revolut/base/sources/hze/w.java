package hze;

import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f157180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardTopUpType.RegularTopUp f157181x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CardTopUpType.RegularTopUp regularTopUp, com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.v = cVar;
        this.f157180w = ref$ObjectRef;
        this.f157181x = regularTopUp;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.f157181x, this.v, continuation, this.f157180w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        CardTopUpType.RegularTopUp regularTopUp = this.f157181x;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.v;
        v vVar = new v(regularTopUp, cVar, null, this.f157180w);
        this.u = 1;
        Object objP2 = cVar.p2(this, vVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
