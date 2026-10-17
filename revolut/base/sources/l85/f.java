package l85;

import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import kotlin.jvm.internal.Intrinsics;
import q35.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f192787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension.RepaymentAccountState f192788b;

    public f(h0 preview, LoanRepaymentAccountModelExtension.RepaymentAccountState selectedAccountState) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(selectedAccountState, "selectedAccountState");
        this.f192787a = preview;
        this.f192788b = selectedAccountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f192787a, fVar.f192787a) && Intrinsics.f(this.f192788b, fVar.f192788b);
    }

    public final int hashCode() {
        return this.f192788b.hashCode() + (this.f192787a.hashCode() * 31);
    }
}
