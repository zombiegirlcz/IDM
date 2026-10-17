package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class d4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d4[] $VALUES;
    public static final d4 HOME_SCREEN;

    static {
        d4 d4Var = new d4("HOME_SCREEN", 0);
        HOME_SCREEN = d4Var;
        d4[] d4VarArr = {d4Var};
        $VALUES = d4VarArr;
        $ENTRIES = vc.s.n(d4VarArr);
    }

    public static d4 valueOf(String str) {
        return (d4) Enum.valueOf(d4.class, str);
    }

    public static d4[] values() {
        return (d4[]) $VALUES.clone();
    }
}
