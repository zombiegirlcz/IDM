package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements xki.c, qw8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProofOfAddressFlowContract$InputData f325276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f325278c = this;
    public final e4m.e d;

    public g0(c0 c0Var, ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData) {
        this.f325277b = c0Var;
        this.f325276a = proofOfAddressFlowContract$InputData;
        this.d = e4m.b.b(new r(c0Var, this, 4));
    }

    @Override // qw8.a
    public final n0 b() {
        return new n0(this.f325277b, this.f325278c, 0);
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
