package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustdockIcChipScreenContract$InputData f325282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f325283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325284c;
    public final e4m.e d;

    public h0(c0 c0Var, i0 i0Var, TrustdockIcChipScreenContract$InputData trustdockIcChipScreenContract$InputData) {
        this.f325282a = trustdockIcChipScreenContract$InputData;
        int i = 19;
        this.f325283b = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f325284c = e4m.b.b(new zpc.m(c0Var, this, 0, i));
        this.d = e4m.b.b(new zpc.m(c0Var, this, 2, i));
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
