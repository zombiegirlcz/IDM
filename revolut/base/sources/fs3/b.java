package fs3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BALANCE_TRANSFER_CREDIT_CARD;
    public static final b CREDIT_BUILDER_CARD;
    public static final b CREDIT_CARD;
    public static final b CREDIT_HEALTH;

    @NotNull
    public static final a Companion;
    public static final b HOME_IMPROVEMENT_LOAN;
    public static final b LOAN;
    public static final b MORTGAGE;
    public static final b OVERDRAFT;
    public static final b PAY_LATER;
    public static final b REFINANCING_LOAN;
    public static final b REFINANCING_MORTGAGE;
    public static final b SECURED_CREDIT_CARD;

    static {
        b bVar = new b("LOAN", 0);
        LOAN = bVar;
        b bVar2 = new b("REFINANCING_LOAN", 1);
        REFINANCING_LOAN = bVar2;
        b bVar3 = new b("HOME_IMPROVEMENT_LOAN", 2);
        HOME_IMPROVEMENT_LOAN = bVar3;
        b bVar4 = new b("MORTGAGE", 3);
        MORTGAGE = bVar4;
        b bVar5 = new b("REFINANCING_MORTGAGE", 4);
        REFINANCING_MORTGAGE = bVar5;
        b bVar6 = new b("CREDIT_CARD", 5);
        CREDIT_CARD = bVar6;
        b bVar7 = new b("BALANCE_TRANSFER_CREDIT_CARD", 6);
        BALANCE_TRANSFER_CREDIT_CARD = bVar7;
        b bVar8 = new b("SECURED_CREDIT_CARD", 7);
        SECURED_CREDIT_CARD = bVar8;
        b bVar9 = new b("CREDIT_BUILDER_CARD", 8);
        CREDIT_BUILDER_CARD = bVar9;
        b bVar10 = new b("PAY_LATER", 9);
        PAY_LATER = bVar10;
        b bVar11 = new b("OVERDRAFT", 10);
        OVERDRAFT = bVar11;
        b bVar12 = new b("CREDIT_HEALTH", 11);
        CREDIT_HEALTH = bVar12;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
