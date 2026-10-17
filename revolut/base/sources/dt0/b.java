package dt0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FIND_ANY;
    public static final b FIND_FIRST;
    public static final b FIND_LAST;

    static {
        b bVar = new b("FIND_ANY", 0);
        FIND_ANY = bVar;
        b bVar2 = new b("FIND_FIRST", 1);
        FIND_FIRST = bVar2;
        b bVar3 = new b("FIND_LAST", 2);
        FIND_LAST = bVar3;
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
