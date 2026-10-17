package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClaimsScreenContract$InputData f247329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247331c;

    public i0(k0 k0Var, o oVar, ClaimsScreenContract$InputData claimsScreenContract$InputData) {
        this.f247329a = claimsScreenContract$InputData;
        int i = 12;
        this.f247330b = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247331c = e4m.b.b(new l(k0Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
