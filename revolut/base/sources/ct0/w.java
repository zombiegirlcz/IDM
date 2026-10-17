package ct0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w BASE;
    public static final w BODY;
    public static final w TIP;

    static {
        w wVar = new w("TIP", 0);
        TIP = wVar;
        w wVar2 = new w("BODY", 1);
        BODY = wVar2;
        w wVar3 = new w("BASE", 2);
        BASE = wVar3;
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
