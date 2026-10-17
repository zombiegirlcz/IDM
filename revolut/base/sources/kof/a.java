package kof;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTION_BUTTON;
    public static final a BANNER_AMOUNT;
    public static final a BANNER_SALARY;
    public static final a BANNER_TOP_UP;
    public static final a NONE;

    static {
        a aVar = new a("BANNER_TOP_UP", 0);
        BANNER_TOP_UP = aVar;
        a aVar2 = new a("BANNER_AMOUNT", 1);
        BANNER_AMOUNT = aVar2;
        a aVar3 = new a("BANNER_SALARY", 2);
        BANNER_SALARY = aVar3;
        a aVar4 = new a("ACTION_BUTTON", 3);
        ACTION_BUTTON = aVar4;
        a aVar5 = new a("NONE", 4);
        NONE = aVar5;
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
