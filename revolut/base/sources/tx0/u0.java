package tx0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 PRIMARY_ACCENT;
    public static final u0 SECONDARY_ACCENT;
    private final Integer backgroundColorAttr;
    private final int contentColorAttr;

    static {
        u0 u0Var = new u0("SECONDARY_ACCENT", 0, R$attr.uikit_colorForeground, null);
        SECONDARY_ACCENT = u0Var;
        u0 u0Var2 = new u0("PRIMARY_ACCENT", 1, R$attr.uikit_colorOnAccentNeutral, Integer.valueOf(R$attr.uikit_colorAccentNeutral));
        PRIMARY_ACCENT = u0Var2;
        u0[] u0VarArr = {u0Var, u0Var2};
        $VALUES = u0VarArr;
        $ENTRIES = vc.s.n(u0VarArr);
    }

    public u0(String str, int i, int i2, Integer num) {
        this.contentColorAttr = i2;
        this.backgroundColorAttr = num;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.backgroundColorAttr;
    }

    public final int b() {
        return this.contentColorAttr;
    }
}
