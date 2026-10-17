package vel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CURRENCY;
    public static final h CURRENCY_PAIR;
    public static final h INDEX;
    public static final h STOCK;

    static {
        h hVar = new h("STOCK", 0);
        STOCK = hVar;
        h hVar2 = new h("CURRENCY", 1);
        CURRENCY = hVar2;
        h hVar3 = new h("INDEX", 2);
        INDEX = hVar3;
        h hVar4 = new h("CURRENCY_PAIR", 3);
        CURRENCY_PAIR = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
