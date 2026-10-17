package aw7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mu7.e f10747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f10748q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, PlanComparisonScreenContract$InputData inputData, mu7.e planComparisonInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planComparisonInteractor, "planComparisonInteractor");
        this.f10747p = planComparisonInteractor;
        this.f10748q = new g(inputData.f76141a, new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f10747p.a(((g) t2()).f10739a, false), null, null, new avk.i(this, null, 4), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f10748q;
    }
}
