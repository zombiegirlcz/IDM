package qsg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEFAULT;
    public static final a NAME;
    public static final a RECENT_FIRST;

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        a aVar2 = new a("NAME", 1);
        NAME = aVar2;
        a aVar3 = new a("RECENT_FIRST", 2);
        RECENT_FIRST = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
