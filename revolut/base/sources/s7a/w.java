package s7a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w DEPENDS_ON_CONTENT_COUNT;
    public static final w HIDDEN;
    public static final w SHOWN;

    static {
        w wVar = new w("HIDDEN", 0);
        HIDDEN = wVar;
        w wVar2 = new w("SHOWN", 1);
        SHOWN = wVar2;
        w wVar3 = new w("DEPENDS_ON_CONTENT_COUNT", 2);
        DEPENDS_ON_CONTENT_COUNT = wVar3;
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
