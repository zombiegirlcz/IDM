package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceReasonGroupScreenContract$InputData f216728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216730c;
    public final e4m.e d;

    public u(q qVar, j jVar, CFACInsuranceReasonGroupScreenContract$InputData cFACInsuranceReasonGroupScreenContract$InputData) {
        this.f216729b = qVar;
        this.f216728a = cFACInsuranceReasonGroupScreenContract$InputData;
        this.f216730c = e4m.b.b(new k(qVar, this, 1, 6));
        this.d = e4m.b.b(new k(qVar, this, 0, 6));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
