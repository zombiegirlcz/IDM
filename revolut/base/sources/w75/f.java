package w75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanBackupCard f295472a;

    public f(LoanBackupCard backupCard) {
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f295472a = backupCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f295472a, ((f) obj2).f295472a);
    }

    public final int hashCode() {
        return this.f295472a.hashCode();
    }
}
