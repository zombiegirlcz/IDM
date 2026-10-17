package wd6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h LIMIT;
    public static final h MARKET;
    public static final h RECURRING;
    public static final h STOP;
    public static final h STOP_LOSS;
    public static final h TAKE_PROFIT;
    public static final h TAKE_PROFIT_STOP_LOSS;

    static {
        h hVar = new h("MARKET", 0);
        MARKET = hVar;
        h hVar2 = new h("LIMIT", 1);
        LIMIT = hVar2;
        h hVar3 = new h("STOP", 2);
        STOP = hVar3;
        h hVar4 = new h("RECURRING", 3);
        RECURRING = hVar4;
        h hVar5 = new h("TAKE_PROFIT_STOP_LOSS", 4);
        TAKE_PROFIT_STOP_LOSS = hVar5;
        h hVar6 = new h("TAKE_PROFIT", 5);
        TAKE_PROFIT = hVar6;
        h hVar7 = new h("STOP_LOSS", 6);
        STOP_LOSS = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
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
