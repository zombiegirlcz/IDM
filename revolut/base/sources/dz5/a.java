package dz5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADD_TO_BEGINNING;
    public static final a ADD_TO_END;
    public static final a EXCLUDE;

    static {
        a aVar = new a("ADD_TO_BEGINNING", 0);
        ADD_TO_BEGINNING = aVar;
        a aVar2 = new a("ADD_TO_END", 1);
        ADD_TO_END = aVar2;
        a aVar3 = new a("EXCLUDE", 2);
        EXCLUDE = aVar3;
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
