package azl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BOTH;
    public static final l FROM_LEFT_TO_RIGHT;
    public static final l FROM_RIGHT_TO_LEFT;

    static {
        l lVar = new l("FROM_RIGHT_TO_LEFT", 0);
        FROM_RIGHT_TO_LEFT = lVar;
        l lVar2 = new l("FROM_LEFT_TO_RIGHT", 1);
        FROM_LEFT_TO_RIGHT = lVar2;
        l lVar3 = new l("BOTH", 2);
        BOTH = lVar3;
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
