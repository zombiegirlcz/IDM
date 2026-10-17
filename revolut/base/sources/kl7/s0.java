package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 DIESEL;
    public static final s0 DIESEL_ELECTRIC;
    public static final s0 DIESEL_PLUG_IN_ELECTRIC;
    public static final s0 ELECTRIC;
    public static final s0 ETHANOL_PETROL;
    public static final s0 HYBRID;
    public static final s0 HYDROGEN;
    public static final s0 LPG;
    public static final s0 PETROL;
    public static final s0 PETROL_ELECTRIC;
    public static final s0 PETROL_GAS;
    public static final s0 PETROL_PLUG_IN_ELECTRIC;

    static {
        s0 s0Var = new s0("DIESEL", 0);
        DIESEL = s0Var;
        s0 s0Var2 = new s0("ELECTRIC", 1);
        ELECTRIC = s0Var2;
        s0 s0Var3 = new s0("HYDROGEN", 2);
        HYDROGEN = s0Var3;
        s0 s0Var4 = new s0("LPG", 3);
        LPG = s0Var4;
        s0 s0Var5 = new s0("PETROL", 4);
        PETROL = s0Var5;
        s0 s0Var6 = new s0("HYBRID", 5);
        HYBRID = s0Var6;
        s0 s0Var7 = new s0("ETHANOL_PETROL", 6);
        ETHANOL_PETROL = s0Var7;
        s0 s0Var8 = new s0("PETROL_ELECTRIC", 7);
        PETROL_ELECTRIC = s0Var8;
        s0 s0Var9 = new s0("PETROL_GAS", 8);
        PETROL_GAS = s0Var9;
        s0 s0Var10 = new s0("DIESEL_ELECTRIC", 9);
        DIESEL_ELECTRIC = s0Var10;
        s0 s0Var11 = new s0("DIESEL_PLUG_IN_ELECTRIC", 10);
        DIESEL_PLUG_IN_ELECTRIC = s0Var11;
        s0 s0Var12 = new s0("PETROL_PLUG_IN_ELECTRIC", 11);
        PETROL_PLUG_IN_ELECTRIC = s0Var12;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6, s0Var7, s0Var8, s0Var9, s0Var10, s0Var11, s0Var12};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}
