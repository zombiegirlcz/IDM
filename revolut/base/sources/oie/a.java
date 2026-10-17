package oie;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SAVINGS_DEPOSITS;
    public static final a SAVINGS_FIXED_TERM;
    public static final a SAVINGS_MMF;
    public static final a UNKNOWN;

    static {
        a aVar = new a("SAVINGS_DEPOSITS", 0);
        SAVINGS_DEPOSITS = aVar;
        a aVar2 = new a("SAVINGS_FIXED_TERM", 1);
        SAVINGS_FIXED_TERM = aVar2;
        a aVar3 = new a("SAVINGS_MMF", 2);
        SAVINGS_MMF = aVar3;
        a aVar4 = new a("UNKNOWN", 3);
        UNKNOWN = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
