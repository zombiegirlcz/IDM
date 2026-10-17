package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustdockSdkFlowContract$InputData f325294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f325296c = this;
    public final e4m.e d;
    public final e4m.e e;

    public i0(c0 c0Var, TrustdockSdkFlowContract$InputData trustdockSdkFlowContract$InputData) {
        this.f325295b = c0Var;
        this.f325294a = trustdockSdkFlowContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.e = e4m.b.b(new zpc.m(c0Var, this, 0, i));
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
