package r65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f251634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f251635b;

    public c(LoanDetails loanDetails, int i) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f251634a = loanDetails;
        this.f251635b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f251634a, cVar.f251634a) && this.f251635b == cVar.f251635b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251635b) + (this.f251634a.hashCode() * 31);
    }
}
