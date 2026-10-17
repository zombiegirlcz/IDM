package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class tt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ tt[] $VALUES;
    public static final tt FILL;
    public static final tt OUTLINE;

    static {
        tt ttVar = new tt("OUTLINE", 0);
        OUTLINE = ttVar;
        tt ttVar2 = new tt("FILL", 1);
        FILL = ttVar2;
        tt[] ttVarArr = {ttVar, ttVar2};
        $VALUES = ttVarArr;
        $ENTRIES = vc.s.n(ttVarArr);
    }

    public static tt valueOf(String str) {
        return (tt) Enum.valueOf(tt.class, str);
    }

    public static tt[] values() {
        return (tt[]) $VALUES.clone();
    }
}
