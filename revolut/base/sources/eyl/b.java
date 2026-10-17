package eyl;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BODY_2;
    public static final b HEADING_3;
    private final int attrRes;

    static {
        b bVar = new b("HEADING_3", 0, R$attr.internal_textAppearanceHeading3);
        HEADING_3 = bVar;
        b bVar2 = new b("BODY_2", 1, R$attr.internal_textAppearanceBody2);
        BODY_2 = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, int i2) {
        this.attrRes = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.attrRes;
    }
}
