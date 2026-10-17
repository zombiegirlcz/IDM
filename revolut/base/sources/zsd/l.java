package zsd;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import djb.n;
import djb.u;
import efm.r;
import g48.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.l0;
import rnb.x;
import tnb.g0;
import wa7.m;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements frd.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f324899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ijb.a f324900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final toh.d f324901c;
    public final n d;
    public final u e;
    public final elb.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f324902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f324903h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f324904j;
    public final ang.f k;

    public l(f savingsNetworthProductsMapper, ijb.a savingsProductInteractor, toh.d savingsAvailabilityInteractor, n savingsAccountsDetailsInteractor, u tradingOnboardingStatusProvider, elb.b savingsFeatureConfigInteractor, r0 jointAccountsInteractor, gte.a featureToggleInteractor, m hiddenAccountsInteractor, g0 savingsEntryPointsContentProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(savingsNetworthProductsMapper, "savingsNetworthProductsMapper");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsEntryPointsContentProvider, "savingsEntryPointsContentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f324899a = savingsNetworthProductsMapper;
        this.f324900b = savingsProductInteractor;
        this.f324901c = savingsAvailabilityInteractor;
        this.d = savingsAccountsDetailsInteractor;
        this.e = tradingOnboardingStatusProvider;
        this.f = savingsFeatureConfigInteractor;
        this.f324902g = jointAccountsInteractor;
        this.f324903h = featureToggleInteractor;
        this.i = hiddenAccountsInteractor;
        this.f324904j = savingsEntryPointsContentProvider;
        this.k = userInteractor;
    }

    @Override // frd.k
    public final Flow b() {
        return frd.k.a(this, new d7e.f(toh.d.g(this.f324901c, null, 3), 4), new zh0.b(this, 19));
    }

    public final r c(List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((SavingsAccountDetails) it8.next()).f86460a.e == l0.MONEY_MARKET_FUND_SAVINGS) {
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((SavingsAccountDetails) it9.next()).f86460a);
                    }
                    return nim.a.w(((x) this.e).a(arrayList, w4l.h.f294642c), new zp5.f(this, list, 9));
                }
            }
        }
        return zi0.c.j(this.f324899a.a(list, null));
    }
}
