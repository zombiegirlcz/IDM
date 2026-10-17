package fda;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIAT_CURRENCIES_POCKETS;
    public static final a MERCHANT_POCKETS;
    public static final a REVX_FIAT_POCKETS;

    static {
        a aVar = new a("FIAT_CURRENCIES_POCKETS", 0);
        FIAT_CURRENCIES_POCKETS = aVar;
        a aVar2 = new a("MERCHANT_POCKETS", 1);
        MERCHANT_POCKETS = aVar2;
        a aVar3 = new a("REVX_FIAT_POCKETS", 2);
        REVX_FIAT_POCKETS = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
