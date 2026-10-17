package tqc;

import cli.y;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.SalaryDisputeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tna.p;
import w4l.i;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements dli.b {
    public final SalaryDisputeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aqc.a f273551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f273552q;

    public e(f stateMapper, SalaryDisputeScreenContract$InputData inputData, aqc.a disputeInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(disputeInteractor, "disputeInteractor");
        this.o = inputData;
        this.f273551p = disputeInteractor;
        this.f273552q = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        SalaryDisputeScreenContract$InputData salaryDisputeScreenContract$InputData = this.o;
        String payrollSwitchId = salaryDisputeScreenContract$InputData.f85287b;
        String disputeId = salaryDisputeScreenContract$InputData.f85286a;
        aqc.a aVar = this.f273551p;
        aVar.getClass();
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
        Intrinsics.checkNotNullParameter(disputeId, "disputeId");
        mqc.e eVar = aVar.f8307a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
        Intrinsics.checkNotNullParameter(disputeId, "disputeId");
        l.a1(this, eVar.f207956c.b(new mqc.d(payrollSwitchId, disputeId), loadingStrategy), null, null, new p(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f273552q;
    }
}
