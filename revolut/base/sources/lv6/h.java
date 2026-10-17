package lv6;

import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreen;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerCashbackBoosterScreen f200325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f200325w = freelancerCashbackBoosterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f200325w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f200325w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen = this.f200325w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = freelancerCashbackBoosterScreen.d();
                String id10 = aVar.f275445a;
                com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b bVar = (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) pVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "ITEM_ID_FREELANCER_TERMS_CLICKABLE_PART")) {
                    bVar.C1(u0.c(ProfileFeatureConfig.Terms.f81349a));
                }
                break;
            default:
                a3 transaction = (a3) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b bVar2 = (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) freelancerCashbackBoosterScreen.d();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                bVar2.C2(new n(transaction));
                break;
        }
        return Unit.f186387a;
    }
}
