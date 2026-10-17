package he3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CARD;
    public static final l CARDHOLDERS;
    public static final l CARD_OTHER;
    public static final l CATEGORY;
    public static final l COUNTRY;
    public static final l COUNTRY_OTHER;
    public static final l CURRENCY;
    public static final l MERCHANT;
    public static final l PARTICIPANTS;
    public static final l PRO_APPLE_PAY;
    public static final l PRO_CARD_READER;
    public static final l PRO_E_COMMERCE;
    public static final l PRO_INVOICE;
    public static final l PRO_PAYMENT_LINK;
    public static final l PRO_POS;
    public static final l PRO_QR_CODE;
    public static final l SAVINGS_OPERATION_TYPE;
    public static final l SAVINGS_TRANSACTION_TYPE;
    public static final l SOURCE_ACCOUNT;

    static {
        l lVar = new l("CATEGORY", 0);
        CATEGORY = lVar;
        l lVar2 = new l("MERCHANT", 1);
        MERCHANT = lVar2;
        l lVar3 = new l("COUNTRY", 2);
        COUNTRY = lVar3;
        l lVar4 = new l("COUNTRY_OTHER", 3);
        COUNTRY_OTHER = lVar4;
        l lVar5 = new l("CURRENCY", 4);
        CURRENCY = lVar5;
        l lVar6 = new l("SAVINGS_TRANSACTION_TYPE", 5);
        SAVINGS_TRANSACTION_TYPE = lVar6;
        l lVar7 = new l("SAVINGS_OPERATION_TYPE", 6);
        SAVINGS_OPERATION_TYPE = lVar7;
        l lVar8 = new l("CARDHOLDERS", 7);
        CARDHOLDERS = lVar8;
        l lVar9 = new l("PARTICIPANTS", 8);
        PARTICIPANTS = lVar9;
        l lVar10 = new l("SOURCE_ACCOUNT", 9);
        SOURCE_ACCOUNT = lVar10;
        l lVar11 = new l("CARD", 10);
        CARD = lVar11;
        l lVar12 = new l("CARD_OTHER", 11);
        CARD_OTHER = lVar12;
        l lVar13 = new l("PRO_APPLE_PAY", 12);
        PRO_APPLE_PAY = lVar13;
        l lVar14 = new l("PRO_CARD_READER", 13);
        PRO_CARD_READER = lVar14;
        l lVar15 = new l("PRO_POS", 14);
        PRO_POS = lVar15;
        l lVar16 = new l("PRO_E_COMMERCE", 15);
        PRO_E_COMMERCE = lVar16;
        l lVar17 = new l("PRO_INVOICE", 16);
        PRO_INVOICE = lVar17;
        l lVar18 = new l("PRO_PAYMENT_LINK", 17);
        PRO_PAYMENT_LINK = lVar18;
        l lVar19 = new l("PRO_QR_CODE", 18);
        PRO_QR_CODE = lVar19;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final boolean a() {
        switch (k.f151566a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return false;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
