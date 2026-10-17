package u2f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s LOYALTY_ORIGIN_ID;
    public static final s TRANSACTION_ID;
    public static final s UNKNOWN;

    static {
        s sVar = new s("LOYALTY_ORIGIN_ID", 0);
        LOYALTY_ORIGIN_ID = sVar;
        s sVar2 = new s("TRANSACTION_ID", 1);
        TRANSACTION_ID = sVar2;
        s sVar3 = new s("UNKNOWN", 2);
        UNKNOWN = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
