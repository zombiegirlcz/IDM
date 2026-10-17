package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceExactReasonScreenContract$InputData f216702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216704c;
    public final e4m.e d;

    public o(q qVar, j jVar, CFACInsuranceExactReasonScreenContract$InputData cFACInsuranceExactReasonScreenContract$InputData) {
        this.f216703b = qVar;
        this.f216702a = cFACInsuranceExactReasonScreenContract$InputData;
        this.f216704c = e4m.b.b(new k(qVar, this, 1, 3));
        this.d = e4m.b.b(new k(qVar, this, 0, 3));
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
