package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class am {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ am[] $VALUES;
    public static final am AUTO;
    public static final am DARK;
    public static final am LIGHT;

    static {
        am amVar = new am("LIGHT", 0);
        LIGHT = amVar;
        am amVar2 = new am("DARK", 1);
        DARK = amVar2;
        am amVar3 = new am("AUTO", 2);
        AUTO = amVar3;
        am[] amVarArr = {amVar, amVar2, amVar3};
        $VALUES = amVarArr;
        $ENTRIES = vc.s.n(amVarArr);
    }

    public static am valueOf(String str) {
        return (am) Enum.valueOf(am.class, str);
    }

    public static am[] values() {
        return (am[]) $VALUES.clone();
    }
}
