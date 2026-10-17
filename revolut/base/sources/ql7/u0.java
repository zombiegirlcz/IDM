package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements ho7.a, do7.a, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MtaReviewFlowContract$InputData f247484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f247486c = this;
    public final e4m.e d = e4m.b.b(new qgk.f1(this, 5));

    public u0(k0 k0Var, MtaReviewFlowContract$InputData mtaReviewFlowContract$InputData) {
        this.f247485b = k0Var;
        this.f247484a = mtaReviewFlowContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // ho7.a
    public final s1 j() {
        return new s1(this.f247485b, this.f247486c, 0);
    }

    @Override // do7.a
    public final q1 s() {
        return new q1(this.f247485b, this.f247486c, 0);
    }
}
