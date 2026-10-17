package y7d;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CONTENT;
    public static final k ENTRY;
    public static final k ERROR;
    public static final k THINKING;

    static {
        k kVar = new k("ENTRY", 0);
        ENTRY = kVar;
        k kVar2 = new k("THINKING", 1);
        THINKING = kVar2;
        k kVar3 = new k("CONTENT", 2);
        CONTENT = kVar3;
        k kVar4 = new k("ERROR", 3);
        ERROR = kVar4;
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
