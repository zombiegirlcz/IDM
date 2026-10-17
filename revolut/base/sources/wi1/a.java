package wi1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTO_COMPLETE;
    public static final a MANUAL;
    public static final a POST_CODE_LOOKUP;
    public static final a UNKNOWN;

    static {
        a aVar = new a("POST_CODE_LOOKUP", 0);
        POST_CODE_LOOKUP = aVar;
        a aVar2 = new a("AUTO_COMPLETE", 1);
        AUTO_COMPLETE = aVar2;
        a aVar3 = new a("MANUAL", 2);
        MANUAL = aVar3;
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
