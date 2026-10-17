package l4l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITIES;
    public static final a CRYPTO;
    public static final a JOINT_TRADING_GIA;
    public static final a RETAIL_FIAT;
    public static final a SAVINGS;
    public static final a TRADING_GIA;
    public static final a TRADING_GIA_CBP;
    public static final a TRADING_TAA_ISA;
    public static final a TRADING_TAA_JISA;
    public static final a TRADING_TAA_PEA;
    public static final a VAULTS;

    static {
        a aVar = new a("RETAIL_FIAT", 0);
        RETAIL_FIAT = aVar;
        a aVar2 = new a("COMMODITIES", 1);
        COMMODITIES = aVar2;
        a aVar3 = new a("CRYPTO", 2);
        CRYPTO = aVar3;
        a aVar4 = new a("VAULTS", 3);
        VAULTS = aVar4;
        a aVar5 = new a("SAVINGS", 4);
        SAVINGS = aVar5;
        a aVar6 = new a("TRADING_GIA", 5);
        TRADING_GIA = aVar6;
        a aVar7 = new a("TRADING_GIA_CBP", 6);
        TRADING_GIA_CBP = aVar7;
        a aVar8 = new a("JOINT_TRADING_GIA", 7);
        JOINT_TRADING_GIA = aVar8;
        a aVar9 = new a("TRADING_TAA_ISA", 8);
        TRADING_TAA_ISA = aVar9;
        a aVar10 = new a("TRADING_TAA_JISA", 9);
        TRADING_TAA_JISA = aVar10;
        a aVar11 = new a("TRADING_TAA_PEA", 10);
        TRADING_TAA_PEA = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
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
