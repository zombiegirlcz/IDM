package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements xki.c, zv8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HypervergeVideoKycFlowContract$InputData f325350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f325352c = this;
    public final e4m.e d;

    public s(c0 c0Var, HypervergeVideoKycFlowContract$InputData hypervergeVideoKycFlowContract$InputData) {
        this.f325351b = c0Var;
        this.f325350a = hypervergeVideoKycFlowContract$InputData;
        this.d = e4m.b.b(new r(c0Var, this, 0));
    }

    @Override // zv8.a
    public final l0 b() {
        return new l0(this.f325351b, this.f325352c, 0);
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
