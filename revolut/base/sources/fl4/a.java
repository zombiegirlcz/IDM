package fl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACH;
    public static final a BACKUP_CARD;
    public static final a DIRECT_DEBIT;
    public static final a SCHEDULED;

    static {
        a aVar = new a("SCHEDULED", 0);
        SCHEDULED = aVar;
        a aVar2 = new a("BACKUP_CARD", 1);
        BACKUP_CARD = aVar2;
        a aVar3 = new a("DIRECT_DEBIT", 2);
        DIRECT_DEBIT = aVar3;
        a aVar4 = new a("ACH", 3);
        ACH = aVar4;
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
