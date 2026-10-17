package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 BIN_COMPROMISED;
    public static final c0 CHANGED_BY_USER;
    public static final c0 COMPROMISED;
    public static final c0 CREDIT_FACILITY_DEACTIVATION;

    @NotNull
    public static final b0 Companion;
    public static final c0 DAMAGED;
    public static final c0 DECLINED_BY_FRAUD_DETECTOR_TRANSACTION;
    public static final c0 DECLINE_RATE_LIMIT;
    public static final c0 DISPOSABLE_EXPIRED;
    public static final c0 DISPOSABLE_USED;
    public static final c0 EXPIRED;
    public static final c0 EXPIRY_TRIES_EXCEEDED;
    public static final c0 FINCRIME_WORKFLOWS;
    public static final c0 FOUND_ON_DARKNET;
    public static final c0 LOST;
    public static final c0 PRE_ORDER_CANCELLED;
    public static final c0 RECARDED;
    public static final c0 REPORTED_AS_COMPROMISED;
    public static final c0 SUSPICIOUS_CARD_TRANSACTION;
    public static final c0 TEMPORARILY_SUSPENDED;
    public static final c0 UNDELIVERED;
    public static final c0 UNKNOWN;
    public static final c0 USER_PERMISSIONS_RESTRICTED;

    @NotNull
    private final String value;

    static {
        c0 c0Var = new c0("SUSPICIOUS_CARD_TRANSACTION", 0, "SUSPICIOUS_CARD_TRANSACTION");
        SUSPICIOUS_CARD_TRANSACTION = c0Var;
        c0 c0Var2 = new c0("DECLINE_RATE_LIMIT", 1, "DECLINE_RATE_LIMIT");
        DECLINE_RATE_LIMIT = c0Var2;
        c0 c0Var3 = new c0("DECLINED_BY_FRAUD_DETECTOR_TRANSACTION", 2, "DECLINED_BY_FRAUD_DETECTOR_TRANSACTION");
        DECLINED_BY_FRAUD_DETECTOR_TRANSACTION = c0Var3;
        c0 c0Var4 = new c0("COMPROMISED", 3, "COMPROMISED");
        COMPROMISED = c0Var4;
        c0 c0Var5 = new c0("UNDELIVERED", 4, "UNDELIVERED");
        UNDELIVERED = c0Var5;
        c0 c0Var6 = new c0("EXPIRED", 5, "EXPIRED");
        EXPIRED = c0Var6;
        c0 c0Var7 = new c0("CHANGED_BY_USER", 6, "CHANGED_BY_USER");
        CHANGED_BY_USER = c0Var7;
        c0 c0Var8 = new c0("PRE_ORDER_CANCELLED", 7, "PRE_ORDER_CANCELLED");
        PRE_ORDER_CANCELLED = c0Var8;
        c0 c0Var9 = new c0("FOUND_ON_DARKNET", 8, "FOUND_ON_DARKNET");
        FOUND_ON_DARKNET = c0Var9;
        c0 c0Var10 = new c0("RECARDED", 9, "RECARDED");
        RECARDED = c0Var10;
        c0 c0Var11 = new c0("LOST", 10, "LOST");
        LOST = c0Var11;
        c0 c0Var12 = new c0("USER_PERMISSIONS_RESTRICTED", 11, "USER_PERMISSIONS_RESTRICTED");
        USER_PERMISSIONS_RESTRICTED = c0Var12;
        c0 c0Var13 = new c0("REPORTED_AS_COMPROMISED", 12, "REPORTED_AS_COMPROMISED");
        REPORTED_AS_COMPROMISED = c0Var13;
        c0 c0Var14 = new c0("DISPOSABLE_USED", 13, "DISPOSABLE_USED");
        DISPOSABLE_USED = c0Var14;
        c0 c0Var15 = new c0("DISPOSABLE_EXPIRED", 14, "DISPOSABLE_EXPIRED");
        DISPOSABLE_EXPIRED = c0Var15;
        c0 c0Var16 = new c0("DAMAGED", 15, "DAMAGED");
        DAMAGED = c0Var16;
        c0 c0Var17 = new c0("TEMPORARILY_SUSPENDED", 16, "TEMPORARILY_SUSPENDED");
        TEMPORARILY_SUSPENDED = c0Var17;
        c0 c0Var18 = new c0("CREDIT_FACILITY_DEACTIVATION", 17, "CREDIT_FACILITY_DEACTIVATION");
        CREDIT_FACILITY_DEACTIVATION = c0Var18;
        c0 c0Var19 = new c0("EXPIRY_TRIES_EXCEEDED", 18, "EXPIRY_TRIES_EXCEEDED");
        EXPIRY_TRIES_EXCEEDED = c0Var19;
        c0 c0Var20 = new c0("BIN_COMPROMISED", 19, "BIN_COMPROMISED");
        BIN_COMPROMISED = c0Var20;
        c0 c0Var21 = new c0("FINCRIME_WORKFLOWS", 20, "FINCRIME_WORKFLOWS");
        FINCRIME_WORKFLOWS = c0Var21;
        c0 c0Var22 = new c0("UNKNOWN", 21, "UNKNOWN");
        UNKNOWN = c0Var22;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10, c0Var11, c0Var12, c0Var13, c0Var14, c0Var15, c0Var16, c0Var17, c0Var18, c0Var19, c0Var20, c0Var21, c0Var22};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
        Companion = new b0();
    }

    public c0(String str, int i, String str2) {
        this.value = str2;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
