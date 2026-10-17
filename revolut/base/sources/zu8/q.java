package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.hyperverge.govauth.HypervergeDigilockerFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements xki.c, zv8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HypervergeDigilockerFlowContract$InputData f325338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f325340c = this;
    public final e4m.e d = e4m.b.b(new zdl.d(this, 27));

    public q(c0 c0Var, HypervergeDigilockerFlowContract$InputData hypervergeDigilockerFlowContract$InputData) {
        this.f325339b = c0Var;
        this.f325338a = hypervergeDigilockerFlowContract$InputData;
    }

    @Override // zv8.a
    public final l0 b() {
        return new l0(this.f325339b, this.f325340c, 1);
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
