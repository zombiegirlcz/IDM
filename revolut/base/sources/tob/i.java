package tob;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements f {
    public final SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f272568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f272569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f272570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f272571s;

    public i(n stateMapper, SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData inputData, ijb.a savingsProductInteractor, f80.a uriHelper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f272568p = savingsProductInteractor;
        this.f272569q = uriHelper;
        this.f272570r = deeplinkHandler;
        this.f272571s = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nim.a.v(ijb.a.a(this.f272568p, null, null, null, null, 15), new tjf.e(this, 23)), null, null, new h(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272571s;
    }
}
