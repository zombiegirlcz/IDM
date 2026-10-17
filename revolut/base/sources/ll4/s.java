package ll4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BALANCE_TRANSFER;
    public static final s UNKNOWN;

    static {
        s sVar = new s("BALANCE_TRANSFER", 0);
        BALANCE_TRANSFER = sVar;
        s sVar2 = new s("UNKNOWN", 1);
        UNKNOWN = sVar2;
        s[] sVarArr = {sVar, sVar2};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
