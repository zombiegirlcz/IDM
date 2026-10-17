package yhh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITIES;
    public static final a ISA;
    public static final a JISA;
    public static final a MARGIN;
    public static final a PEA;
    public static final a ROBO;
    public static final a SECURITIES;
    public static final a SECURITIES_JOINT;
    public static final a UNKNOWN;

    static {
        a aVar = new a("SECURITIES", 0);
        SECURITIES = aVar;
        a aVar2 = new a("ISA", 1);
        ISA = aVar2;
        a aVar3 = new a("PEA", 2);
        PEA = aVar3;
        a aVar4 = new a("SECURITIES_JOINT", 3);
        SECURITIES_JOINT = aVar4;
        a aVar5 = new a("COMMODITIES", 4);
        COMMODITIES = aVar5;
        a aVar6 = new a("ROBO", 5);
        ROBO = aVar6;
        a aVar7 = new a("JISA", 6);
        JISA = aVar7;
        a aVar8 = new a("MARGIN", 7);
        MARGIN = aVar8;
        a aVar9 = new a("UNKNOWN", 8);
        UNKNOWN = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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
