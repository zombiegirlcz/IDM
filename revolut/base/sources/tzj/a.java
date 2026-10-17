package tzj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITIES;
    public static final a CRYPTO;
    public static final a TOP_STORIES;

    static {
        a aVar = new a("TOP_STORIES", 0);
        TOP_STORIES = aVar;
        a aVar2 = new a("CRYPTO", 1);
        CRYPTO = aVar2;
        a aVar3 = new a("COMMODITIES", 2);
        COMMODITIES = aVar3;
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
