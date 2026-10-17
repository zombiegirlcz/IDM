package by6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f19744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f19745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f19746c;
    public final FreelancerInvoice d;
    public final FreelancerInvoiceSettings e;

    public f(Set allInvoicePaymentMethods, Set eligibleInvoicePaymentMethods, Set initiallyEnabledPaymentMethodsSnapshot, FreelancerInvoice freelancerInvoice, FreelancerInvoiceSettings freelancerInvoiceSettings, int i) {
        freelancerInvoice = (i & 8) != 0 ? null : freelancerInvoice;
        freelancerInvoiceSettings = (i & 16) != 0 ? null : freelancerInvoiceSettings;
        Intrinsics.checkNotNullParameter(allInvoicePaymentMethods, "allInvoicePaymentMethods");
        Intrinsics.checkNotNullParameter(eligibleInvoicePaymentMethods, "eligibleInvoicePaymentMethods");
        Intrinsics.checkNotNullParameter(initiallyEnabledPaymentMethodsSnapshot, "initiallyEnabledPaymentMethodsSnapshot");
        this.f19744a = allInvoicePaymentMethods;
        this.f19745b = eligibleInvoicePaymentMethods;
        this.f19746c = initiallyEnabledPaymentMethodsSnapshot;
        this.d = freelancerInvoice;
        this.e = freelancerInvoiceSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f19744a, fVar.f19744a) && Intrinsics.f(this.f19745b, fVar.f19745b) && Intrinsics.f(this.f19746c, fVar.f19746c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iF = p.a.f(p.a.f(this.f19744a.hashCode() * 31, 31, this.f19745b), 31, this.f19746c);
        FreelancerInvoice freelancerInvoice = this.d;
        int iHashCode = (iF + (freelancerInvoice == null ? 0 : freelancerInvoice.hashCode())) * 31;
        FreelancerInvoiceSettings freelancerInvoiceSettings = this.e;
        return iHashCode + (freelancerInvoiceSettings != null ? freelancerInvoiceSettings.hashCode() : 0);
    }
}
