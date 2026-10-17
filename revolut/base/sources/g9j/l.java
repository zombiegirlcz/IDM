package g9j;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ t u;
    public final /* synthetic */ StakingProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StakingPocket f141926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, StakingProduct stakingProduct, StakingPocket stakingPocket, Continuation continuation) {
        super(1, continuation);
        this.u = tVar;
        this.v = stakingProduct;
        this.f141926w = stakingPocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.u, this.v, this.f141926w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ytd.a aVar2 = new ytd.a(null, this.v, this.f141926w);
        t tVar = this.u;
        tVar.N2(tVar.o2(aVar2), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new j(tVar, 1));
        return Unit.f186387a;
    }
}
