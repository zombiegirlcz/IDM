package b99;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SATISFIED;
    public static final a UNSATISFIABLE;
    public static final a UNSATISFIED;

    static {
        a aVar = new a("SATISFIED", 0);
        SATISFIED = aVar;
        a aVar2 = new a("UNSATISFIED", 1);
        UNSATISFIED = aVar2;
        a aVar3 = new a("UNSATISFIABLE", 2);
        UNSATISFIABLE = aVar3;
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
