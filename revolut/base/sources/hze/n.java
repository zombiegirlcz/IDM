package hze;

import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f157166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardTopUpType.RegularTopUp f157167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f157168y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CardTopUpType.RegularTopUp regularTopUp, com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, String str, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.v = cVar;
        this.f157166w = ref$ObjectRef;
        this.f157167x = regularTopUp;
        this.f157168y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.f157167x, this.v, this.f157168y, continuation, this.f157166w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        String str = this.f157168y;
        CardTopUpType.RegularTopUp regularTopUp = this.f157167x;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.v;
        m mVar = new m(regularTopUp, cVar, str, null, this.f157166w);
        this.u = 1;
        Object objP2 = cVar.p2(this, mVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
