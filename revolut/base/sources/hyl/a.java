package hyl;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEEP_PURPLE;
    public static final a INDIGO;
    public static final a NEGATIVE;
    public static final a NEUTRAL;
    public static final a POSITIVE;
    public static final a TERRACOTTA;
    public static final a YELLOW;
    private final int attr;

    static {
        a aVar = new a("POSITIVE", 0, R$attr.uikit_colorPerformancePositive);
        POSITIVE = aVar;
        a aVar2 = new a("NEGATIVE", 1, R$attr.uikit_colorPerformanceNegative);
        NEGATIVE = aVar2;
        a aVar3 = new a("NEUTRAL", 2, R$attr.uikit_colorGreyTone50);
        NEUTRAL = aVar3;
        a aVar4 = new a("YELLOW", 3, R$attr.uikit_colorYellow);
        YELLOW = aVar4;
        a aVar5 = new a("DEEP_PURPLE", 4, R$attr.uikit_colorDeepPurple);
        DEEP_PURPLE = aVar5;
        a aVar6 = new a("TERRACOTTA", 5, R$attr.uikit_colorTerracotta);
        TERRACOTTA = aVar6;
        a aVar7 = new a("INDIGO", 6, R$attr.uikit_colorIndigo);
        INDIGO = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.attr = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.attr;
    }
}
