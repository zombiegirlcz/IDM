package sx2;

import com.revolut.feature.cards.models.design.CardDesignLockInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e93.q f266315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardDesignLockInfo.Challenge f266316x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, e93.q qVar, CardDesignLockInfo.Challenge challenge, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f266315w = qVar;
        this.f266316x = challenge;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f266315w, this.f266316x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            if (skm.k0.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        this.v.R2(this.f266315w.f123888b, this.f266316x);
        return Unit.f186387a;
    }
}
