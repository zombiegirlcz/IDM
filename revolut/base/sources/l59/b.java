package l59;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ATMS;
    public static final b CREDIT;
    public static final b CREDIT_CARD;
    public static final b CRYPTO;
    public static final b EXPERIENCES;
    public static final b FREELANCER;
    public static final b LINKED;
    public static final b LOANS;
    public static final b MILES;
    public static final b PAY_LATER;
    public static final b RECURRING;
    public static final b REFERRALS;
    public static final b REMITTANCE;
    public static final b ROBO;
    public static final b SALARY_ADVANCE;
    public static final b SAVINGS;
    public static final b SHOPS;
    public static final b STAYS;
    public static final b VAULTS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f192194id;

    static {
        b bVar = new b("CREDIT", 0, "Credit");
        CREDIT = bVar;
        b bVar2 = new b("LOANS", 1, "Loans");
        LOANS = bVar2;
        b bVar3 = new b("CREDIT_CARD", 2, "CreditCard");
        CREDIT_CARD = bVar3;
        b bVar4 = new b("PAY_LATER", 3, "PayLater");
        PAY_LATER = bVar4;
        b bVar5 = new b("SHOPS", 4, "Shops");
        SHOPS = bVar5;
        b bVar6 = new b("LINKED", 5, "Linked");
        LINKED = bVar6;
        b bVar7 = new b("ATMS", 6, "ATMs");
        ATMS = bVar7;
        b bVar8 = new b("RECURRING", 7, "Recurring");
        RECURRING = bVar8;
        b bVar9 = new b("CRYPTO", 8, "Crypto");
        CRYPTO = bVar9;
        b bVar10 = new b("ROBO", 9, "Robo");
        ROBO = bVar10;
        b bVar11 = new b("VAULTS", 10, "Vaults");
        VAULTS = bVar11;
        b bVar12 = new b("STAYS", 11, "Stays");
        STAYS = bVar12;
        b bVar13 = new b("SALARY_ADVANCE", 12, "SalaryAdvance");
        SALARY_ADVANCE = bVar13;
        b bVar14 = new b("REFERRALS", 13, "Referrals");
        REFERRALS = bVar14;
        b bVar15 = new b("FREELANCER", 14, "Freelancer");
        FREELANCER = bVar15;
        b bVar16 = new b("REMITTANCE", 15, "Remittance");
        REMITTANCE = bVar16;
        b bVar17 = new b("EXPERIENCES", 16, "Experiences");
        EXPERIENCES = bVar17;
        b bVar18 = new b("SAVINGS", 17, "Savings");
        SAVINGS = bVar18;
        b bVar19 = new b("MILES", 18, "Miles");
        MILES = bVar19;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.f192194id = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f192194id;
    }
}
