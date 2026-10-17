package lc0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l EDIT;
    public static final l HIDDEN;
    public static final l VISIBLE;

    static {
        l lVar = new l("VISIBLE", 0);
        VISIBLE = lVar;
        l lVar2 = new l("HIDDEN", 1);
        HIDDEN = lVar2;
        l lVar3 = new l("EDIT", 2);
        EDIT = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
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
