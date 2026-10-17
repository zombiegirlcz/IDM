package vw7;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements c {
    public final InsuranceProductSummaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f292652p;

    public e(InsuranceProductSummaryScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f292652p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f292652p;
    }
}
