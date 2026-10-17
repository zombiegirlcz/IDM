package jel;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a3[] $VALUES;
    public static final a3 CASH_AND_DERIVATIVES;
    public static final a3 CFDS;
    public static final a3 COMMODITIES;
    public static final a3 COMMUNICATION_SERVICES;
    public static final a3 CONSUMER_CYCLICAL;
    public static final a3 CONSUMER_DEFENSIVE;
    public static final a3 CORPORATE_BONDS;
    public static final a3 CRYPTOCURRENCY;
    public static final a3 ENERGY;
    public static final a3 FINANCIAL;
    public static final a3 GOVERNMENT_BONDS;
    public static final a3 HEALTHCARE;
    public static final a3 INDUSTRIALS;
    public static final a3 MATERIALS;
    public static final a3 OTHER;
    public static final a3 REAL_ESTATE;
    public static final a3 ROBO;
    public static final a3 SECURITIZED;
    public static final a3 TECHNOLOGY;

    @he0.b
    public static final a3 UNSPECIFIED;
    public static final a3 UTILITIES;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f173408id;

    static {
        a3 a3Var = new a3("MATERIALS", 0, "MATERIALS");
        MATERIALS = a3Var;
        a3 a3Var2 = new a3("INDUSTRIALS", 1, "INDUSTRIALS");
        INDUSTRIALS = a3Var2;
        a3 a3Var3 = new a3("FINANCIAL", 2, "FINANCIAL");
        FINANCIAL = a3Var3;
        a3 a3Var4 = new a3("ENERGY", 3, "ENERGY");
        ENERGY = a3Var4;
        a3 a3Var5 = new a3("CONSUMER_CYCLICAL", 4, "CONSUMER_CYCLICAL");
        CONSUMER_CYCLICAL = a3Var5;
        a3 a3Var6 = new a3("TECHNOLOGY", 5, "TECHNOLOGY");
        TECHNOLOGY = a3Var6;
        a3 a3Var7 = new a3("COMMUNICATION_SERVICES", 6, "COMMUNICATION_SERVICES");
        COMMUNICATION_SERVICES = a3Var7;
        a3 a3Var8 = new a3("REAL_ESTATE", 7, "REAL_ESTATE");
        REAL_ESTATE = a3Var8;
        a3 a3Var9 = new a3("HEALTHCARE", 8, "HEALTHCARE");
        HEALTHCARE = a3Var9;
        a3 a3Var10 = new a3("CONSUMER_DEFENSIVE", 9, "CONSUMER_DEFENSIVE");
        CONSUMER_DEFENSIVE = a3Var10;
        a3 a3Var11 = new a3("UTILITIES", 10, "UTILITIES");
        UTILITIES = a3Var11;
        a3 a3Var12 = new a3("GOVERNMENT_BONDS", 11, "GOVERNMENT_BONDS");
        GOVERNMENT_BONDS = a3Var12;
        a3 a3Var13 = new a3("CORPORATE_BONDS", 12, "CORPORATE_BONDS");
        CORPORATE_BONDS = a3Var13;
        a3 a3Var14 = new a3("SECURITIZED", 13, "SECURITIZED");
        SECURITIZED = a3Var14;
        a3 a3Var15 = new a3("CASH_AND_DERIVATIVES", 14, "CASH_AND_DERIVATIVES");
        CASH_AND_DERIVATIVES = a3Var15;
        a3 a3Var16 = new a3("CRYPTOCURRENCY", 15, "CRYPTOCURRENCY");
        CRYPTOCURRENCY = a3Var16;
        a3 a3Var17 = new a3("CFDS", 16, "CFDS");
        CFDS = a3Var17;
        a3 a3Var18 = new a3("COMMODITIES", 17, "COMMODITIES");
        COMMODITIES = a3Var18;
        a3 a3Var19 = new a3("ROBO", 18, "ROBO");
        ROBO = a3Var19;
        a3 a3Var20 = new a3("OTHER", 19, "OTHER");
        OTHER = a3Var20;
        a3 a3Var21 = new a3("UNSPECIFIED", 20, "UNSPECIFIED");
        UNSPECIFIED = a3Var21;
        a3[] a3VarArr = {a3Var, a3Var2, a3Var3, a3Var4, a3Var5, a3Var6, a3Var7, a3Var8, a3Var9, a3Var10, a3Var11, a3Var12, a3Var13, a3Var14, a3Var15, a3Var16, a3Var17, a3Var18, a3Var19, a3Var20, a3Var21};
        $VALUES = a3VarArr;
        $ENTRIES = vc.s.n(a3VarArr);
    }

    public a3(String str, int i, String str2) {
        this.f173408id = str2;
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f173408id;
    }
}
