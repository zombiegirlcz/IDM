package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ft {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ft[] $VALUES;
    public static final ft DISABLED;
    public static final ft ENABLED;

    static {
        ft ftVar = new ft("ENABLED", 0);
        ENABLED = ftVar;
        ft ftVar2 = new ft("DISABLED", 1);
        DISABLED = ftVar2;
        ft[] ftVarArr = {ftVar, ftVar2};
        $VALUES = ftVarArr;
        $ENTRIES = vc.s.n(ftVarArr);
    }

    public static ft valueOf(String str) {
        return (ft) Enum.valueOf(ft.class, str);
    }

    public static ft[] values() {
        return (ft[]) $VALUES.clone();
    }
}
