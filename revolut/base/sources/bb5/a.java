package bb5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTION_REQUIRED;
    public static final a IN_PROGRESS;
    public static final a OFFER;
    public static final a TERMINATED;
    public static final a UNKNOWN;
    public static final a WAITING;

    static {
        a aVar = new a("ACTION_REQUIRED", 0);
        ACTION_REQUIRED = aVar;
        a aVar2 = new a("IN_PROGRESS", 1);
        IN_PROGRESS = aVar2;
        a aVar3 = new a("TERMINATED", 2);
        TERMINATED = aVar3;
        a aVar4 = new a("WAITING", 3);
        WAITING = aVar4;
        a aVar5 = new a("OFFER", 4);
        OFFER = aVar5;
        a aVar6 = new a("UNKNOWN", 5);
        UNKNOWN = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
