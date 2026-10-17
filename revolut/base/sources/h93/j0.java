package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    public static final i0 Companion;
    public static final j0 FAMILY;
    public static final j0 JOINT_ACCOUNT;
    public static final j0 PRO;
    public static final j0 RETAIL;
    public static final j0 UNKNOWN;
    public static final j0 YOUTH;

    static {
        j0 j0Var = new j0("RETAIL", 0);
        RETAIL = j0Var;
        j0 j0Var2 = new j0("YOUTH", 1);
        YOUTH = j0Var2;
        j0 j0Var3 = new j0("PRO", 2);
        PRO = j0Var3;
        j0 j0Var4 = new j0("FAMILY", 3);
        FAMILY = j0Var4;
        j0 j0Var5 = new j0("JOINT_ACCOUNT", 4);
        JOINT_ACCOUNT = j0Var5;
        j0 j0Var6 = new j0("UNKNOWN", 5);
        UNKNOWN = j0Var6;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
        Companion = new i0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
