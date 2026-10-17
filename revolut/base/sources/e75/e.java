package e75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;
import q35.r;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f123064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f123065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoanBackupCard f123066c;
    public final x35.e d;

    public e(LoanDetails loanDetails, r paymentSource, LoanBackupCard backupCard, x35.e eVar) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f123064a = loanDetails;
        this.f123065b = paymentSource;
        this.f123066c = backupCard;
        this.d = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f123064a, eVar.f123064a) && Intrinsics.f(this.f123065b, eVar.f123065b) && Intrinsics.f(this.f123066c, eVar.f123066c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f123066c.hashCode() + ((this.f123065b.hashCode() + (this.f123064a.hashCode() * 31)) * 31)) * 31;
        x35.e eVar = this.d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
