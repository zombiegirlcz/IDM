package uo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;

    @NotNull
    public static final m0 Companion;
    public static final n0 IMPORTANCE_CACHED;
    public static final n0 IMPORTANCE_CANT_SAVE_STATE;
    public static final n0 IMPORTANCE_FOREGROUND;
    public static final n0 IMPORTANCE_FOREGROUND_SERVICE;
    public static final n0 IMPORTANCE_GONE;
    public static final n0 IMPORTANCE_PERCEPTIBLE;
    public static final n0 IMPORTANCE_SERVICE;
    public static final n0 IMPORTANCE_TOP_SLEEPING;
    public static final n0 IMPORTANCE_VISIBLE;

    @NotNull
    private final String stringName;

    static {
        n0 n0Var = new n0("IMPORTANCE_FOREGROUND", 0, "FOREGROUND");
        IMPORTANCE_FOREGROUND = n0Var;
        n0 n0Var2 = new n0("IMPORTANCE_FOREGROUND_SERVICE", 1, "FOREGROUND_SERVICE");
        IMPORTANCE_FOREGROUND_SERVICE = n0Var2;
        n0 n0Var3 = new n0("IMPORTANCE_TOP_SLEEPING", 2, "TOP_SLEEPING");
        IMPORTANCE_TOP_SLEEPING = n0Var3;
        n0 n0Var4 = new n0("IMPORTANCE_VISIBLE", 3, "VISIBLE");
        IMPORTANCE_VISIBLE = n0Var4;
        n0 n0Var5 = new n0("IMPORTANCE_PERCEPTIBLE", 4, "PERCEPTIBLE");
        IMPORTANCE_PERCEPTIBLE = n0Var5;
        n0 n0Var6 = new n0("IMPORTANCE_CANT_SAVE_STATE", 5, "CANT_SAVE_STATE");
        IMPORTANCE_CANT_SAVE_STATE = n0Var6;
        n0 n0Var7 = new n0("IMPORTANCE_SERVICE", 6, "SERVICE");
        IMPORTANCE_SERVICE = n0Var7;
        n0 n0Var8 = new n0("IMPORTANCE_CACHED", 7, "CACHED");
        IMPORTANCE_CACHED = n0Var8;
        n0 n0Var9 = new n0("IMPORTANCE_GONE", 8, "GONE");
        IMPORTANCE_GONE = n0Var9;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var8, n0Var9};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
        Companion = new m0();
    }

    public n0(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
