package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements qji.a, kk7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceClaimFlowContract$InputData.MakeClaim f216687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f216689c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(q qVar, CFACInsuranceClaimFlowContract$InputData.MakeClaim makeClaim) {
        this.f216688b = qVar;
        this.f216687a = makeClaim;
        int i = 2;
        this.d = e4m.b.b(new e(this, 2, i));
        this.e = e4m.b.b(new e(this, 1, i));
        this.f = e4m.b.b(new e(this, 0, i));
    }

    @Override // kk7.a
    public final x b() {
        return new x(this.f216688b, this.f216689c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
