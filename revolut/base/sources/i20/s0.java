package i20;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 BOLD;
    public static final s0 HEADING_1;
    public static final s0 HEADING_2;
    public static final s0 HEADING_3;
    public static final s0 ITALIC;
    public static final s0 NORMAL_TEXT;

    @NotNull
    private final String value;

    static {
        s0 s0Var = new s0("ITALIC", 0, "italic");
        ITALIC = s0Var;
        s0 s0Var2 = new s0("BOLD", 1, "bold");
        BOLD = s0Var2;
        s0 s0Var3 = new s0("NORMAL_TEXT", 2, "normal-text");
        NORMAL_TEXT = s0Var3;
        s0 s0Var4 = new s0("HEADING_1", 3, "heading1");
        HEADING_1 = s0Var4;
        s0 s0Var5 = new s0("HEADING_2", 4, "heading2");
        HEADING_2 = s0Var5;
        s0 s0Var6 = new s0("HEADING_3", 5, "heading3");
        HEADING_3 = s0Var6;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public s0(String str, int i, String str2) {
        this.value = str2;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
