package th8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AVAILABLE;
    public static final a DISABLED;
    public static final a MAX_GUARDIAN_ACCOUNT_LIMIT_REACHED;
    public static final a MAX_TOTAL_ACCOUNT_LIMIT_REACHED;

    static {
        a aVar = new a("AVAILABLE", 0);
        AVAILABLE = aVar;
        a aVar2 = new a("DISABLED", 1);
        DISABLED = aVar2;
        a aVar3 = new a("MAX_TOTAL_ACCOUNT_LIMIT_REACHED", 2);
        MAX_TOTAL_ACCOUNT_LIMIT_REACHED = aVar3;
        a aVar4 = new a("MAX_GUARDIAN_ACCOUNT_LIMIT_REACHED", 3);
        MAX_GUARDIAN_ACCOUNT_LIMIT_REACHED = aVar4;
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
