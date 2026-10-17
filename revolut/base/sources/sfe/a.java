package sfe;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CACHE_ONLY;
    public static final a FULL;
    public static final a RELOAD;

    static {
        a aVar = new a("FULL", 0);
        FULL = aVar;
        a aVar2 = new a("RELOAD", 1);
        RELOAD = aVar2;
        a aVar3 = new a("CACHE_ONLY", 2);
        CACHE_ONLY = aVar3;
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
