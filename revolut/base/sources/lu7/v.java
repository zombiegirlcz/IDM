package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanComparisonScreenContract$InputData f200181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f200182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200183c;

    public v(s sVar, u uVar, PlanComparisonScreenContract$InputData planComparisonScreenContract$InputData) {
        this.f200181a = planComparisonScreenContract$InputData;
        int i = 18;
        this.f200182b = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.f200183c = e4m.b.b(new lti.l(sVar, this, 0, i));
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
