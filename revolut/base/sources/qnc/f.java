package qnc;

import com.revolut.feature.robo.impl.ui.screen.risk_metrics_details.RiskMetricsDetailsScreenContract$InputData;
import jki.g;
import jki.h;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f247935p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RiskMetricsDetailsScreenContract$InputData inputData, c mapper) {
        super(mapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f247935p = new b(inputData.f85196b);
    }

    @Override // jki.g
    public final i r2() {
        return this.f247935p;
    }
}
