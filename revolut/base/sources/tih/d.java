package tih;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BONDS;
    public static final d COMMODITIES;
    public static final d ETFS;
    public static final d GIA_MARGIN;
    public static final d JOINT_SECURITIES;
    public static final d MARGIN;
    public static final d PRIVATE_MARKETS;
    public static final d ROBO;
    public static final d SECURITIES;
    public static final d TAA_CUSTODIAN_JISA;
    public static final d TAA_ISA;
    public static final d TAA_PEA;
    public static final d TAA_PERSONAL_JISA;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f271528id;

    static {
        d dVar = new d("SECURITIES", 0, "INVEST_SECURITIES");
        SECURITIES = dVar;
        d dVar2 = new d("BONDS", 1, "INVEST_BONDS");
        BONDS = dVar2;
        d dVar3 = new d("ETFS", 2, "INVEST_ETFS");
        ETFS = dVar3;
        d dVar4 = new d("TAA_ISA", 3, "INVEST_TAA_ISA");
        TAA_ISA = dVar4;
        d dVar5 = new d("TAA_CUSTODIAN_JISA", 4, "INVEST_TAA_CUSTODIAN_JISA");
        TAA_CUSTODIAN_JISA = dVar5;
        d dVar6 = new d("TAA_PERSONAL_JISA", 5, "INVEST_TAA_PERSONAL_JISA");
        TAA_PERSONAL_JISA = dVar6;
        d dVar7 = new d("TAA_PEA", 6, "INVEST_TAA_PEA");
        TAA_PEA = dVar7;
        d dVar8 = new d("ROBO", 7, "INVEST_ROBO");
        ROBO = dVar8;
        d dVar9 = new d("JOINT_SECURITIES", 8, "JOINT_INVEST_SECURITIES");
        JOINT_SECURITIES = dVar9;
        d dVar10 = new d("MARGIN", 9, "INVEST_MARGIN");
        MARGIN = dVar10;
        d dVar11 = new d("GIA_MARGIN", 10, "INVEST_GIA_MARGIN");
        GIA_MARGIN = dVar11;
        d dVar12 = new d("PRIVATE_MARKETS", 11, "PRIVATE_MARKETS");
        PRIVATE_MARKETS = dVar12;
        d dVar13 = new d("COMMODITIES", 12, "INVEST_COMMODITIES");
        COMMODITIES = dVar13;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.f271528id = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
