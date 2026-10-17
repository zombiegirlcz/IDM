package ta9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RiskCheckScreenContract$InputData f269281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f269282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f269283c;

    public w(m mVar, o oVar, RiskCheckScreenContract$InputData riskCheckScreenContract$InputData) {
        this.f269281a = riskCheckScreenContract$InputData;
        int i = 24;
        this.f269282b = e4m.b.b(new t0b.l(mVar, this, 1, i));
        this.f269283c = e4m.b.b(new t0b.l(mVar, this, 0, i));
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
