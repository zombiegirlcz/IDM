package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e4[] $VALUES;
    public static final e4 DisabledClickable;
    public static final e4 DisabledNonClickable;
    public static final e4 EnabledClickable;
    public static final e4 EnabledNonClickable;
    private final boolean enabled;

    static {
        e4 e4Var = new e4("EnabledClickable", 0, true);
        EnabledClickable = e4Var;
        e4 e4Var2 = new e4("DisabledNonClickable", 1, false);
        DisabledNonClickable = e4Var2;
        e4 e4Var3 = new e4("EnabledNonClickable", 2, true);
        EnabledNonClickable = e4Var3;
        e4 e4Var4 = new e4("DisabledClickable", 3, false);
        DisabledClickable = e4Var4;
        e4[] e4VarArr = {e4Var, e4Var2, e4Var3, e4Var4};
        $VALUES = e4VarArr;
        $ENTRIES = vc.s.n(e4VarArr);
    }

    public e4(String str, int i, boolean z) {
        this.enabled = z;
    }

    public static e4 valueOf(String str) {
        return (e4) Enum.valueOf(e4.class, str);
    }

    public static e4[] values() {
        return (e4[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.enabled;
    }
}
