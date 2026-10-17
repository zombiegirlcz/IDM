package wbc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n GRAM;
    public static final n KILOGRAM;
    public static final n MILLIGRAM;
    public static final n OUNCE;
    public static final n POUND;
    public static final n STONE;

    static {
        n nVar = new n("MILLIGRAM", 0);
        MILLIGRAM = nVar;
        n nVar2 = new n("GRAM", 1);
        GRAM = nVar2;
        n nVar3 = new n("KILOGRAM", 2);
        KILOGRAM = nVar3;
        n nVar4 = new n("OUNCE", 3);
        OUNCE = nVar4;
        n nVar5 = new n("POUND", 4);
        POUND = nVar5;
        n nVar6 = new n("STONE", 5);
        STONE = nVar6;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
