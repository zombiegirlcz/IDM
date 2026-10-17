package yw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i FIN_CRIME;
    public static final i FIN_CRIME_WITH_ACTIONS;
    public static final i MARKETING;
    public static final i MARKETING_WITH_ACTIONS;

    static {
        i iVar = new i("MARKETING", 0);
        MARKETING = iVar;
        i iVar2 = new i("MARKETING_WITH_ACTIONS", 1);
        MARKETING_WITH_ACTIONS = iVar2;
        i iVar3 = new i("FIN_CRIME", 2);
        FIN_CRIME = iVar3;
        i iVar4 = new i("FIN_CRIME_WITH_ACTIONS", 3);
        FIN_CRIME_WITH_ACTIONS = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
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
