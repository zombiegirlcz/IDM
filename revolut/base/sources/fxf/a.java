package fxf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANY;
    public static final a COARSE_LOCATION;
    public static final a FINE_LOCATION;

    static {
        a aVar = new a("FINE_LOCATION", 0);
        FINE_LOCATION = aVar;
        a aVar2 = new a("COARSE_LOCATION", 1);
        COARSE_LOCATION = aVar2;
        a aVar3 = new a("ANY", 2);
        ANY = aVar3;
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
