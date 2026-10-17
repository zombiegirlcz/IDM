package b6i;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BOTTOM_TO_TOP;
    public static final l TOP_TO_BOTTOM;

    static {
        l lVar = new l("TOP_TO_BOTTOM", 0);
        TOP_TO_BOTTOM = lVar;
        l lVar2 = new l("BOTTOM_TO_TOP", 1);
        BOTTOM_TO_TOP = lVar2;
        l[] lVarArr = {lVar, lVar2};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
