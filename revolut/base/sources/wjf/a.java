package wjf;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLUE;
    public static final a BROWN;
    public static final a CYAN;
    public static final a DEEP_GREY;
    public static final a DEEP_PINK;
    public static final a DEEP_PURPLE;
    public static final a GREEN;
    public static final a INDIGO;
    public static final a LIGHT_BLUE;
    public static final a LIGHT_GREEN;
    public static final a ORANGE;
    public static final a PINK;
    public static final a PURPLE;
    public static final a RED;
    public static final a TEAL;
    public static final a YELLOW;
    private final int attrId;

    static {
        a aVar = new a("RED", 0, R$attr.uikit_colorRed);
        RED = aVar;
        a aVar2 = new a("PINK", 1, R$attr.uikit_colorPink);
        PINK = aVar2;
        a aVar3 = new a("PURPLE", 2, R$attr.uikit_colorPurple);
        PURPLE = aVar3;
        a aVar4 = new a("DEEP_PURPLE", 3, R$attr.uikit_colorDeepPurple);
        DEEP_PURPLE = aVar4;
        a aVar5 = new a("INDIGO", 4, R$attr.uikit_colorIndigo);
        INDIGO = aVar5;
        a aVar6 = new a("LIGHT_BLUE", 5, R$attr.uikit_colorLightBlue);
        LIGHT_BLUE = aVar6;
        a aVar7 = new a("CYAN", 6, R$attr.uikit_colorCyan);
        CYAN = aVar7;
        a aVar8 = new a("TEAL", 7, R$attr.uikit_colorTeal);
        TEAL = aVar8;
        a aVar9 = new a("GREEN", 8, R$attr.uikit_colorGreen);
        GREEN = aVar9;
        a aVar10 = new a("LIGHT_GREEN", 9, R$attr.uikit_colorLightGreen);
        LIGHT_GREEN = aVar10;
        a aVar11 = new a("YELLOW", 10, R$attr.uikit_colorYellow);
        YELLOW = aVar11;
        a aVar12 = new a("BLUE", 11, R$attr.uikit_colorBlue);
        BLUE = aVar12;
        a aVar13 = new a("ORANGE", 12, R$attr.uikit_colorOrange);
        ORANGE = aVar13;
        a aVar14 = new a("DEEP_PINK", 13, R$attr.uikit_colorDeepPink);
        DEEP_PINK = aVar14;
        a aVar15 = new a("DEEP_GREY", 14, R$attr.uikit_colorDeepGrey);
        DEEP_GREY = aVar15;
        a aVar16 = new a("BROWN", 15, R$attr.uikit_colorBrown);
        BROWN = aVar16;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.attrId = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.attrId;
    }
}
