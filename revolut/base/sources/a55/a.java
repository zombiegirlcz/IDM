package a55;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import kotlin.jvm.internal.Intrinsics;
import sx4.f;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static MoneyClause a(LoanAccrual loanAccrual) {
        MoneyClause.Format.Defaults format = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        Intrinsics.checkNotNullParameter(loanAccrual, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return f.a(loanAccrual.f70124a, format, null);
    }
}
