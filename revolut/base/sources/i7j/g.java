package i7j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g AMOUNT_TOO_SMALL;
    public static final g BRL_LOWER_LIMIT_EXCEEDED;
    public static final g BRL_UPPER_LIMIT_EXCEEDED;
    public static final g BRL_USAGE_LIMIT_EXCEEDED;
    public static final g ESTIMATED;
    public static final g EXCEEDED_BALANCE;
    public static final g EXCEEDED_CRYPTO_LIMIT;
    public static final g FAILED_COMMODITY_LOWER_LIMIT;
    public static final g FAILED_CRYPTO_LOWER_LIMIT;
    public static final g LIMIT_PRICE_NEEDED;
    public static final g STOP_PRICE_NEEDED;

    static {
        g gVar = new g("EXCEEDED_BALANCE", 0);
        EXCEEDED_BALANCE = gVar;
        g gVar2 = new g("AMOUNT_TOO_SMALL", 1);
        AMOUNT_TOO_SMALL = gVar2;
        g gVar3 = new g("LIMIT_PRICE_NEEDED", 2);
        LIMIT_PRICE_NEEDED = gVar3;
        g gVar4 = new g("STOP_PRICE_NEEDED", 3);
        STOP_PRICE_NEEDED = gVar4;
        g gVar5 = new g("ESTIMATED", 4);
        ESTIMATED = gVar5;
        g gVar6 = new g("EXCEEDED_CRYPTO_LIMIT", 5);
        EXCEEDED_CRYPTO_LIMIT = gVar6;
        g gVar7 = new g("FAILED_CRYPTO_LOWER_LIMIT", 6);
        FAILED_CRYPTO_LOWER_LIMIT = gVar7;
        g gVar8 = new g("FAILED_COMMODITY_LOWER_LIMIT", 7);
        FAILED_COMMODITY_LOWER_LIMIT = gVar8;
        g gVar9 = new g("BRL_USAGE_LIMIT_EXCEEDED", 8);
        BRL_USAGE_LIMIT_EXCEEDED = gVar9;
        g gVar10 = new g("BRL_UPPER_LIMIT_EXCEEDED", 9);
        BRL_UPPER_LIMIT_EXCEEDED = gVar10;
        g gVar11 = new g("BRL_LOWER_LIMIT_EXCEEDED", 10);
        BRL_LOWER_LIMIT_EXCEEDED = gVar11;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
