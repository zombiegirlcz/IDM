package qih;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AVAILABLE_TO_INVEST;
    public static final a AVAILABLE_TO_WITHDRAW;
    public static final a TOTAL;

    static {
        a aVar = new a("TOTAL", 0);
        TOTAL = aVar;
        a aVar2 = new a("AVAILABLE_TO_WITHDRAW", 1);
        AVAILABLE_TO_WITHDRAW = aVar2;
        a aVar3 = new a("AVAILABLE_TO_INVEST", 2);
        AVAILABLE_TO_INVEST = aVar3;
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
