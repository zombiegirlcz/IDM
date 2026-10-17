package v30;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a OFFLINE;
    public static final a ONLINE;
    public static final a OUT_OF_OFFICE;
    public static final a UNKNOWN;

    static {
        a aVar = new a("ONLINE", 0);
        ONLINE = aVar;
        a aVar2 = new a("OFFLINE", 1);
        OFFLINE = aVar2;
        a aVar3 = new a("OUT_OF_OFFICE", 2);
        OUT_OF_OFFICE = aVar3;
        a aVar4 = new a("UNKNOWN", 3);
        UNKNOWN = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
