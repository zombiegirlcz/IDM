package gkl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 ACCESS_RECOVERY;

    @NotNull
    public static final t0 Companion;
    public static final u0 EXTERNAL_CLIENT;
    public static final u0 OPERATION_BOUND_AUTHENTICATION;
    public static final u0 SIGN_IN;
    public static final u0 SIGN_IN_WITH_REVOLUT_ID;

    @NotNull
    private final String value;

    static {
        u0 u0Var = new u0("ACCESS_RECOVERY", 0, "ACCESS_RECOVERY");
        ACCESS_RECOVERY = u0Var;
        u0 u0Var2 = new u0("EXTERNAL_CLIENT", 1, "EXTERNAL_CLIENT");
        EXTERNAL_CLIENT = u0Var2;
        u0 u0Var3 = new u0("OPERATION_BOUND_AUTHENTICATION", 2, "OPERATION_BOUND_AUTHENTICATION");
        OPERATION_BOUND_AUTHENTICATION = u0Var3;
        u0 u0Var4 = new u0("SIGN_IN", 3, "SIGN_IN");
        SIGN_IN = u0Var4;
        u0 u0Var5 = new u0("SIGN_IN_WITH_REVOLUT_ID", 4, "SIGN_IN_WITH_REVOLUT_ID");
        SIGN_IN_WITH_REVOLUT_ID = u0Var5;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4, u0Var5};
        $VALUES = u0VarArr;
        $ENTRIES = vc.s.n(u0VarArr);
        Companion = new t0();
    }

    public u0(String str, int i, String str2) {
        this.value = str2;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
