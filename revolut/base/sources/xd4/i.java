package xd4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.ManualUnderwritingTicketorContract$InputData;
import hw3.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends oki.h implements c {
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManualUnderwritingTicketorContract$InputData f304264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f304265q;

    public i(d0 interactor, ManualUnderwritingTicketorContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f304264p = inputData;
        this.f304265q = mra.d.b(this, new a(inputData.f67966a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        String ticketId = this.f304264p.f67966a.f154982c;
        d0 d0Var = this.o;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        q34.d dVar = (q34.d) d0Var.f156059a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        yji.l.b1(this, dVar.f.b(ticketId, w4l.i.f294643c), null, new x64.b(this, null, 16), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f304265q;
    }
}
