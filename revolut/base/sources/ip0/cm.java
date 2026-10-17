package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class cm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cm[] $VALUES;
    public static final cm HERO;
    public static final cm LARGE;

    static {
        cm cmVar = new cm("HERO", 0);
        HERO = cmVar;
        cm cmVar2 = new cm("LARGE", 1);
        LARGE = cmVar2;
        cm[] cmVarArr = {cmVar, cmVar2};
        $VALUES = cmVarArr;
        $ENTRIES = vc.s.n(cmVarArr);
    }

    public static cm valueOf(String str) {
        return (cm) Enum.valueOf(cm.class, str);
    }

    public static cm[] values() {
        return (cm[]) $VALUES.clone();
    }
}
