package vnb;

import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import lcd.n;
import ncd.m;
import rnb.w;
import vdl.c1;
import vh2.j;
import vkm.q;
import wkm.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements mf1.c, mf1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f290783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f290784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ijb.a f290785c;
    public final slb.a d;
    public final elb.b e;
    public final t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f290786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ang.f f290787h;
    public final wsg.b i;

    public h(i savingsAddNewWidgetItemInfoProvider, w savingsVaultInteractor, ijb.a savingsProductInteractor, slb.a savingsCreationAvailabilityInteractor, elb.b savingsFeatureConfigInteractor, t pricingPlanInteractor, gte.a featureToggleInteractor, ang.f userInteractor, wsg.b walletInteractor) {
        Intrinsics.checkNotNullParameter(savingsAddNewWidgetItemInfoProvider, "savingsAddNewWidgetItemInfoProvider");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsCreationAvailabilityInteractor, "savingsCreationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f290783a = savingsAddNewWidgetItemInfoProvider;
        this.f290784b = savingsVaultInteractor;
        this.f290785c = savingsProductInteractor;
        this.d = savingsCreationAvailabilityInteractor;
        this.e = savingsFeatureConfigInteractor;
        this.f = pricingPlanInteractor;
        this.f290786g = featureToggleInteractor;
        this.f290787h = userInteractor;
        this.i = walletInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return nim.a.u(new dmf.b(this, null), u0.m(nim.a.v(u0.m(ijb.a.a(this.f290785c, null, null, u.c(m.ACTIVE), null, 11), rd0.e.b(this.f.q())), new j(this, 20)), q.q(nim.a.v(this.f290787h.j(w4l.j.f294644c), new vn8.a(1)))));
    }

    @Override // mf1.b
    public final Flow b() {
        return d();
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.d(new SavingsAccountCreationFlow$Destination(SavingsAccountCreationFlow$Filter.All.f83128a, null, 14));
    }

    public final Flow d() {
        n accountTypeFilter = n.f193865a;
        Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l lVarQ = q.Q(q.q(new hy9.b(zi0.c.w(this.d.b(accountTypeFilter, u.c(ncd.g.SAVINGS_DEPOSITS), loadingStrategy)), 6)), new c1((Continuation) null, this, 18));
        Boolean bool = Boolean.FALSE;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return q.q(zi0.c.M(lVarQ, bool, kotlin.time.c.g(5, pkm.e.SECONDS), "P4U:SavingsAvailability"));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return d();
    }
}
