package akl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 AWAITING_REVIEW;

    @NotNull
    public static final j0 Companion;
    public static final k0 INITIATED;
    public static final k0 SIGN_IN_WITH_ACCOUNT;

    @NotNull
    private final String value;

    static {
        k0 k0Var = new k0("INITIATED", 0, "INITIATED");
        INITIATED = k0Var;
        k0 k0Var2 = new k0("AWAITING_REVIEW", 1, "AWAITING_REVIEW");
        AWAITING_REVIEW = k0Var2;
        k0 k0Var3 = new k0("SIGN_IN_WITH_ACCOUNT", 2, "SIGN_IN_WITH_ACCOUNT");
        SIGN_IN_WITH_ACCOUNT = k0Var3;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
        Companion = new j0();
    }

    public k0(String str, int i, String str2) {
        this.value = str2;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
