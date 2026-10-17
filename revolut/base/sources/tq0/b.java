package tq0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b REGULAR;
    public static final b TITLE;
    private final int appearanceAttr;

    static {
        b bVar = new b("TITLE", 0, R$attr.internal_textAppearanceEmphasis1);
        TITLE = bVar;
        b bVar2 = new b("REGULAR", 1, R$attr.internal_textAppearanceBody1);
        REGULAR = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, int i2) {
        this.appearanceAttr = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.appearanceAttr;
    }
}
