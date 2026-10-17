package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s2[] $VALUES;
    public static final s2 FULLSCREEN;
    public static final s2 REGULAR;

    static {
        s2 s2Var = new s2("REGULAR", 0);
        REGULAR = s2Var;
        s2 s2Var2 = new s2("FULLSCREEN", 1);
        FULLSCREEN = s2Var2;
        s2[] s2VarArr = {s2Var, s2Var2};
        $VALUES = s2VarArr;
        $ENTRIES = vc.s.n(s2VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static s2 valueOf(String str) {
        return (s2) Enum.valueOf(s2.class, str);
    }

    public static s2[] values() {
        return (s2[]) $VALUES.clone();
    }
}
