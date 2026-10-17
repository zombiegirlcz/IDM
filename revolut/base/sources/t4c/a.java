package t4c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BRIEF;
    public static final a LOCKED_BALANCE;
    public static final a VERBOSE;

    static {
        a aVar = new a("BRIEF", 0);
        BRIEF = aVar;
        a aVar2 = new a("VERBOSE", 1);
        VERBOSE = aVar2;
        a aVar3 = new a("LOCKED_BALANCE", 2);
        LOCKED_BALANCE = aVar3;
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
