package xi4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StatusDialogFlowContract$InputData f306305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f306306q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StatusDialogFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f306305p = inputData;
        x2g.b bVar = new x2g.b(this, 28);
        this.f306306q = d.a(this, StatusDialogFlowContract$Step.f68488a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f306306q;
    }
}
