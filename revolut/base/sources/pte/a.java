package pte;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NESTED_TOP_UP;
    public static final a REVOLUT_PAY;
    public static final a STANDARD;

    static {
        a aVar = new a("STANDARD", 0);
        STANDARD = aVar;
        a aVar2 = new a("NESTED_TOP_UP", 1);
        NESTED_TOP_UP = aVar2;
        a aVar3 = new a("REVOLUT_PAY", 2);
        REVOLUT_PAY = aVar3;
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
