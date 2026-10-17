package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 ACTIVE_CHARGEBACK;
    public static final n0 CANCELLED_CHARGEBACK;
    public static final n0 CARD_LIMIT_REACHED;
    public static final n0 COMPROMISED;

    @NotNull
    public static final m0 Companion;
    public static final n0 DAMAGED;
    public static final n0 EXPIRED;
    public static final n0 LOST;
    public static final n0 REACTIVATION_PERIOD_PASSED;
    public static final n0 REFUNDED;
    public static final n0 REPLACED;
    public static final n0 SUCCESSFUL_CHARGEBACK;
    public static final n0 TERMINATED_BY_REVOLUT;
    public static final n0 TERMINATED_BY_USER;
    public static final n0 TOO_MANY_CHARGEBACKS;
    public static final n0 UNDELIVERED;
    public static final n0 UNSUPPORTED;

    @NotNull
    private final String value;

    static {
        n0 n0Var = new n0("EXPIRED", 0, "EXPIRED");
        EXPIRED = n0Var;
        n0 n0Var2 = new n0("REPLACED", 1, "REPLACED");
        REPLACED = n0Var2;
        n0 n0Var3 = new n0("REACTIVATION_PERIOD_PASSED", 2, "REACTIVATION_PERIOD_PASSED");
        REACTIVATION_PERIOD_PASSED = n0Var3;
        n0 n0Var4 = new n0("CARD_LIMIT_REACHED", 3, "CARD_LIMIT_REACHED");
        CARD_LIMIT_REACHED = n0Var4;
        n0 n0Var5 = new n0("REFUNDED", 4, "REFUNDED");
        REFUNDED = n0Var5;
        n0 n0Var6 = new n0("LOST", 5, "LOST");
        LOST = n0Var6;
        n0 n0Var7 = new n0("COMPROMISED", 6, "COMPROMISED");
        COMPROMISED = n0Var7;
        n0 n0Var8 = new n0("TERMINATED_BY_USER", 7, "TERMINATED_BY_USER");
        TERMINATED_BY_USER = n0Var8;
        n0 n0Var9 = new n0("TERMINATED_BY_REVOLUT", 8, "TERMINATED_BY_REVOLUT");
        TERMINATED_BY_REVOLUT = n0Var9;
        n0 n0Var10 = new n0("UNDELIVERED", 9, "UNDELIVERED");
        UNDELIVERED = n0Var10;
        n0 n0Var11 = new n0("DAMAGED", 10, "DAMAGED");
        DAMAGED = n0Var11;
        n0 n0Var12 = new n0("ACTIVE_CHARGEBACK", 11, "ACTIVE_CHARGEBACK");
        ACTIVE_CHARGEBACK = n0Var12;
        n0 n0Var13 = new n0("CANCELLED_CHARGEBACK", 12, "CANCELLED_CHARGEBACK");
        CANCELLED_CHARGEBACK = n0Var13;
        n0 n0Var14 = new n0("SUCCESSFUL_CHARGEBACK", 13, "SUCCESSFUL_CHARGEBACK");
        SUCCESSFUL_CHARGEBACK = n0Var14;
        n0 n0Var15 = new n0("TOO_MANY_CHARGEBACKS", 14, "TOO_MANY_CHARGEBACKS");
        TOO_MANY_CHARGEBACKS = n0Var15;
        n0 n0Var16 = new n0("UNSUPPORTED", 15, "UNSUPPORTED");
        UNSUPPORTED = n0Var16;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var8, n0Var9, n0Var10, n0Var11, n0Var12, n0Var13, n0Var14, n0Var15, n0Var16};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
        Companion = new m0();
    }

    public n0(String str, int i, String str2) {
        this.value = str2;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
