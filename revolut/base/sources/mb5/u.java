package mb5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u ACH;
    public static final u BACKUP_CARD;
    public static final u DIRECT_DEBIT;
    public static final u SCHEDULED;

    static {
        u uVar = new u("SCHEDULED", 0);
        SCHEDULED = uVar;
        u uVar2 = new u("BACKUP_CARD", 1);
        BACKUP_CARD = uVar2;
        u uVar3 = new u("DIRECT_DEBIT", 2);
        DIRECT_DEBIT = uVar3;
        u uVar4 = new u("ACH", 3);
        ACH = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
