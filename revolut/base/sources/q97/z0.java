package q97;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbb.c f243832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(t97.c productCellProvider, kbb.c juniorConfigInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.f243832b = juniorConfigInteractor;
        this.f243833c = t97.d.JUNIOR_ACCOUNTS;
    }

    @Override // r97.b
    public final Flow d() {
        return vkm.q.Q(mo3.a.f(rd0.e.b(this.f243832b.L()), new ku1.f0(22), new pv7.t(16), new q92.f(13)), new q7b.j((Continuation) null, this, 6));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243833c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new JuniorOnboardingDestination.Creation((mh8.h) null, 3));
    }
}
