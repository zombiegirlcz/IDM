package vad;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e PAYMENT_LINK;
    public static final e PAY_IN_STORE;
    public static final e UNKNOWN;

    static {
        e eVar = new e("PAYMENT_LINK", 0);
        PAYMENT_LINK = eVar;
        e eVar2 = new e("PAY_IN_STORE", 1);
        PAY_IN_STORE = eVar2;
        e eVar3 = new e("UNKNOWN", 2);
        UNKNOWN = eVar3;
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
