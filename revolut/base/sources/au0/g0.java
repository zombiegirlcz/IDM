package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 AVATAR;
    public static final g0 ICON;
    public static final g0 IMAGE_80;
    public static final g0 PROGRESS;
    public static final g0 TITLE_SUBTITLE;

    static {
        g0 g0Var = new g0("AVATAR", 0);
        AVATAR = g0Var;
        g0 g0Var2 = new g0("ICON", 1);
        ICON = g0Var2;
        g0 g0Var3 = new g0("IMAGE_80", 2);
        IMAGE_80 = g0Var3;
        g0 g0Var4 = new g0("PROGRESS", 3);
        PROGRESS = g0Var4;
        g0 g0Var5 = new g0("TITLE_SUBTITLE", 4);
        TITLE_SUBTITLE = g0Var5;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
