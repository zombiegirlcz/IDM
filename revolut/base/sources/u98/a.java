package u98;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ELIGIBLE;
    public static final a FUTURE_DATE;
    public static final a INVALID_AGE_DIFFERENCE;
    public static final a TOO_OLD;
    public static final a TOO_YOUNG;

    static {
        a aVar = new a("ELIGIBLE", 0);
        ELIGIBLE = aVar;
        a aVar2 = new a("TOO_OLD", 1);
        TOO_OLD = aVar2;
        a aVar3 = new a("TOO_YOUNG", 2);
        TOO_YOUNG = aVar3;
        a aVar4 = new a("FUTURE_DATE", 3);
        FUTURE_DATE = aVar4;
        a aVar5 = new a("INVALID_AGE_DIFFERENCE", 4);
        INVALID_AGE_DIFFERENCE = aVar5;
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
