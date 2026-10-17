package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class q2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q2[] $VALUES;
    public static final q2 SIZE_100;
    public static final q2 SIZE_120;
    public static final q2 SIZE_20;
    public static final q2 SIZE_24;
    public static final q2 SIZE_32;
    public static final q2 SIZE_40;
    public static final q2 SIZE_48;
    public static final q2 SIZE_56;
    public static final q2 SIZE_64;
    public static final q2 SIZE_80;
    private final float avatarSizeDp;

    static {
        q2 q2Var = new q2(20.0f, 0, "SIZE_20");
        SIZE_20 = q2Var;
        q2 q2Var2 = new q2(24.0f, 1, "SIZE_24");
        SIZE_24 = q2Var2;
        q2 q2Var3 = new q2(32.0f, 2, "SIZE_32");
        SIZE_32 = q2Var3;
        q2 q2Var4 = new q2(40.0f, 3, "SIZE_40");
        SIZE_40 = q2Var4;
        q2 q2Var5 = new q2(48.0f, 4, "SIZE_48");
        SIZE_48 = q2Var5;
        q2 q2Var6 = new q2(56.0f, 5, "SIZE_56");
        SIZE_56 = q2Var6;
        q2 q2Var7 = new q2(64.0f, 6, "SIZE_64");
        SIZE_64 = q2Var7;
        q2 q2Var8 = new q2(80.0f, 7, "SIZE_80");
        SIZE_80 = q2Var8;
        q2 q2Var9 = new q2(100.0f, 8, "SIZE_100");
        SIZE_100 = q2Var9;
        q2 q2Var10 = new q2(120.0f, 9, "SIZE_120");
        SIZE_120 = q2Var10;
        q2[] q2VarArr = {q2Var, q2Var2, q2Var3, q2Var4, q2Var5, q2Var6, q2Var7, q2Var8, q2Var9, q2Var10};
        $VALUES = q2VarArr;
        $ENTRIES = vc.s.n(q2VarArr);
    }

    public q2(float f, int i, String str) {
        this.avatarSizeDp = f;
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }

    public final float a() {
        return this.avatarSizeDp;
    }
}
