package pbl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIRST_AND_LAST_NAME;
    public static final a FIRST_AND_MIDDLE_AND_LAST;
    public static final a FIRST_AND_SURNAMES;
    public static final a FULL_NAME;
    public static final a NATIVE_NAME;

    static {
        a aVar = new a("FIRST_AND_LAST_NAME", 0);
        FIRST_AND_LAST_NAME = aVar;
        a aVar2 = new a("FIRST_AND_SURNAMES", 1);
        FIRST_AND_SURNAMES = aVar2;
        a aVar3 = new a("FIRST_AND_MIDDLE_AND_LAST", 2);
        FIRST_AND_MIDDLE_AND_LAST = aVar3;
        a aVar4 = new a("FULL_NAME", 3);
        FULL_NAME = aVar4;
        a aVar5 = new a("NATIVE_NAME", 4);
        NATIVE_NAME = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
