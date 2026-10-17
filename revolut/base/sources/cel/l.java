package cel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACTUAL;
    public static final l ESTIMATE;

    static {
        l lVar = new l("ACTUAL", 0);
        ACTUAL = lVar;
        l lVar2 = new l("ESTIMATE", 1);
        ESTIMATE = lVar2;
        l[] lVarArr = {lVar, lVar2};
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
