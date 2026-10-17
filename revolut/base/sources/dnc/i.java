package dnc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BONDS;
    public static final i COMMODITIES;
    public static final i STOCKS;

    static {
        i iVar = new i("STOCKS", 0);
        STOCKS = iVar;
        i iVar2 = new i("BONDS", 1);
        BONDS = iVar2;
        i iVar3 = new i("COMMODITIES", 2);
        COMMODITIES = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
