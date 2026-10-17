package pfk;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 GRADUATE;
    public static final q0 WITHDRAWAL;

    @NotNull
    private final String value;

    static {
        q0 q0Var = new q0("GRADUATE", 0, "GRADUATED");
        GRADUATE = q0Var;
        q0 q0Var2 = new q0("WITHDRAWAL", 1, "WITHDRAWAL");
        WITHDRAWAL = q0Var2;
        q0[] q0VarArr = {q0Var, q0Var2};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
    }

    public q0(String str, int i, String str2) {
        this.value = str2;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
