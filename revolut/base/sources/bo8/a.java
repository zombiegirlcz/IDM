package bo8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BIZUM;
    public static final a BLIK;
    public static final a MB_WAY;
    public static final a NONE;

    static {
        a aVar = new a("BIZUM", 0);
        BIZUM = aVar;
        a aVar2 = new a("BLIK", 1);
        BLIK = aVar2;
        a aVar3 = new a("MB_WAY", 2);
        MB_WAY = aVar3;
        a aVar4 = new a("NONE", 3);
        NONE = aVar4;
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
