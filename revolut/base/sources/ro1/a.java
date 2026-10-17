package ro1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BIWEEKLY;
    public static final a DAILY;
    public static final a MONTHLY;
    public static final a WEEKLY;
    public static final a YEARLY;

    static {
        a aVar = new a("DAILY", 0);
        DAILY = aVar;
        a aVar2 = new a("WEEKLY", 1);
        WEEKLY = aVar2;
        a aVar3 = new a("BIWEEKLY", 2);
        BIWEEKLY = aVar3;
        a aVar4 = new a("MONTHLY", 3);
        MONTHLY = aVar4;
        a aVar5 = new a("YEARLY", 4);
        YEARLY = aVar5;
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
