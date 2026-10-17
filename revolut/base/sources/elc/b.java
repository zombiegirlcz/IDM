package elc;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DEFAULT;
    public static final b FOREGROUND;
    public static final b GREY;
    private final Integer colorAttr;

    static {
        b bVar = new b(0, "DEFAULT", null);
        DEFAULT = bVar;
        b bVar2 = new b(1, "GREY", Integer.valueOf(R$attr.uikit_colorGrey50));
        GREY = bVar2;
        b bVar3 = new b(2, "FOREGROUND", Integer.valueOf(R$attr.uikit_colorForeground));
        FOREGROUND = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(int i, String str, Integer num) {
        this.colorAttr = num;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.colorAttr;
    }
}
