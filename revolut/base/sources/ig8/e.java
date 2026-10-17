package ig8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DECLINED_TRANSFER;
    public static final e INACTIVE_ACCOUNT;
    public static final e NEGATIVE_BALANCE;
    public static final e UNKNOWN;
    public static final e UNVERIFIED_ACCOUNT;

    static {
        e eVar = new e("INACTIVE_ACCOUNT", 0);
        INACTIVE_ACCOUNT = eVar;
        e eVar2 = new e("UNVERIFIED_ACCOUNT", 1);
        UNVERIFIED_ACCOUNT = eVar2;
        e eVar3 = new e("NEGATIVE_BALANCE", 2);
        NEGATIVE_BALANCE = eVar3;
        e eVar4 = new e("DECLINED_TRANSFER", 3);
        DECLINED_TRANSFER = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
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
