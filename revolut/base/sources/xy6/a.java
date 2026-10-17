package xy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoiceTax f309617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f309618b;

    public a(FreelancerInvoiceTax taxRate, ArrayList items) {
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309617a = taxRate;
        this.f309618b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f309617a, aVar.f309617a) && this.f309618b.equals(aVar.f309618b);
    }

    public final int hashCode() {
        return this.f309618b.hashCode() + (this.f309617a.hashCode() * 31);
    }
}
