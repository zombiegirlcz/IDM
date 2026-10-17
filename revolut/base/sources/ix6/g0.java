package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g f169392b;

    public /* synthetic */ g0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, int i) {
        this.f169391a = i;
        this.f169392b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f169391a) {
            case 0:
                fz6.i result = (fz6.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = this.f169392b;
                FreelancerInvoice freelancerInvoiceJ2 = gVar.J2();
                if (freelancerInvoiceJ2 != null) {
                    gVar.H2(gVar.z, new is2.t(result, 27));
                    gVar.N2(FreelancerInvoice.a(freelancerInvoiceJ2, null, null, null, null, null, null, result.f139115a.f86397a, result.f139116b, 16777215));
                }
                return Unit.f186387a;
            default:
                q invoice = (q) obj2;
                Intrinsics.checkNotNullParameter(invoice, "invoice");
                return this.f169392b.v.j(new md6.a(md6.e.PRO, invoice.f169408a.i, (md6.d) null, (md6.f) null, 60));
        }
    }
}
