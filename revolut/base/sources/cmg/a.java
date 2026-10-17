package cmg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE;
    public static final a RELOAD_AND_SHOW;
    public static final a SHOW;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("SHOW", 1);
        SHOW = aVar2;
        a aVar3 = new a("RELOAD_AND_SHOW", 2);
        RELOAD_AND_SHOW = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
