package yx6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import et6.p1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ly6.j;
import wx6.h;
import yji.n;
import yuc.p;
import yx6.c;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f317581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InvoiceEmailMessageScreenContract$InputData.SingleInvoiceEmailMessage f317582m;

    public g(p1 freelancerInvoiceInteractor, InvoiceEmailMessageScreenContract$InputData.SingleInvoiceEmailMessage inputData) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f317581l = freelancerInvoiceInteractor;
        this.f317582m = inputData;
    }

    @Override // yx6.e
    public final Unit S1(h hVar) {
        Data data = hVar.f300760a;
        String str = hVar.f300762c;
        FreelancerInvoice freelancerInvoice = ((wx6.g) zi0.c.I(data)).f300758a;
        if (freelancerInvoice == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FreelancerInvoiceSettings freelancerInvoiceSettings = ((wx6.g) zi0.c.I(hVar.f300760a)).f300759b;
        boolean zF = Intrinsics.f(str, freelancerInvoice.v);
        boolean z = !zF;
        boolean z3 = hVar.f300761b && !Intrinsics.f(str, freelancerInvoiceSettings.f73410m);
        if (!zF || z3) {
            V2(new j(this, z, z3, freelancerInvoice, hVar, freelancerInvoiceSettings, null, 1), new yi5.b(29));
            return Unit.f186387a;
        }
        r2().M0(c.a.f317576b);
        return Unit.f186387a;
    }

    @Override // yx6.e
    public final akg.n a() {
        String str = this.f317582m.f73890a;
        p1 p1Var = this.f317581l;
        return nim.a.v(u0.m(rd0.e.b(p1Var.d(str, false)), rd0.e.b(p1Var.e(false))), new p(this, 15));
    }
}
