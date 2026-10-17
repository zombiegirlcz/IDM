package hha;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 BASIC;

    @NotNull
    public static final v0 Companion;
    public static final w0 ESSENTIAL;
    public static final w0 METAL;
    public static final w0 PLUS;
    public static final w0 PREMIUM;
    public static final w0 PRIVATE;
    public static final w0 STANDARD;
    public static final w0 ULTRA;
    public static final w0 UNKNOWN;

    static {
        w0 w0Var = new w0("ESSENTIAL", 0);
        ESSENTIAL = w0Var;
        w0 w0Var2 = new w0("BASIC", 1);
        BASIC = w0Var2;
        w0 w0Var3 = new w0("STANDARD", 2);
        STANDARD = w0Var3;
        w0 w0Var4 = new w0("PLUS", 3);
        PLUS = w0Var4;
        w0 w0Var5 = new w0("PREMIUM", 4);
        PREMIUM = w0Var5;
        w0 w0Var6 = new w0("METAL", 5);
        METAL = w0Var6;
        w0 w0Var7 = new w0("ULTRA", 6);
        ULTRA = w0Var7;
        w0 w0Var8 = new w0("PRIVATE", 7);
        PRIVATE = w0Var8;
        w0 w0Var9 = new w0("UNKNOWN", 8);
        UNKNOWN = w0Var9;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, w0Var9};
        $VALUES = w0VarArr;
        $ENTRIES = vc.s.n(w0VarArr);
        Companion = new v0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
