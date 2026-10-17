package jel;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 NEGATIVE;
    public static final l1 NEUTRAL;
    public static final l1 POSITIVE;

    @NotNull
    private final String value;

    static {
        l1 l1Var = new l1("POSITIVE", 0, "POSITIVE");
        POSITIVE = l1Var;
        l1 l1Var2 = new l1("NEUTRAL", 1, "NEUTRAL");
        NEUTRAL = l1Var2;
        l1 l1Var3 = new l1("NEGATIVE", 2, "NEGATIVE");
        NEGATIVE = l1Var3;
        l1[] l1VarArr = {l1Var, l1Var2, l1Var3};
        $VALUES = l1VarArr;
        $ENTRIES = vc.s.n(l1VarArr);
    }

    public l1(String str, int i, String str2) {
        this.value = str2;
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
