package ct0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t BASIC;

    @NotNull
    public static final r Companion;
    public static final t DIMMED;
    public static final t MONOCHROMATIC;
    public static final t NEGATIVE;
    public static final t POSITIVE;
    public static final t STATIC;
    public static final t WARNING;

    static {
        t tVar = new t("BASIC", 0);
        BASIC = tVar;
        t tVar2 = new t("DIMMED", 1);
        DIMMED = tVar2;
        t tVar3 = new t("POSITIVE", 2);
        POSITIVE = tVar3;
        t tVar4 = new t("NEGATIVE", 3);
        NEGATIVE = tVar4;
        t tVar5 = new t("STATIC", 4);
        STATIC = tVar5;
        t tVar6 = new t("WARNING", 5);
        WARNING = tVar6;
        t tVar7 = new t("MONOCHROMATIC", 6);
        MONOCHROMATIC = tVar7;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
        Companion = new r();
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public final int a(int i) {
        switch (s.f108610a[ordinal()]) {
            case 1:
                int i2 = i % 3;
                return i2 != 0 ? i2 != 1 ? R$attr.uikit_colorPurple : R$attr.uikit_colorCyan : R$attr.uikit_colorBlue;
            case 2:
                int i3 = i % 3;
                return i3 != 0 ? i3 != 1 ? R$attr.uikit_colorGreyTone20 : R$attr.uikit_colorGreyTone10 : R$attr.uikit_colorGreyTone8;
            case 3:
                return R$attr.uikit_colorPerformancePositive;
            case 4:
                return R$attr.uikit_colorPerformanceNegative;
            case 5:
                return R$attr.uikit_colorPerformanceStatic;
            case 6:
                return R$attr.uikit_colorStatusWarning;
            case 7:
                return R$attr.uikit_colorForeground;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
