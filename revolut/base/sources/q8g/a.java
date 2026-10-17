package q8g;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCENT;
    public static final a ACCENT_10;
    public static final a BLACK_40;
    private final int backgroundColor;
    private final int foregroundColor;

    static {
        int i = R$attr.uikit_colorAccent;
        a aVar = new a("ACCENT", 0, i, R$attr.uikit_colorOnAccent);
        ACCENT = aVar;
        a aVar2 = new a("ACCENT_10", 1, R$attr.uikit_colorAccent_10, i);
        ACCENT_10 = aVar2;
        a aVar3 = new a("BLACK_40", 2, R$attr.uikit_colorBlack_40, R$attr.uikit_colorWhite);
        BLACK_40 = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2, int i3) {
        this.backgroundColor = i2;
        this.foregroundColor = i3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.backgroundColor;
    }

    public final int b() {
        return this.foregroundColor;
    }
}
