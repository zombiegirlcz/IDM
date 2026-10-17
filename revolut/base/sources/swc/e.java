package swc;

import com.revolut.feature.security_hub.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer a(String limitName) {
        Intrinsics.checkNotNullParameter(limitName, "limitName");
        switch (limitName.hashCode()) {
            case -1928952970:
                if (limitName.equals("DAILY_OUTBOUND_HU")) {
                    return Integer.valueOf(R$string.security_hub_transactions_limits_dialog_limit_exceeded_transfers);
                }
                return null;
            case -1910562554:
                if (!limitName.equals("NIGHTLY_OUTBOUND_BR_SELF")) {
                    return null;
                }
                break;
            case -1110652654:
                if (!limitName.equals("DAILY_OUTBOUND_BR_SELF")) {
                    return null;
                }
                break;
            case -48347617:
                if (limitName.equals("CARD_PAYMENTS_ROLLING_DAY")) {
                    return Integer.valueOf(R$string.security_hub_transactions_limits_dialog_limit_exceeded_card_payments);
                }
                return null;
            case 331122717:
                if (limitName.equals("ATM_ROLLING_DAY")) {
                    return Integer.valueOf(R$string.security_hub_transactions_limits_dialog_limit_exceeded_atm_withdrawals);
                }
                return null;
            default:
                return null;
        }
        return Integer.valueOf(R$string.security_hub_transactions_limits_dialog_limit_exceeded_transfer_to_self);
    }
}
