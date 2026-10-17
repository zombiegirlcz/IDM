package cnf;

import aw0.ka;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.h3;
import tof.y6;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements k {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeClause.Format.DayAndMonth f25418a = new TimeClause.Format.DayAndMonth(ka.SHORT);

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause b(DateTime dateTime) {
        return dateTime != null ? new TextLocalisedClause(R.string.transaction_details_delayed_pos_time, u.c(new TimeClause(dateTime.getMillis(), f25418a, null, null, 12)), null, 12) : new TextLocalisedClause(R.string.transaction_details_delayed_no_date, null, null, 14);
    }

    public final TextLocalisedClause a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        h3 h3Var = transaction.A;
        DateTime dateTime = h3Var.e;
        boolean z = h3Var.f;
        y6 y6Var = transaction.e;
        if (y6Var == y6.ATM) {
            if (k71.k.h(transaction)) {
                return new TextLocalisedClause(R.string.top_up_transaction_withdrawal, null, null, 14);
            }
            if (z) {
                return b(dateTime);
            }
        } else if (y6Var == y6.CARD_PAYMENT) {
            if (k71.k.h(transaction) && !k71.k.g0(transaction)) {
                return new TextLocalisedClause(R.string.top_up_transaction_payment, null, null, 14);
            }
            if (z) {
                return b(dateTime);
            }
            if (k71.k.i0(transaction)) {
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                return (k71.k.i0(transaction) && Intrinsics.f(transaction.f272611s, "tfl_prefunding")) ? new TextLocalisedClause(R.string.transactions_tfl_auth, null, null, 14) : new TextLocalisedClause(R.string.transactions_tfl_note, null, null, 14);
            }
        } else if (y6Var == y6.TOPUP && k71.k.h(transaction)) {
            return new TextLocalisedClause(R.string.transaction_top_up_declined, null, null, 14);
        }
        return null;
    }
}
