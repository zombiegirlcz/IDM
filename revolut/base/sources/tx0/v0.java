package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class v0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 AVATAR;
    public static final v0 ICON;

    static {
        v0 v0Var = new v0("ICON", 0);
        ICON = v0Var;
        v0 v0Var2 = new v0("AVATAR", 1);
        AVATAR = v0Var2;
        v0[] v0VarArr = {v0Var, v0Var2};
        $VALUES = v0VarArr;
        $ENTRIES = vc.s.n(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }
}
