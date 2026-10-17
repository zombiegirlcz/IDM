package a3f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k COMMUNICATION_SERVICES;
    public static final k CONSUMER_CYCLICAL;
    public static final k CONSUMER_DEFENSIVE;
    public static final k ENERGY;
    public static final k FINANCIAL;
    public static final k HEALTHCARE;
    public static final k INDUSTRIALS;
    public static final k MATERIALS;
    public static final k REAL_ESTATE;
    public static final k TECHNOLOGY;
    public static final k UTILITIES;

    static {
        k kVar = new k("TECHNOLOGY", 0);
        TECHNOLOGY = kVar;
        k kVar2 = new k("CONSUMER_DEFENSIVE", 1);
        CONSUMER_DEFENSIVE = kVar2;
        k kVar3 = new k("ENERGY", 2);
        ENERGY = kVar3;
        k kVar4 = new k("INDUSTRIALS", 3);
        INDUSTRIALS = kVar4;
        k kVar5 = new k("FINANCIAL", 4);
        FINANCIAL = kVar5;
        k kVar6 = new k("MATERIALS", 5);
        MATERIALS = kVar6;
        k kVar7 = new k("HEALTHCARE", 6);
        HEALTHCARE = kVar7;
        k kVar8 = new k("CONSUMER_CYCLICAL", 7);
        CONSUMER_CYCLICAL = kVar8;
        k kVar9 = new k("REAL_ESTATE", 8);
        REAL_ESTATE = kVar9;
        k kVar10 = new k("COMMUNICATION_SERVICES", 9);
        COMMUNICATION_SERVICES = kVar10;
        k kVar11 = new k("UTILITIES", 10);
        UTILITIES = kVar11;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
