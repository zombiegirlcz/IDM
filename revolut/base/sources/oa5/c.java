package oa5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$InputData;
import e4m.e;
import java.util.Set;
import nng.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostTerminationPlanDetailsFlowContract$InputData f223538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f223539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f223540c;

    public c(b bVar, PostTerminationPlanDetailsFlowContract$InputData postTerminationPlanDetailsFlowContract$InputData) {
        this.f223539b = bVar;
        this.f223538a = postTerminationPlanDetailsFlowContract$InputData;
        this.f223540c = e4m.b.b(new n(bVar, this, 22));
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
