package glh;

import cli.y;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends h implements dli.b {
    public final z0h.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f144697p;

    public f(z0h.a clauseDestinationProvider, g stateMapper, CashHoldingFundsExplanationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = clauseDestinationProvider;
        this.f144697p = mra.d.b(this, new b(inputData.f95998a, inputData.f95999b, inputData.f96000c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144697p;
    }
}
