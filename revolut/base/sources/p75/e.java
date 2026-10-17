package p75;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loan f233550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233551b;

    public e(Loan loan, String str) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        this.f233550a = loan;
        this.f233551b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f233550a, eVar.f233550a) && Intrinsics.f(this.f233551b, eVar.f233551b);
    }

    public final int hashCode() {
        int iHashCode = this.f233550a.hashCode() * 31;
        String str = this.f233551b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
