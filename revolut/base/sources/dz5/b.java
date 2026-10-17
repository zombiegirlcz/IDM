package dz5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMMODITY_POCKETS;
    public static final b CRYPTO_POCKETS;
    public static final b EXTERNAL_POCKETS;
    public static final b HOME_FEED;
    public static final b RATES;
    public static final b VAULTS;

    static {
        b bVar = new b("VAULTS", 0);
        VAULTS = bVar;
        b bVar2 = new b("RATES", 1);
        RATES = bVar2;
        b bVar3 = new b("EXTERNAL_POCKETS", 2);
        EXTERNAL_POCKETS = bVar3;
        b bVar4 = new b("CRYPTO_POCKETS", 3);
        CRYPTO_POCKETS = bVar4;
        b bVar5 = new b("COMMODITY_POCKETS", 4);
        COMMODITY_POCKETS = bVar5;
        b bVar6 = new b("HOME_FEED", 5);
        HOME_FEED = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
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
