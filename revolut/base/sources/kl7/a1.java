package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 ADDITIONAL_DRIVER_ADD;
    public static final a1 ADDITIONAL_DRIVER_REMOVE;
    public static final a1 CANCEL_MTA;
    public static final a1 DRIVING_LICENCE_UPDATE;
    public static final a1 UNKNOWN;
    public static final a1 VEHICLE_ADD;
    public static final a1 VEHICLE_REPLACE;
    public static final a1 VEHICLE_SUBSTITUTE;

    static {
        a1 a1Var = new a1("ADDITIONAL_DRIVER_ADD", 0);
        ADDITIONAL_DRIVER_ADD = a1Var;
        a1 a1Var2 = new a1("ADDITIONAL_DRIVER_REMOVE", 1);
        ADDITIONAL_DRIVER_REMOVE = a1Var2;
        a1 a1Var3 = new a1("VEHICLE_REPLACE", 2);
        VEHICLE_REPLACE = a1Var3;
        a1 a1Var4 = new a1("VEHICLE_ADD", 3);
        VEHICLE_ADD = a1Var4;
        a1 a1Var5 = new a1("VEHICLE_SUBSTITUTE", 4);
        VEHICLE_SUBSTITUTE = a1Var5;
        a1 a1Var6 = new a1("DRIVING_LICENCE_UPDATE", 5);
        DRIVING_LICENCE_UPDATE = a1Var6;
        a1 a1Var7 = new a1("CANCEL_MTA", 6);
        CANCEL_MTA = a1Var7;
        a1 a1Var8 = new a1("UNKNOWN", 7);
        UNKNOWN = a1Var8;
        a1[] a1VarArr = {a1Var, a1Var2, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8};
        $VALUES = a1VarArr;
        $ENTRIES = vc.s.n(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}
