package lg7;

import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$EmptyStep;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$InputData;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements b {
    public final IncentiveSelectionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f195082p;

    public c(IncentiveSelectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        lcc.c cVar = new lcc.c(this, 7);
        this.f195082p = d.a(this, IncentiveSelectionFlowContract$EmptyStep.f74867a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f195082p;
    }
}
