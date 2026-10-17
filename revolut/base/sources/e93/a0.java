package e93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;

    @NotNull
    public static final z Companion;
    public static final a0 DAILY;
    public static final a0 MONTHLY;
    public static final a0 TOTAL;
    public static final a0 UNKNOWN;

    @NotNull
    private final String value;

    static {
        a0 a0Var = new a0("TOTAL", 0, "TOTAL");
        TOTAL = a0Var;
        a0 a0Var2 = new a0("DAILY", 1, "DAILY");
        DAILY = a0Var2;
        a0 a0Var3 = new a0("MONTHLY", 2, "MONTHLY");
        MONTHLY = a0Var3;
        a0 a0Var4 = new a0("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
        Companion = new z();
    }

    public a0(String str, int i, String str2) {
        this.value = str2;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
