package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class an {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ an[] $VALUES;
    public static final an BACKGROUND_AND_ITEMS;
    public static final an ITEMS_ONLY;

    static {
        an anVar = new an("ITEMS_ONLY", 0);
        ITEMS_ONLY = anVar;
        an anVar2 = new an("BACKGROUND_AND_ITEMS", 1);
        BACKGROUND_AND_ITEMS = anVar2;
        an[] anVarArr = {anVar, anVar2};
        $VALUES = anVarArr;
        $ENTRIES = vc.s.n(anVarArr);
    }

    public static an valueOf(String str) {
        return (an) Enum.valueOf(an.class, str);
    }

    public static an[] values() {
        return (an[]) $VALUES.clone();
    }
}
