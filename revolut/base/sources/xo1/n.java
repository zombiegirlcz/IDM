package xo1;

import com.revolut.feature.apm.bills.core.api.model.BillWarning;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f307584c;
    public final BillWarning d;
    public final ServiceProvider e;

    public n(dj0.d amount, ArrayList fields, LocalDate localDate, BillWarning billWarning, ServiceProvider serviceProvider) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f307582a = amount;
        this.f307583b = fields;
        this.f307584c = localDate;
        this.d = billWarning;
        this.e = serviceProvider;
    }

    @Override // xo1.q
    /* JADX INFO: renamed from: a */
    public final BillWarning getE() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f307582a.equals(nVar.f307582a) && this.f307583b.equals(nVar.f307583b) && Intrinsics.f(this.f307584c, nVar.f307584c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f307583b, this.f307582a.hashCode() * 31, 31);
        LocalDate localDate = this.f307584c;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        BillWarning billWarning = this.d;
        int iHashCode2 = (iHashCode + (billWarning == null ? 0 : billWarning.hashCode())) * 31;
        ServiceProvider serviceProvider = this.e;
        return iHashCode2 + (serviceProvider != null ? serviceProvider.hashCode() : 0);
    }
}
