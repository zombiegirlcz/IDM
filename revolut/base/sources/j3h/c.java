package j3h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CRYPTO_ETN;
    public static final c PRIVATE_BANK_FUND;
    public static final c RETAIL_FUND;

    static {
        c cVar = new c("CRYPTO_ETN", 0);
        CRYPTO_ETN = cVar;
        c cVar2 = new c("RETAIL_FUND", 1);
        RETAIL_FUND = cVar2;
        c cVar3 = new c("PRIVATE_BANK_FUND", 2);
        PRIVATE_BANK_FUND = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
