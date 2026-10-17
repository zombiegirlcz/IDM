package pn1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CREATE_SCHEDULED;
    public static final a DEFAULT;
    public static final a UPDATE_SCHEDULED;

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        a aVar2 = new a("CREATE_SCHEDULED", 1);
        CREATE_SCHEDULED = aVar2;
        a aVar3 = new a("UPDATE_SCHEDULED", 2);
        UPDATE_SCHEDULED = aVar3;
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
