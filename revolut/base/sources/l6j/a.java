package l6j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a LIMIT_BUY_ORDER_INTRO;
    public static final a LIMIT_SELL_ORDER_INTRO;
    public static final a RECURRING_ORDER_INTRO;
    public static final a STOP_BUY_ORDER_INTRO;
    public static final a STOP_SELL_ORDER_INTRO;

    static {
        a aVar = new a("STOP_BUY_ORDER_INTRO", 0);
        STOP_BUY_ORDER_INTRO = aVar;
        a aVar2 = new a("STOP_SELL_ORDER_INTRO", 1);
        STOP_SELL_ORDER_INTRO = aVar2;
        a aVar3 = new a("LIMIT_BUY_ORDER_INTRO", 2);
        LIMIT_BUY_ORDER_INTRO = aVar3;
        a aVar4 = new a("LIMIT_SELL_ORDER_INTRO", 3);
        LIMIT_SELL_ORDER_INTRO = aVar4;
        a aVar5 = new a("RECURRING_ORDER_INTRO", 4);
        RECURRING_ORDER_INTRO = aVar5;
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
