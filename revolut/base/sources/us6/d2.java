package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.api.ui.controller.contract.FreelancerCashbackUpsellContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCashbackUpsellContract$InputData f282492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282494c;

    public d2(c2 c2Var, FreelancerCashbackUpsellContract$InputData freelancerCashbackUpsellContract$InputData) {
        this.f282492a = freelancerCashbackUpsellContract$InputData;
        this.f282493b = e4m.b.b(new q0(c2Var, this, 1, 23));
        this.f282494c = e4m.b.b(new q0(c2Var, this, 0, 23));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
