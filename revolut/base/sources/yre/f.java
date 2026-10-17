package yre;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDsVerificationFlowContract$InputData f316308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f316309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f316310c = this;
    public final e4m.e d;
    public final e4m.e e;

    public f(e eVar, ThreeDsVerificationFlowContract$InputData threeDsVerificationFlowContract$InputData) {
        this.f316309b = eVar;
        this.f316308a = threeDsVerificationFlowContract$InputData;
        int i = 1;
        this.d = e4m.b.b(new a(eVar, this, 0, i));
        this.e = e4m.b.b(new a(eVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
