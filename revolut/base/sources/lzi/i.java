package lzi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CUSTOM;
    public static final i MAX;
    public static final i MONTHLY;
    public static final i WEEKLY;
    public static final i YEARLY;

    static {
        i iVar = new i("WEEKLY", 0);
        WEEKLY = iVar;
        i iVar2 = new i("MONTHLY", 1);
        MONTHLY = iVar2;
        i iVar3 = new i("YEARLY", 2);
        YEARLY = iVar3;
        i iVar4 = new i("MAX", 3);
        MAX = iVar4;
        i iVar5 = new i("CUSTOM", 4);
        CUSTOM = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
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
