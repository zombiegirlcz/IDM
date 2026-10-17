package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KycConsolidatedFlowContract$InputData f325258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q89.e f325259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f325260c;
    public final d0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    public d0(c0 c0Var, KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData, q89.e eVar) {
        this.f325260c = c0Var;
        this.f325258a = kycConsolidatedFlowContract$InputData;
        this.f325259b = eVar;
        int i = 17;
        this.e = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f = e4m.b.b(new zpc.m(c0Var, this, 0, i));
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
