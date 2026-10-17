package cv6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AcquiringPaymentFilter f109287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109288c;

    public j(Data allCurrenciesData, AcquiringPaymentFilter acquiringPaymentFilter, boolean z) {
        Intrinsics.checkNotNullParameter(allCurrenciesData, "allCurrenciesData");
        this.f109286a = allCurrenciesData;
        this.f109287b = acquiringPaymentFilter;
        this.f109288c = z;
    }

    public static j a(j jVar, Data allCurrenciesData, AcquiringPaymentFilter acquiringPaymentFilter, int i) {
        if ((i & 1) != 0) {
            allCurrenciesData = jVar.f109286a;
        }
        if ((i & 2) != 0) {
            acquiringPaymentFilter = jVar.f109287b;
        }
        boolean z = (i & 4) != 0 ? jVar.f109288c : true;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(allCurrenciesData, "allCurrenciesData");
        return new j(allCurrenciesData, acquiringPaymentFilter, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f109286a, jVar.f109286a) && Intrinsics.f(this.f109287b, jVar.f109287b) && this.f109288c == jVar.f109288c;
    }

    public final int hashCode() {
        int iHashCode = this.f109286a.hashCode() * 31;
        AcquiringPaymentFilter acquiringPaymentFilter = this.f109287b;
        return Boolean.hashCode(this.f109288c) + ((iHashCode + (acquiringPaymentFilter == null ? 0 : acquiringPaymentFilter.hashCode())) * 31);
    }
}
