package zw7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 COVERED;
    public static final i0 NOT_COVERED;

    @NotNull
    private final String value;

    static {
        i0 i0Var = new i0("COVERED", 0, "COVERED");
        COVERED = i0Var;
        i0 i0Var2 = new i0("NOT_COVERED", 1, "NOT_COVERED");
        NOT_COVERED = i0Var2;
        i0[] i0VarArr = {i0Var, i0Var2};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public i0(String str, int i, String str2) {
        this.value = str2;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
