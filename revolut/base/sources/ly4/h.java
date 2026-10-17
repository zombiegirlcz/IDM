package ly4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$AmountType;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$RepaymentDay;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitConfirmScreenContract$AmountType f200683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DirectDebitConfirmScreenContract$RepaymentDay f200684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f200685c;
    public final String d;

    public h(DirectDebitConfirmScreenContract$AmountType amountType, DirectDebitConfirmScreenContract$RepaymentDay repaymentDay, Clause bankName, String clabe) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(repaymentDay, "repaymentDay");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(clabe, "clabe");
        this.f200683a = amountType;
        this.f200684b = repaymentDay;
        this.f200685c = bankName;
        this.d = clabe;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f200683a, hVar.f200683a) && Intrinsics.f(this.f200684b, hVar.f200684b) && Intrinsics.f(this.f200685c, hVar.f200685c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a((this.f200684b.hashCode() + (this.f200683a.hashCode() * 31)) * 31, 31, this.f200685c);
    }
}
