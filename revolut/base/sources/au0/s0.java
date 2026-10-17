package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 CENTERED;
    public static final s0 CENTERED_HORIZONTALLY;
    public static final s0 CENTERED_HORIZONTALLY_SMALL_BUTTONS;
    public static final s0 CENTERED_SMALL_BUTTONS;
    public static final s0 LEFT_ALIGNED;

    static {
        s0 s0Var = new s0("CENTERED_HORIZONTALLY", 0);
        CENTERED_HORIZONTALLY = s0Var;
        s0 s0Var2 = new s0("CENTERED_HORIZONTALLY_SMALL_BUTTONS", 1);
        CENTERED_HORIZONTALLY_SMALL_BUTTONS = s0Var2;
        s0 s0Var3 = new s0("CENTERED", 2);
        CENTERED = s0Var3;
        s0 s0Var4 = new s0("CENTERED_SMALL_BUTTONS", 3);
        CENTERED_SMALL_BUTTONS = s0Var4;
        s0 s0Var5 = new s0("LEFT_ALIGNED", 4);
        LEFT_ALIGNED = s0Var5;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3, s0Var4, s0Var5};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}
