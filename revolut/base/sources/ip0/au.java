package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class au {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ au[] $VALUES;
    public static final au NORMAL;
    public static final au SMALL;

    static {
        au auVar = new au("NORMAL", 0);
        NORMAL = auVar;
        au auVar2 = new au("SMALL", 1);
        SMALL = auVar2;
        au[] auVarArr = {auVar, auVar2};
        $VALUES = auVarArr;
        $ENTRIES = vc.s.n(auVarArr);
    }

    public static au valueOf(String str) {
        return (au) Enum.valueOf(au.class, str);
    }

    public static au[] values() {
        return (au[]) $VALUES.clone();
    }
}
