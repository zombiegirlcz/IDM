package qtc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVE;
    public static final a SUSPENDED;
    public static final a UNKNOWN;

    static {
        a aVar = new a("ACTIVE", 0);
        ACTIVE = aVar;
        a aVar2 = new a("SUSPENDED", 1);
        SUSPENDED = aVar2;
        a aVar3 = new a("UNKNOWN", 2);
        UNKNOWN = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
