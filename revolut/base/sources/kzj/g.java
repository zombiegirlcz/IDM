package kzj;

import cli.y;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements a {
    public final bzj.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f191124p;

    public g(h stateMapper, SettingsLimitsFlowContract$InputData inputData, bzj.b limitsControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(limitsControllerExtension, "limitsControllerExtension");
        this.o = limitsControllerExtension;
        this.f191124p = mra.d.b(this, new b(inputData.f101782b, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(this.o.Z2()), null, new krc.h(this, null, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191124p;
    }
}
