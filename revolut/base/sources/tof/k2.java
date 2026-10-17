package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k2[] $VALUES;
    public static final k2 NOT_COLLECTION_EXCHANGE;
    public static final k2 NOT_HIDDEN;
    public static final k2 NOT_PENDING_CARD_REFUND;
    public static final k2 NOT_SPARE_CHANGE;
    public static final k2 NOT_SUSPICIOUS;
    public static final k2 SUSPICIOUS_BY_FRAUD_STATE;
    public static final k2 SUSPICIOUS_BY_REASON_CODE;
    public static final k2 VALID_STATES;

    static {
        k2 k2Var = new k2("VALID_STATES", 0);
        VALID_STATES = k2Var;
        k2 k2Var2 = new k2("NOT_SPARE_CHANGE", 1);
        NOT_SPARE_CHANGE = k2Var2;
        k2 k2Var3 = new k2("NOT_HIDDEN", 2);
        NOT_HIDDEN = k2Var3;
        k2 k2Var4 = new k2("SUSPICIOUS_BY_FRAUD_STATE", 3);
        SUSPICIOUS_BY_FRAUD_STATE = k2Var4;
        k2 k2Var5 = new k2("SUSPICIOUS_BY_REASON_CODE", 4);
        SUSPICIOUS_BY_REASON_CODE = k2Var5;
        k2 k2Var6 = new k2("NOT_SUSPICIOUS", 5);
        NOT_SUSPICIOUS = k2Var6;
        k2 k2Var7 = new k2("NOT_COLLECTION_EXCHANGE", 6);
        NOT_COLLECTION_EXCHANGE = k2Var7;
        k2 k2Var8 = new k2("NOT_PENDING_CARD_REFUND", 7);
        NOT_PENDING_CARD_REFUND = k2Var8;
        k2[] k2VarArr = {k2Var, k2Var2, k2Var3, k2Var4, k2Var5, k2Var6, k2Var7, k2Var8};
        $VALUES = k2VarArr;
        $ENTRIES = vc.s.n(k2VarArr);
    }

    public static k2 valueOf(String str) {
        return (k2) Enum.valueOf(k2.class, str);
    }

    public static k2[] values() {
        return (k2[]) $VALUES.clone();
    }
}
