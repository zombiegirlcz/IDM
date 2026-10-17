package yfa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b OPEN_BANKING;
    public static final b REV_PAYMENT;
    public static final b SEPA_DIRECT_DEBIT;

    static {
        b bVar = new b("OPEN_BANKING", 0);
        OPEN_BANKING = bVar;
        b bVar2 = new b("REV_PAYMENT", 1);
        REV_PAYMENT = bVar2;
        b bVar3 = new b("SEPA_DIRECT_DEBIT", 2);
        SEPA_DIRECT_DEBIT = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
