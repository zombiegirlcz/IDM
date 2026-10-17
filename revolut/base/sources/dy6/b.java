package dy6;

import btk.j;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import et6.p1;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f121063l;

    public b(p1 freelancerInvoiceInteractor) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        this.f121063l = freelancerInvoiceInteractor;
    }

    @Override // dy6.e
    public final akg.n a() {
        return nim.a.v(rd0.e.b(this.f121063l.e(false)), new dug.a(this, 14));
    }

    @Override // dy6.e
    public final Object l(Set set, FreelancerInvoice freelancerInvoice, FreelancerInvoiceSettings freelancerInvoiceSettings, j jVar) {
        if (freelancerInvoiceSettings == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objB = pu7.a.B(this.e, "update_default_invoice_payment_methods", new com.revolut.feature.credit.application.plugins.impl.ui.form.a(this, freelancerInvoiceSettings, set, null, 9), jVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }
}
