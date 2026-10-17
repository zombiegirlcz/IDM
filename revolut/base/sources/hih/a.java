package hih;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a GIA;
    public static final a GIA_JOINT;
    public static final a ISA;
    public static final a JISA;
    public static final a MARGIN_TRADING;
    public static final a PEA;
    public static final a ROBO;

    static {
        a aVar = new a("GIA", 0);
        GIA = aVar;
        a aVar2 = new a("GIA_JOINT", 1);
        GIA_JOINT = aVar2;
        a aVar3 = new a("ISA", 2);
        ISA = aVar3;
        a aVar4 = new a("PEA", 3);
        PEA = aVar4;
        a aVar5 = new a("JISA", 4);
        JISA = aVar5;
        a aVar6 = new a("ROBO", 5);
        ROBO = aVar6;
        a aVar7 = new a("MARGIN_TRADING", 6);
        MARGIN_TRADING = aVar7;
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
