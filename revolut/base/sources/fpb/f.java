package fpb;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown.HoldingsBreakdownControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements dli.b {
    public final HoldingsBreakdownControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f137082p;

    public f(HoldingsBreakdownControllerContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f137082p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f137082p;
    }
}
