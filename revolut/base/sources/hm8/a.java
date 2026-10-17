package hm8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ABOVE_MAX_AGE;
    public static final a ELIGIBLE;
    public static final a INELIGIBLE;

    static {
        a aVar = new a("ABOVE_MAX_AGE", 0);
        ABOVE_MAX_AGE = aVar;
        a aVar2 = new a("ELIGIBLE", 1);
        ELIGIBLE = aVar2;
        a aVar3 = new a("INELIGIBLE", 2);
        INELIGIBLE = aVar3;
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
