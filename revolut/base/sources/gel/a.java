package gel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a RBSA;
    public static final a RL;
    public static final a RPAPL;
    public static final a RPNZPL;
    public static final a RTJI;
    public static final a RTSPL;
    public static final a UNKNOWN;

    static {
        a aVar = new a("RL", 0);
        RL = aVar;
        a aVar2 = new a("RTSPL", 1);
        RTSPL = aVar2;
        a aVar3 = new a("RPAPL", 2);
        RPAPL = aVar3;
        a aVar4 = new a("RPNZPL", 3);
        RPNZPL = aVar4;
        a aVar5 = new a("RTJI", 4);
        RTJI = aVar5;
        a aVar6 = new a("RBSA", 5);
        RBSA = aVar6;
        a aVar7 = new a("UNKNOWN", 6);
        UNKNOWN = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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
