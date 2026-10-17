package sza;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NEVER;
    public static final a ON_FIRST_PAGE_SHOWN;
    public static final a ON_LAST_PAGE_SHOWN;

    static {
        a aVar = new a("NEVER", 0);
        NEVER = aVar;
        a aVar2 = new a("ON_FIRST_PAGE_SHOWN", 1);
        ON_FIRST_PAGE_SHOWN = aVar2;
        a aVar3 = new a("ON_LAST_PAGE_SHOWN", 2);
        ON_LAST_PAGE_SHOWN = aVar3;
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
