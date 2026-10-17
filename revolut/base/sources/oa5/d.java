package oa5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentControllerContract$InputData;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostTerminationPlanManualRepaymentControllerContract$InputData f223541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f223542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f223543c;
    public final e4m.e d;

    public d(b bVar, PostTerminationPlanManualRepaymentControllerContract$InputData postTerminationPlanManualRepaymentControllerContract$InputData) {
        this.f223542b = bVar;
        this.f223541a = postTerminationPlanManualRepaymentControllerContract$InputData;
        int i = 9;
        this.f223543c = e4m.b.b(new o41.b(bVar, this, 1, i));
        this.d = e4m.b.b(new o41.b(bVar, this, 0, i));
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
