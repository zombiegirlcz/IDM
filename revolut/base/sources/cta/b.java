package cta;

import com.revolut.feature.raffle.impl.data.service.RaffleService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f108651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f108652x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f108651w = cVar;
        this.f108652x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f108651w, this.f108652x, continuation, 0);
            case 1:
                return new b(this.f108651w, this.f108652x, continuation, 1);
            default:
                return new b(this.f108651w, this.f108652x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RaffleService raffleService = this.f108651w.f108655c;
                this.v = 1;
                Object objClaimRaffleReward = raffleService.claimRaffleReward(this.f108652x, this);
                return objClaimRaffleReward == aVar ? aVar : objClaimRaffleReward;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RaffleService raffleService2 = this.f108651w.f108655c;
                this.v = 1;
                Object notified = raffleService2.getNotified(this.f108652x, this);
                return notified == aVar2 ? aVar2 : notified;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RaffleService raffleService3 = this.f108651w.f108655c;
                this.v = 1;
                Object objOptInToRaffle = raffleService3.optInToRaffle(this.f108652x, this);
                return objOptInToRaffle == aVar3 ? aVar3 : objOptInToRaffle;
        }
    }
}
