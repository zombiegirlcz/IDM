package fxc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AVAILABLE;
    public static final a EXPIRED;
    public static final a UNAVAILABLE;
    public static final a UNVERIFIED;

    static {
        a aVar = new a("EXPIRED", 0);
        EXPIRED = aVar;
        a aVar2 = new a("UNAVAILABLE", 1);
        UNAVAILABLE = aVar2;
        a aVar3 = new a("UNVERIFIED", 2);
        UNVERIFIED = aVar3;
        a aVar4 = new a("AVAILABLE", 3);
        AVAILABLE = aVar4;
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
