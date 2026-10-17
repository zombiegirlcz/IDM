package fel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITY;
    public static final a CRYPTO;
    public static final a FIAT;
    public static final a INDEX;
    public static final a SECURITY;

    static {
        a aVar = new a("COMMODITY", 0);
        COMMODITY = aVar;
        a aVar2 = new a("SECURITY", 1);
        SECURITY = aVar2;
        a aVar3 = new a("CRYPTO", 2);
        CRYPTO = aVar3;
        a aVar4 = new a("INDEX", 3);
        INDEX = aVar4;
        a aVar5 = new a("FIAT", 4);
        FIAT = aVar5;
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
