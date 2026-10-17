package e75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanBackupCard f123071a;

    public i(LoanBackupCard backupCard) {
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f123071a = backupCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f123071a, ((i) obj2).f123071a);
    }

    public final int hashCode() {
        return this.f123071a.hashCode();
    }
}
