package np4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e MONTHLY_SPENDING_LIMIT;
    public static final e SINGLE_PURCHASE_LIMIT;

    static {
        e eVar = new e("SINGLE_PURCHASE_LIMIT", 0);
        SINGLE_PURCHASE_LIMIT = eVar;
        e eVar2 = new e("MONTHLY_SPENDING_LIMIT", 1);
        MONTHLY_SPENDING_LIMIT = eVar2;
        e[] eVarArr = {eVar, eVar2};
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
