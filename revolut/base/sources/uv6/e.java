package uv6;

import com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell.FreelancerCashbackUpsellScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerCashbackUpsellScreen f283327w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283327w = freelancerCashbackUpsellScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f283327w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f283327w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ht6.a aVar = (ht6.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerCashbackUpsellScreen freelancerCashbackUpsellScreen = this.f283327w;
        switch (i) {
            case 0:
                ht6.a aVar = (ht6.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVar = (f) freelancerCashbackUpsellScreen.M.getValue();
                hha.d plan = aVar.f155327b;
                l lVar = (l) fVar;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                lVar.l2(new un8.j(lVar, plan, null, 13), new yi5.b(26));
                break;
            default:
                ht6.a aVar3 = (ht6.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVar2 = (f) freelancerCashbackUpsellScreen.M.getValue();
                hha.d plan2 = aVar3.f155327b;
                l lVar2 = (l) fVar2;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(plan2, "plan");
                lVar2.l2(new un8.j(lVar2, plan2, null, 13), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
