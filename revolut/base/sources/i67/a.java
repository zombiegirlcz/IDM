package i67;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DISABLED;
    public static final a ENABLED;
    public static final a PENDING;
    public static final a UNDEFINED;

    static {
        a aVar = new a("UNDEFINED", 0);
        UNDEFINED = aVar;
        a aVar2 = new a("PENDING", 1);
        PENDING = aVar2;
        a aVar3 = new a("ENABLED", 2);
        ENABLED = aVar3;
        a aVar4 = new a("DISABLED", 3);
        DISABLED = aVar4;
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
