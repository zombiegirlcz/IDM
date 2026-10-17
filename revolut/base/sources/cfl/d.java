package cfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BUY_SELL;
    public static final d CLOSE_POSITION_ONLY;
    public static final d NONE;
    public static final d SELL_ONLY;

    static {
        d dVar = new d("BUY_SELL", 0);
        BUY_SELL = dVar;
        d dVar2 = new d("SELL_ONLY", 1);
        SELL_ONLY = dVar2;
        d dVar3 = new d("CLOSE_POSITION_ONLY", 2);
        CLOSE_POSITION_ONLY = dVar3;
        d dVar4 = new d("NONE", 3);
        NONE = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
