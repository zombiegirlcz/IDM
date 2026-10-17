package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class z2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z2[] $VALUES;
    public static final z2 ACTIVE;
    public static final z2 CREATED;
    public static final z2 DISCONNECTED;
    public static final z2 TERMINATED;
    public static final z2 UNKNOWN;

    static {
        z2 z2Var = new z2("CREATED", 0);
        CREATED = z2Var;
        z2 z2Var2 = new z2("ACTIVE", 1);
        ACTIVE = z2Var2;
        z2 z2Var3 = new z2("DISCONNECTED", 2);
        DISCONNECTED = z2Var3;
        z2 z2Var4 = new z2("TERMINATED", 3);
        TERMINATED = z2Var4;
        z2 z2Var5 = new z2("UNKNOWN", 4);
        UNKNOWN = z2Var5;
        z2[] z2VarArr = {z2Var, z2Var2, z2Var3, z2Var4, z2Var5};
        $VALUES = z2VarArr;
        $ENTRIES = vc.s.n(z2VarArr);
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) $VALUES.clone();
    }
}
