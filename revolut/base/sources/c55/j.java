package c55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanBackupCard f21448b;

    public j(String loanId, LoanBackupCard backupCard) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f21447a = loanId;
        this.f21448b = backupCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f21447a, jVar.f21447a) && Intrinsics.f(this.f21448b, jVar.f21448b);
    }

    public final int hashCode() {
        return this.f21448b.hashCode() + (this.f21447a.hashCode() * 31);
    }
}
