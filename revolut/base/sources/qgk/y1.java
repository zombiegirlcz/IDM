package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class y1 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StudentVerificationFlowContract$InputData f246333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1 f246335c = this;
    public final e4m.e d;
    public final e4m.e e;

    public y1(i0 i0Var, StudentVerificationFlowContract$InputData studentVerificationFlowContract$InputData) {
        this.f246334b = i0Var;
        this.f246333a = studentVerificationFlowContract$InputData;
        int i = 4;
        this.d = e4m.b.b(new p1(i0Var, this, 1, i));
        this.e = e4m.b.b(new p1(i0Var, this, 0, i));
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
