package ll4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ADD_MONEY;
    public static final k DISCOVER;
    public static final k GET_CREDIT;
    public static final k SEARCH;
    public static final k TOTAL_WEALTH_ACTIVE_PRODUCT;
    public static final k TOTAL_WEALTH_WITHOUT_ACTIVE_PRODUCT;

    static {
        k kVar = new k("SEARCH", 0);
        SEARCH = kVar;
        k kVar2 = new k("TOTAL_WEALTH_WITHOUT_ACTIVE_PRODUCT", 1);
        TOTAL_WEALTH_WITHOUT_ACTIVE_PRODUCT = kVar2;
        k kVar3 = new k("TOTAL_WEALTH_ACTIVE_PRODUCT", 2);
        TOTAL_WEALTH_ACTIVE_PRODUCT = kVar3;
        k kVar4 = new k("ADD_MONEY", 3);
        ADD_MONEY = kVar4;
        k kVar5 = new k("GET_CREDIT", 4);
        GET_CREDIT = kVar5;
        k kVar6 = new k("DISCOVER", 5);
        DISCOVER = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
