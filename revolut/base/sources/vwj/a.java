package vwj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AS_TOP;
    public static final a SINGLE_TOP;
    public static final a STARTUP;

    static {
        a aVar = new a("AS_TOP", 0);
        AS_TOP = aVar;
        a aVar2 = new a("STARTUP", 1);
        STARTUP = aVar2;
        a aVar3 = new a("SINGLE_TOP", 2);
        SINGLE_TOP = aVar3;
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
