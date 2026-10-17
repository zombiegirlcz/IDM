package cw6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FreelancerInvoiceNumberData f109545c = new FreelancerInvoiceNumberData("", null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceNumberData f109547b;

    public static final class a {
        private a() {
        }
    }

    public h() {
        this(0);
    }

    public static h a(h hVar, FreelancerInvoiceNumberData freelancerInvoiceNumberData) {
        Data invoiceData = hVar.f109546a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(invoiceData, "invoiceData");
        return new h(invoiceData, freelancerInvoiceNumberData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f109546a, hVar.f109546a) && Intrinsics.f(this.f109547b, hVar.f109547b);
    }

    public final int hashCode() {
        int iHashCode = this.f109546a.hashCode() * 31;
        FreelancerInvoiceNumberData freelancerInvoiceNumberData = this.f109547b;
        return iHashCode + (freelancerInvoiceNumberData == null ? 0 : freelancerInvoiceNumberData.hashCode());
    }

    public h(Data invoiceData, FreelancerInvoiceNumberData freelancerInvoiceNumberData) {
        Intrinsics.checkNotNullParameter(invoiceData, "invoiceData");
        this.f109546a = invoiceData;
        this.f109547b = freelancerInvoiceNumberData;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
