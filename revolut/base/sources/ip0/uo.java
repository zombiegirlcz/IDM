package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class uo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ uo[] $VALUES;
    public static final uo ACTIVE;
    public static final uo DISABLED;
    public static final uo INACTIVE;

    static {
        uo uoVar = new uo("ACTIVE", 0);
        ACTIVE = uoVar;
        uo uoVar2 = new uo("INACTIVE", 1);
        INACTIVE = uoVar2;
        uo uoVar3 = new uo("DISABLED", 2);
        DISABLED = uoVar3;
        uo[] uoVarArr = {uoVar, uoVar2, uoVar3};
        $VALUES = uoVarArr;
        $ENTRIES = vc.s.n(uoVarArr);
    }

    public static uo valueOf(String str) {
        return (uo) Enum.valueOf(uo.class, str);
    }

    public static uo[] values() {
        return (uo[]) $VALUES.clone();
    }
}
