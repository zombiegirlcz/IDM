package eh5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a LOCKED_GIFT;
    public static final a LOCKED_UNSTAKE;
    public static final a OPEN_ORDERS;

    static {
        a aVar = new a("OPEN_ORDERS", 0);
        OPEN_ORDERS = aVar;
        a aVar2 = new a("LOCKED_GIFT", 1);
        LOCKED_GIFT = aVar2;
        a aVar3 = new a("LOCKED_UNSTAKE", 2);
        LOCKED_UNSTAKE = aVar3;
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
