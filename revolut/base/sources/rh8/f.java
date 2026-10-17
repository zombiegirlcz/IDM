package rh8;

import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f254332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f254333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f254334c;
    public final jla.h d;
    public final gte.a e;

    public f(a juniorAccountCreationChecker, wsg.n walletsInteractor, kbb.c juniorConfigInteractor, jla.h productCatalogueInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountCreationChecker, "juniorAccountCreationChecker");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f254332a = juniorAccountCreationChecker;
        this.f254333b = walletsInteractor;
        this.f254334c = juniorConfigInteractor;
        this.d = productCatalogueInteractor;
        this.e = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return nim.a.v(rd0.e.b(this.f254334c.O(false)), new rg3.d(9));
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.d(new JuniorOnboardingDestination.Creation((mh8.h) null, 3));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.e).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new go.g(Boolean.FALSE, 2) : vkm.q.Q(new ae8.c(bla.b.b(this.d, "YOUTH"), 24), new c(null, this, 0));
    }
}
