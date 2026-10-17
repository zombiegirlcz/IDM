package m1l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SCHEDULE_DISABLED;
    public static final a SCHEDULE_ENABLED;
    public static final a SCHEDULE_REQUIRED;

    static {
        a aVar = new a("SCHEDULE_DISABLED", 0);
        SCHEDULE_DISABLED = aVar;
        a aVar2 = new a("SCHEDULE_ENABLED", 1);
        SCHEDULE_ENABLED = aVar2;
        a aVar3 = new a("SCHEDULE_REQUIRED", 2);
        SCHEDULE_REQUIRED = aVar3;
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
