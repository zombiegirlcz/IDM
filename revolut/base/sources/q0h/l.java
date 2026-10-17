package q0h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l MOST_BOUGHT;
    public static final l MOST_SOLD;
    public static final l MOST_TRADED;

    static {
        l lVar = new l("MOST_TRADED", 0);
        MOST_TRADED = lVar;
        l lVar2 = new l("MOST_BOUGHT", 1);
        MOST_BOUGHT = lVar2;
        l lVar3 = new l("MOST_SOLD", 2);
        MOST_SOLD = lVar3;
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
