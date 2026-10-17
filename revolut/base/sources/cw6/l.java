package cw6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreenContract$InputData;
import et6.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements i {
    public final FreelancerInvoiceNumberSettingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1 f109551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jr6.m f109552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f109553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f109554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f109555t;

    public l(FreelancerInvoiceNumberSettingsScreenContract$InputData inputData, p1 freelancerInvoiceInteractor, jr6.m freelancerDialogFactory, j60.a bottomDialogExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f109551p = freelancerInvoiceInteractor;
        this.f109552q = freelancerDialogFactory;
        this.f109553r = bottomDialogExtension;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f109554s = z1VarB;
        this.f109555t = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f109554s, new cvi.i(continuation, this, 2)), null, new cvi.j(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f109555t;
    }
}
