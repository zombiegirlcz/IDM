package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.cancellation.CancellationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationFlowContract$InputData f247326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f247328c = this;
    public final qgk.p1 d;
    public final e4m.e e;

    public i(k0 k0Var, CancellationFlowContract$InputData cancellationFlowContract$InputData) {
        this.f247327b = k0Var;
        this.f247326a = cancellationFlowContract$InputData;
        int i = 28;
        this.d = new qgk.p1(k0Var, this, 1, i);
        this.e = e4m.b.b(new qgk.p1(k0Var, this, 0, i));
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
