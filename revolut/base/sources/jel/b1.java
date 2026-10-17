package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 BUYOUT;
    public static final b1 BUYOUT_GENERAL;
    public static final b1 BUYOUT_LARGE;
    public static final b1 BUYOUT_MEDIUM;
    public static final b1 BUYOUT_SMALL;
    public static final b1 CASH_AND_CASH_EQUIVALENTS;
    public static final b1 CORE;
    public static final b1 CORE_PLUS;
    public static final b1 CO_INVESTMENTS;
    public static final b1 DEBT;
    public static final b1 DIRECT_LENDING;
    public static final b1 DIRECT_LENDING_GENERAL;
    public static final b1 DIRECT_LENDING_NOT_SPONSOR_BACKED;
    public static final b1 DIRECT_LENDING_SPONSOR_BACKED;
    public static final b1 DISTRESSED;
    public static final b1 GROWTH_EQUITY;
    public static final b1 MEZZANINE;
    public static final b1 OPPORTUNISTIC;
    public static final b1 OTHER;
    public static final b1 OTHER_LIQUID_ASSETS;
    public static final b1 PRIMARIES;
    public static final b1 SECONDARIES;
    public static final b1 SPECIAL_SITUATIONS;
    public static final b1 VALUE_ADDED;
    public static final b1 VENTURE_CAPITAL;
    public static final b1 VENTURE_DEBT;

    static {
        b1 b1Var = new b1("BUYOUT", 0);
        BUYOUT = b1Var;
        b1 b1Var2 = new b1("BUYOUT_GENERAL", 1);
        BUYOUT_GENERAL = b1Var2;
        b1 b1Var3 = new b1("BUYOUT_LARGE", 2);
        BUYOUT_LARGE = b1Var3;
        b1 b1Var4 = new b1("BUYOUT_MEDIUM", 3);
        BUYOUT_MEDIUM = b1Var4;
        b1 b1Var5 = new b1("BUYOUT_SMALL", 4);
        BUYOUT_SMALL = b1Var5;
        b1 b1Var6 = new b1("PRIMARIES", 5);
        PRIMARIES = b1Var6;
        b1 b1Var7 = new b1("SECONDARIES", 6);
        SECONDARIES = b1Var7;
        b1 b1Var8 = new b1("CO_INVESTMENTS", 7);
        CO_INVESTMENTS = b1Var8;
        b1 b1Var9 = new b1("GROWTH_EQUITY", 8);
        GROWTH_EQUITY = b1Var9;
        b1 b1Var10 = new b1("VENTURE_CAPITAL", 9);
        VENTURE_CAPITAL = b1Var10;
        b1 b1Var11 = new b1("DIRECT_LENDING", 10);
        DIRECT_LENDING = b1Var11;
        b1 b1Var12 = new b1("DIRECT_LENDING_GENERAL", 11);
        DIRECT_LENDING_GENERAL = b1Var12;
        b1 b1Var13 = new b1("DIRECT_LENDING_SPONSOR_BACKED", 12);
        DIRECT_LENDING_SPONSOR_BACKED = b1Var13;
        b1 b1Var14 = new b1("DIRECT_LENDING_NOT_SPONSOR_BACKED", 13);
        DIRECT_LENDING_NOT_SPONSOR_BACKED = b1Var14;
        b1 b1Var15 = new b1("MEZZANINE", 14);
        MEZZANINE = b1Var15;
        b1 b1Var16 = new b1("DISTRESSED", 15);
        DISTRESSED = b1Var16;
        b1 b1Var17 = new b1("SPECIAL_SITUATIONS", 16);
        SPECIAL_SITUATIONS = b1Var17;
        b1 b1Var18 = new b1("VENTURE_DEBT", 17);
        VENTURE_DEBT = b1Var18;
        b1 b1Var19 = new b1("CORE", 18);
        CORE = b1Var19;
        b1 b1Var20 = new b1("CORE_PLUS", 19);
        CORE_PLUS = b1Var20;
        b1 b1Var21 = new b1("VALUE_ADDED", 20);
        VALUE_ADDED = b1Var21;
        b1 b1Var22 = new b1("OPPORTUNISTIC", 21);
        OPPORTUNISTIC = b1Var22;
        b1 b1Var23 = new b1("DEBT", 22);
        DEBT = b1Var23;
        b1 b1Var24 = new b1("CASH_AND_CASH_EQUIVALENTS", 23);
        CASH_AND_CASH_EQUIVALENTS = b1Var24;
        b1 b1Var25 = new b1("OTHER_LIQUID_ASSETS", 24);
        OTHER_LIQUID_ASSETS = b1Var25;
        b1 b1Var26 = new b1("OTHER", 25);
        OTHER = b1Var26;
        b1[] b1VarArr = {b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, b1Var8, b1Var9, b1Var10, b1Var11, b1Var12, b1Var13, b1Var14, b1Var15, b1Var16, b1Var17, b1Var18, b1Var19, b1Var20, b1Var21, b1Var22, b1Var23, b1Var24, b1Var25, b1Var26};
        $VALUES = b1VarArr;
        $ENTRIES = vc.s.n(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
