package nrj;

import com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle.AnalyticsEditCycleScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f218657p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AnalyticsEditCycleScreenContract$InputData inputData, k stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f218657p = new f(inputData.f101503a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f218657p;
    }
}
