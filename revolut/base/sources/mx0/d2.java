package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d2[] $VALUES;
    public static final d2 FULLSCREEN_VIDEO_DARK;
    public static final d2 NORMAL;

    static {
        d2 d2Var = new d2("NORMAL", 0);
        NORMAL = d2Var;
        d2 d2Var2 = new d2("FULLSCREEN_VIDEO_DARK", 1);
        FULLSCREEN_VIDEO_DARK = d2Var2;
        d2[] d2VarArr = {d2Var, d2Var2};
        $VALUES = d2VarArr;
        $ENTRIES = vc.s.n(d2VarArr);
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) $VALUES.clone();
    }
}
