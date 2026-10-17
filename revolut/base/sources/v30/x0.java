package v30;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class x0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x0[] $VALUES;

    @NotNull
    public static final w0 Companion;
    public static final x0 Generated;
    public static final x0 Scheduled;

    @NotNull
    private final String key;

    static {
        x0 x0Var = new x0("Scheduled", 0, "Scheduled");
        Scheduled = x0Var;
        x0 x0Var2 = new x0("Generated", 1, "Generated");
        Generated = x0Var2;
        x0[] x0VarArr = {x0Var, x0Var2};
        $VALUES = x0VarArr;
        $ENTRIES = vc.s.n(x0VarArr);
        Companion = new w0();
    }

    public x0(String str, int i, String str2) {
        this.key = str2;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
