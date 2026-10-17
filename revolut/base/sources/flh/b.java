package flh;

import cli.g;
import cli.y;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import fjd.w;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements dli.b {
    public final CashHoldingSelectorInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f135990p;

    public b(d stateMapper, CashHoldingSelectorInputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f135990p = mra.d.b(this, new a(inputData.f95932a, inputData.f95933b, qih.a.AVAILABLE_TO_WITHDRAW), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        H2(this.f135990p, new w(this, 8));
    }

    @Override // cli.z
    public final g getState() {
        return this.f135990p;
    }
}
