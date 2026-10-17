package fs6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BI_MONTHLY;
    public static final b HALF_YEARLY;
    public static final b MONTHLY;
    public static final b QUARTERLY;
    public static final b UNKNOWN;
    public static final b YEARLY;

    static {
        b bVar = new b("MONTHLY", 0);
        MONTHLY = bVar;
        b bVar2 = new b("BI_MONTHLY", 1);
        BI_MONTHLY = bVar2;
        b bVar3 = new b("QUARTERLY", 2);
        QUARTERLY = bVar3;
        b bVar4 = new b("HALF_YEARLY", 3);
        HALF_YEARLY = bVar4;
        b bVar5 = new b("YEARLY", 4);
        YEARLY = bVar5;
        b bVar6 = new b("UNKNOWN", 5);
        UNKNOWN = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
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
