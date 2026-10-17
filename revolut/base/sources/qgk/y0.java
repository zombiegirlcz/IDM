package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPreviewScreenContract$InputData f246330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246332c;
    public final e4m.e d;

    public y0(i0 i0Var, PlanPreviewScreenContract$InputData planPreviewScreenContract$InputData) {
        this.f246331b = i0Var;
        this.f246330a = planPreviewScreenContract$InputData;
        int i = 19;
        this.f246332c = e4m.b.b(new m(i0Var, this, 1, i));
        this.d = e4m.b.b(new m(i0Var, this, 0, i));
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
