package yw4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AVAILABLE;
    public static final a SPENT;
    public static final a STATEMENT;
    public static final a UNKNOWN;
    public static final a UNSELECTED;

    static {
        a aVar = new a("SPENT", 0);
        SPENT = aVar;
        a aVar2 = new a("AVAILABLE", 1);
        AVAILABLE = aVar2;
        a aVar3 = new a("STATEMENT", 2);
        STATEMENT = aVar3;
        a aVar4 = new a("UNKNOWN", 3);
        UNKNOWN = aVar4;
        a aVar5 = new a("UNSELECTED", 4);
        UNSELECTED = aVar5;
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
