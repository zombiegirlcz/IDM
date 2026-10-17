package hke;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALL_SETTINGS;
    public static final a ROBO;
    public static final a STOCKS;
    public static final a TAA;

    static {
        a aVar = new a("ALL_SETTINGS", 0);
        ALL_SETTINGS = aVar;
        a aVar2 = new a("STOCKS", 1);
        STOCKS = aVar2;
        a aVar3 = new a("ROBO", 2);
        ROBO = aVar3;
        a aVar4 = new a("TAA", 3);
        TAA = aVar4;
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
