package zx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f326044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f326045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerInvoiceSettings f326046c;
    public final xi0.b d;

    public g(Set allowedCurrencies, xi0.b baseCurrency, FreelancerInvoiceSettings invoiceSettings) {
        Intrinsics.checkNotNullParameter(allowedCurrencies, "allowedCurrencies");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
        this.f326044a = allowedCurrencies;
        this.f326045b = baseCurrency;
        this.f326046c = invoiceSettings;
        xi0.b bVar = invoiceSettings.f73411n;
        if (bVar != null) {
            baseCurrency = bVar;
        } else if (!allowedCurrencies.contains(baseCurrency)) {
            baseCurrency = null;
        }
        this.d = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f326044a, gVar.f326044a) && Intrinsics.f(this.f326045b, gVar.f326045b) && Intrinsics.f(this.f326046c, gVar.f326046c);
    }

    public final int hashCode() {
        return this.f326046c.hashCode() + h30.l.j(this.f326045b, this.f326044a.hashCode() * 31, 31);
    }
}
