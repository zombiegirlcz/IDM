package tx0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 ACCENT;
    public static final p0 DEFAULT;
    private final Integer backgroundColorAttr;
    private final Integer contentColorAttr;

    static {
        p0 p0Var = new p0("DEFAULT", 0, null, null);
        DEFAULT = p0Var;
        p0 p0Var2 = new p0("ACCENT", 1, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), Integer.valueOf(R$attr.uikit_colorAccentNeutral));
        ACCENT = p0Var2;
        p0[] p0VarArr = {p0Var, p0Var2};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public p0(String str, int i, Integer num, Integer num2) {
        this.contentColorAttr = num;
        this.backgroundColorAttr = num2;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.backgroundColorAttr;
    }

    public final Integer b() {
        return this.contentColorAttr;
    }
}
