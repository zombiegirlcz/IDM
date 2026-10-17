package fv6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import java.time.LocalDateTime;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AcquiringPaymentsQuery f138360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f138361c;
    public final boolean d;

    public g() {
        this(null, 15);
    }

    public static g a(g gVar, Data paymentsData, AcquiringPaymentsQuery acquiringPaymentsQuery, Data searchResult, boolean z, int i) {
        if ((i & 1) != 0) {
            paymentsData = gVar.f138359a;
        }
        if ((i & 2) != 0) {
            acquiringPaymentsQuery = gVar.f138360b;
        }
        if ((i & 4) != 0) {
            searchResult = gVar.f138361c;
        }
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(paymentsData, "paymentsData");
        Intrinsics.checkNotNullParameter(acquiringPaymentsQuery, "acquiringPaymentsQuery");
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        return new g(paymentsData, acquiringPaymentsQuery, searchResult, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f138359a, gVar.f138359a) && Intrinsics.f(this.f138360b, gVar.f138360b) && Intrinsics.f(this.f138361c, gVar.f138361c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kii.e.c(this.f138361c, (this.f138360b.hashCode() + (this.f138359a.hashCode() * 31)) * 31, 31);
    }

    public g(Data paymentsData, AcquiringPaymentsQuery acquiringPaymentsQuery, Data searchResult, boolean z) {
        Intrinsics.checkNotNullParameter(paymentsData, "paymentsData");
        Intrinsics.checkNotNullParameter(acquiringPaymentsQuery, "acquiringPaymentsQuery");
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        this.f138359a = paymentsData;
        this.f138360b = acquiringPaymentsQuery;
        this.f138361c = searchResult;
        this.d = z;
    }

    public /* synthetic */ g(AcquiringPaymentsQuery acquiringPaymentsQuery, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? new AcquiringPaymentsQuery((String) null, (LocalDateTime) null, (LocalDateTime) null, (Set) null, (Set) null, (Set) null, CertificateBody.profileType) : acquiringPaymentsQuery, new Data(null, null, true, 3, null), false);
    }
}
