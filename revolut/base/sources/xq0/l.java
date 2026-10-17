package xq0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l DISTRIBUTED;
    public static final l FILL_FIRST_AND_LAST;
    public static final l INNER_AND_FILL_LAST;

    static {
        l lVar = new l("DISTRIBUTED", 0);
        DISTRIBUTED = lVar;
        l lVar2 = new l("INNER_AND_FILL_LAST", 1);
        INNER_AND_FILL_LAST = lVar2;
        l lVar3 = new l("FILL_FIRST_AND_LAST", 2);
        FILL_FIRST_AND_LAST = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
