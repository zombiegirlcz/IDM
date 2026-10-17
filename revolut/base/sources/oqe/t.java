package oqe;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends oki.h implements h {

    @NotNull
    public static final n Companion = new n();
    public final TeenDashboardScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xqe.b f227900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final til.m f227901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f227902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f227903s;

    public t(u stateMapper, TeenDashboardScreenContract$InputData inputData, xqe.b teenProfileInteractor, til.m workflowFlowDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        this.o = inputData;
        this.f227900p = teenProfileInteractor;
        this.f227901q = workflowFlowDestinationProvider;
        this.f227902r = new vii.b();
        this.f227903s = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f227902r, new okf.m(continuation, this, 8)), null, null, new oli.f(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f227903s;
    }
}
