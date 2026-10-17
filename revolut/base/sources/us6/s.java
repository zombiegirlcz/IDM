package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerBusinessDescriptionScreenContract$InputData f282740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282742c;
    public final e4m.e d;

    public s(q qVar, d0 d0Var, FreelancerBusinessDescriptionScreenContract$InputData freelancerBusinessDescriptionScreenContract$InputData) {
        this.f282740a = freelancerBusinessDescriptionScreenContract$InputData;
        int i = 25;
        this.f282741b = e4m.b.b(new ufg.k0(d0Var, this, 0, i));
        this.f282742c = e4m.b.b(new ufg.k0(d0Var, this, 2, i));
        this.d = e4m.b.b(new ufg.k0(d0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f282741b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
