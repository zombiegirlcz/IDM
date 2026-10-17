package tqe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ERROR;
    public static final a FAILED;
    public static final a NONE;
    public static final a PASSED;
    public static final a PENDING;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("PENDING", 1);
        PENDING = aVar2;
        a aVar3 = new a("PASSED", 2);
        PASSED = aVar3;
        a aVar4 = new a("FAILED", 3);
        FAILED = aVar4;
        a aVar5 = new a("ERROR", 4);
        ERROR = aVar5;
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
