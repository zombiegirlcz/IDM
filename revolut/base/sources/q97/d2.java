package q97;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d2 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f243670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.h f243671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sha.c f243672c;

    public d2(t97.c productCellProvider, gr6.e freelancerAvailabilityInteractor, gr6.h freelancerCashbackInteractor, sha.c proOnboardingCommandFactory) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        this.f243670a = freelancerAvailabilityInteractor;
        this.f243671b = freelancerCashbackInteractor;
        this.f243672c = proOnboardingCommandFactory;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.PRO_ACCOUNT;
    }

    @Override // p97.c
    public final efm.r b() {
        return rd0.e.c(vkm.q.Q(((et6.l0) this.f243670a).m(), new q7b.j((Continuation) null, this, 7)), kotlin.coroutines.g.f186406a);
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new pwb.p(this, null, 21)), new j0(new l1(2), 29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
