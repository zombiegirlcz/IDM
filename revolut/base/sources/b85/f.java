package b85;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;
import q35.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f13096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f13097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13098c;
    public final Data d;

    public f(LoanDetails loan, e0 repayment, String userId, Data sepaAccount) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sepaAccount, "sepaAccount");
        this.f13096a = loan;
        this.f13097b = repayment;
        this.f13098c = userId;
        this.d = sepaAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f13096a, fVar.f13096a) && Intrinsics.f(this.f13097b, fVar.f13097b) && Intrinsics.f(this.f13098c, fVar.f13098c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f13097b.hashCode() + (this.f13096a.hashCode() * 31)) * 31, 31, this.f13098c);
    }
}
