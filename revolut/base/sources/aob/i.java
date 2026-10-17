package aob;

import amh.j;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import djb.k;
import djb.l;
import djb.n;
import djb.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ku1.f0;
import ne0.k;
import pie.v;
import tnb.d0;
import wa7.m;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f7967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f7968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ijb.a f7969c;
    public final toh.d d;
    public final u e;
    public final x79.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final elb.b f7970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f7971h;
    public final ou5.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xqe.b f7972j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ugc.a f7973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f7974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f7975n;

    public i(d0 mapper, n savingsAccountsDetailsInteractor, ijb.a savingsProductInteractor, toh.d savingsAvailabilityInteractor, u tradingOnboardingStatusProvider, x79.a onHoldAccountInteractor, elb.b savingsFeatureConfigInteractor, f filterMapper, ou5.b juniorProfilesDataInteractor, xqe.b teenProfileInteractor, m hiddenAccountsInteractor, ugc.a savingsChallengeInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(filterMapper, "filterMapper");
        Intrinsics.checkNotNullParameter(juniorProfilesDataInteractor, "juniorProfilesDataInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f7967a = mapper;
        this.f7968b = savingsAccountsDetailsInteractor;
        this.f7969c = savingsProductInteractor;
        this.d = savingsAvailabilityInteractor;
        this.e = tradingOnboardingStatusProvider;
        this.f = onHoldAccountInteractor;
        this.f7970g = savingsFeatureConfigInteractor;
        this.f7971h = filterMapper;
        this.i = juniorProfilesDataInteractor;
        this.f7972j = teenProfileInteractor;
        this.k = hiddenAccountsInteractor;
        this.f7973l = savingsChallengeInteractor;
        this.f7974m = userInteractor;
        this.f7975n = new k(new an4.f(this, 14), null);
    }

    @Override // pfe.g
    public final Flow a() {
        return rd0.e.e(mo3.a.e(toh.d.g(this.d, null, 3), new f0(22), new an4.g(20)), h0.f322473a, new a35.k(3, 11, null));
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow c(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, sfe.a dataLoadingMode) {
        djb.k lVar;
        djb.k kVar;
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        if (spaceIdentifier instanceof ProductSpaceIdentifier.Personal) {
            kVar = k.b.f115282a;
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Joint) {
            kVar = ((jte.d) this.f7971h.f7963a).c(SavingsApi$Toggles.JointAccountsSavings.f83075c) ? k.a.f115281a : null;
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Youth) {
            ProductSpaceIdentifier.Youth.State state = ((ProductSpaceIdentifier.Youth) spaceIdentifier).f89754c;
            if (!Intrinsics.f(state, ProductSpaceIdentifier.Youth.State.Discover.f89756a)) {
                if (!(state instanceof ProductSpaceIdentifier.Youth.State.Active)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar = new djb.m(((ProductSpaceIdentifier.Youth.State.Active) state).f89755a);
                kVar = lVar;
            }
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Teen) {
            lVar = new l(((ProductSpaceIdentifier.Teen) spaceIdentifier).f89752c);
            kVar = lVar;
        } else {
            if (!(spaceIdentifier instanceof ProductSpaceIdentifier.TotalWealth) && !(spaceIdentifier instanceof ProductSpaceIdentifier.CreditHub) && !(spaceIdentifier instanceof ProductSpaceIdentifier.Favourites) && !(spaceIdentifier instanceof ProductSpaceIdentifier.Linked) && !(spaceIdentifier instanceof ProductSpaceIdentifier.Pro) && !(spaceIdentifier instanceof ProductSpaceIdentifier.Restricted)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (kVar == null) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        g gVar = new g(kVar, dataLoadingMode);
        return boh.f.e(rd0.e.b(this.f7975n.a(gVar)), new j(this, gVar, 14));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        g gVar = new g(k.b.f115282a, dataLoadingMode);
        return boh.f.e(rd0.e.b(this.f7975n.a(gVar)), new j(this, gVar, 14));
    }
}
