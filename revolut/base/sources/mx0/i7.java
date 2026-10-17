package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class i7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i7[] $VALUES;
    public static final i7 CAPPED;
    public static final i7 RESPECT_EXACT_HEIGHT;
    private final boolean honorsExactHeight;

    static {
        i7 i7Var = new i7("CAPPED", 0, false);
        CAPPED = i7Var;
        i7 i7Var2 = new i7("RESPECT_EXACT_HEIGHT", 1, true);
        RESPECT_EXACT_HEIGHT = i7Var2;
        i7[] i7VarArr = {i7Var, i7Var2};
        $VALUES = i7VarArr;
        $ENTRIES = vc.s.n(i7VarArr);
    }

    public i7(String str, int i, boolean z) {
        this.honorsExactHeight = z;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i7 valueOf(String str) {
        return (i7) Enum.valueOf(i7.class, str);
    }

    public static i7[] values() {
        return (i7[]) $VALUES.clone();
    }

    public final boolean b() {
        return this.honorsExactHeight;
    }
}
