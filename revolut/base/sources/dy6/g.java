package dy6;

import btk.j;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import et6.p1;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f121068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods f121069m;

    public g(p1 freelancerInvoiceInteractor, InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods inputData) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f121068l = freelancerInvoiceInteractor;
        this.f121069m = inputData;
    }

    @Override // dy6.e
    public final akg.n a() {
        InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods singleInvoicePaymentMethods = this.f121069m;
        String str = singleInvoicePaymentMethods.f73892a;
        p1 p1Var = this.f121068l;
        return nim.a.v(u0.i(rd0.e.b(p1Var.d(str, false)), rd0.e.b(p1Var.e(false)), p1Var.c(singleInvoicePaymentMethods.f73892a)), new dug.a(this, 15));
    }

    @Override // dy6.e
    public final Object l(Set set, FreelancerInvoice freelancerInvoice, FreelancerInvoiceSettings freelancerInvoiceSettings, j jVar) {
        if (freelancerInvoice == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objB = pu7.a.B(this.e, "update_single_invoice_payment_methods", new com.revolut.feature.credit.application.plugins.impl.ui.form.a(this, freelancerInvoice, set, null, 10), jVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }
}
