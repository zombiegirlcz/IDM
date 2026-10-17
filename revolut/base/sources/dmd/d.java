package dmd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACCOUNT;
    public static final d ACCOUNT_WITH_CURRENCY;
    public static final d CURRENCY;

    static {
        d dVar = new d("CURRENCY", 0);
        CURRENCY = dVar;
        d dVar2 = new d("ACCOUNT", 1);
        ACCOUNT = dVar2;
        d dVar3 = new d("ACCOUNT_WITH_CURRENCY", 2);
        ACCOUNT_WITH_CURRENCY = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
