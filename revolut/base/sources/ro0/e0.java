package ro0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 BOTTOM_BAR;
    public static final e0 CHAT_INPUT;
    public static final e0 NAV_BAR;
    public static final e0 NAV_BAR_TITLE;
    public static final e0 OVERLAY_BACKGROUND;
    public static final e0 REFLECTIVE_SURFACE;

    static {
        e0 e0Var = new e0("NAV_BAR", 0);
        NAV_BAR = e0Var;
        e0 e0Var2 = new e0("NAV_BAR_TITLE", 1);
        NAV_BAR_TITLE = e0Var2;
        e0 e0Var3 = new e0("BOTTOM_BAR", 2);
        BOTTOM_BAR = e0Var3;
        e0 e0Var4 = new e0("CHAT_INPUT", 3);
        CHAT_INPUT = e0Var4;
        e0 e0Var5 = new e0("OVERLAY_BACKGROUND", 4);
        OVERLAY_BACKGROUND = e0Var5;
        e0 e0Var6 = new e0("REFLECTIVE_SURFACE", 5);
        REFLECTIVE_SURFACE = e0Var6;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
