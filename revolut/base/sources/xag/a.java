package xag;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DISABLED;
    public static final a ENABLED;
    public static final a HIDDEN;
    public static final a UNAVAILABLE;

    static {
        a aVar = new a("ENABLED", 0);
        ENABLED = aVar;
        a aVar2 = new a("DISABLED", 1);
        DISABLED = aVar2;
        a aVar3 = new a("UNAVAILABLE", 2);
        UNAVAILABLE = aVar3;
        a aVar4 = new a("HIDDEN", 3);
        HIDDEN = aVar4;
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
