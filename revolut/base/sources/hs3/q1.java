package hs3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;

    @NotNull
    public static final p1 Companion;
    public static final q1 SCROLL_ONE_PAGE;
    public static final q1 SCROLL_TO_END;
    public static final q1 UNKNOWN;

    static {
        q1 q1Var = new q1("SCROLL_TO_END", 0);
        SCROLL_TO_END = q1Var;
        q1 q1Var2 = new q1("SCROLL_ONE_PAGE", 1);
        SCROLL_ONE_PAGE = q1Var2;
        q1 q1Var3 = new q1("UNKNOWN", 2);
        UNKNOWN = q1Var3;
        q1[] q1VarArr = {q1Var, q1Var2, q1Var3};
        $VALUES = q1VarArr;
        $ENTRIES = vc.s.n(q1VarArr);
        Companion = new p1();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }
}
