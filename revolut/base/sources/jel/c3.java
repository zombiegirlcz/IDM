package jel;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c3[] $VALUES;
    public static final c3 BANKRUPTCY;
    public static final c3 GOING_OTC;
    public static final c3 GOING_PRIVATE;
    public static final c3 LIQUIDITY_CONSTRAINTS;
    public static final c3 MERGERS_AND_ACQUISITIONS;
    public static final c3 PENNY_STOCK;
    public static final c3 RISK_APPETITE;
    public static final c3 SANCTIONS_ON_BUY;
    public static final c3 SANCTIONS_SUSPEND;
    public static final c3 STOCK_SPLIT;

    @NotNull
    private final String reason;

    static {
        c3 c3Var = new c3("PENNY_STOCK", 0, "PENNY_STOCK");
        PENNY_STOCK = c3Var;
        c3 c3Var2 = new c3("SANCTIONS_ON_BUY", 1, "SANCTIONS_ON_BUY");
        SANCTIONS_ON_BUY = c3Var2;
        c3 c3Var3 = new c3("SANCTIONS_SUSPEND", 2, "SANCTIONS_SUSPEND");
        SANCTIONS_SUSPEND = c3Var3;
        c3 c3Var4 = new c3("GOING_PRIVATE", 3, "GOING_PRIVATE");
        GOING_PRIVATE = c3Var4;
        c3 c3Var5 = new c3("BANKRUPTCY", 4, "BANKRUPTCY");
        BANKRUPTCY = c3Var5;
        c3 c3Var6 = new c3("GOING_OTC", 5, "GOING_OTC");
        GOING_OTC = c3Var6;
        c3 c3Var7 = new c3("MERGERS_AND_ACQUISITIONS", 6, "MERGERS_AND_ACQUISITIONS");
        MERGERS_AND_ACQUISITIONS = c3Var7;
        c3 c3Var8 = new c3("STOCK_SPLIT", 7, "STOCK_SPLIT");
        STOCK_SPLIT = c3Var8;
        c3 c3Var9 = new c3("RISK_APPETITE", 8, "RISK_APPETITE");
        RISK_APPETITE = c3Var9;
        c3 c3Var10 = new c3("LIQUIDITY_CONSTRAINTS", 9, "LIQUIDITY_CONSTRAINTS");
        LIQUIDITY_CONSTRAINTS = c3Var10;
        c3[] c3VarArr = {c3Var, c3Var2, c3Var3, c3Var4, c3Var5, c3Var6, c3Var7, c3Var8, c3Var9, c3Var10};
        $VALUES = c3VarArr;
        $ENTRIES = vc.s.n(c3VarArr);
    }

    public c3(String str, int i, String str2) {
        this.reason = str2;
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) $VALUES.clone();
    }

    public final String a() {
        return this.reason;
    }
}
