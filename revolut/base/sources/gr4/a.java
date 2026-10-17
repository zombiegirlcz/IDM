package gr4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTO_PAY;
    public static final a CANCEL_CREDIT_CARD;
    public static final a CREDIT_CARDS;
    public static final a CREDIT_CARD_LIMIT;
    public static final a DISPLAY_AMOUNT;
    public static final a DOCUMENTS_RATES_INFO;
    public static final a DUE_DATE;
    public static final a GET_HELP;
    public static final a PLAN_BENEFITS;
    public static final a STATEMENTS;

    static {
        a aVar = new a("PLAN_BENEFITS", 0);
        PLAN_BENEFITS = aVar;
        a aVar2 = new a("CREDIT_CARDS", 1);
        CREDIT_CARDS = aVar2;
        a aVar3 = new a("CREDIT_CARD_LIMIT", 2);
        CREDIT_CARD_LIMIT = aVar3;
        a aVar4 = new a("STATEMENTS", 3);
        STATEMENTS = aVar4;
        a aVar5 = new a("AUTO_PAY", 4);
        AUTO_PAY = aVar5;
        a aVar6 = new a("DUE_DATE", 5);
        DUE_DATE = aVar6;
        a aVar7 = new a("DISPLAY_AMOUNT", 6);
        DISPLAY_AMOUNT = aVar7;
        a aVar8 = new a("DOCUMENTS_RATES_INFO", 7);
        DOCUMENTS_RATES_INFO = aVar8;
        a aVar9 = new a("GET_HELP", 8);
        GET_HELP = aVar9;
        a aVar10 = new a("CANCEL_CREDIT_CARD", 9);
        CANCEL_CREDIT_CARD = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
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
