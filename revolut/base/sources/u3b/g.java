package u3b;

import cli.n;
import cli.y;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends oki.h implements e {
    public final CfdMaintenanceMarginControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h5b.b f276889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m4f.b f276890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f276891r;

    public g(n stateMapper, CfdMaintenanceMarginControllerContract$InputData inputData, h5b.b maintenanceMarginWidgetControllerModelExtension, m4f.b wealthAddMoneyCommandProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetControllerModelExtension, "maintenanceMarginWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        this.o = inputData;
        this.f276889p = maintenanceMarginWidgetControllerModelExtension;
        this.f276890q = wealthAddMoneyCommandProvider;
        this.f276891r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f276889p.c3(), null, new tz6.e(this, (Continuation) null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276891r;
    }
}
