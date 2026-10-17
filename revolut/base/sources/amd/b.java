package amd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CASH;
    public static final b CREDIT;
    public static final b CREDIT_CARDS;
    public static final b CRYPTO;
    public static final b INVEST;
    public static final b LINKED;
    public static final b LINKED_COMBINED;
    public static final b LINKED_CREDIT_CARDS;
    public static final b LOANS;
    public static final b OTHER_ASSETS;
    public static final b PAY_LATER;
    public static final b POCKETS;
    public static final b SAVINGS;

    @NotNull
    private final yld.g netWorthType;
    private final int priority;

    @NotNull
    private final String value;

    static {
        yld.g gVar = yld.g.ASSET;
        b bVar = new b("CASH", 0, "CASH", 1, gVar);
        CASH = bVar;
        b bVar2 = new b("SAVINGS", 1, "SAVINGS", 2, gVar);
        SAVINGS = bVar2;
        yld.g gVar2 = yld.g.LIABILITY;
        b bVar3 = new b("CREDIT", 2, "CREDIT", 3, gVar2);
        CREDIT = bVar3;
        b bVar4 = new b("LOANS", 3, "LOANS", 4, gVar2);
        LOANS = bVar4;
        b bVar5 = new b("CREDIT_CARDS", 4, "CREDIT_CARDS", 5, gVar2);
        CREDIT_CARDS = bVar5;
        b bVar6 = new b("PAY_LATER", 5, "PAY_LATER", 6, gVar2);
        PAY_LATER = bVar6;
        b bVar7 = new b("INVEST", 6, "INVEST", 7, gVar);
        INVEST = bVar7;
        b bVar8 = new b("CRYPTO", 7, "CRYPTO", 8, gVar);
        CRYPTO = bVar8;
        b bVar9 = new b("LINKED_COMBINED", 8, "LINKED_COMBINED", 9, gVar);
        LINKED_COMBINED = bVar9;
        b bVar10 = new b("LINKED_CREDIT_CARDS", 9, "LINKED_CREDIT_CARDS", 10, gVar2);
        LINKED_CREDIT_CARDS = bVar10;
        b bVar11 = new b("LINKED", 10, "LINKED", 11, gVar);
        LINKED = bVar11;
        b bVar12 = new b("POCKETS", 11, "POCKETS", 12, gVar);
        POCKETS = bVar12;
        b bVar13 = new b("OTHER_ASSETS", 12, "OTHER_ASSETS", 13, gVar);
        OTHER_ASSETS = bVar13;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public b(String str, int i, String str2, int i2, yld.g gVar) {
        this.value = str2;
        this.priority = i2;
        this.netWorthType = gVar;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final yld.g b() {
        return this.netWorthType;
    }

    public final int c() {
        return this.priority;
    }

    public final String d() {
        return this.value;
    }
}
