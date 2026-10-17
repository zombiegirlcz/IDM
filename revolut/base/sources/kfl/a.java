package kfl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PRIVATE_MARKETS;
    public static final a ROBO;
    public static final a STOCKS;
    public static final a TAX_ADVANTAGE_REPORTS;

    static {
        a aVar = new a("STOCKS", 0);
        STOCKS = aVar;
        a aVar2 = new a("TAX_ADVANTAGE_REPORTS", 1);
        TAX_ADVANTAGE_REPORTS = aVar2;
        a aVar3 = new a("ROBO", 2);
        ROBO = aVar3;
        a aVar4 = new a("PRIVATE_MARKETS", 3);
        PRIVATE_MARKETS = aVar4;
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
