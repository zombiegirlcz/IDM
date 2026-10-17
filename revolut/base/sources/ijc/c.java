package ijc;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsTransaction f161757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RentAndBillsConfigurations f161758c;

    public c(boolean z, RevPointsTransaction revPointsTransaction, RentAndBillsConfigurations rentAndBillsConfigurations) {
        this.f161756a = z;
        this.f161757b = revPointsTransaction;
        this.f161758c = rentAndBillsConfigurations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f161756a == cVar.f161756a && Intrinsics.f(this.f161757b, cVar.f161757b) && Intrinsics.f(this.f161758c, cVar.f161758c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f161756a) * 31;
        RevPointsTransaction revPointsTransaction = this.f161757b;
        int iHashCode2 = (iHashCode + (revPointsTransaction == null ? 0 : revPointsTransaction.hashCode())) * 31;
        RentAndBillsConfigurations rentAndBillsConfigurations = this.f161758c;
        return iHashCode2 + (rentAndBillsConfigurations != null ? rentAndBillsConfigurations.hashCode() : 0);
    }
}
