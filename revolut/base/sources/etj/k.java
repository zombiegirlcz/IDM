package etj;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public IncomeSorterDestination u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterDestination f129426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f129427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterDestinationId f129428y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(IncomeSorterDestination incomeSorterDestination, o oVar, IncomeSorterDestinationId incomeSorterDestinationId, Continuation continuation) {
        super(2, continuation);
        this.f129426w = incomeSorterDestination;
        this.f129427x = oVar;
        this.f129428y = incomeSorterDestinationId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.f129426w, this.f129427x, this.f129428y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IncomeSorterDestination incomeSorterDestination;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            IncomeSorterDestinationId.Crypto crypto = (IncomeSorterDestinationId.Crypto) this.f129428y;
            IncomeSorterDestination incomeSorterDestination2 = this.f129426w;
            this.u = incomeSorterDestination2;
            this.v = 1;
            obj2 = o.b(this.f129427x, crypto, this);
            if (obj2 == aVar) {
                return aVar;
            }
            incomeSorterDestination = incomeSorterDestination2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            incomeSorterDestination = this.u;
            yhm.o.b(obj2);
        }
        IncomeSorterDestinationId destinationId = (IncomeSorterDestinationId) obj2;
        dj0.d money = incomeSorterDestination.f99166a;
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        return new IncomeSorterDestination(money, destinationId);
    }
}
