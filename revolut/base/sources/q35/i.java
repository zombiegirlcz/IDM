package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CANCELED;
    public static final i CLAIMED;
    public static final i LATE;
    public static final i OUTSTANDING;
    public static final i PAID;
    public static final i SCHEDULED;
    public static final i UNKNOWN;

    static {
        i iVar = new i("SCHEDULED", 0);
        SCHEDULED = iVar;
        i iVar2 = new i("PAID", 1);
        PAID = iVar2;
        i iVar3 = new i("LATE", 2);
        LATE = iVar3;
        i iVar4 = new i("CANCELED", 3);
        CANCELED = iVar4;
        i iVar5 = new i("OUTSTANDING", 4);
        OUTSTANDING = iVar5;
        i iVar6 = new i("CLAIMED", 5);
        CLAIMED = iVar6;
        i iVar7 = new i("UNKNOWN", 6);
        UNKNOWN = iVar7;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
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
