package gzl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOTTOM;
    public static final a LEFT;
    public static final a RIGHT;
    public static final a TOP;

    static {
        a aVar = new a("LEFT", 0);
        LEFT = aVar;
        a aVar2 = new a("TOP", 1);
        TOP = aVar2;
        a aVar3 = new a("RIGHT", 2);
        RIGHT = aVar3;
        a aVar4 = new a("BOTTOM", 3);
        BOTTOM = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
