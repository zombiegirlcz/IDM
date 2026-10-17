package lcd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PERSONAL;
    public static final a PERSONAL_JOINT;
    public static final a TEEN;
    public static final a UNKNOWN;
    public static final a YOUTH;

    static {
        a aVar = new a("PERSONAL", 0);
        PERSONAL = aVar;
        a aVar2 = new a("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = aVar2;
        a aVar3 = new a("YOUTH", 2);
        YOUTH = aVar3;
        a aVar4 = new a("TEEN", 3);
        TEEN = aVar4;
        a aVar5 = new a("UNKNOWN", 4);
        UNKNOWN = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
