package s65;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDetails f260135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f260136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f260137c;

    public f(LoanDetails loanDetails, int i, Data newRepaymentSchedule) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(newRepaymentSchedule, "newRepaymentSchedule");
        this.f260135a = loanDetails;
        this.f260136b = i;
        this.f260137c = newRepaymentSchedule;
    }

    public static f a(f fVar, int i, Data newRepaymentSchedule, int i2) {
        LoanDetails loanDetails = fVar.f260135a;
        if ((i2 & 2) != 0) {
            i = fVar.f260136b;
        }
        if ((i2 & 4) != 0) {
            newRepaymentSchedule = fVar.f260137c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(newRepaymentSchedule, "newRepaymentSchedule");
        return new f(loanDetails, i, newRepaymentSchedule);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f260135a, fVar.f260135a) && this.f260136b == fVar.f260136b && Intrinsics.f(this.f260137c, fVar.f260137c);
    }

    public final int hashCode() {
        return this.f260137c.hashCode() + j6.a.b(this.f260136b, this.f260135a.hashCode() * 31, 31);
    }
}
