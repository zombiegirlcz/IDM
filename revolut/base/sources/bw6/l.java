package bw6;

import cli.n;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreenContract$InputData;
import et6.p1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements dli.b {
    public final p1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerAddNotesScreenContract$InputData f19255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f19256q;

    public l(p1 invoiceInteractor, FreelancerAddNotesScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = invoiceInteractor;
        this.f19255p = inputData;
        this.f19256q = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.o.d(this.f19255p.f73765a, false)), null, null, new btd.e(this, null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19256q;
    }
}
