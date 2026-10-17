package l3b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CUSTOM;
    public static final a NEVER;
    public static final a NINETY_DAYS;
    public static final a SIX_MONTHS;
    public static final a TODAY;

    static {
        a aVar = new a("NINETY_DAYS", 0);
        NINETY_DAYS = aVar;
        a aVar2 = new a("TODAY", 1);
        TODAY = aVar2;
        a aVar3 = new a("SIX_MONTHS", 2);
        SIX_MONTHS = aVar3;
        a aVar4 = new a("CUSTOM", 3);
        CUSTOM = aVar4;
        a aVar5 = new a("NEVER", 4);
        NEVER = aVar5;
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
