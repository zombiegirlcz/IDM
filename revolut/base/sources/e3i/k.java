package e3i;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ABOVE_THE_LIMIT;
    public static final k BELOW_THE_LIMIT;

    static {
        k kVar = new k("ABOVE_THE_LIMIT", 0);
        ABOVE_THE_LIMIT = kVar;
        k kVar2 = new k("BELOW_THE_LIMIT", 1);
        BELOW_THE_LIMIT = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
