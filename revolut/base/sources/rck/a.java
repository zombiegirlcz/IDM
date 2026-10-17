package rck;

import com.revolut.retail.feature.plan_referrals.impl.network.PlanReferralsService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import uck.f;
import uck.h;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f253296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f253297b;

    public a(b bVar, int i) {
        this.f253296a = bVar;
        this.f253297b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f253296a;
        nj0.a aVar = bVar.f253299b;
        int i = this.f253297b;
        if (i == 0) {
            return new f((PlanReferralsService) bVar.d.get(), (j) bVar.e.get(), new p56.a(new h(fe0.d.a())), new uck.a());
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            d.Companion.getClass();
            return new ne0.d();
        }
        ik0.b retrofitFactory = ((nj0.d) aVar).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((nj0.d) aVar).d();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PlanReferralsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PlanReferralsService planReferralsService = (PlanReferralsService) objCreate;
        s.k(planReferralsService);
        return planReferralsService;
    }
}
