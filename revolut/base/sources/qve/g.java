package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements xki.c, eze.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdealTopUpFlowContract$InputData f249591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f249593c = this;
    public final e4m.e d;

    public g(k kVar, IdealTopUpFlowContract$InputData idealTopUpFlowContract$InputData) {
        this.f249592b = kVar;
        this.f249591a = idealTopUpFlowContract$InputData;
        this.d = e4m.b.b(new qbj.w(kVar, this, 22));
    }

    @Override // eze.b
    public final ove.y b() {
        return new ove.y(this.f249592b, this.f249593c, 3);
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
