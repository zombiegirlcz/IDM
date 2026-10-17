package nb5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BACKUP_CARD;
    public static final e DIRECT_DEBIT;
    public static final e REVOLUT_POCKET;

    static {
        e eVar = new e("REVOLUT_POCKET", 0);
        REVOLUT_POCKET = eVar;
        e eVar2 = new e("DIRECT_DEBIT", 1);
        DIRECT_DEBIT = eVar2;
        e eVar3 = new e("BACKUP_CARD", 2);
        BACKUP_CARD = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
