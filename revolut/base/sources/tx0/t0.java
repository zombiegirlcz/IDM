package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class t0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 DISABLED;
    public static final t0 ENABLED;
    private final boolean clickable;
    private final float contentAlpha;

    static {
        t0 t0Var = new t0(1.0f, 0, "ENABLED", true);
        ENABLED = t0Var;
        t0 t0Var2 = new t0(0.3f, 1, "DISABLED", false);
        DISABLED = t0Var2;
        t0[] t0VarArr = {t0Var, t0Var2};
        $VALUES = t0VarArr;
        $ENTRIES = vc.s.n(t0VarArr);
    }

    public t0(float f, int i, String str, boolean z) {
        this.contentAlpha = f;
        this.clickable = z;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.clickable;
    }

    public final float b() {
        return this.contentAlpha;
    }
}
