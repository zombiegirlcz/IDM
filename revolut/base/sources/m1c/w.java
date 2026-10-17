package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w ACTIVE;
    public static final w LOCKED;
    public static final w UNKNOWN;

    static {
        w wVar = new w("ACTIVE", 0);
        ACTIVE = wVar;
        w wVar2 = new w("LOCKED", 1);
        LOCKED = wVar2;
        w wVar3 = new w("UNKNOWN", 2);
        UNKNOWN = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
