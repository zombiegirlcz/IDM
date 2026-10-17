package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 COMMUNICATION_SERVICES;
    public static final u0 CONSUMER_DISCRETIONARY;
    public static final u0 CONSUMER_STAPLES;
    public static final u0 ENERGY;
    public static final u0 FINANCIALS;
    public static final u0 HEALTH_CARE;
    public static final u0 INDUSTRIALS;
    public static final u0 INFRASTRUCTURE;
    public static final u0 MATERIALS;
    public static final u0 REAL_ESTATE;
    public static final u0 TECHNOLOGY;
    public static final u0 UTILITIES;

    static {
        u0 u0Var = new u0("CONSUMER_DISCRETIONARY", 0);
        CONSUMER_DISCRETIONARY = u0Var;
        u0 u0Var2 = new u0("CONSUMER_STAPLES", 1);
        CONSUMER_STAPLES = u0Var2;
        u0 u0Var3 = new u0("ENERGY", 2);
        ENERGY = u0Var3;
        u0 u0Var4 = new u0("FINANCIALS", 3);
        FINANCIALS = u0Var4;
        u0 u0Var5 = new u0("HEALTH_CARE", 4);
        HEALTH_CARE = u0Var5;
        u0 u0Var6 = new u0("INDUSTRIALS", 5);
        INDUSTRIALS = u0Var6;
        u0 u0Var7 = new u0("TECHNOLOGY", 6);
        TECHNOLOGY = u0Var7;
        u0 u0Var8 = new u0("MATERIALS", 7);
        MATERIALS = u0Var8;
        u0 u0Var9 = new u0("COMMUNICATION_SERVICES", 8);
        COMMUNICATION_SERVICES = u0Var9;
        u0 u0Var10 = new u0("REAL_ESTATE", 9);
        REAL_ESTATE = u0Var10;
        u0 u0Var11 = new u0("UTILITIES", 10);
        UTILITIES = u0Var11;
        u0 u0Var12 = new u0("INFRASTRUCTURE", 11);
        INFRASTRUCTURE = u0Var12;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4, u0Var5, u0Var6, u0Var7, u0Var8, u0Var9, u0Var10, u0Var11, u0Var12};
        $VALUES = u0VarArr;
        $ENTRIES = vc.s.n(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}
