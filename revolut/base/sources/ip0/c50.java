package ip0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c50 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c50[] $VALUES;

    @NotNull
    public static final b50 Companion;
    public static final c50 FIRST;
    public static final c50 LAST;
    public static final c50 MIDDLE;

    static {
        c50 c50Var = new c50("FIRST", 0);
        FIRST = c50Var;
        c50 c50Var2 = new c50("MIDDLE", 1);
        MIDDLE = c50Var2;
        c50 c50Var3 = new c50("LAST", 2);
        LAST = c50Var3;
        c50[] c50VarArr = {c50Var, c50Var2, c50Var3};
        $VALUES = c50VarArr;
        $ENTRIES = vc.s.n(c50VarArr);
        Companion = new b50();
    }

    public static c50 valueOf(String str) {
        return (c50) Enum.valueOf(c50.class, str);
    }

    public static c50[] values() {
        return (c50[]) $VALUES.clone();
    }
}
