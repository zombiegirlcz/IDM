package yhi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BOTTOM_DIALOG;
    public static final b POPUP;
    public static final b SOLID;

    static {
        b bVar = new b("POPUP", 0);
        POPUP = bVar;
        b bVar2 = new b("SOLID", 1);
        SOLID = bVar2;
        b bVar3 = new b("BOTTOM_DIALOG", 2);
        BOTTOM_DIALOG = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
