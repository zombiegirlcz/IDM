package f2b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ASSET_DETAILS;
    public static final a CFD_HOME;
    public static final a CFD_POSITION_DETAILS;
    public static final a INVEST_TAB;

    static {
        a aVar = new a("ASSET_DETAILS", 0);
        ASSET_DETAILS = aVar;
        a aVar2 = new a("CFD_HOME", 1);
        CFD_HOME = aVar2;
        a aVar3 = new a("CFD_POSITION_DETAILS", 2);
        CFD_POSITION_DETAILS = aVar3;
        a aVar4 = new a("INVEST_TAB", 3);
        INVEST_TAB = aVar4;
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
