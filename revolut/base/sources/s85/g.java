package s85;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanBackupCard f260892a;

    public g(LoanBackupCard backupCard) {
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f260892a = backupCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f260892a, ((g) obj2).f260892a);
    }

    public final int hashCode() {
        return this.f260892a.hashCode();
    }
}
