package rzj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c COMMODITY_MARKET;
    public static final c CRYPTO_MARKET;
    public static final c GENERAL_MARKET;
    public static final c STOCK_MARKET;

    static {
        c cVar = new c("GENERAL_MARKET", 0);
        GENERAL_MARKET = cVar;
        c cVar2 = new c("STOCK_MARKET", 1);
        STOCK_MARKET = cVar2;
        c cVar3 = new c("CRYPTO_MARKET", 2);
        CRYPTO_MARKET = cVar3;
        c cVar4 = new c("COMMODITY_MARKET", 3);
        COMMODITY_MARKET = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
