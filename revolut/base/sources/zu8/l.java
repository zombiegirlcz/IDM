package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.egov_kyc.screen.EgovKycScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EgovKycScreenContract$InputData f325309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325311c;
    public final e4m.e d;
    public final e4m.e e;

    public l(c0 c0Var, k kVar, EgovKycScreenContract$InputData egovKycScreenContract$InputData) {
        this.f325310b = c0Var;
        this.f325309a = egovKycScreenContract$InputData;
        this.f325311c = e4m.b.b(new zpc.m(c0Var, this, 0, 12));
        this.d = e4m.b.b(new zpc.m(c0Var, this, 1, 12));
        this.e = e4m.b.b(new zpc.m(c0Var, this, 2, 12));
    }

    public final r10.v b() {
        f80.a uriHelper = this.f325310b.f325244m.x();
        vc.s.j(uriHelper);
        hv8.a.Companion.getClass();
        EgovKycScreenContract$InputData inputData = this.f325309a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        return new r10.v(inputData.f77639b, uriHelper);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f325311c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
