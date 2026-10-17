package hea;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f151672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f151673y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, io3.d dVar, AccountId accountId, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f151671w = aVar;
        this.f151672x = dVar;
        this.f151673y = accountId;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f151671w, this.f151672x, this.f151673y, continuation, 0);
            default:
                return new w(this.f151671w, this.f151672x, this.f151673y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarD = this.f151671w.f80859q.d(this.f151673y, this.f151672x);
                    this.v = 1;
                    if (nim.a.a(rVarD, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar3 = this.f151671w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarC = aVar3.f80859q.c(this.f151673y, this.f151672x);
                    this.v = 1;
                    if (nim.a.a(rVarC, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar3.H2(aVar3.U, new afa.s(io3.d.a(this.f151672x, null, io3.k.INACTIVE, 0L, null, 8388575), 5));
                return Unit.f186387a;
        }
    }
}
