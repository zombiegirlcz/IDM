package nha;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AT_RISK;
    public static final a MISSED;
    public static final a ON_TRACK;
    public static final a UNKNOWN;

    static {
        a aVar = new a("ON_TRACK", 0);
        ON_TRACK = aVar;
        a aVar2 = new a("AT_RISK", 1);
        AT_RISK = aVar2;
        a aVar3 = new a("MISSED", 2);
        MISSED = aVar3;
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
