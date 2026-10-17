package xw4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HEALTHY;
    public static final a LIMIT_EXCEEDED;
    public static final a OVERDUE;
    public static final a TERMINATED;

    static {
        a aVar = new a("HEALTHY", 0);
        HEALTHY = aVar;
        a aVar2 = new a("OVERDUE", 1);
        OVERDUE = aVar2;
        a aVar3 = new a("LIMIT_EXCEEDED", 2);
        LIMIT_EXCEEDED = aVar3;
        a aVar4 = new a("TERMINATED", 3);
        TERMINATED = aVar4;
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
