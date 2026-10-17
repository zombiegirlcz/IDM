package w3g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CENTIMETER;
    public static final d FOOT;
    public static final d KILOGRAM;
    public static final d POUND;

    static {
        d dVar = new d("FOOT", 0);
        FOOT = dVar;
        d dVar2 = new d("POUND", 1);
        POUND = dVar2;
        d dVar3 = new d("KILOGRAM", 2);
        KILOGRAM = dVar3;
        d dVar4 = new d("CENTIMETER", 3);
        CENTIMETER = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
