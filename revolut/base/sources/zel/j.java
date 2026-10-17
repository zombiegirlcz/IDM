package zel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BOND;
    public static final j COMMODITY;
    public static final j CRYPTO;
    public static final j ETF;
    public static final j INDEX;
    public static final j NOTE;
    public static final j STOCK;
    public static final j UNKNOWN;

    static {
        j jVar = new j("STOCK", 0);
        STOCK = jVar;
        j jVar2 = new j("BOND", 1);
        BOND = jVar2;
        j jVar3 = new j("COMMODITY", 2);
        COMMODITY = jVar3;
        j jVar4 = new j("CRYPTO", 3);
        CRYPTO = jVar4;
        j jVar5 = new j("INDEX", 4);
        INDEX = jVar5;
        j jVar6 = new j("ETF", 5);
        ETF = jVar6;
        j jVar7 = new j("NOTE", 6);
        NOTE = jVar7;
        j jVar8 = new j("UNKNOWN", 7);
        UNKNOWN = jVar8;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
