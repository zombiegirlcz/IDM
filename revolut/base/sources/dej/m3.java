package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m3[] $VALUES;
    public static final m3 PAYMENT;
    public static final m3 POINTS_REDEMPTION;
    public static final m3 POINTS_REFUND;
    public static final m3 REFUND;

    static {
        m3 m3Var = new m3("PAYMENT", 0);
        PAYMENT = m3Var;
        m3 m3Var2 = new m3("REFUND", 1);
        REFUND = m3Var2;
        m3 m3Var3 = new m3("POINTS_REDEMPTION", 2);
        POINTS_REDEMPTION = m3Var3;
        m3 m3Var4 = new m3("POINTS_REFUND", 3);
        POINTS_REFUND = m3Var4;
        m3[] m3VarArr = {m3Var, m3Var2, m3Var3, m3Var4};
        $VALUES = m3VarArr;
        $ENTRIES = vc.s.n(m3VarArr);
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) $VALUES.clone();
    }
}
