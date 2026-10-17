package v1e;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CHECK_MARK;
    public static final a REV_POINTS;
    public static final a TROPHY;
    public static final a UNKNOWN;

    static {
        a aVar = new a("CHECK_MARK", 0);
        CHECK_MARK = aVar;
        a aVar2 = new a("TROPHY", 1);
        TROPHY = aVar2;
        a aVar3 = new a("REV_POINTS", 2);
        REV_POINTS = aVar3;
        a aVar4 = new a("UNKNOWN", 3);
        UNKNOWN = aVar4;
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
