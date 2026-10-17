package ekc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVATED;
    public static final a NOT_ACTIVATED;
    public static final a REACTIVATION_REQUIRED;

    static {
        a aVar = new a("ACTIVATED", 0);
        ACTIVATED = aVar;
        a aVar2 = new a("REACTIVATION_REQUIRED", 1);
        REACTIVATION_REQUIRED = aVar2;
        a aVar3 = new a("NOT_ACTIVATED", 2);
        NOT_ACTIVATED = aVar3;
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
