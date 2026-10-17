package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c7 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValuatorDetailsScreenContract$InputData f118519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118521c;

    public c7(c1 c1Var, i5 i5Var, ValuatorDetailsScreenContract$InputData valuatorDetailsScreenContract$InputData) {
        this.f118519a = valuatorDetailsScreenContract$InputData;
        this.f118520b = e4m.b.b(new g5(c1Var, this, 1, 24));
        this.f118521c = e4m.b.b(new g5(c1Var, this, 0, 24));
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
