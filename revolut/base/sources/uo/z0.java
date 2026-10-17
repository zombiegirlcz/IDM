package uo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class z0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;

    @NotNull
    public static final y0 Companion;
    public static final z0 START_TYPE_COLD;
    public static final z0 START_TYPE_HOT;
    public static final z0 START_TYPE_UNSET;
    public static final z0 START_TYPE_WARM;

    @NotNull
    private final String stringName;

    static {
        z0 z0Var = new z0("START_TYPE_COLD", 0, "COLD");
        START_TYPE_COLD = z0Var;
        z0 z0Var2 = new z0("START_TYPE_HOT", 1, "HOT");
        START_TYPE_HOT = z0Var2;
        z0 z0Var3 = new z0("START_TYPE_UNSET", 2, "UNSET");
        START_TYPE_UNSET = z0Var3;
        z0 z0Var4 = new z0("START_TYPE_WARM", 3, "WARM");
        START_TYPE_WARM = z0Var4;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4};
        $VALUES = z0VarArr;
        $ENTRIES = vc.s.n(z0VarArr);
        Companion = new y0();
    }

    public z0(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
