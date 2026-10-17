package u6i;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c LIMIT_ORDER;
    public static final c MARKET_ORDER;
    public static final c SCHEDULING;
    public static final c STOP_ORDER;

    static {
        c cVar = new c("SCHEDULING", 0);
        SCHEDULING = cVar;
        c cVar2 = new c("MARKET_ORDER", 1);
        MARKET_ORDER = cVar2;
        c cVar3 = new c("LIMIT_ORDER", 2);
        LIMIT_ORDER = cVar3;
        c cVar4 = new c("STOP_ORDER", 3);
        STOP_ORDER = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
