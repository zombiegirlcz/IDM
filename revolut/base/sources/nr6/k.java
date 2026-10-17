package nr6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f218567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerInvoice f218569c;
    public final OrderInitiationPage d;

    public k(b order, dj0.d dVar, FreelancerInvoice freelancerInvoice, OrderInitiationPage orderInitiationPage) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f218567a = order;
        this.f218568b = dVar;
        this.f218569c = freelancerInvoice;
        this.d = orderInitiationPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f218567a, kVar.f218567a) && Intrinsics.f(this.f218568b, kVar.f218568b) && Intrinsics.f(this.f218569c, kVar.f218569c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f218567a.hashCode() * 31;
        dj0.d dVar = this.f218568b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        FreelancerInvoice freelancerInvoice = this.f218569c;
        int iHashCode3 = (iHashCode2 + (freelancerInvoice == null ? 0 : freelancerInvoice.hashCode())) * 31;
        OrderInitiationPage orderInitiationPage = this.d;
        return iHashCode3 + (orderInitiationPage != null ? orderInitiationPage.hashCode() : 0);
    }
}
