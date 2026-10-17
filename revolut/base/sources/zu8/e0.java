package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements xki.c, qw8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv8.b f325264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KycFlowContract$InputData f325265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f325266c;
    public final e0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f325267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f325268h;
    public final e4m.e i;

    public e0(c0 c0Var, KycFlowContract$InputData kycFlowContract$InputData, qv8.b bVar) {
        this.f325266c = c0Var;
        this.f325264a = bVar;
        this.f325265b = kycFlowContract$InputData;
        int i = 18;
        this.e = e4m.b.b(new zpc.m(c0Var, this, 2, i));
        this.f = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f325267g = e4m.b.b(new zpc.m(c0Var, this, 0, i));
        this.f325268h = e4m.b.b(new zpc.m(c0Var, this, 4, i));
        this.i = e4m.b.b(new zpc.m(c0Var, this, 3, i));
    }

    @Override // qw8.a
    public final n0 b() {
        return new n0(this.f325266c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f325267g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
