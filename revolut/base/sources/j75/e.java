package j75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f171854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x35.e f171855b;

    public e(LoanDetails loanDetails, x35.e eVar) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f171854a = loanDetails;
        this.f171855b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f171854a, eVar.f171854a) && Intrinsics.f(this.f171855b, eVar.f171855b);
    }

    public final int hashCode() {
        int iHashCode = this.f171854a.hashCode() * 31;
        x35.e eVar = this.f171855b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
