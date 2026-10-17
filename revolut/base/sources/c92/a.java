package c92;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import h02.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final boolean a(MultibancoWithdrawalCode multibancoWithdrawalCode) {
        Intrinsics.checkNotNullParameter(multibancoWithdrawalCode, "<this>");
        return multibancoWithdrawalCode.f61953c == f.ACTIVE;
    }

    public static final MoneyClause b(MultibancoWithdrawalCode multibancoWithdrawalCode) {
        Intrinsics.checkNotNullParameter(multibancoWithdrawalCode, "<this>");
        return new MoneyClause(multibancoWithdrawalCode.f, new MoneyClause.Format.Shorts(false, 63), null, null, 12);
    }

    public static final String c(MultibancoWithdrawalCode multibancoWithdrawalCode) {
        Intrinsics.checkNotNullParameter(multibancoWithdrawalCode, "<this>");
        return d0.k0(f0.M0(3, multibancoWithdrawalCode.f61952b), " ", null, null, 0, null, 62);
    }
}
