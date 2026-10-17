package xea;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CREDITS;
    public static final e CRYPTO;
    public static final e CURRENCIES;
    public static final e LINKED_ACCOUNTS;
    public static final e ON_HOLD;

    static {
        e eVar = new e("ON_HOLD", 0);
        ON_HOLD = eVar;
        e eVar2 = new e("CURRENCIES", 1);
        CURRENCIES = eVar2;
        e eVar3 = new e("CREDITS", 2);
        CREDITS = eVar3;
        e eVar4 = new e("LINKED_ACCOUNTS", 3);
        LINKED_ACCOUNTS = eVar4;
        e eVar5 = new e("CRYPTO", 4);
        CRYPTO = eVar5;
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
