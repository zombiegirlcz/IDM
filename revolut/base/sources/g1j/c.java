package g1j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNTS;
    public static final c COMMODITIES;
    public static final c CREDIT_CARDS;
    public static final c CRYPTO;
    public static final c DEFI;
    public static final c FUTURES_COLLATERAL;
    public static final c INVESTMENTS;
    public static final c SAVINGS;
    public static final c SPOT_MARGIN_COLLATERAL;
    public static final c VAULTS;

    static {
        c cVar = new c("ACCOUNTS", 0);
        ACCOUNTS = cVar;
        c cVar2 = new c("VAULTS", 1);
        VAULTS = cVar2;
        c cVar3 = new c("SAVINGS", 2);
        SAVINGS = cVar3;
        c cVar4 = new c("CREDIT_CARDS", 3);
        CREDIT_CARDS = cVar4;
        c cVar5 = new c("CRYPTO", 4);
        CRYPTO = cVar5;
        c cVar6 = new c("SPOT_MARGIN_COLLATERAL", 5);
        SPOT_MARGIN_COLLATERAL = cVar6;
        c cVar7 = new c("FUTURES_COLLATERAL", 6);
        FUTURES_COLLATERAL = cVar7;
        c cVar8 = new c("INVESTMENTS", 7);
        INVESTMENTS = cVar8;
        c cVar9 = new c("COMMODITIES", 8);
        COMMODITIES = cVar9;
        c cVar10 = new c("DEFI", 9);
        DEFI = cVar10;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
