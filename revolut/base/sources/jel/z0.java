package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class z0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 DIGITAL;
    public static final z0 ENVIRONMENT;
    public static final z0 OTHER;
    public static final z0 POWER_AND_ENERGY;
    public static final z0 RENEWABLES;
    public static final z0 TRANSPORT;

    static {
        z0 z0Var = new z0("POWER_AND_ENERGY", 0);
        POWER_AND_ENERGY = z0Var;
        z0 z0Var2 = new z0("RENEWABLES", 1);
        RENEWABLES = z0Var2;
        z0 z0Var3 = new z0("TRANSPORT", 2);
        TRANSPORT = z0Var3;
        z0 z0Var4 = new z0("DIGITAL", 3);
        DIGITAL = z0Var4;
        z0 z0Var5 = new z0("ENVIRONMENT", 4);
        ENVIRONMENT = z0Var5;
        z0 z0Var6 = new z0("OTHER", 5);
        OTHER = z0Var6;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4, z0Var5, z0Var6};
        $VALUES = z0VarArr;
        $ENTRIES = vc.s.n(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
