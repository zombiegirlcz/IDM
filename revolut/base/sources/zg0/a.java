package zg0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PRIORITY_BALANCED_POWER_ACCURACY;
    public static final a PRIORITY_HD_ACCURACY;
    public static final a PRIORITY_HIGH_ACCURACY;
    public static final a PRIORITY_LOW_POWER;
    public static final a PRIORITY_NO_POWER;
    private final int intValue;

    static {
        a aVar = new a("PRIORITY_HIGH_ACCURACY", 0, 100);
        PRIORITY_HIGH_ACCURACY = aVar;
        a aVar2 = new a("PRIORITY_BALANCED_POWER_ACCURACY", 1, 102);
        PRIORITY_BALANCED_POWER_ACCURACY = aVar2;
        a aVar3 = new a("PRIORITY_LOW_POWER", 2, 104);
        PRIORITY_LOW_POWER = aVar3;
        a aVar4 = new a("PRIORITY_NO_POWER", 3, 105);
        PRIORITY_NO_POWER = aVar4;
        a aVar5 = new a("PRIORITY_HD_ACCURACY", 4, 200);
        PRIORITY_HD_ACCURACY = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.intValue = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.intValue;
    }
}
