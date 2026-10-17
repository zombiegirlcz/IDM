package x8j;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends gim.i implements Function1 {
    public final /* synthetic */ g0 u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StakingProduct f303421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StakingPocket f303422x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, String str, StakingProduct stakingProduct, StakingPocket stakingPocket, Continuation continuation) {
        super(1, continuation);
        this.u = g0Var;
        this.v = str;
        this.f303421w = stakingProduct;
        this.f303422x = stakingPocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.u, this.v, this.f303421w, this.f303422x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ytd.a aVar2 = new ytd.a(this.v, this.f303421w, this.f303422x);
        g0 g0Var = this.u;
        g0Var.N2(g0Var.o2(aVar2), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new p(g0Var, 1));
        return Unit.f186387a;
    }
}
