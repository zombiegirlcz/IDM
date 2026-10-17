package rtj;

import com.revolut.retail.feature.impl.rewards_hub.network.RewardsHubService;
import kotlin.jvm.internal.Intrinsics;
import mtj.q;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f257278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257279b;

    public f(g gVar, int i) {
        this.f257278a = gVar;
        this.f257279b = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f257278a;
        nj0.a aVar = gVar.d;
        int i = this.f257279b;
        if (i == 0) {
            return new stj.h((mtj.e) gVar.f257287m.get());
        }
        if (i == 1) {
            ze0.a aVarA = gVar.f257281b.a();
            s.j(aVarA);
            RewardsHubService rewardsHubService = (RewardsHubService) gVar.f257286l.get();
            mtj.d dVar = new mtj.d((RewardsHubService) gVar.f257286l.get(), gVar.b());
            ne0.d dVar2 = new ne0.d();
            xe0.e eVarB = gVar.b();
            mk0.a aVarA2 = gVar.e.a();
            s.j(aVarA2);
            return new q(aVarA, rewardsHubService, dVar, dVar2, eVarB, aVarA2);
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            mtj.e eVar = (mtj.e) gVar.f257287m.get();
            gte.a aVarB = gVar.f257280a.b();
            s.j(aVarB);
            return new stj.k(eVar, aVarB);
        }
        ek.a converterFactory = ((nj0.d) aVar).d();
        ik0.b retrofitFactory = ((nj0.d) aVar).m();
        s.j(retrofitFactory);
        m.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(RewardsHubService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RewardsHubService rewardsHubService2 = (RewardsHubService) objCreate;
        s.k(rewardsHubService2);
        return rewardsHubService2;
    }
}
