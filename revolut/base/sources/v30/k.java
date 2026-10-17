package v30;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k GREAT;
    public static final k POOR;
    public static final k POSTPONED;
    public static final k WOW;

    static {
        k kVar = new k("POOR", 0);
        POOR = kVar;
        k kVar2 = new k("GREAT", 1);
        GREAT = kVar2;
        k kVar3 = new k("WOW", 2);
        WOW = kVar3;
        k kVar4 = new k("POSTPONED", 3);
        POSTPONED = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
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
