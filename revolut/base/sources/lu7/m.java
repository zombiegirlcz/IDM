package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements xki.c, hv7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceDetailsFlowContract$InputData f200137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f200139c = this;
    public final e4m.e d;

    public m(s sVar, InsuranceDetailsFlowContract$InputData insuranceDetailsFlowContract$InputData) {
        this.f200138b = sVar;
        this.f200137a = insuranceDetailsFlowContract$InputData;
        this.d = e4m.b.b(new ld1.g(sVar, this, 25));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hv7.b
    public final hv7.a s() {
        return new g0(this.f200138b, this.f200139c, 1);
    }
}
