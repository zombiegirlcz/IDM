package ptl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALL;
    public static final b EXCLUDE_RECURRING_BUYS;
    public static final b INCLUDE_ONLY_RECURRING_BUYS;

    static {
        b bVar = new b("ALL", 0);
        ALL = bVar;
        b bVar2 = new b("INCLUDE_ONLY_RECURRING_BUYS", 1);
        INCLUDE_ONLY_RECURRING_BUYS = bVar2;
        b bVar3 = new b("EXCLUDE_RECURRING_BUYS", 2);
        EXCLUDE_RECURRING_BUYS = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
