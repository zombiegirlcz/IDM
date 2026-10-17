package fq7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ClaimsScreenContract$InputData f137205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f137206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f137207r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, ClaimsScreenContract$InputData inputData, v policyRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f137205p = inputData;
        this.f137206q = policyRepository;
        this.f137207r = new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        ClaimsScreenContract$InputData claimsScreenContract$InputData = this.f137205p;
        String str = claimsScreenContract$InputData.f75652a;
        v vVar = this.f137206q;
        yji.l.a1(this, v.a(vVar, str), null, null, new h(this, null, 0), 3);
        String policyId = claimsScreenContract$InputData.f75652a;
        e0 e0Var = (e0) vVar;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        yji.l.a1(this, rd0.e.b(e0Var.f196613h.f(policyId, false)), null, null, new h(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f137207r;
    }
}
