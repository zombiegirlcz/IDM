package vl4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BELOW_MINIMUM;
    public static final b FULLY_REPAID;
    public static final b MIN_PAYMENT_PAID;

    static {
        b bVar = new b("BELOW_MINIMUM", 0);
        BELOW_MINIMUM = bVar;
        b bVar2 = new b("MIN_PAYMENT_PAID", 1);
        MIN_PAYMENT_PAID = bVar2;
        b bVar3 = new b("FULLY_REPAID", 2);
        FULLY_REPAID = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
