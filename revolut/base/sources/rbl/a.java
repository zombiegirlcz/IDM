package rbl;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BACK;
    public static final a CLOSE;
    public static final a NONE;
    private final Integer icon;

    static {
        a aVar = new a(0, "BACK", Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        BACK = aVar;
        a aVar2 = new a(1, "CLOSE", Integer.valueOf(R$drawable.uikit_icn_24_cross));
        CLOSE = aVar2;
        a aVar3 = new a(2, "NONE", null);
        NONE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(int i, String str, Integer num) {
        this.icon = num;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.icon;
    }

    public final boolean b() {
        return this != NONE;
    }
}
