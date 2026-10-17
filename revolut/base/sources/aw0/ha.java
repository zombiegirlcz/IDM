package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ha {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ha[] $VALUES;
    public static final ha ALLOW;
    public static final ha IGNORE;

    static {
        ha haVar = new ha("ALLOW", 0);
        ALLOW = haVar;
        ha haVar2 = new ha("IGNORE", 1);
        IGNORE = haVar2;
        ha[] haVarArr = {haVar, haVar2};
        $VALUES = haVarArr;
        $ENTRIES = vc.s.n(haVarArr);
    }

    public static ha valueOf(String str) {
        return (ha) Enum.valueOf(ha.class, str);
    }

    public static ha[] values() {
        return (ha[]) $VALUES.clone();
    }
}
