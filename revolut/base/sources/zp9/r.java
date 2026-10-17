package zp9;

import aw0.k7;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.messaging.common.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static MoneyClause a(cp9.a splitType, wp9.t participant) {
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        Intrinsics.checkNotNullParameter(participant, "participant");
        int i = q.f324211a[splitType.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        k7 k7Var = null;
        ScaleMode scaleMode = null;
        boolean z = false;
        return new MoneyClause(participant.f299201c, new MoneyClause.Format.Defaults(k7Var, scaleMode, z, false, 15), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12);
    }

    public static TextLocalisedClause b(cp9.a splitType, wp9.t participant) {
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        Intrinsics.checkNotNullParameter(participant, "participant");
        MoneyClause moneyClauseA = a(splitType, participant);
        if (moneyClauseA != null) {
            return new TextLocalisedClause(R$string.payments_split_bill_summary_paid, zhm.u.c(moneyClauseA), null, 12);
        }
        return null;
    }
}
